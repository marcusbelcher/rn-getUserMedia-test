package com.rngetusermediatest.customwebview;
import android.content.Context;
import android.annotation.TargetApi;
import android.widget.LinearLayout;
import android.os.Bundle;
import android.os.Build;
import android.widget.Toast;
import android.webkit.ConsoleMessage;
import android.webkit.PermissionRequest;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.net.http.SslCertificate;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.support.v4.app.ActivityCompat;
import android.app.LocalActivityManager;
import android.view.ViewGroup;
import android.Manifest;
import android.app.Activity;
import com.rngetusermediatest.MainActivity;
import com.rngetusermediatest.R;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;

public class CustomWebviewView extends WebView {

    private Context context;

    public CustomWebviewView(Context context) {
        super(context);
        this.context = context;

        this.setWebViewClient(new WebViewClient());

        WebSettings webSettings = this.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setAllowFileAccessFromFileURLs(true);
        webSettings.setAllowUniversalAccessFromFileURLs(true);
        webSettings.setMediaPlaybackRequiresUserGesture(false);
        webSettings.setUseWideViewPort(true);
        webSettings.setDomStorageEnabled(true);

        this.setWebChromeClient(new WebChromeClient() {

            // public boolean onConsoleMessage(ConsoleMessage m) {
            //     Log.d("getUserMedia, WebView", m.message() + " -- From line " + m.lineNumber() + " of " + m.sourceId());
            //     return true;
            // }

            @Override
            public void onPermissionRequest(final PermissionRequest request) {
                // MainActivity.this.runOnUiThread(new Runnable() {
                    // @TargetApi(Build.VERSION_CODES.LOLLIPOP)
                    // @Override
                    // public void run() {
                        // Below isn't necessary, however you might want to:
                        // 1) Check what the site is and perhaps have a blacklist
                        // 2) Have a pop up for the user to explicitly give permission
                        if (request.getOrigin().toString().equals("https://marcusbelcher.github.io/")
                                || request.getOrigin().toString().equals("https://webrtc.github.io/")) {
                            request.grant(request.getResources());
                        } else {
                            request.deny();
                        }
                    // }
                // });
            }
        });
    }
}