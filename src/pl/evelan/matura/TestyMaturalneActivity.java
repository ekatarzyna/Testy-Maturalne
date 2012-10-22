package pl.evelan.matura;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class TestyMaturalneActivity extends Activity {

	// statystyka
	public static final String STAT_NAME = "Statystyka";
	static SharedPreferences stat;
	static SharedPreferences.Editor statEditor;
	
	 

	int przerobionePytania = 0;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		Button pytania = (Button) findViewById(R.id.btn_przegladaj);
		Button statystyka = (Button) findViewById(R.id.btn_statystyki);
		Button info = (Button) findViewById(R.id.btn_info);
		TextView zostalo = (TextView) findViewById(R.id.tv_zostalo);
		TextView zostalo_txt = (TextView) findViewById(R.id.tv_zostalo_text);
		
		Typeface font = Typeface.createFromAsset(getAssets(), "fonts/visitor.ttf"); 
		zostalo.setTypeface(font);  
		zostalo_txt.setTypeface(font);  

		// do matury zosta³o

		Date date1 = new Date();
		int rok = 2013;
		Calendar calendar = new GregorianCalendar(rok, 4, 9); // pierwsza liczba normalnie, druga cyfra o jeden mniejsza, trzecia cyfra o jeden wiêksza 2012,4,9
		long days = ((calendar.getTimeInMillis() - date1.getTime()) / 86400000);
		zostalo.setText(days + " dni");
		// Toast.makeText(getApplicationContext(), "Dni = " +days, Toast.LENGTH_SHORT).show(); debug :E

		if (days == 1) {
			zostalo_txt.setText("");
			zostalo.setText("Jutro matura, daj sobie ju¿ spokój, wszystko umiesz.\nPowodzenia!");
		}

		if (days == 0) {
			zostalo_txt.setText("");
			zostalo.setText("Szybka powtórka? :)\nBêdzie dobrze, powodzenia!");
		}
		
		if (days < 0) {
			zostalo_txt.setText("");
			zostalo.setText("");
		}

		pytania.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				Intent intent = new Intent(getApplicationContext(), ActPytania.class);
				startActivity(intent);
			}
		});

		statystyka.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {

				stat = getSharedPreferences(STAT_NAME, 0);

				for (int i = 0; i < BazaDanych.liczbaPytan; i++) {
					if (stat.getBoolean("przerobione_pytanie" + i, false)) przerobionePytania++;
				}

				if (przerobionePytania == 0) {
					Toast.makeText(getApplicationContext(), "Nie ma statystyk, odpowiedz najpierw na jakieœ pytania", Toast.LENGTH_LONG).show();
				} else {
					Intent intent = new Intent(getApplicationContext(), ActStatystyki.class);
					startActivity(intent);
				}
			}
		});

		info.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				Intent intent = new Intent(getApplicationContext(), ActInfo.class);
				startActivity(intent);
			}
		});

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