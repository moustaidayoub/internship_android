package com.example.ssc;

import android.app.Activity;
import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class GestionMessages extends TabActivity implements OnClickListener{
	private TabHost mytabhost;
	private Button envoi_btn;
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gestion_msgs);
    	mytabhost =getTabHost();
    				mytabhost.setup();

    				// Adding tabs
    				// tab1 settings
    					TabSpec spec = mytabhost.newTabSpec("Msgs Reçus");
    				// text and image of tab
    				spec.setIndicator("Msgs Reçus").setContent(new Intent(this,MsgsRecus.class));
    				
    				// adding tab in TabHost
    					mytabhost.addTab(spec);
    					
    					// tab settings
    					TabSpec spec2 = mytabhost.newTabSpec("Msgs Envoyés");
    				// text and image of tab
    					spec2.setIndicator("Msgs Envoyés").setContent(new Intent(this,MsgsEnvoyes.class));
    				// adding tab in TabHost
    					mytabhost.addTab(spec2);
    					envoi_btn=(Button)findViewById(R.id.envoyer_message);
    			        envoi_btn.setOnClickListener(this);

	}
	public void onClick(View v)
	{
		Intent intent=new Intent(GestionMessages.this,EnvoiMessage.class);
	    startActivity(intent);
		
	}
}