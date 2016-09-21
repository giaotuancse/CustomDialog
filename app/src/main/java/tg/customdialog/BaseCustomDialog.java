package tg.customdialog;

import android.app.Dialog;
import android.content.Context;
import android.view.View;

/**
 * Created by Tuan.Giao on 9/21/2016.
 */

public class BaseCustomDialog  extends Dialog implements View.OnClickListener {

    public EventDialog myEvent = null;

    public BaseCustomDialog(Context context) {
        super(context);
        // TODO Auto-generated constructor stub
    }

    public BaseCustomDialog(Context context, int themedialogcustom) {
        super(context, themedialogcustom);
        // TODO Auto-generated constructor stub
    }

    public void setEvendialog(EventDialog event) {
        myEvent = event;
    }

    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub

    }

}