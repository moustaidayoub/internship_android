package com.example.ssc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class FichiersCours extends Activity implements OnClickListener {
	private Button btn=null;
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fichiers_cours);
    btn=(Button)findViewById(R.id.envoyer_fichier_cours);
    btn.setOnClickListener(this);
}
	public void onClick(View v)
	{
		Intent intentt=new Intent(FichiersCours.this,EnvoiFichier.class);
		startActivity(intentt);
		
	}
}
