package com.example.raphaeloliveira.bypaulasouza;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageButton;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.bnt) ImageButton bnt;
    @BindView(R.id.bnt1) ImageButton bnt1;
    @BindView(R.id.bnt2) ImageButton bnt2;
    @BindView(R.id.bnt3) ImageButton bnt3;
    @BindView(R.id.webview1) WebView webview1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.bnt)
    public void bnt() {

        WebSettings ws = webview1.getSettings();
        ws.setJavaScriptEnabled(true);
        ws.setSupportZoom(false);
        webview1.loadUrl("http://lista.mercadolivre.com.br/vestidos-em-viscose%2C-estampado-ver%C3%A3o-longos#D[A:vestidos-em-viscose,-estampado-verão-longos]");

    }

    @OnClick(R.id.bnt1)
    public void bnt1() {
        WebSettings ws = webview1.getSettings();
        ws.setJavaScriptEnabled(true);
        ws.setSupportZoom(false);
        webview1.loadUrl("http://lista.mercadolivre.com.br/vestidos-em-viscose%2C-estampado-ver%C3%A3o-longos#D[A:vestidos-em-viscose,-estampado-verão-longos]");

    }

    @OnClick(R.id.bnt2)
    public void bnt2() {
        Intent intent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://produto.mercadolivre.com.br/MLB-818981319-vestido-listrado-feminino-ombro-a-ombro-manga-longa-curto-_JM?attribute=33000-52049&attribute=43000-52119"));
        startActivity(intent);
    }

    @OnClick(R.id.bnt3)
    public void bnt3() {
        Intent intent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://produto.mercadolivre.com.br/MLB-818981319-vestido-listrado-feminino-ombro-a-ombro-manga-longa-curto-_JM?attribute=33000-52049&attribute=43000-52119"));
        startActivity(intent);
    }


}
