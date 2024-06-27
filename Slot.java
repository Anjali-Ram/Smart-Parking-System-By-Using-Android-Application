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
public class Slot extends Activity {
EditText parking;
Button submit;
String username;
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_slot);
parking=(EditText)findViewById(R.id.editText1);
submit=(Button)findViewById(R.id.button1);
username=getIntent().getStringExtra("username");
submit.setOnClickListener(new OnClickListener() {
@Override
public void onClick(View arg0) {
// TODO Auto-generated method stub
GetDeviceList1 gdlist4 = new GetDeviceList1();
gdlist4.execute();
}});}
private class GetDeviceList1 extends AsyncTask<String, Void, Void> {
String from1=parking.getText().toString();
String list;
//intent.putExtra("b",b);
protected void onPreExecute() {
//username = getIntent().getStringExtra("username");
Toast.makeText(getApplicationContext(),"please wait...",Toast.LENGTH_SHORT).show();
}
protected Void doInBackground(String... params) {
list=Callservice.getDeviceList1(from1,"getDeviceList1");
return null;
}
@Override
protected void onPostExecute(Void result) {
if(from1.equals("Slots"))
{
Intent intent = new Intent(getBaseContext(),Parkingslot.class);
intent.putExtra("place",from1);
//intent.putExtra("to",to1);
intent.putExtra("list", list);
intent.putExtra("username", username);
startActivity(intent);
}
else
{
Toast.makeText(getApplicationContext(), "Please enter the keyword word Slots", 
Toast.LENGTH_SHORT).show();
}}}
@Override
public boolean onCreateOptionsMenu(Menu menu) {
// Inflate the menu; this adds items to the action bar if it is present.
getMenuInflater().inflate(R.menu.slot, menu);
return true;
}}
