package pl.evelan.matura;

import android.widget.ImageView;
import android.widget.TextView;

public class BazaDanych {

	static int liczbaPytan = 30; //free ograniczone do 30

	static public void pytanie(int nrPytania, TextView pytanie1, ImageView img_pytanie1,
											  TextView pytanie2, ImageView img_pytanie2,
											  TextView pytanie3, ImageView img_pytanie3,
											  TextView pytanie4, ImageView img_pytanie4) {
		
		switch(nrPytania) {
		case 1:
			//pytanie
			pytanie1.setText("Liczbê ");
			img_pytanie1.setImageResource(R.drawable.sqrt32);
			pytanie2.setText(" mo¿na przedstawiæ w");
			pytanie3.setText("postaci");
			
			//odpowiedzi
			
			
			break;
		
		case 2: 
			pytanie1.setText("Potêga "); 
			img_pytanie1.setImageResource(R.drawable.pyt2_pyt);
			pytanie2.setText(" (gdzie x i y s¹ ró¿ne od");
			pytanie3.setText("zera) jest równa");
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
			pytanie3.setText("jest równe");
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
			
		case 9: 
			pytanie1.setText("6% liczby x jest równe 9. Wtedy ");
			break;
			
		case 10: 
			pytanie1.setText("Iloraz ");
			img_pytanie1.setImageResource(R.drawable.pyt10_pytanie);
			pytanie2.setText(" jest równy");
			break;
			
		case 11: 
			pytanie1.setText("O liczbie x wiadomo, ¿e ");
			img_pytanie1.setImageResource(R.drawable.pyt11_pytanie);
			pytanie3.setText("zatem");
			break;
			
		case 12: 
			pytanie1.setText("Wyra¿enie ");
			img_pytanie1.setImageResource(R.drawable.pyt12_pytanie);
			pytanie2.setText(" jest równe");
			pytanie3.setText("iloczynowi");
			break;
			
		case 13: 
			pytanie1.setText("Wiercho³ek paraboli o równaniu ");
			img_pytanie3.setImageResource(R.drawable.pyt13_pytanie);
			pytanie3.setText("ma wspó³rzêdne");
			break;
			
		case 14:
			pytanie1.setText("Ile jest liczb naturalnych czterocyfrowych o sumie cyfr równej 2?");
			break;
			
		case 15: 
			pytanie1.setText("Œrednia arytmetyczna szeœciu liczb:");
			pytanie3.setText("3, 1, 1, 0, x, 2 jest równa 2. Wtedy liczba x jest równa");
			break;
			
		case 16:
			pytanie1.setText("Liczba ");
			img_pytanie1.setImageResource(R.drawable.pyt16_pytanie);
			pytanie2.setText(" jest równa");
			break;
			
		case 17:
			pytanie1.setText("Najmniejsz¹ liczb¹ ca³kowit¹ nale¿¹c¹ do zbioru rozwi¹zañ nierównoœci");
			img_pytanie3.setImageResource(R.drawable.pyt17_pytanie);
			pytanie4.setText(" jest");
			break;
			
		case 18:
			pytanie1.setText("Miejscem zerowym tej funkcji jest liczba");
			img_pytanie3.setImageResource(R.drawable.pyt18_pytanie);
			break;
			
		case 19:
			pytanie1.setText("Pierwsza rata, która stanowi 9% ceny towaru, jest równa 189z³. Rower kosztuje ");
			break;
			
		case 20: 
			pytanie1.setText("Funkcja liniowa ");
			img_pytanie1.setImageResource(R.drawable.pyt20_pytanie);
			break;
			
		case 21: 
			pytanie1.setText("Liczb¹ odwrotn¹ do ");
			img_pytanie1.setImageResource(R.drawable.pyt21_pyt);
			pytanie2.setText(" jest");
			break;
			
		case 22: 
			pytanie1.setText("Po dwukrotnej obni¿ce ceny za ka¿dym razem o 4% buty kosztowa³y 230,40z³");
			pytanie3.setText("Ich cena pocz¹tkowa to");
			break;
			
		case 23: 
			pytanie1.setText("Wykres funkcji okreœlonej na zbiorze liczb rzeczywistych");
			break;
			
		case 24: 
			pytanie1.setText("Do zbioru rozwi¹zañ nierównoœci ");
			img_pytanie1.setImageResource(R.drawable.pyt24_pyt);
			pytanie3.setText("nie nale¿y liczba");
			break;
			
		case 25: 
			pytanie1.setText("Okr¹g o równaniu ");
			img_pytanie1.setImageResource(R.drawable.pyt25_pyt);
			break;
			
		case 26: 
			pytanie1.setText("K¹t œrodkowy okrêgu jest wiêkszy od kata wpisanego opartego na tym samym ³uku o");
			break;
			
		case 27: 
			pytanie1.setText("Funkcja ");
			img_pytanie1.setImageResource(R.drawable.pyt27_pyt);
			pytanie2.setText(" jest rosn¹ca");
			pytanie3.setText("w przedziale");
			break;
			
		case 28: 
			pytanie1.setText("Funkcja ");
			img_pytanie1.setImageResource(R.drawable.pyt28_pyt);
			pytanie3.setText("ma");
			break;
			
		case 29: 
			pytanie1.setText("Równanie ");
			img_pytanie1.setImageResource(R.drawable.pyt29_pyt);
			pytanie2.setText(" ma");
			break;
			
		case 30: 
			pytanie1.setText("Powierzchnia szeœcianu wynosi ");
			img_pytanie1.setImageResource(R.drawable.pyt30_pyt);
			pytanie3.setText("KrawêdŸ tego szeœcianu ma d³ugoœæ");
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
		case 9: odpowiedz = 2; break;
		case 10: odpowiedz = 2; break;
		case 11: odpowiedz = 3; break;
		case 12: odpowiedz = 1; break;
		case 13: odpowiedz = 1; break;
		case 14: odpowiedz = 4; break;
		case 15: odpowiedz = 3; break;
		case 16: odpowiedz = 1; break;
		case 17: odpowiedz = 2; break;
		case 18: odpowiedz = 4; break;
		case 19: odpowiedz = 2; break;
		case 20: odpowiedz = 4; break;
		case 21: odpowiedz = 2; break;
		case 22: odpowiedz = 1; break;
		case 23: odpowiedz = 1; break;
		case 24: odpowiedz = 4; break;
		case 25: odpowiedz = 1; break;
		case 26: odpowiedz = 3; break;
		case 27: odpowiedz = 1; break;
		case 28: odpowiedz = 3; break;
		case 29: odpowiedz = 3; break;
		case 30: odpowiedz = 2; break;

		}
		return odpowiedz;
	}

