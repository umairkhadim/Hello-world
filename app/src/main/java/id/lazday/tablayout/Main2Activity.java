
package id.lazday.tablayout;
import android.support.v7.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;



public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void newActivity(View view) {

        Intent i=new Intent(this, MainActivity.class);
        startActivity(i);

    }

    public void end(View view) {
        finish();
        System.exit(0);
    }
}
