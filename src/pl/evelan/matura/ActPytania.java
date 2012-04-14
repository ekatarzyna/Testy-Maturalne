package pl.evelan.matura;

import android.app.Activity;
import android.os.Bundle;
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
	
	//TextView pytanie;
	//ImageView pytanie;
	
	int odpowiedzUsera = 0;
	int odpowiedzPoprawna;
	int nrPytania = 1;
	
	//pytania
	TextView pytanie1, pytanie2, pytanie3, pytanie4;
	ImageView img_pytanie1, img_pytanie2, img_pytanie3, img_pytanie4;
	
	//odpowiedzi
	ImageView img_odpA, img_odpB, img_odpC, img_odpD;
	TextView tv_odpA, tv_odpB, tv_odpC, tv_odpD; 
	
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.pytanie);

		odpA = (RadioButton) findViewById(R.id.rb_odp_a);
		odpB = (RadioButton) findViewById(R.id.rb_odp_b);
		odpC = (RadioButton) findViewById(R.id.rb_odp_c);
		odpD = (RadioButton) findViewById(R.id.rb_odp_d);
		
		Button sprawdz = (Button) findViewById(R.id.btn_sprawdz);
		Button nastepne = (Button) findViewById(R.id.btn_nastepne);
		Button poprzednie = (Button) findViewById(R.id.btn_poprzednie);
		
		//pytanie
		pytanie1 = (TextView) findViewById(R.id.tv_pytanie_1);
		pytanie2 = (TextView) findViewById(R.id.tv_pytanie_2);
		pytanie3 = (TextView) findViewById(R.id.tv_pytanie_3);
		pytanie4 = (TextView) findViewById(R.id.tv_pytanie_4);
		img_pytanie1 = (ImageView) findViewById(R.id.iv_pytanie_1);
		img_pytanie2 = (ImageView) findViewById(R.id.iv_pytanie_2);
		img_pytanie3 = (ImageView) findViewById(R.id.iv_pytanie_3);
		img_pytanie4 = (ImageView) findViewById(R.id.iv_pytanie_4);
		
		
		//odpowiedz
		img_odpA = (ImageView) findViewById(R.id.img_odpA);
		img_odpB = (ImageView) findViewById(R.id.img_odpB);
		img_odpC = (ImageView) findViewById(R.id.img_odpC);
		img_odpD = (ImageView) findViewById(R.id.img_odpD);

		tv_odpA = (TextView) findViewById(R.id.tv_odpA);
		tv_odpB = (TextView) findViewById(R.id.tv_odpB);
		tv_odpC = (TextView) findViewById(R.id.tv_odpC);
		tv_odpD = (TextView) findViewById(R.id.tv_odpD);
		
		BazaDanych.pytanie(1, pytanie1, img_pytanie1, pytanie2, img_pytanie2, pytanie3, img_pytanie3, pytanie4, img_pytanie4);
		BazaDanych.odpowiedzi(1, img_odpA, tv_odpA, img_odpB, tv_odpB, img_odpC, tv_odpC, img_odpD, tv_odpD);
		odpowiedzPoprawna = BazaDanych.poprawnaOdp(1);
		
		sprawdz.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				/*
				if(odpowiedzUsera == 0) {
					Toast.makeText(getApplicationContext(), "Nie wybra≥es øadnej odpowiedzi, to g≥upie. Strzelaj chociaø!", Toast.LENGTH_LONG).show();
				}
				*/
				if(odpowiedzUsera == odpowiedzPoprawna){
					Toast.makeText(getApplicationContext(), "Dobrze!", Toast.LENGTH_SHORT).show();
					//TODO: liczenie punktÛw i zapisywanie do sharedpreferences
										
				} else {
					Toast.makeText(getApplicationContext(), "èle :/", Toast.LENGTH_SHORT).show();
				}
			}
		});
		
		nastepne.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				przygotowanieEkranu();
				nrPytania++; 
				BazaDanych.pytanie(nrPytania, pytanie1, img_pytanie1, pytanie2, img_pytanie2, pytanie3, img_pytanie3, pytanie4, img_pytanie4);
				BazaDanych.odpowiedzi(nrPytania, img_odpA, tv_odpA, img_odpB, tv_odpB, img_odpC, tv_odpC, img_odpD, tv_odpD);
				odpowiedzPoprawna = BazaDanych.poprawnaOdp(nrPytania);
			}
		});
		
		/*SPRAWDZA CO KLIKN•£ UØYTKOWNIK*/
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
		/*PYTANIA*/
		pytanie1.setText("");
		pytanie2.setText("");
		pytanie3.setText("");
		pytanie4.setText("");
		img_pytanie1.setImageResource(R.drawable.blank);
		img_pytanie2.setImageResource(R.drawable.blank);
		img_pytanie3.setImageResource(R.drawable.blank);
		img_pytanie4.setImageResource(R.drawable.blank);
		
		/*ODPOWIEDZI*/
		img_odpA.setImageResource(R.drawable.blank);
		img_odpB.setImageResource(R.drawable.blank);
		img_odpC.setImageResource(R.drawable.blank);
		img_odpD.setImageResource(R.drawable.blank);
		tv_odpA.setText("");
		tv_odpB.setText("");
		tv_odpC.setText("");
		tv_odpD.setText("");
		
		/*CZYSZCZENIE ZAZNACZONEJ ODPOWIEDZI*/
		odpA.setChecked(false);
		odpB.setChecked(false);
		odpC.setChecked(false);
		odpD.setChecked(false);
		
	}
}
