package app.example.app.networkconn;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void isNetworkAvailable(View v){
        ConnectivityManager conn = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo info = conn.getActiveNetworkInfo();
        if(info != null){
            Toast.makeText(getApplicationContext(), info.getExtraInfo()+"", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(getApplicationContext(), "No Network found!", Toast.LENGTH_SHORT).show();
        }
    }
}
