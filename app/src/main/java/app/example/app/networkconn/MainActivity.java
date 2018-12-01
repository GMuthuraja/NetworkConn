package app.example.app.networkconn;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.TelephonyManager;
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
        NetworkInfo network = conn.getActiveNetworkInfo();
        if(network != null && network.isConnected()){
            if(network.getType() == ConnectivityManager.TYPE_WIFI){
                Toast.makeText(getApplicationContext(), "Connected to Wifi: "+network.getExtraInfo(), Toast.LENGTH_SHORT).show();
            }else if(network.getType() == ConnectivityManager.TYPE_MOBILE){
                switch (network.getSubtype()) {
                        case TelephonyManager.NETWORK_TYPE_1xRTT:
                            Toast.makeText(getApplicationContext(), "Connected to Mobile Data: " + network.getExtraInfo() + " at Speed ~ 50-100 kbps", Toast.LENGTH_SHORT).show();
                            break;
                        case TelephonyManager.NETWORK_TYPE_CDMA:
                            Toast.makeText(getApplicationContext(), "Connected to Mobile Data: " + network.getExtraInfo() + " at Speed ~ 14-64 kbps", Toast.LENGTH_SHORT).show();
                            break;
                        case TelephonyManager.NETWORK_TYPE_EDGE:
                            Toast.makeText(getApplicationContext(), "Connected to Mobile Data: " + network.getExtraInfo() + " at Speed ~ 50-100 kbps", Toast.LENGTH_SHORT).show();
                            break;
                        case TelephonyManager.NETWORK_TYPE_EVDO_0:
                            Toast.makeText(getApplicationContext(), "Connected to Mobile Data: " + network.getExtraInfo() + " at Speed ~ 400-1000 kbps", Toast.LENGTH_SHORT).show();
                            break;
                        case TelephonyManager.NETWORK_TYPE_EVDO_A:
                            Toast.makeText(getApplicationContext(), "Connected to Mobile Data: " + network.getExtraInfo() + " at Speed ~ 600-1400 kbps", Toast.LENGTH_SHORT).show();
                            break;
                        case TelephonyManager.NETWORK_TYPE_GPRS:
                            Toast.makeText(getApplicationContext(), "Connected to Mobile Data: " + network.getExtraInfo() + " at Speed ~ 100 kbps", Toast.LENGTH_SHORT).show();
                            break;
                        case TelephonyManager.NETWORK_TYPE_HSDPA:
                            Toast.makeText(getApplicationContext(), "Connected to Mobile Data: " + network.getExtraInfo() + " at Speed ~ 2-14 Mbps", Toast.LENGTH_SHORT).show();
                            break;
                        case TelephonyManager.NETWORK_TYPE_HSPA:
                            Toast.makeText(getApplicationContext(), "Connected to Mobile Data: " + network.getExtraInfo() + " at Speed ~ 700-7000 kbps", Toast.LENGTH_SHORT).show();
                            break;
                        case TelephonyManager.NETWORK_TYPE_HSUPA:
                            Toast.makeText(getApplicationContext(), "Connected to Mobile Data: " + network.getExtraInfo() + " at Speed ~ 1-23 Mbps", Toast.LENGTH_SHORT).show();
                            break;
                        case TelephonyManager.NETWORK_TYPE_UMTS:
                            Toast.makeText(getApplicationContext(), "Connected to Mobile Data: " + network.getExtraInfo() + " at Speed ~ 400-7000 kbps", Toast.LENGTH_SHORT).show();
                            break;
                        case TelephonyManager.NETWORK_TYPE_EHRPD:
                            Toast.makeText(getApplicationContext(), "Connected to Mobile Data: " + network.getExtraInfo() + " at Speed ~ 1-2 Mbps", Toast.LENGTH_SHORT).show();
                            break;
                        case TelephonyManager.NETWORK_TYPE_EVDO_B:
                            Toast.makeText(getApplicationContext(), "Connected to Mobile Data: " + network.getExtraInfo() + " at Speed ~ 5 Mbps", Toast.LENGTH_SHORT).show();
                            break;
                        case TelephonyManager.NETWORK_TYPE_HSPAP:
                            Toast.makeText(getApplicationContext(), "Connected to Mobile Data: " + network.getExtraInfo() + " at Speed ~ 10-20 Mbps", Toast.LENGTH_SHORT).show();
                            break;
                        case TelephonyManager.NETWORK_TYPE_IDEN:
                            Toast.makeText(getApplicationContext(), "Connected to Mobile Data: " + network.getExtraInfo() + " at Speed ~ 25 kbps", Toast.LENGTH_SHORT).show();
                            break;
                        case TelephonyManager.NETWORK_TYPE_LTE:
                            Toast.makeText(getApplicationContext(), "Connected to Mobile Data: " + network.getExtraInfo() + " at Speed ~ 10 Mbps", Toast.LENGTH_SHORT).show();
                            break;
                        case TelephonyManager.NETWORK_TYPE_UNKNOWN:
                            Toast.makeText(getApplicationContext(), "Connected to Unknown Network: " + network.getExtraInfo(), Toast.LENGTH_SHORT).show();
                            break;
                }
            }
        }else{
            Toast.makeText(getApplicationContext(), "No Network found!", Toast.LENGTH_SHORT).show();
        }
    }
}
