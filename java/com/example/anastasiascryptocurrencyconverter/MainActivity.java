package com.example.anastasiascryptocurrencyconverter;



import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static java.lang.Integer.parseInt;



import android.app.Activity;
import android.os.Parcelable;
import android.os.Bundle;
import android.widget.ListView;
import java.io.InputStream;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    void convertBTCtoUSD() {

        EditText btc = (EditText) findViewById(R.id.usd);
        btc.setInputType(InputType.TYPE_CLASS_NUMBER);

        EditText  usd = (EditText) findViewById(R.id.btc);
        usd.setInputType(InputType.TYPE_CLASS_NUMBER);

        double a = parseInt(btc.getText().toString());

        double result = a * 3422.56;
        usd.setText(String.valueOf(result));
    }

    void convertUSDtoBTC() {
        EditText btc = (EditText) findViewById(R.id.usd);
        btc.setInputType(InputType.TYPE_CLASS_NUMBER);
        EditText  usd = (EditText) findViewById(R.id.btc);
        usd.setInputType(InputType.TYPE_CLASS_NUMBER);

        double a = parseInt(usd.getText().toString());
        double result = a / 3422.56;
        btc.setText(String.valueOf(result));
    }

    public void click(View view) {
        convertBTCtoUSD();
        Button b2 = (Button) findViewById(R.id.submit2);
        b2.setEnabled(false);
    }

    public void click2(View view) {
        Button b1 = (Button) findViewById(R.id.submit);
        b1.setEnabled(false);
        convertUSDtoBTC();
    }

    public void reset(View view) {
        Button b1 =(Button) findViewById(R.id.submit);
        b1.setEnabled(true);

        Button b2 = (Button) findViewById(R.id.submit2);
        b2.setEnabled(true);

        EditText usd = (EditText) findViewById(R.id.usd);
        usd.setText("");

        EditText  btc =(EditText) findViewById(R.id.btc);
        btc.setText("");

    }



}
