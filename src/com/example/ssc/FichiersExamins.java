package com.example.ssc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class FichiersExamins extends Activity implements OnClickListener {
	private Button btn=null;
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fichiers_examins);
    btn=(Button)findViewById(R.id.envoyer_fichier_examins);
    btn.setOnClickListener(this);
}
	public void onClick(View v)
	{
		Intent intentt=new Intent(FichiersExamins.this,EnvoiFichier.class);
		startActivity(intentt);
		
	}
}