package lion.lion.com.imagebutton;


import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Window;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Tweet extends Activity {
    private WebView mnWebView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        mnWebView = new WebView(this);
        mnWebView.getSettings().setJavaScriptEnabled(true);
        mnWebView.loadUrl("https://sentimentsearchlion.herokuapp.com/");
        mnWebView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
        });

        this.setContentView(mnWebView);
    }

    @Override
    public boolean onKeyDown(final int keyCode, final KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK) && mnWebView.canGoBack()) {
            mnWebView.goBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}
