package com.egga.layouting3;
/*Nama : Egga Dinarul Syam
Nim : 10116393
Kelas : AKB IF 9
TGL : 3 Mei 2019
 */
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class ProfileFragmente extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile, container, false);
        return view;
    }

   /* private WebView URL13, URL14;
    private Button btn_fb,btn_ig;
    public Button getBtn_fb() {
        URL13 = (WebView) URL13.findViewById(R.id.fragment_profile);
        URL13.setWebViewClient(new WebViewClient());
        URL13.setScrollbarFadingEnabled(true);
        URL13.setHorizontalScrollBarEnabled(false);
        URL13.getSettings().setJavaScriptEnabled(true);
        URL13.loadUrl("http://www.xxxxx.com");

        return btn_fb;
    }



    btn_fb = (Button) view.findViewById(R.id.btn_fb);
    btn_fb.setOnClickListener(new OnClickListener() {

        @Override
        public void onClick(View v) {


        }
    });

    btn_i = (Button) view.findViewById(R.id.button13);
    button13.setOnClickListener(new OnClickListener() {

        @Override
        public void onClick(View v) {

            URL14 = (WebView) URL14.findViewById(R.id.webviewsito);
            URL14.setWebViewClient(new WebViewClient());
            URL14.setScrollbarFadingEnabled(true);
            URL14.setHorizontalScrollBarEnabled(false);
            URL14.getSettings().setJavaScriptEnabled(true);
            URL14.loadUrl("http://www.xxxx.com");

        }
    });

    return view;*/
}
