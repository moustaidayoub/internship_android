package com.example.ssc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class FichierExercices extends Activity implements OnClickListener {
	private Button btn=null;
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fichiers_exercices);
    btn=(Button)findViewById(R.id.envoyer_fichier_exercices);
    btn.setOnClickListener(this);
}
	public void onClick(View v)
	{
		Intent intentt=new Intent(FichierExercices.this,EnvoiFichier.class);
		startActivity(intentt);
		
	}
}