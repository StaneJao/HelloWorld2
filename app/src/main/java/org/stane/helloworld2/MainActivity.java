package org.stane.helloworld2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // This is the layout file I am linking.
        setContentView(R.layout.activity_main);
        String message = getString(R.string.message);
        Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
    }
}
