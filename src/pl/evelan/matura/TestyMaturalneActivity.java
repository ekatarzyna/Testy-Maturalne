package pl.evelan.matura;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class TestyMaturalneActivity extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		Button pytania = (Button) findViewById(R.id.btn_przegladaj);
		Button statystyka = (Button) findViewById(R.id.btn_statystyki);
		Button info = (Button) findViewById(R.id.btn_info);


		pytania.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				Intent intent = new Intent(getApplicationContext(), ActPytania.class);
				startActivity(intent);
			}
		});
		
		statystyka.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				Intent intent = new Intent(getApplicationContext(), ActStatystyki.class);
				startActivity(intent);
			}
		});
		
		info.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				Intent intent = new Intent(getApplicationContext(), ActInfo.class);
				startActivity(intent);
			}
		});
	}
}