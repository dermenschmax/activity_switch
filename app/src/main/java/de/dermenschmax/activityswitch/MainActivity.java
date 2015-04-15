package de.dermenschmax.activityswitch;

import android.content.ComponentName;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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


    public void onClickActivity1(View view){
        Intent intent = new Intent();


        /* Create an explicit Intent for SecondActivity. There are several ways to do this
         * (see https://developer.android.com/reference/android/content/Intent.html).
         */
        intent.setClass(this, SecondActivity.class);                                                                                     // setClass (Context packageContext, Class<?> cls)
        // intent.setClassName(this, "de.dermenschmax.activityswitch.SecondActivity");                                                   // setClassName (Context packageContext, String className)
        // intent.setClassName("de.dermenschmax.activityswitch", "de.dermenschmax.activityswitch.SecondActivity");                       // setClassName (String packageName, String className)
        // intent.setComponent(new ComponentName("de.dermenschmax.activityswitch", "de.dermenschmax.activityswitch.SecondActivity"));    // setComponent (ComponentName component)



        /* fire the Intent
         */
        startActivity(intent);
    }
}
