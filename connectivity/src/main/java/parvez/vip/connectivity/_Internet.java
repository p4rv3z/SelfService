package parvez.vip.connectivity;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * Project: SelfService
 * Created by Muhammad Harun-Or-Roshid
 * Email: md.parvez28@gmail.com
 * Web: https://parvez.vip
 * On 03 July 2018 at 10:59 PM
 */
public class _Internet {
    private ConnectivityManager connectivityManager;
    private NetworkInfo activeNetwork;


    /**
     *
     * @param context
     */
    public _Internet(Context context) {
        connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        activeNetwork = connectivityManager.getActiveNetworkInfo();
    }


    /**
     *
     * @return true if internet is connected and also available
     */
    public boolean isOK() {
        if (isConnected() && isAvailable()) {
            return true;
        }
        return false;
    }

    /**
     *
     * @return true if internet is connected
     */
    public boolean isConnected() {
        // connected to the internet
        if (activeNetwork != null && activeNetwork.isConnected()) {
            return true;
        }
        // not connected to the internet
        return false;
    }


    /**
     *
     * @return true if internet is available
     */
    public boolean isAvailable() {
        // connected to the internet
        if (activeNetwork != null && activeNetwork.isAvailable()) {
            return true;
        }
        // not connected to the internet
        return false;
    }


    /**
     *
     * @return Connection type: WIFI | GSM | UNKNOWN
     */
    public String getType() {
        if (activeNetwork.getType() == ConnectivityManager.TYPE_WIFI) {
            // connected to wifi
            return "WIFI";
        } else if (activeNetwork.getType() == ConnectivityManager.TYPE_MOBILE) {
            // connected to the mobile provider's data plan
            return "GSM";
        }
        //unknown
        return "UNKNOWN";
    }

    /**
     *
     * @return error message
     */
    public String getMSG() {
        if (!isConnected()) {
            return "Internet is not connected.";
        } else if (!isAvailable()) {
            return "Internet is connected but internet is not available.";
        }
        return "Unknown";
    }
}
