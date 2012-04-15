package pl.evelan.matura;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class ActStatystyki extends Activity {

	TextView	poprawne, poprawne_proc, przerobione, przerobione_proc;
	ImageView	statystyka;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		setContentView(R.layout.statystyki);
		super.onCreate(savedInstanceState);

		poprawne = (TextView) findViewById(R.id.tv_poprawne);
		poprawne_proc = (TextView) findViewById(R.id.tv_poprawne_proc);
		przerobione = (TextView) findViewById(R.id.tv_przerobione);
		przerobione_proc = (TextView) findViewById(R.id.tv_przerobione_proc);
		statystyka = (ImageView) findViewById(R.id.iv_statystyka);
		// loadBitmap();

	}
}
