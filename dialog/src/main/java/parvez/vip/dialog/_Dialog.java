package parvez.vip.dialog;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.annotation.StyleRes;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.AppCompatTextView;
import android.text.Html;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;


/**
 * Project: SelfService
 * Created by Muhammad Harun-Or-Roshid
 * Email: md.parvez28@gmail.com
 * Web: https://parvez.vip
 * On 01 July 2018 at 1:45 AM
 */
public class _Dialog {

    private Context context;
    private Dialog dialog;
    private AppCompatTextView title, message;
    private AppCompatButton btnPositive, btnNegative, btnNeutral;
    private AppCompatImageView icon;
    private LinearLayout header, footer;
    private RelativeLayout main;
    private RelativeLayout body;


    /**
     * @param context
     */
    public _Dialog(@NonNull Context context) {
        this(context, 0);
    }


    /**
     * @param context
     * @param style   Dialog Style
     */
    public _Dialog(@NonNull Context context, @StyleRes int style) {
        this.context = context;

        dialog = new Dialog(context, style);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.dialog_layout);
        dialog.getWindow().setLayout(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);

        title = dialog.findViewById(R.id.dialog_title);
        message = dialog.findViewById(R.id.dialog_message);
        icon = dialog.findViewById(R.id.dialog_icon);

        btnPositive = dialog.findViewById(R.id.dialog_btn_positive);
        btnNegative = dialog.findViewById(R.id.dialog_btn_negative);
        btnNeutral = dialog.findViewById(R.id.dialog_btn_neutral);

        main = dialog.findViewById(R.id.main_layout);
        header = dialog.findViewById(R.id.header);
        footer = dialog.findViewById(R.id.footer);
        body = dialog.findViewById(R.id.body);
    }


    /**
     * @param context
     * @param title
     * @param message
     * @param neutralButton
     */
    public _Dialog(@NonNull Context context, String title, String message, String neutralButton) {
        this(context);
        setTitle(title);
        setMessage(message);
        btnNeutral.setVisibility(View.VISIBLE);
        btnNeutral.setText(neutralButton);
        btnNeutral.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        show();
    }


    /**
     * @param context
     * @param title
     * @param message
     */
    public _Dialog(@NonNull Context context, String title, String message) {
        this(context, title, message, "DISMISS");
    }


    /**
     * @param backgroundColor Background Color
     * @return
     */
    public _Dialog setBackgroundColor(int backgroundColor) {
        main.setBackgroundColor(backgroundColor);
        return this;
    }


    /**
     * @param backgroundColor Header Background Color
     * @return
     */
    public _Dialog setHeaderBackgroundColor(int backgroundColor) {
        header.setBackgroundColor(backgroundColor);
        return this;
    }


    /**
     * @param backgroundColor Body Background Color
     * @return
     */
    public _Dialog setBodyBackgroundColor(int backgroundColor) {
        body.setBackgroundColor(backgroundColor);
        return this;
    }


    /**
     * @param backgroundColor Footer Background Color
     * @return
     */
    public _Dialog setFooterHeaderBackgroundColor(int backgroundColor) {
        footer.setBackgroundColor(backgroundColor);
        return this;
    }


    /**
     * @param isCancelAble
     * @return
     */
    public _Dialog isCancelAble(boolean isCancelAble) {
        dialog.setCancelable(isCancelAble);
        return this;
    }


    /**
     * @param gravity set gravity
     * @return
     */
    public _Dialog setGravity(int gravity) {
        dialog.getWindow().setGravity(gravity);
        return this;
    }

    /**
     * @param icon set drawable icon
     * @return instance
     */
    public _Dialog setIcon(Drawable icon) {
        this.icon.setVisibility(View.VISIBLE);
        this.icon.setImageDrawable(icon);
        return this;
    }


    /**
     * @param icon set bitmap icon
     * @return instance
     */
    public _Dialog setIcon(Bitmap icon) {
        this.icon.setVisibility(View.VISIBLE);
        this.icon.setImageBitmap(icon);
        return this;
    }


    /**
     * @param icon set drawable resource id icon
     * @return instance
     */
    public _Dialog setIcon(@DrawableRes int icon) {
        this.icon.setVisibility(View.VISIBLE);
        this.icon.setImageResource(icon);
        return this;
    }

    /**
     * @param title set dialog title
     * @return instance
     */
    public _Dialog setTitle(String title) {
        return setTitle(title, false);
    }

    /**
     * @param title  set dialog title
     * @param isHTML true for html tag support
     * @return instance
     */
    public _Dialog setTitle(String title, boolean isHTML) {
        this.title.setVisibility(View.VISIBLE);
        if (isHTML) {
            this.title.setText(Html.fromHtml(title));
            return this;
        }
        this.title.setText(title);
        return this;
    }

    /**
     * @param message set dialog message
     * @return instance
     */
    public _Dialog setMessage(String message) {
        return setMessage(message, false);
    }

    /**
     * @param message set dialog message
     * @param isHTML  true for html tag support
     * @return instance
     */
    public _Dialog setMessage(String message, boolean isHTML) {
        this.message.setVisibility(View.VISIBLE);
        if (isHTML) {
            this.message.setText(Html.fromHtml(message));
            return this;
        }
        this.message.setText(message);
        return this;
    }


    public void show() {
        dialog.show();
    }


    /**
     * @param positiveButton  Positive Button Name
     * @param onClickListener
     * @return instance
     */
    public _Dialog setPositiveButton(String positiveButton, final onClickListener onClickListener) {
        btnPositive.setVisibility(View.VISIBLE);
        btnPositive.setText(positiveButton);
        btnPositive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (onClickListener != null) {
                    onClickListener.onClick(view, dialog);
                }
            }
        });
        return this;
    }


    /**
     * @param negativeButton  Negative Button Name
     * @param onClickListener
     * @return instance
     */
    public _Dialog setNegativeButton(String negativeButton, final onClickListener onClickListener) {
        btnNegative.setVisibility(View.VISIBLE);
        btnNegative.setText(negativeButton);
        btnNegative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (onClickListener != null) {
                    onClickListener.onClick(view, dialog);
                }
            }
        });
        return this;
    }


    /**
     * @param neutralButton   Neutral Button Name
     * @param onClickListener
     * @return instance
     */
    public _Dialog setNeutralButton(String neutralButton, final onClickListener onClickListener) {
        btnNeutral.setVisibility(View.VISIBLE);
        btnNeutral.setText(neutralButton);
        btnNeutral.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (onClickListener != null) {
                    onClickListener.onClick(view, dialog);
                }
            }
        });
        return this;
    }


    public interface onClickListener {
        void onClick(View view, Dialog dialog);
    }

}
