package pl.evelan.matura;

import android.app.Activity;
import android.content.Intent;
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

public class ActInfo extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		setContentView(R.layout.info);
		super.onCreate(savedInstanceState);
		Button email = (Button) findViewById(R.id.btn_email);
		
		TextView info = (TextView) findViewById(R.id.info_txt);
		Typeface font = Typeface.createFromAsset(getAssets(), "fonts/Rawengulk_Sans.otf"); 
		//Rawengulk_Sans.otf
		info.setTypeface(font);  
		
		email.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				Intent emailIntent = new Intent(Intent.ACTION_SEND);
				String subject = "Aplikacja Maturalna - informacja";
				String body = "";
				String[] extra = new String[] { "evelan3094@gmail.com" };
				emailIntent.putExtra(Intent.EXTRA_EMAIL, extra);
				emailIntent.putExtra(Intent.EXTRA_SUBJECT, subject);
				emailIntent.putExtra(Intent.EXTRA_TEXT, body);
				emailIntent.setType("message/rfc822");
				startActivity(emailIntent);
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
