package pl.evelan.matura;

import java.math.BigDecimal;

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
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ActStatystyki extends Activity {

	TextView poprawne_txt, poprawne, poprawne_proc, przerobione_txt, przerobione, przerobione_proc;
	ImageView statystyka;

	WebView wykresPoprawne, wykresPrzerobione;
	StringBuilder danePoprawne, danePrzerobione;

	// statystyka
	public static final String STAT_NAME = "Statystyka";
	static SharedPreferences stat;
	static SharedPreferences.Editor statEditor;

	int przerobionePytania = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		setContentView(R.layout.statystyki);
		super.onCreate(savedInstanceState);

		poprawne_txt = (TextView) findViewById(R.id.tv_poprawne_txt);
		poprawne = (TextView) findViewById(R.id.tv_poprawne);
		poprawne_proc = (TextView) findViewById(R.id.tv_poprawne_proc);
		przerobione_txt = (TextView) findViewById(R.id.tv_przerobione_txt);
		przerobione = (TextView) findViewById(R.id.tv_przerobione);
		przerobione_proc = (TextView) findViewById(R.id.tv_przerobione_proc);

		Button reset = (Button) findViewById(R.id.btn_reset);

		Typeface font = Typeface.createFromAsset(getAssets(), "fonts/Rawengulk_Sans.otf");
		poprawne_txt.setTypeface(font);
		poprawne.setTypeface(font);
		poprawne_proc.setTypeface(font);

		przerobione_txt.setTypeface(font);
		przerobione.setTypeface(font);
		przerobione_proc.setTypeface(font);

		stat = getSharedPreferences(STAT_NAME, 0);

		for (int i = 0; i < BazaDanych.liczbaPytan; i++) {
			if (stat.getBoolean("przerobione_pytanie" + i, false)) przerobionePytania++;
		}

		int poprawneInt = stat.getInt("statystyka_wynik", 0);

		poprawne.setText(" " + poprawneInt + " / " + przerobionePytania + " ");

		float procent_poprawne = ((float) poprawneInt / (float) przerobionePytania) * 100;

		poprawne_proc.setText(" (" + round(procent_poprawne, 2, BigDecimal.ROUND_HALF_UP) + "%) ");

		przerobione.setText(" " + przerobionePytania + " / " + BazaDanych.liczbaPytan + " ");
		float procent_przerobione = ((float) przerobionePytania / (float) BazaDanych.liczbaPytan) * 100;
		przerobione_proc.setText(" (" + round(procent_przerobione, 2, BigDecimal.ROUND_HALF_UP) + "%) ");

		// tworzenie wykresu
		wykresPoprawne = (WebView) findViewById(R.id.poprawne);
		wykresPrzerobione = (WebView) findViewById(R.id.przerobione);

		danePoprawne = new StringBuilder();
		danePoprawne.append("https://chart.googleapis.com/chart?cht=p3&chd=t:");
		danePoprawne.append(procent_poprawne);
		danePoprawne.append(",");
		danePoprawne.append(100 - procent_poprawne);
		danePoprawne.append("&chs=340x140&chl=Poprawnie|%C5%B9le&chco=32CD32&chp=0.6");
		wykresPoprawne.loadUrl(danePoprawne.toString());

		danePrzerobione = new StringBuilder();
		danePrzerobione.append("https://chart.googleapis.com/chart?cht=p3&chd=t:");
		danePrzerobione.append(procent_przerobione);
		danePrzerobione.append(",");
		danePrzerobione.append(100 - procent_przerobione);
		danePrzerobione.append("&chs=340x140&chl=Zrobione|&chco=00BFFF&chp=0.8");
		wykresPrzerobione.loadUrl(danePrzerobione.toString());

		reset.setOnClickListener(new OnClickListener() {

			public void onClick(View arg0) {
				statEditor = stat.edit();
				statEditor.putInt("statystyka_wynik", 0);

				for (int i = 0; i < BazaDanych.liczbaPytan; i++) {
					statEditor.putBoolean("przerobione_pytanie" + i, false);
				}

				statEditor.commit();
				finish();
				
				//poprawne.setText(" brak danych");
				//poprawne_proc.setText("");

				//przerobione.setText(" brak danych");
				//przerobione_proc.setText("");
				//wykresPoprawne.loadUrl("https://chart.googleapis.com/chart?cht=p3&chd=t:100,0&chs=360x150&chl=|&chco=A9A9A9&chp=0.6");
				//wykresPrzerobione.loadUrl("https://chart.googleapis.com/chart?cht=p3&chd=t:100,0&chs=360x150&chl=|&chco=A9A9A9&chp=0.6");

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

	public static double round(double unrounded, int precision, int roundingMode) {
		BigDecimal bd = new BigDecimal(unrounded);
		BigDecimal rounded = bd.setScale(precision, roundingMode);
		return rounded.doubleValue();
	}
}
