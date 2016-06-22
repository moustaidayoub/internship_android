package com.example.ssc;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class GestionFichiers extends TabActivity implements OnClickListener {
	private TabHost mytabhost;
	private Button ajouter_btn;
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gestion_fichiers);
    	mytabhost =getTabHost();
    				mytabhost.setup();

    				// Adding tabs
    				// tab1 settings
    					TabSpec spec = mytabhost.newTabSpec("Cours");
    				// text and image of tab
    				spec.setIndicator("Cours").setContent(new Intent(this,FichiersCours.class));
    				
    				// adding tab in TabHost
    					mytabhost.addTab(spec);
    					
    					// tab settings
    					TabSpec spec2 = mytabhost.newTabSpec("Exercices");
    				// text and image of tab
    					spec2.setIndicator("Exercices").setContent(new Intent(this,FichierExercices.class));
    				// adding tab in TabHost
    					mytabhost.addTab(spec2);
    				
    					TabSpec spec3 = mytabhost.newTabSpec("Examins");
        				// text and image of tab
        					spec3.setIndicator("Examins").setContent(new Intent(this,FichiersExamins.class));
        				// adding tab in TabHost
        					mytabhost.addTab(spec3);
        					 ajouter_btn=(Button)findViewById(R.id.ajouter_fichier);
        				        ajouter_btn.setOnClickListener(this);
	}
	public void onClick(View v)
	{

		Intent intent=new Intent(GestionFichiers.this,AjoutFichier.class);
	    startActivity(intent);
}
}