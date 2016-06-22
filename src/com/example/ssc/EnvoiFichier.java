package com.example.ssc;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class EnvoiFichier extends Activity {
	private ListView lv=null;
	private  String[] values = new String[] { "Moustaid Ayoub", 
            "Addoumi Mohammed",
            "Marrakchi Tarik",
            "Tanji Hamza", 
            "Haloui Hicham", 
            "Ndao Ibrahima", 
            "Chahir Ayoub", 
            "Mejdoubi Issam" 
           };
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.envoyer_fichier);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_checked, values);
        lv=(ListView)findViewById(R.id.envoi_list);
        lv.setAdapter(adapter);
 
	}

}
