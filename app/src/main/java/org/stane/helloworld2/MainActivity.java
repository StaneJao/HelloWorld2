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
        Toast.makeText(MainActivity.this, "this is a message", Toast.LENGTH_SHORT).show();
        Toast.makeText(MainActivity.this, "this is another message", Toast.LENGTH_SHORT).show();
    }
}
