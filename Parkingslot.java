package com.example.smartparking;
import android.os.Bundle;
import android.app.ListActivity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;
public class Parkingslot extends ListActivity {
String list;
String item;
String username;
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
list=getIntent().getStringExtra("list");
username=getIntent().getStringExtra("username");
String[] eventnames = list.split("@");
setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_parkingslot,eventnames));
ListView listview = getListView();
listview.setTextFilterEnabled(true);
listview.setOnItemClickListener(new OnItemClickListener() {
@SuppressWarnings("unused")
@Override
public void onItemClick(AdapterView<?> arg0, View view, int arg2,long arg3) {
item = ((TextView)view).getText().toString();
String[] parts=item.split("\n");
String place=parts[0].replace("Place: ", "");
String available=parts[0].replace("Available: ", "");
String price=parts[1].replace("Price: ", "");
Intent inn=new Intent(getApplicationContext(),Home.class);
inn.putExtra("price",price);
inn.putExtra("username", username);
startActivity(inn);}
});}
@Override
public boolean onCreateOptionsMenu(Menu menu) {
// Inflate the menu; this adds items to the action bar if it is present.
getMenuInflater().inflate(R.menu.parkingslot, menu);
return true;}}