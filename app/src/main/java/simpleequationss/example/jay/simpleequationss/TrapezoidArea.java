package simpleequationss.example.jay.simpleequationss;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class TrapezoidArea extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trapezoid_area);
    }
    public void onButtonClick( View v)
    {
        Double n1 , n2, n3 , answer1;
        EditText e1 = (EditText) findViewById(R.id.num1);
        EditText e2 = (EditText) findViewById(R.id.num2);
        EditText e3 = (EditText) findViewById(R.id.num3);
        TextView t1 = (TextView) findViewById(R.id.answer);
        if (e1.getText().length() == 0 || e2.getText().length() == 0 || e3.getText().length() == 0) {
            t1.setText("Please enter both bases and height");
        }else if (e1.getText().toString().equals(".") || e2.getText().toString().equals(".") || e3.getText().toString().equals(".")){
            t1.setText("Invalid Number");
        }
        else {
            n1 = Double.parseDouble(e1.getText().toString());
            n2 = Double.parseDouble(e2.getText().toString());
            n3 = Double.parseDouble(e3.getText().toString());
            answer1 = (n3/2) * (n1 + n2);
            t1.setText(Double.toString(answer1));
        }

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.trapezoid_area, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
