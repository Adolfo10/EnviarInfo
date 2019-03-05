package com.example.enviarinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity
{
    String url = "http://nuevo.rnrsiilge-org.mx/nombre";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        HttpPost request = new HttpPost();
        List<NameValuePair> postParameters = new ArrayList<NameValuePair>(1);
        postParameters.add(new BasicNameValuePair("parametroNombre", parametroValor));
        request.setEntity(new UrlEncodedFormEntity(postParameters));
    }
}