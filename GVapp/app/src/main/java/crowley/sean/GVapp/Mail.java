package crowley.sean.GVapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Mail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mail);
        WebView myWebView = (WebView) findViewById(R.id.webview);
        myWebView.setWebViewClient(new WebViewClient());
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
        webSettings.setLoadWithOverviewMode(true);
        webSettings.setBuiltInZoomControls(true);
        webSettings.setDisplayZoomControls(false);
        webSettings.setSupportZoom(true);
        webSettings.setUseWideViewPort(true);
        myWebView.loadUrl("https://cas.gvsu.edu/auth/login?SAMLRequest=fVLJbtswEL0HyD8QvGtFCgSEpcCNYcRA0gqx3ENvFDWSWXNROaSc%2FH1kOUHcQ3N9fPOW4SzuXrQiIziU1hQ0i1NKwAjbStMXdFevo1t6V15fLZBrNbBl8HvzDH8DoCfTpEE2PxQ0OMMsR4nMcA3IvGDb5dMjy%2BOUDc56K6yiZLMqKHRdoyXw4dAduv2fQw%2BiaZuhb0QvBm1bULDnne0p%2BfURKz%2FF2iAG2Bj03PgJSrNvUZZHWVbnKUtv2E3%2Bm5Lq3em7NOcGX8VqziRkD3VdRdXPbT0LjLIF92NiF7S3tlcQC6tP9hVHlOMEd1whULJEBOengPfWYNDgtuBGKWD3%2FFjQvfcDsiQ5Ho%2Fxp0zCE82livsRQwxtSLhAWs7LZXM%2Fd7HVr9PzD3dafuovkgup8v3TTl02q8oqKV7JUil7vHfA%2FVTEuzD1WFunuf%2B%2FWxZnMyLbqJupLBgcQMhOQktJUp5d%2F72O6WbeAA%3D%3D&RelayState=https%3A%2F%2Fwww.google.com%2Fa%2Fmail.gvsu.edu%2FServiceLogin%3Fservice%3Dmail%26passive%3Dtrue%26rm%3Dfalse%26continue%3Dhttps%253A%252F%252Fmail.google.com%252Fmail%252F%26ss%3D1%26ltmpl%3Ddefault%26ltmplcache%3D2%26emr%3D1%26osid%3D1");
    }
}
