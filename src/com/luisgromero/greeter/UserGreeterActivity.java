package com.luisgromero.greeter;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class UserGreeterActivity extends Activity implements OnClickListener{

	TextView greeterTitle;
	Button greeterButton;
	EditText greeterText;
	String userText;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        this.greeterTitle=(TextView) findViewById(R.id.greeterTitle);
        this.greeterTitle.setText("Welcome to the User Greeter App");
        this.greeterButton=(Button)findViewById(R.id.button1);
        this.greeterButton.setText("Greetings!");
        this.greeterText=(EditText)findViewById(R.id.editText1);
        
        this.greeterButton.setOnClickListener(this);
    }

	public void onClick(View view) {
		if(view==this.greeterButton){
			this.userText=this.greeterText.getText().toString();
			Toast.makeText(this, "Hello there, "+ this.userText, Toast.LENGTH_SHORT).show();
		}
		
	}
}