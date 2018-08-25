package smile.com.drsmile;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Activity_Toothdecay extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__toothdecay);
        WebView myWebView = (WebView) findViewById(R.id.webView1);
        myWebView.loadUrl("file:///android_asset/cavity.html");
    }
}
