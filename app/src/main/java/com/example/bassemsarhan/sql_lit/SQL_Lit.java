package com.example.bassemsarhan.sql_lit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SQL_Lit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sql__lit);

        final TextView Emp_ID = (TextView) findViewById(R.id.Emp_ID);
        final TextView Emp_name = (TextView) findViewById(R.id.Emp_name);
        final TextView Emp_phone = (TextView) findViewById(R.id.Emp_phone);
        Button submit = (Button) findViewById(R.id.submit);
        final Intent i= new Intent(getApplicationContext() , Display.class);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                contact con = new contact(Emp_ID.getText().toString(), Emp_name.getText().toString() ,Emp_phone.getText().toString());
                con.setID(Emp_ID.getText().toString());
                con.setName(Emp_name.getText().toString());
                con.setPhone(Emp_phone.getText().toString());
               /// startActivities(new Intent[]{new Intent(getApplicationContext(), Display.class)});


                }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_sql__lit, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
