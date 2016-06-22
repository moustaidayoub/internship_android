package com.example.ssc;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;


public class MainActivity extends Activity implements OnClickListener{
private Button b1=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.connexion);
        b1.setOnClickListener(this);
 
    }
public void onClick(View v)
{
	//b1.setBackgroundResource(R.drawable.button_click);
	Intent intent1=new Intent(MainActivity.this,EspaceProf.class);
    startActivity(intent1);
}

}
    


