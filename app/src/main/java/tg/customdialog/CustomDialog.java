package tg.customdialog;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;

/**
 * Created by Tuan.Giao on 9/21/2016.
 */

public class CustomDialog extends BaseCustomDialog {
    private LinearLayout mGroupInfor;
    private ImageView imgParticle;
    public CustomDialog(Context context, int themedialogcustom) {
        super(context, themedialogcustom);
        getWindow().getAttributes().windowAnimations = R.style.PauseDialogAnimation;
        //requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.layout_dialog_up_point);
        getWindow().setLayout(LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT);
       // mAct = (Activity) context;
        //targetCoin = img;
        initlayout();
    }

    private void initlayout() {
        mGroupInfor = (LinearLayout) findViewById(R.id.ln_group_info);
        mGroupInfor.setVisibility(View.VISIBLE);
        imgParticle = (ImageView) findViewById(R.id.img_main);
       // imgParticle.setBackgroundResource(R.drawable.beta_animation_particle);
//        imgParticle.post(new Runnable() {
//            @Override
//            public void run() {
//                AnimationDrawable frameAnimation = (AnimationDrawable) imgParticle.getBackground();
//                frameAnimation.start();
//            }
//        });
//        imgTemp = (ImageView) findViewById(R.id.img_dialog_loading);
        animationGroup();
    //    imgTemp.postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                animationCoin();
//            }
//        }, 500);

    }

    private void animationGroup() {
        // Load the animation
        final Animation myAnim = AnimationUtils.loadAnimation(getContext(), R.anim.bounce);
        double animationDuration = 2000;
        myAnim.setDuration((long) animationDuration);

        // Use custom animation interpolator to achieve the bounce effect
        BounceInterpolator interpolator = new BounceInterpolator(0.2f, 20);
        myAnim.setInterpolator(interpolator);

        mGroupInfor.startAnimation(myAnim);
        // Run button animation again after it finished
        myAnim.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation arg0) {
            }

            @Override
            public void onAnimationRepeat(Animation arg0) {
            }

            @Override
            public void onAnimationEnd(Animation arg0) {
            }
        });
    }
}
