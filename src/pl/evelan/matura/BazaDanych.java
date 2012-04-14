package pl.evelan.matura;

import android.widget.ImageView;
import android.widget.TextView;

public class BazaDanych {
	
	//TODO:
	//LEVEL: HARDCORE on; (Matura rozszerzona) 
	
	
	static int liczbaPytan = 1;
	
	static public void pytanie(int nrPytania, TextView pytanie1, ImageView img_pytanie1,
											  TextView pytanie2, ImageView img_pytanie2,
											  TextView pytanie3, ImageView img_pytanie3,
											  TextView pytanie4, ImageView img_pytanie4){
		
		switch(nrPytania){
		case 1: 
			pytanie1.setText("Pytanie,");
			pytanie2.setText(" dalszy ciag pytania");
			break;
		
		case 2: 
			pytanie1.setText("Pytanie 2: "); 
			img_pytanie1.setImageResource(R.drawable.ic_launcher);
			break;
		
		case 3:
			pytanie1.setText("Pytanie 3: ");
			pytanie2.setText("trolololool");
			break;
			
		case 4:
			pytanie1.setText("Pytanie 4: ");
			pytanie2.setText("||X|-1| = 0 dla x < 0");
			break;
		}
	}
	
	static public int poprawnaOdp(int nrPytania){
		int odpowiedz = -1;
		
		switch (nrPytania) {
		case 1: odpowiedz = 3; break;
		case 2: odpowiedz = 2; break;
		case 3: odpowiedz = 1; break;
		case 4: odpowiedz = 4; break;
		case 5: odpowiedz = 3; break;
		case 6: odpowiedz = 2; break;
		case 7: odpowiedz = 1; break;
		}
		return odpowiedz;
	}
	
	static public void odpowiedzi(int nrPytania, ImageView img_odpA, TextView odpA, 
												 ImageView img_odpB, TextView odpB,
												 ImageView img_odpC, TextView odpC,
												 ImageView img_odpD, TextView odpD) {
		switch(nrPytania){
		case 1: 
			odpA.setText("x = 2");
			odpB.setText("x = 1,4");
			odpC.setText("x = 43");
			odpD.setText("x = 8");
			break;
		case 2: 
			odpA.setText("y = 2");
			odpB.setText("y = 1,4");
			odpC.setText("y = 43");
			odpD.setText("y = 8");
			break;
		case 3: 
			odpA.setText("Wiêksze od 0");
			odpB.setText("Mniejsze od 0");
			odpC.setText("Równe 0");
			odpD.setText("Nie wiem");
			break;
		case 4: 
			odpA.setText("[0,6]");
			odpB.setText("[6,3]");
			odpC.setText("[11,23]");
			odpD.setText("[0,0]");
			break;
		case 5: 
			odpA.setText("x = 2");
			odpB.setText("x = 1,4");
			odpC.setText("x = 43");
			odpD.setText("x = 8");
			break;
			
		}
	}

}
