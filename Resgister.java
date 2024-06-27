package com.example.smartparking;
import android.os.AsyncTask;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.telephony.gsm.SmsManager;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
@SuppressWarnings("deprecation")
public class Register extends Activity {
EditText u,p,e,m;
Button reg;
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_register);
u=(EditText)findViewById(R.id.editText1);
p=(EditText)findViewById(R.id.editText2);
e=(EditText)findViewById(R.id.editText3);
m=(EditText)findViewById(R.id.editText4);
reg=(Button)findViewById(R.id.button1);
reg.setOnClickListener(new OnClickListener(){
@Override
public void onClick(View arg0) {
// TODO Auto-generated method stub
String MobilePattern = "[0-9]{10}";
if((u.equals(""))||(p.equals(""))||(e.equals(""))||(m.equals("")))
{
Toast.makeText(getApplicationContext(), "Please fill all fields", 
Toast.LENGTH_LONG).show();
}
else if(!m.getText().toString().matches(MobilePattern)) {
Toast.makeText(getApplicationContext(), "Please enter valid 10 digit phone number", 
Toast.LENGTH_SHORT).show();
}else
{
ActiveTask1 task1=new ActiveTask1();
task1.execute();
}}});
}
private class ActiveTask1 extends AsyncTask<String,Void,Void> {
String user=u.getText().toString();
String pass=p.getText().toString();
String mail=e.getText().toString();
String mobile=m.getText().toString();
@SuppressWarnings("unused")
String res=null;
@Override
protected void onPreExecute() {
}
@Override
protected Void doInBackground(String... params) {
res=Callservice.registerService(user,pass,mail,mobile,"Register");
return null;
}
protected void onPostExecute(Void result) {
Intent intent=new Intent(getBaseContext(),Slot.class);
startActivity(intent);
try{
SmsManager sms=SmsManager.getDefault();
sms.sendTextMessage(mobile, null, "Your Account Has successfully Registered", null, null);
Toast.makeText(getApplicationContext(), "SMS Sent Successfully", 
Toast.LENGTH_LONG).show();
}
catch(Exception e){
e.printStackTrace();
Toast.makeText(getApplicationContext(), "SMS Sent Failed", 
Toast.LENGTH_LONG).show();}}}
@Override
public boolean onCreateOptionsMenu(Menu menu) {
// Inflate the menu; this adds items to the action bar if it is present.
getMenuInflater().inflate(R.menu.register, menu);
return true;
}}