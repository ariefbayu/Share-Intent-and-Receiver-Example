package id.web.freelancer.example.intent1;
 
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
 
public class IntentActivity extends Activity {
    TextView uriPath = null;
    ImageView imageView = null;
 
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle extras = getIntent().getExtras();
 
        setContentView(R.layout.main);
 
        if(extras != null){
            Uri filePathFromActivity = (Uri) extras.get(Intent.EXTRA_STREAM);
            Log.i("log", "PATH: " + filePathFromActivity.toString());
 
            uriPath = (TextView)findViewById(R.id.uriPath);
            imageView = (ImageView)findViewById(R.id.imageView);
 
            uriPath.setText(filePathFromActivity.toString());
            imageView.setImageURI(filePathFromActivity);
        }
    }
}