package com.example.ssc;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TableLayout;
import android.widget.TableLayout.LayoutParams;
import android.widget.TableRow;
import android.widget.TextView;

public class GestionEtudiants extends Activity implements OnClickListener {
private TextView tv=null;
	private Button ajout_btn;
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gestion_etudiants);
      tv=(TextView)findViewById(R.id.nom_etudiant);
      tv.setOnClickListener(this);
        ajout_btn=(Button)findViewById(R.id.ajouter_etudiant);
        ajout_btn.setOnClickListener(this);
        
	}
	public void onClick(View v)
	{
		if(v.getId()==R.id.ajouter_etudiant)
		{
		Intent intent=new Intent(GestionEtudiants.this,AjoutEtudiant.class);
	    startActivity(intent);
		}
		else if(v.getId()==R.id.nom_etudiant)
		{
			Intent intent=new Intent(GestionEtudiants.this,DetailsEtudiant.class);
		    startActivity(intent);
			
		}
	}
}
