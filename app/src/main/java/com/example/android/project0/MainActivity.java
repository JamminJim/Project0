package com.example.android.project0;

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

    /**
     * This method is called when a project button is clicked.
     */
    public void projectClick(View view) {

        switch(view.getId())
        {
            case R.id.project_one:
                showToastMessage(getString(R.string.toast_project_one));
            break;
            case R.id.projecte_two:
                showToastMessage(getString(R.string.toast_project_two));
                break;
            case R.id.projecte_three:
                showToastMessage(getString(R.string.toast_project_three));
                break;
            case R.id.projecte_four:
                showToastMessage(getString(R.string.toast_project_four));
                break;
            case R.id.projecte_five:
                showToastMessage(getString(R.string.toast_project_five));
                break;
            case R.id.projecte_six:
                showToastMessage(getString(R.string.toast_project_six));
                break;
            case R.id.projecte_seven:
                showToastMessage(getString(R.string.toast_project_seven));
                break;
            default:
                break;
        }
    }

    /**
     * This method executes a toast message when a project button is pressed
     */
    private void showToastMessage(String msg)
    {
        Toast.makeText(getApplicationContext(),msg, Toast.LENGTH_SHORT).show();
    }

}
