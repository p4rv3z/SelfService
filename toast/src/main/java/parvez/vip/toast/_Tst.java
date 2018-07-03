package parvez.vip.toast;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Project: SelfService
 * Created by Muhammad Harun-Or-Roshid
 * Email: md.parvez28@gmail.com
 * Web: https://parvez.vip
 * On 02 July 2018 at 11:41 PM
 */
public class _Tst {
    TextView text;
    ImageView icon;
    Toast toast;
    /**
     * Show the view or text notification for a short period of time.  This time
     * could be user-definable.  This is the default.
     *
     * @see #setDuration
     */
    public static final int SHORT = 0;

    /**
     * Show the view or text notification for a long period of time.  This time
     * could be user-definable.
     *
     * @see #setDuration
     */
    public static final int LONG = 1;


    /**
     * @param activity
     */
    public _Tst(Activity activity) {
        LayoutInflater inflater = activity.getLayoutInflater();
        View layout = inflater.inflate(R.layout.toast_layout,
                (ViewGroup) activity.findViewById(R.id.toast_layout));

        icon = layout.findViewById(R.id.image);
        text = layout.findViewById(R.id.text);

        toast = new Toast(activity);
        toast.setView(layout);
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setDuration(SHORT);
    }

    /**
     * @param activity
     * @param message
     */
    public _Tst(Activity activity, String message) {
        this(activity);
        setMessage(message);
        show();
    }


    /**
     * @param gravity
     * @param x
     * @param y
     * @return
     */
    public _Tst setGravity(int gravity, int x, int y) {
        toast.setGravity(gravity, x, y);
        return this;
    }


    /**
     * @param duration
     * @return
     */
    public _Tst setDuration(int duration) {
        toast.setDuration(duration);
        return this;
    }


    /**
     * show
     */
    public void show() {
        toast.show();
    }


    /**
     * @param massage
     * @return
     */
    public _Tst setMessage(String massage) {
        text.setText(massage);
        return this;
    }


    /**
     * @param drawable
     * @return
     */
    public _Tst setIcon(Drawable drawable) {
        icon.setVisibility(View.VISIBLE);
        icon.setImageDrawable(drawable);
        return this;
    }


    /**
     * @param imageResourceId
     * @return
     */
    public _Tst setIcon(int imageResourceId) {
        icon.setVisibility(View.VISIBLE);
        icon.setImageResource(imageResourceId);
        return this;
    }


    /**
     * @param bitmap
     * @return
     */
    public _Tst setIcon(Bitmap bitmap) {
        icon.setVisibility(View.VISIBLE);
        icon.setImageBitmap(bitmap);
        return this;
    }
}
