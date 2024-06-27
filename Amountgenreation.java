package com.example.smartparking;
import android.R.integer;
import android.os.AsyncTask;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
@SuppressWarnings("unused")
public class Amountgenreation extends Activity {
TextView tv;
EditText e1;
Button out,pay;
/*int tamount;
String price,qrvalue,phno,cvv;
int tamount1,cash,ct;*/
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_amountgenreation);
tv=(TextView)findViewById(R.id.textView1);
e1=(EditText)findViewById(R.id.editText1);
pay =(Button)findViewById(R.id.button2);
out=(Button)findViewById(R.id.button1);
/*
phno=e1.getText().toString();
qrvalue=getIntent().getStringExtra("qrvalue");
cvv=getIntent().getStringExtra("cvv");
price=getIntent().getStringExtra("price");*/
 out.setOnClickListener(new OnClickListener() {
@Override
public void onClick(View arg0) {
// TODO Auto-generated method stub
Intent in=new Intent(Amountgenreation.this,MainActivity.class);
startActivity(in);
}
});
pay.setOnClickListener(new OnClickListener() {
//@SuppressWarnings("deprecation")
@Override
public void onClick(View arg0) {
// TODO Auto-generated method stub
/*int price1=Integer.parseInt(price);
tamount1=tamount-price1; */
Toast.makeText(getApplicationContext(), "you amount successfully debited", 
Toast.LENGTH_LONG).show();
Intent i=new Intent(getApplicationContext(), Sendsms.class);
startActivity(i);
}});
}
@Override
public boolean onCreateOptionsMenu(Menu menu) {
// Inflate the menu; this adds items to the action bar if it is present.
getMenuInflater().inflate(R.menu.amountgenration, menu);
return true;
}}