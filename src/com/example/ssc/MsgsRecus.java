package com.example.ssc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TabHost;
import android.widget.TextView;

public class MsgsRecus extends Activity implements OnClickListener{
	private TextView tv=null;
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.msgs_recus);
        tv=(TextView)findViewById(R.id.objet_msg);
        tv.setOnClickListener(this);
}
	public void onClick(View v)
	{
		
		Intent intent=new Intent(MsgsRecus.this,DetailsMessage.class);
	    startActivity(intent);
		
}
}
