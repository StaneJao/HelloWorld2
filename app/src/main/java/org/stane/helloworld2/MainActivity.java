package org.stane.helloworld2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{
    private TextView textView;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // This is the layout file I am linking.
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.text_view);
        editText = (EditText) findViewById(R.id.username);
    }

    /* Called when btnExit has been clicked.     */
    public void btnExit_click(View Button){
        Toast.makeText(MainActivity.this, R.string.btnExit_message, Toast.LENGTH_SHORT).show();
    }

    /* Called when btnLogin has been clicked.     */
    public void btnLogin_click(View Button) {
        Toast.makeText(MainActivity.this, "btnLogin was clicked", Toast.LENGTH_SHORT).show();
        String name = editText.getText().toString();
        textView.setText(String.format("Hello there, %s!", name));
    }
}
