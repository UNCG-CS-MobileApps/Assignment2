package csc495s15.assignment2;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.content.Intent;

public class ChooserActivity extends ActionBarActivity {

    private PositionPlayer[] positionPlayers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chooser);

        positionPlayers = new PositionPlayer[3];
        positionPlayers[0] = new PositionPlayer("QB", "Cam","Newton");
        positionPlayers[1] = new PositionPlayer("RB", "DeAngelo", "Williams");
        positionPlayers[2] = new PositionPlayer("WR", "Jerricho", "Cotchery");

        Spinner playerSpinner = (Spinner) findViewById(R.id.positionSpinner);

        ArrayAdapter<PositionPlayer> adapter = new ArrayAdapter<PositionPlayer>(this, android.R.layout.simple_spinner_item, positionPlayers);

        playerSpinner.setAdapter(adapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_chooser, menu);
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

    public void handleModifyClick(View v) {

    }

}
