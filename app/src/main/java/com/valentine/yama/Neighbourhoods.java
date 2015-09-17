package com.valentine.yama;

import android.app.ListActivity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.parse.ParseQueryAdapter;


public class Neighbourhoods extends ListActivity {

//    private ParseQueryAdapter<Neighbourhoods> mainAdapter;
//
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        getListView().setClickable(true);
//
//        mainAdapter = new ParseQueryAdapter<Neighbourhoods>(this, Neighbourhoods.class);
//        mainAdapter.setTextKey("location");
//
//
//        // Default view is all meals
//        setListAdapter(mainAdapter);
//    }

   @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getListView().setClickable(true);

//       mainAdapter = new ParseQueryAdapter<Neighbourhoods>(this, Neighbourhoods.class);
//       mainAdapter.setTextKey("location");
//
//        setListAdapter(mainAdapter);
        setContentView(R.layout.activity_neighbourhoods);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_neighbourhoods, menu);
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