	static public void odpowiedzi(int nrPytania, ImageView img_odpA, TextView odpA, ImageView img_odpB, TextView odpB, ImageView img_odpC, TextView odpC,
			ImageView img_odpD, TextView odpD) {
		switch (nrPytania) {
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
		case 9:
			odpA.setText("x = 240");
			odpB.setText("x = 150");
			odpC.setText("x = 24");
			odpD.setText("x = 15");
			break;

		case 10:
			img_odpA.setImageResource(R.drawable.pyt10_a);
			img_odpB.setImageResource(R.drawable.pyt10_b);
			img_odpC.setImageResource(R.drawable.pyt10_c);
			img_odpD.setImageResource(R.drawable.pyt10_d);
			break;

		case 11:
			img_odpA.setImageResource(R.drawable.pyt11_a);
			img_odpB.setImageResource(R.drawable.pyt11_b);
			img_odpC.setImageResource(R.drawable.pyt11_c);
			img_odpD.setImageResource(R.drawable.pyt11_d);
			break;

		case 12:
			img_odpA.setImageResource(R.drawable.pyt12_a);
			img_odpB.setImageResource(R.drawable.pyt12_b);
			img_odpC.setImageResource(R.drawable.pyt12_c);
			img_odpD.setImageResource(R.drawable.pyt12_d);
			break;

		case 13:
			odpA.setText("(-1;0)");
			odpB.setText("(0;-1)");
			odpC.setText("(1;0)");
			odpD.setText("(0;1)");
			break;
		case 14:
			odpA.setText("1");
			odpB.setText("2");
			odpC.setText("3");
			odpD.setText("4");
			break;
		case 15:
			odpA.setText("3");
			odpB.setText("4");
			odpC.setText("5");
			odpD.setText("6");
			break;

		case 16:
			img_odpA.setImageResource(R.drawable.pyt16_a);
			img_odpB.setImageResource(R.drawable.pyt16_b);
			img_odpC.setImageResource(R.drawable.pyt16_c);
			img_odpD.setImageResource(R.drawable.pyt16_d);
			break;

		case 17:
			odpA.setText("1");
			odpB.setText("2");
			odpC.setText("-1");
			odpD.setText("-2");
			break;

		case 18:
			img_odpA.setImageResource(R.drawable.pyt18_a);
			img_odpB.setImageResource(R.drawable.pyt18_b);
			img_odpC.setImageResource(R.drawable.pyt18_c);
			img_odpD.setImageResource(R.drawable.pyt18_d);
			break;

		case 19:
			odpA.setText("1701 z³");
			odpB.setText("2100 z³");
			odpC.setText("1890 z³");
			odpD.setText("2091 z³");
			break;

		case 20:
			odpA.setText("jest malej¹ca i jej wykres przechodzi przez punkt (0;6)");
			odpB.setText("jest rosn¹ca i jej wykres przechodzi przez punkt (0;6)");
			odpC.setText("jest malej¹ca i jej wykres przechodzi przez punkt (0;-6)");
			odpD.setText("jest rosn¹ca i jej wykres przechodzi przez punkt (0;-6)");
			break;

		case 21:
			img_odpA.setImageResource(R.drawable.pyt21_a);
			img_odpB.setImageResource(R.drawable.pyt21_b);
			img_odpC.setImageResource(R.drawable.pyt21_c);
			img_odpD.setImageResource(R.drawable.pyt21_d);
			break;

		case 22:
			odpA.setText("250z³");
			odpB.setText("270z³");
			odpC.setText("290z³");
			odpD.setText("202,40z³");
			break;

		case 23:
			odpA.setText("musi mieæ punkt wspólny z osi¹ OY");
			odpB.setText("mo¿e mieæ dwa punkty wspólne z osi¹ OY");
			odpC.setText("musi mieæ punkt wspólny z osi¹ OX");
			odpD.setText("przechodzi przez pocz¹tek uk³adu wspó³rzêdnych");
			break;

		case 24:
			img_odpA.setImageResource(R.drawable.pyt24_a);
			img_odpB.setImageResource(R.drawable.pyt24_b);
			img_odpC.setImageResource(R.drawable.pyt24_c);
			img_odpD.setImageResource(R.drawable.pyt24_d);
			break;

		case 25:
			odpA.setText("nie przecina osi OX");
			odpB.setText("nie przecina osi OY");
			odpC.setText("przechodzi przez pocz¹tek uk³adu wspó³rzêdnych");
			odpD.setText("przechodzi przez punkt (-1;-2)");
			break;

		case 26:
			odpA.setText("200%");
			odpB.setText("150%");
			odpC.setText("100%");
			odpD.setText("50%");
			break;

		case 27:
			img_odpA.setImageResource(R.drawable.pyt27_a);
			img_odpB.setImageResource(R.drawable.pyt27_b);
			img_odpC.setImageResource(R.drawable.pyt27_c);
			img_odpD.setImageResource(R.drawable.pyt27_d);
			break;

		case 28:
			odpA.setText("1 miejsce zerowe");
			odpB.setText("2 miejsca zerowe");
			odpC.setText("3 miejsca zerowe");
			odpD.setText("4 miejsca zerowe");
			break;

		case 29:
			odpA.setText("2 pierwiastki");
			odpB.setText("3 pierwiastki");
			odpC.setText("1 pierwiastek");
			odpD.setText("4 pierwiastki");

			break;

		case 30:
			odpA.setText("4cm");
			odpB.setText("5cm");
			odpC.setText("5,5cm");
			odpD.setText("6cm");
			break;

		}
	}
}
