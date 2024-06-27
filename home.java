package com.example.smartparking;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
public class Home extends Activity {
Button s1,s2,s3,s4,s5;
String price;
String username;
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_home);
s1=(Button)findViewById(R.id.button1);
s2=(Button)findViewById(R.id.button2);
s3=(Button)findViewById(R.id.button3);
s4=(Button)findViewById(R.id.button4);
s5=(Button)findViewById(R.id.button5);
s1.setOnClickListener(new OnClickListener(){
@Override
public void onClick(View arg0) {
// TODO Auto-generated method stub
Intent i=new Intent(getApplicationContext(), Makepatment.class);
i.putExtra("price",price);
startActivity(i);
}});
s2.setOnClickListener(new OnClickListener() {
@Override
public void onClick(View arg0) {
// TODO Auto-generated method stub
Intent in=new Intent(getApplicationContext(), Makepatment.class);
in.putExtra("price",price);
startActivity(in);
}});
s3.setOnClickListener(new OnClickListener() {
@Override
public void onClick(View arg0) {
// TODO Auto-generated method stub
Intent i=new Intent(getApplicationContext(), Makepatment.class);
i.putExtra("price",price);
startActivity(i)
}});
s4.setOnClickListener(new OnClickListener() {
@Override
public void onClick(View arg0) {
// TODO Auto-generated method stub
Intent i=new Intent(getApplicationContext(), Makepatment.class);
i.putExtra("price",price);
startActivity(i);
}});
s5.setOnClickListener(new OnClickListener() {
@Override
public void onClick(View arg0) {
// TODO Auto-generated method stub
Intent i=new Intent(getApplicationContext(), Makepatment.class);
i.putExtra("price",price);
startActivity(i);
}});
}
@Override
public boolean onCreateOptionsMenu(Menu menu){
// Inflate the menu; this adds items to the action bar if it is present.
getMenuInflater().inflate(R.menu.home, menu);
return true;
}
}