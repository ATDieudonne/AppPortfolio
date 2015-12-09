package com.example.android.appportfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    //Runs when one of the ListView buttons is clicked, place in MainActivity
    // so fragment view can find method.  Can't find method Error otherwise.
    public void printPurpose(View view){
        //Declare the current context to use in the Toast constructor
        Context currentContext = view.getContext();
        // Declare int and assign variable to determine duration of Toast in toast constructor.
        int duration = Toast.LENGTH_LONG;
        //Cast the view as a Button so you can pull the Button text from it. Should be
        //ok as it will only be the buttons that call this method.
        Button buttonShell = (Button) view;
        //Get the text from the button and convert it to a string because it's returned
        //as a CharSequence
        String castedText = buttonShell.getText().toString();
        //Declare Toast with make text constructor using a context, the text you want to display
        //which in this case is the pre-made text followed by the App Name which also
        //happens to be the button name and the duration declared above.
        Toast button_msg = Toast.makeText(currentContext,R.string.button_toast_msg + castedText,duration);
        //Finally the show function to actually show the Toast
        button_msg.show();

    }
}
