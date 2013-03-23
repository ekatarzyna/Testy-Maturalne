package pl.evelan.matura;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class ActPytania extends Activity {

	RadioGroup grupaOdp;
	RadioButton odpA;
	RadioButton odpB;
	RadioButton odpC;
	RadioButton odpD;
	
	//TODO: zapisywanie ostatniego pytania przy wychodzeniu

	// TextView pytanie;
	// ImageView pytanie;

	int odpowiedzUsera = 0;
	int odpowiedzPoprawna;
	int nrPytania = 1;
	int ostatniePytanie = 1; 

	MediaPlayer sound;

	// statystyka
	public static final String STAT_NAME = "Statystyka";
	static SharedPreferences stat;
	static SharedPreferences.Editor statEditor;
	
	//ostatnie pytanie
	public static final String MEMORY_NAME = "PytanieMem";
	static SharedPreferences mem;
	static SharedPreferences.Editor memEditor;

	// pytania
	TextView pytanie1, pytanie2, pytanie3, pytanie4;
	ImageView img_pytanie1, img_pytanie2, img_pytanie3, img_pytanie4;

	// odpowiedzi
	ImageView img_odpA, img_odpB, img_odpC, img_odpD;
	TextView tv_odpA, tv_odpB, tv_odpC, tv_odpD;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.pytanie);

		sound = MediaPlayer.create(this, R.raw.ok);

		Typeface tf = Typeface.createFromAsset(getAssets(), "fonts/StRyde.otf");
		//Typeface tf = Typeface.createFromAsset(getAssets(), "fonts/Rawengulk_Sans.otf");
 
		odpA = (RadioButton) findViewById(R.id.rb_odp_a);
		odpA.setTypeface(tf);
		odpB = (RadioButton) findViewById(R.id.rb_odp_b);
		odpB.setTypeface(tf);
		odpC = (RadioButton) findViewById(R.id.rb_odp_c);
		odpC.setTypeface(tf);
		odpD = (RadioButton) findViewById(R.id.rb_odp_d);
		odpD.setTypeface(tf);

		Button sprawdz = (Button) findViewById(R.id.btn_sprawdz);
		Button nastepne = (Button) findViewById(R.id.btn_nastepne);
		Button poprzednie = (Button) findViewById(R.id.btn_poprzednie);

		// pytanie
		pytanie1 = (TextView) findViewById(R.id.tv_pytanie_1);
		pytanie1.setTypeface(tf);
		pytanie2 = (TextView) findViewById(R.id.tv_pytanie_2);
		pytanie2.setTypeface(tf);
		pytanie3 = (TextView) findViewById(R.id.tv_pytanie_3);
		pytanie3.setTypeface(tf);
		pytanie4 = (TextView) findViewById(R.id.tv_pytanie_4);
		pytanie4.setTypeface(tf);
		img_pytanie1 = (ImageView) findViewById(R.id.iv_pytanie_1);
		img_pytanie2 = (ImageView) findViewById(R.id.iv_pytanie_2);
		img_pytanie3 = (ImageView) findViewById(R.id.iv_pytanie_3);
		img_pytanie4 = (ImageView) findViewById(R.id.iv_pytanie_4);

		// odpowiedz
		img_odpA = (ImageView) findViewById(R.id.img_odpA);
		img_odpB = (ImageView) findViewById(R.id.img_odpB);
		img_odpC = (ImageView) findViewById(R.id.img_odpC);
		img_odpD = (ImageView) findViewById(R.id.img_odpD);

		tv_odpA = (TextView) findViewById(R.id.tv_odpA);
		tv_odpA.setTypeface(tf);
		tv_odpB = (TextView) findViewById(R.id.tv_odpB);
		tv_odpB.setTypeface(tf);
		tv_odpC = (TextView) findViewById(R.id.tv_odpC);
		tv_odpC.setTypeface(tf);
		tv_odpD = (TextView) findViewById(R.id.tv_odpD);
		tv_odpD.setTypeface(tf);

		BazaDanych.pytanie(1, pytanie1, img_pytanie1, pytanie2, img_pytanie2, pytanie3, img_pytanie3, pytanie4, img_pytanie4);
		BazaDanych.odpowiedzi(1, img_odpA, tv_odpA, img_odpB, tv_odpB, img_odpC, tv_odpC, img_odpD, tv_odpD);
		odpowiedzPoprawna = BazaDanych.poprawnaOdp(1);

		sprawdz.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				
				/* STATYSTYKA */
				stat = getSharedPreferences(STAT_NAME, 0);
				int stat_wynik = stat.getInt("statystyka_wynik", 0);
				

				if (odpowiedzUsera == odpowiedzPoprawna) {

					sound.start();

					// sprawdzenie czy pytanie zosta³o ju¿ przerobione
					Boolean przerobionePytanie = stat.getBoolean("przerobione_pytanie" +nrPytania, false);

					// je¿eli tak to dodaje +1 do punktacji
					if (przerobionePytanie == false) {	
						statEditor = stat.edit();
						statEditor.putInt("statystyka_wynik", ++stat_wynik); //dodaje +1 do punktacji
						statEditor.putBoolean("przerobione_pytanie" +nrPytania, true); 
						statEditor.commit();
					}

					przygotowanieEkranu();
					nrPytania++;
					if (nrPytania > BazaDanych.liczbaPytan) nrPytania--;

					BazaDanych.pytanie(nrPytania, pytanie1, img_pytanie1, pytanie2, img_pytanie2, pytanie3, img_pytanie3, pytanie4, img_pytanie4);
					BazaDanych.odpowiedzi(nrPytania, img_odpA, tv_odpA, img_odpB, tv_odpB, img_odpC, tv_odpC, img_odpD, tv_odpD);
					odpowiedzPoprawna = BazaDanych.poprawnaOdp(nrPytania);

				} else { 
					if (odpowiedzUsera == 0) { // je¿eli nie wybrano ¿adnej odpoweidzi
						Toast.makeText(getApplicationContext(), "Nie wybra³es ¿adnej odpowiedzi, to g³upie. Strzelaj chocia¿!", Toast.LENGTH_LONG).show();
					} else { // je¿eli odpowiedŸ jest b³edna
						Toast.makeText(getApplicationContext(), "le", Toast.LENGTH_SHORT).show();
						statEditor = stat.edit();
						statEditor.putBoolean("przerobione_pytanie" +nrPytania, true); 
						statEditor.commit();
					}
				}
			}
		});

		nastepne.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				przygotowanieEkranu();
				nrPytania++;
				if (nrPytania > BazaDanych.liczbaPytan) nrPytania--;
				BazaDanych.pytanie(nrPytania, pytanie1, img_pytanie1, pytanie2, img_pytanie2, pytanie3, img_pytanie3, pytanie4, img_pytanie4);
				BazaDanych.odpowiedzi(nrPytania, img_odpA, tv_odpA, img_odpB, tv_odpB, img_odpC, tv_odpC, img_odpD, tv_odpD);
				odpowiedzPoprawna = BazaDanych.poprawnaOdp(nrPytania);
			}
		});

		poprzednie.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				przygotowanieEkranu();
				nrPytania--;
				if (nrPytania == 0) nrPytania = 1;
				BazaDanych.pytanie(nrPytania, pytanie1, img_pytanie1, pytanie2, img_pytanie2, pytanie3, img_pytanie3, pytanie4, img_pytanie4);
				BazaDanych.odpowiedzi(nrPytania, img_odpA, tv_odpA, img_odpB, tv_odpB, img_odpC, tv_odpC, img_odpD, tv_odpD);
				odpowiedzPoprawna = BazaDanych.poprawnaOdp(nrPytania);
			}
		});

		/* SPRAWDZA CO KLIKN¥£ U¯YTKOWNIK */
		addUserListener();
	}

	private void addUserListener() {
		odpA.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				odpB.setChecked(false);
				odpC.setChecked(false);
				odpD.setChecked(false);
				odpowiedzUsera = 1;
			}
		});
		odpB.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				odpA.setChecked(false);
				odpC.setChecked(false);
				odpD.setChecked(false);
				odpowiedzUsera = 2;
			}
		});
		odpC.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				odpA.setChecked(false);
				odpB.setChecked(false);
				odpD.setChecked(false);
				odpowiedzUsera = 3;
			}
		});
		odpD.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				odpA.setChecked(false);
				odpB.setChecked(false);
				odpC.setChecked(false);
				odpowiedzUsera = 4;
			}
		});

	}

	protected void przygotowanieEkranu() {
		/* PYTANIA */
		pytanie1.setText("");
		pytanie2.setText("");
		pytanie3.setText("");
		pytanie4.setText("");
		img_pytanie1.setImageResource(R.drawable.blank);
		img_pytanie2.setImageResource(R.drawable.blank);
		img_pytanie3.setImageResource(R.drawable.blank);
		img_pytanie4.setImageResource(R.drawable.blank);

		/* ODPOWIEDZI */
		img_odpA.setImageResource(R.drawable.blank);
		img_odpB.setImageResource(R.drawable.blank);
		img_odpC.setImageResource(R.drawable.blank);
		img_odpD.setImageResource(R.drawable.blank);
		tv_odpA.setText("");
		tv_odpB.setText("");
		tv_odpC.setText("");
		tv_odpD.setText("");

		/* CZYSZCZENIE ZAZNACZONEJ ODPOWIEDZI */
		odpA.setChecked(false);
		odpB.setChecked(false);
		odpC.setChecked(false);
		odpD.setChecked(false);

	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.menu, menu);
		return true;
		// return super.onCreateOptionsMenu(menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.info:
			Intent intent = new Intent(this, ActInfo.class);
			startActivity(intent);
			return true;

		case R.id.wiecej:
			Intent intent_see_more = new Intent(Intent.ACTION_VIEW);
			intent_see_more.setData(Uri.parse("market://search?q=pub:EvelanDev"));
			startActivity(intent_see_more);
			return true;

		case R.id.ocen:
			Intent intent_rate = new Intent(Intent.ACTION_VIEW);
			intent_rate.setData(Uri.parse("market://details?id=pl.evelan.matura"));
			startActivity(intent_rate);
			return true;

		case R.id.exit:
			finish();
			return true;

		default:
			return super.onOptionsItemSelected(item);
		}
	}
}
