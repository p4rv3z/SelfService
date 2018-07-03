package parvez.vip.log;

import android.util.Log;

/**
 * Project: Log
 * Created by Muhammad Harun-Or-Roshid
 * Email: md.parvez28@gmail.com
 * Web: https://parvez.vip
 * On 28 June 2018 at 11:21 PM
 */

public class L {

    public static final String TAG = "__PAR_LOG::";

    /**
     * Send a #DEBUG log message.
     *
     * @param tag Used to identify the source of a log message.  It usually identifies
     *            the class or activity where the log call occurs.
     * @param msg The message you would like logged.
     */
    public static void d(String tag, String msg) {
        Log.d(tag, msg);
    }

    /**
     * Send a #DEBUG log message.
     *
     * @param msg The message you would like logged.
     * @default tag is __PAR_LOG::
     */
    public static void d(String msg) {
        d(TAG, msg);
    }


    /**
     * Send a #VERBOSE log message.
     *
     * @param tag Used to identify the source of a log message.  It usually identifies
     *            the class or activity where the log call occurs.
     * @param msg The message you would like logged.
     */
    public static void v(String tag, String msg) {
        Log.v(tag, msg);
    }

    /**
     * Send a #VERBOSE log message.
     *
     * @param msg The message you would like logged.
     * @default tag is __PAR_LOG::
     */
    public static void v(String msg) {
        v(TAG, msg);
    }


    /**
     * Send a #INFO log message.
     *
     * @param tag Used to identify the source of a log message.  It usually identifies
     *            the class or activity where the log call occurs.
     * @param msg The message you would like logged.
     */
    public static void i(String tag, String msg) {
        Log.i(tag, msg);
    }

    /**
     * Send a #INFO log message.
     *
     * @param msg The message you would like logged.
     * @default tag is __PAR_LOG::
     */
    public static void i(String msg) {
        i(TAG, msg);
    }


    /**
     * Send a #WARN log message.
     *
     * @param tag Used to identify the source of a log message.  It usually identifies
     *            the class or activity where the log call occurs.
     * @param msg The message you would like logged.
     */
    public static void w(String tag, String msg) {
        Log.w(tag, msg);
    }

    /**
     * Send a #WARN log message.
     *
     * @param msg The message you would like logged.
     * @default tag is __PAR_LOG::
     */
    public static void w(String msg) {
        i(TAG, msg);
    }


    /**
     * Send a #ERROR log message.
     *
     * @param tag Used to identify the source of a log message.  It usually identifies
     *            the class or activity where the log call occurs.
     * @param msg The message you would like logged.
     */
    public static void e(String tag, String msg) {
        Log.e(tag, msg);
    }

    /**
     * Send a #ERROR log message.
     *
     * @param msg The message you would like logged.
     * @default tag is __PAR_LOG::
     */
    public static void e(String msg) {
        e(TAG, msg);
    }


    /**
     * Send a #ASSERT log message.
     *
     * @param tag Used to identify the source of a log message.  It usually identifies
     *            the class or activity where the log call occurs.
     * @param msg The message you would like logged.
     */
    public static void a(String tag, String msg) {
        Log.wtf(tag, msg);
    }

    /**
     * Send a #ASSERT log message.
     *
     * @param msg The message you would like logged.
     * @default tag is __PAR_LOG::
     */
    public static void a(String msg) {
        a(TAG, msg);
    }
    
}
