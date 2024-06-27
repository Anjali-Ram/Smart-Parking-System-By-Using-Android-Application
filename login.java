package com.example.smartparking;
import android.os.AsyncTask;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class Login extends Activity {
EditText u,p;
Button l,r;
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_login);
u=(EditText)findViewById(R.id.username);
p=(EditText)findViewById(R.id.password);
l=(Button)findViewById(R.id.login);
r=(Button)findViewById(R.id.reg);
r.setOnClickListener(new OnClickListener() {
@Override
public void onClick(View arg0) {
// TODO Auto-generated method stub
Intent i=new Intent(getApplicationContext(), Register.class);
startActivity(i);
}});
l.setOnClickListener(new OnClickListener() {
@Override
public void onClick(View arg0) {
// TODO Auto-generated method stub
if(!((u.getText().toString().equals("")) || (p.getText().toString().equals("")))) {
ActiveTask1 task=new ActiveTask1();
task.execute();
}
else {
Toast.makeText(getApplicationContext(), "enter values in all field", 
Toast.LENGTH_SHORT).show();
}}});
}
private class ActiveTask1 extends AsyncTask<String,Void,Void> {
String s1=u.getText().toString();
String s2=p.getText().toString();
String res=null;
@Override
protected void onPreExecute() {
}
@Override
protected Void doInBackground(String... params) {
res=Callservice.loginService(s1,s2,"Login");
return null;
}
protected void onPostExecute(Void result) {
//pb.setVisibility(View.INVISIBLE);
if(res.equals("success")) {
Intent intent=new Intent(getBaseContext(),Slot.class);
intent.putExtra("username", s1);
startActivity(intent);
}
else {
Toast.makeText(getApplicationContext(), res, Toast.LENGTH_SHORT).show();
}}}
@Override
public boolean onCreateOptionsMenu(Menu menu) {
// Inflate the menu; this adds items to the action bar if it is present.
getMenuInflater().inflate(R.menu.login, menu);
return true;
}}