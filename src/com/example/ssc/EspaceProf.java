package com.example.ssc;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;
public class EspaceProf extends Activity implements OnClickListener{
	private ImageButton etudiants_btn=null,visualiser_btn=null,gestion_msgs_btn=null,gestion_fichiers_btn=null;
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.espace_prof);
        etudiants_btn=(ImageButton)findViewById(R.id.gestion_etudiants_btn);
        etudiants_btn.setOnClickListener(this);
        visualiser_btn=(ImageButton)findViewById(R.id.visualiser_ecrans);
        visualiser_btn.setOnClickListener(this);
        gestion_msgs_btn=(ImageButton)findViewById(R.id.gestion_messages);
        gestion_msgs_btn.setOnClickListener(this);
        gestion_fichiers_btn=(ImageButton)findViewById(R.id.gestion_fichiers);
        gestion_fichiers_btn.setOnClickListener(this);
    
    }
	public void onClick(View v)
	{
		Intent intent=null;
		if(v.getId()==R.id.gestion_etudiants_btn)
		{
			intent=new Intent(EspaceProf.this,GestionEtudiants.class);
	    startActivity(intent);
		}
		else if(v.getId()==R.id.visualiser_ecrans)
		{
			intent=new Intent(EspaceProf.this,VisualiserEcrans.class);
	    startActivity(intent);
		}
		else if(v.getId()==R.id.gestion_messages)
		{
			intent=new Intent(EspaceProf.this,GestionMessages.class);
	    startActivity(intent);
		}
		else if(v.getId()==R.id.gestion_fichiers)
		{
			intent=new Intent(EspaceProf.this,GestionFichiers.class);
	    startActivity(intent);
		}
	
	}
	
}
