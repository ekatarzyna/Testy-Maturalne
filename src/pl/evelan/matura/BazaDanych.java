package pl.evelan.matura;

import android.widget.ImageView;
import android.widget.TextView;

public class BazaDanych {
	
	//TODO:
	//LEVEL: HARDCORE on; (Matura rozszerzona) 
	
	
	static int liczbaPytan = 8;
	
	static public void pytanie(int nrPytania, TextView pytanie1, ImageView img_pytanie1,
											  TextView pytanie2, ImageView img_pytanie2,
											  TextView pytanie3, ImageView img_pytanie3,
											  TextView pytanie4, ImageView img_pytanie4) {
		
		switch(nrPytania) {
		case 1: 
			pytanie1.setText("Liczbê ");
			img_pytanie1.setImageResource(R.drawable.sqrt32);
			pytanie2.setText(" mo¿na przedstawiæ w");
			pytanie3.setText(" postaci");
			break;
		
		case 2: 
			pytanie1.setText("Potêga "); 
			img_pytanie1.setImageResource(R.drawable.pyt2_pyt);
			pytanie2.setText(" (gdzie x i y s¹");
			pytanie3.setText("ró¿ne od zera) jest równa");
			break;
			
		case 3: 
			pytanie1.setText("Liczba ");
			img_pytanie1.setImageResource(R.drawable.pyt3_pytanie);
			pytanie2.setText(" jest równa");
			break;
		case 4: 
			pytanie1.setText("Wyra¿enie ");
			img_pytanie1.setImageResource(R.drawable.pyt4_pytanie1);
			pytanie2.setText(" dla ");
			img_pytanie2.setImageResource(R.drawable.pyt4_pytanie2);
			pytanie3.setText(" jest równe");
			break;
		case 5: 
			pytanie1.setText("W pewnym sklepie ceny wszystkich p³yt CD obni¿ono o 20%");
			pytanie3.setText("Zatem za dwie p³yty kupione w tym sklepie nale¿y zap³aciæ mniej o");
			break;
		case 6: 
			pytanie1.setText("Wielomian ");
			img_pytanie1.setImageResource(R.drawable.pyt6_pytanie);
			pytanie2.setText(" jest równy");
			break;
		case 7: 
			pytanie1.setText("Równanie ");
			img_pytanie1.setImageResource(R.drawable.pyt7_pytanie);
			break;
		case 8: 
			pytanie1.setText("Najwiêksz¹ liczbê ca³kowit¹ spe³niaj¹c¹ nierównoœæ ");
			img_pytanie3.setImageResource(R.drawable.pyt8_pytanie);
			pytanie4.setText(" jest");
			break;
		/*
		case : 
			pytanie1.setText("");
			img_pytanie1.setImageResource(R.drawable.);
			pytanie2.setText("");
			img_pytanie2.setImageResource(R.drawable.);
			pytanie3.setText("");
			img_pytanie3.setImageResource(R.drawable.);
			pytanie4.setText("");
			img_pytanie4.setImageResource(R.drawable.);
			break;
		*/
		}
	}
	
	static public int poprawnaOdp(int nrPytania){
		int odpowiedz = -1;
		
		switch (nrPytania) {
		case 1: odpowiedz = 4; break;
		case 2: odpowiedz = 2; break;
		case 3: odpowiedz = 1; break;
		case 4: odpowiedz = 3; break;
		case 5: odpowiedz = 2; break;
		case 6: odpowiedz = 2; break;
		case 7: odpowiedz = 1; break;
		case 8: odpowiedz = 1; break;
		}
		return odpowiedz;
	}
	
	static public void odpowiedzi(int nrPytania, ImageView img_odpA, TextView odpA, 
												 ImageView img_odpB, TextView odpB,
												 ImageView img_odpC, TextView odpC,
												 ImageView img_odpD, TextView odpD) {
		switch(nrPytania){
		case 1: 
			img_odpA.setImageResource(R.drawable.pyt1_a8sqrt2);
			img_odpB.setImageResource(R.drawable.pyt1_b12sqrt3);
			img_odpC.setImageResource(R.drawable.pyt1_c4sqrt8);
			img_odpD.setImageResource(R.drawable.pyt1_d4sqrt2);
			break;
		case 2: 
			img_odpA.setImageResource(R.drawable.pyt2_a);
			img_odpB.setImageResource(R.drawable.pyt2_b);
			img_odpC.setImageResource(R.drawable.pyt2_c);
			img_odpD.setImageResource(R.drawable.pyt2_d);
			break;			
		case 3: 
			img_odpA.setImageResource(R.drawable.pyt3_a);
			img_odpB.setImageResource(R.drawable.pyt3_b);
			img_odpC.setImageResource(R.drawable.pyt3_c);
			img_odpD.setImageResource(R.drawable.pyt3_d);
			break;			
		case 4: 
			img_odpA.setImageResource(R.drawable.pyt4_a);
			img_odpB.setImageResource(R.drawable.pyt4_b);
			img_odpC.setImageResource(R.drawable.pyt4_c);
			img_odpD.setImageResource(R.drawable.pyt4_d);
			break;			
		case 5: 
			odpA.setText("10%");
			odpB.setText("20%");
			odpC.setText("30%");
			odpD.setText("40%");
			break;			
		case 6: 
			img_odpA.setImageResource(R.drawable.pyt6_a);
			img_odpB.setImageResource(R.drawable.pyt6_b);
			img_odpC.setImageResource(R.drawable.pyt6_c);
			img_odpD.setImageResource(R.drawable.pyt6_d);
			break;
		case 7: 
			odpA.setText("nie ma rozwi¹zañ");
			odpB.setText("ma dok³adnie jedno rozwi¹zanie");
			odpC.setText("ma dok³adnie dwa rozwi¹zania");
			odpD.setText("ma dok³adnie trzy rozwi¹zania");
			break;
		case 8: 
			odpA.setText("-5");
			odpB.setText("-4");
			odpC.setText("-3");
			odpD.setText("-2");
			break;
		
		}
	}

}
