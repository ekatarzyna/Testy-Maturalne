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
			pytanie1.setText("Liczb� ");
			img_pytanie1.setImageResource(R.drawable.sqrt32);
			pytanie2.setText(" mo�na przedstawi� w");
			pytanie3.setText("postaci");
			
			//odpowiedzi
			
			
			break;
		
		case 2: 
			pytanie1.setText("Pot�ga "); 
			img_pytanie1.setImageResource(R.drawable.pyt2_pyt);
			pytanie2.setText(" (gdzie x i y s� r�ne od");
			pytanie3.setText("zera) jest r�wna");
			break;
			
		case 3: 
			pytanie1.setText("Liczba ");
			img_pytanie1.setImageResource(R.drawable.pyt3_pytanie);
			pytanie2.setText(" jest r�wna");
			break;
		case 4: 
			pytanie1.setText("Wyra�enie ");
			img_pytanie1.setImageResource(R.drawable.pyt4_pytanie1);
			pytanie2.setText(" dla ");
			img_pytanie2.setImageResource(R.drawable.pyt4_pytanie2);
			pytanie3.setText("jest r�wne");
			break;
		case 5: 
			pytanie1.setText("W pewnym sklepie ceny wszystkich p�yt CD obni�ono o 20%");
			pytanie3.setText("Zatem za dwie p�yty kupione w tym sklepie nale�y zap�aci� mniej o");
			break;
		case 6: 
			pytanie1.setText("Wielomian ");
			img_pytanie1.setImageResource(R.drawable.pyt6_pytanie);
			pytanie2.setText(" jest r�wny");
			break;
		case 7: 
			pytanie1.setText("R�wnanie ");
			img_pytanie1.setImageResource(R.drawable.pyt7_pytanie);
			break;
		case 8: 
			pytanie1.setText("Najwi�ksz� liczb� ca�kowit� spe�niaj�c� nier�wno�� ");
			img_pytanie3.setImageResource(R.drawable.pyt8_pytanie);
			pytanie4.setText(" jest");
			break;
			
		case 9: 
			pytanie1.setText("6% liczby x jest r�wne 9. Wtedy ");
			break;
			
		case 10: 
			pytanie1.setText("Iloraz ");
			img_pytanie1.setImageResource(R.drawable.pyt10_pytanie);
			pytanie2.setText(" jest r�wny");
			break;
			
		case 11: 
			pytanie1.setText("O liczbie x wiadomo, �e ");
			img_pytanie1.setImageResource(R.drawable.pyt11_pytanie);
			pytanie3.setText("zatem");
			break;
			
		case 12: 
			pytanie1.setText("Wyra�enie ");
			img_pytanie1.setImageResource(R.drawable.pyt12_pytanie);
			pytanie2.setText(" jest r�wne");
			pytanie3.setText("iloczynowi");
			break;
			
		case 13: 
			pytanie1.setText("Wiercho�ek paraboli o r�wnaniu ");
			img_pytanie3.setImageResource(R.drawable.pyt13_pytanie);
			pytanie3.setText("ma wsp�rz�dne");
			break;
			
		case 14:
			pytanie1.setText("Ile jest liczb naturalnych czterocyfrowych o sumie cyfr r�wnej 2?");
			break;
			
		case 15: 
			pytanie1.setText("�rednia arytmetyczna sze�ciu liczb:");
			pytanie3.setText("3, 1, 1, 0, x, 2 jest r�wna 2. Wtedy liczba x jest r�wna");
			break;
			
		case 16:
			pytanie1.setText("Liczba ");
			img_pytanie1.setImageResource(R.drawable.pyt16_pytanie);
			pytanie2.setText(" jest r�wna");
			break;
			
		case 17:
			pytanie1.setText("Najmniejsz� liczb� ca�kowit� nale��c� do zbioru rozwi�za� nier�wno�ci");
			img_pytanie3.setImageResource(R.drawable.pyt17_pytanie);
			pytanie4.setText(" jest");
			break;
			
		case 18:
			pytanie1.setText("Miejscem zerowym tej funkcji jest liczba");
			img_pytanie3.setImageResource(R.drawable.pyt18_pytanie);
			break;
			
		case 19:
			pytanie1.setText("Pierwsza rata, kt�ra stanowi 9% ceny towaru, jest r�wna 189z�. Rower kosztuje ");
			break;
			
		case 20: 
			pytanie1.setText("Funkcja liniowa ");
			img_pytanie1.setImageResource(R.drawable.pyt20_pytanie);
			break;
			
		case 21: 
			pytanie1.setText("Liczb� odwrotn� do ");
			img_pytanie1.setImageResource(R.drawable.pyt21_pyt);
			pytanie2.setText(" jest");
			break;
			
		case 22: 
			pytanie1.setText("Po dwukrotnej obni�ce ceny za ka�dym razem o 4% buty kosztowa�y 230,40z�");
			pytanie3.setText("Ich cena pocz�tkowa to");
			break;
			
		case 23: 
			pytanie1.setText("Wykres funkcji okre�lonej na zbiorze liczb rzeczywistych");
			break;
			
		case 24: 
			pytanie1.setText("Do zbioru rozwi�za� nier�wno�ci ");
			img_pytanie1.setImageResource(R.drawable.pyt24_pyt);
			pytanie3.setText("nie nale�y liczba");
			break;
			
		case 25: 
			pytanie1.setText("Okr�g o r�wnaniu ");
			img_pytanie1.setImageResource(R.drawable.pyt25_pyt);
			break;
			
		case 26: 
			pytanie1.setText("K�t �rodkowy okr�gu jest wi�kszy od kata wpisanego opartego na tym samym �uku o");
			break;
			
		case 27: 
			pytanie1.setText("Funkcja ");
			img_pytanie1.setImageResource(R.drawable.pyt27_pyt);
			pytanie2.setText(" jest rosn�ca");
			pytanie3.setText("w przedziale");
			break;
			
		case 28: 
			pytanie1.setText("Funkcja ");
			img_pytanie1.setImageResource(R.drawable.pyt28_pyt);
			pytanie3.setText("ma");
			break;
			
		case 29: 
			pytanie1.setText("R�wnanie ");
			img_pytanie1.setImageResource(R.drawable.pyt29_pyt);
			pytanie2.setText(" ma");
			break;
			
		case 30: 
			pytanie1.setText("Powierzchnia sze�cianu wynosi ");
			img_pytanie1.setImageResource(R.drawable.pyt30_pyt);
			pytanie3.setText("Kraw�d� tego sze�cianu ma d�ugo��");
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
			odpA.setText("nie ma rozwi�za�");
			odpB.setText("ma dok�adnie jedno rozwi�zanie");
			odpC.setText("ma dok�adnie dwa rozwi�zania");
			odpD.setText("ma dok�adnie trzy rozwi�zania");
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
			odpA.setText("1701 z�");
			odpB.setText("2100 z�");
			odpC.setText("1890 z�");
			odpD.setText("2091 z�");
			break;

		case 20:
			odpA.setText("jest malej�ca i jej wykres przechodzi przez punkt (0;6)");
			odpB.setText("jest rosn�ca i jej wykres przechodzi przez punkt (0;6)");
			odpC.setText("jest malej�ca i jej wykres przechodzi przez punkt (0;-6)");
			odpD.setText("jest rosn�ca i jej wykres przechodzi przez punkt (0;-6)");
			break;

		case 21:
			img_odpA.setImageResource(R.drawable.pyt21_a);
			img_odpB.setImageResource(R.drawable.pyt21_b);
			img_odpC.setImageResource(R.drawable.pyt21_c);
			img_odpD.setImageResource(R.drawable.pyt21_d);
			break;

		case 22:
			odpA.setText("250z�");
			odpB.setText("270z�");
			odpC.setText("290z�");
			odpD.setText("202,40z�");
			break;

		case 23:
			odpA.setText("musi mie� punkt wsp�lny z osi� OY");
			odpB.setText("mo�e mie� dwa punkty wsp�lne z osi� OY");
			odpC.setText("musi mie� punkt wsp�lny z osi� OX");
			odpD.setText("przechodzi przez pocz�tek uk�adu wsp�rz�dnych");
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
			odpC.setText("przechodzi przez pocz�tek uk�adu wsp�rz�dnych");
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
