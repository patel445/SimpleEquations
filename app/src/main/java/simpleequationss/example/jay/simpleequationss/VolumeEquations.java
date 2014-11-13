package simpleequationss.example.jay.simpleequationss;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class VolumeEquations extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volume_equations);
        Button button2 = (Button) findViewById(R.id.button);
        button2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(VolumeEquations.this, CubeVolume.class);
                startActivity(intent);
            }
        });
        Button button3 = (Button) findViewById(R.id.button2);
        button3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(VolumeEquations.this, RectPrismVolume.class);
                startActivity(intent);
            }
        });
        Button button4 = (Button) findViewById(R.id.button8);
        button4.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(VolumeEquations.this, IrregularVolume.class);
                startActivity(intent);
            }
        });
        Button button5 = (Button) findViewById(R.id.button9);
        button5.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(VolumeEquations.this, CylinderVolume.class);
                startActivity(intent);
            }
        });
        Button button6 = (Button) findViewById(R.id.button10);
        button6.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(VolumeEquations.this, PyramidVolume.class);
                startActivity(intent);
            }
        });
        Button button7 = (Button) findViewById(R.id.button11);
        button7.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(VolumeEquations.this, ConeVolume.class);
                startActivity(intent);
            }
        });
        Button button8 = (Button) findViewById(R.id.button12);
        button8.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(VolumeEquations.this, SphereVolume.class);
                startActivity(intent);
            }
        });
        Button button9 = (Button) findViewById(R.id.button13);
        button9.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(VolumeEquations.this, EllipsoidVolume.class);
                startActivity(intent);
            }
        });
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.volume_equations, menu);
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
