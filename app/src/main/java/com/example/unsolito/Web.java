package com.example.unsolito;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

public class Web extends AppCompatActivity {

    TextView pagina;
    Button buscar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        WebView myWebView = new WebView(this);

        pagina =  findViewById(R.id.Web);
        buscar=findViewById(R.id.buscar);
        buscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(myWebView);
                myWebView.loadUrl(pagina.getText().toString());
            }
        });
    }
}