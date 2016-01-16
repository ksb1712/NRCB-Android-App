package com.nrcb.app;

/**
 * Created by ksb1712 on 10/1/16.
 */

import android.app.TabActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.text.TextDirectionHeuristicCompat;
import android.support.v7.app.ActionBar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class Fragment1 extends Fragment {

    private EditText soil_N;
    private EditText soil_P;
    private EditText soil_K;
    private EditText soil_T;
    private int count=0;



    float x,y;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.layout_fragment1,null);
        Utilities.swipe1 = (TextView)rootview.findViewById(R.id.swipe);
        Utilities.swipe2 = (TextView)rootview.findViewById(R.id.swipe2);
        Utilities.next = (Button)rootview.findViewById(R.id.button_next);
        soil_N = (EditText)rootview.findViewById(R.id.soil_N);
        soil_P = (EditText)rootview.findViewById(R.id.soil_P);
        soil_K = (EditText)rootview.findViewById(R.id.soil_K);
        soil_T = (EditText)rootview.findViewById(R.id.soil_T);
        rootview.setOnTouchListener(new View.OnTouchListener()
        {
            @Override
            public boolean onTouch(View v, MotionEvent event)
            {
                int action = event.getAction();
                Log.e("On touch","in frag page");
                if(action==MotionEvent.ACTION_DOWN){
                    Log.e("On touch if ","in frag page");
                    Utilities.swipe1.setVisibility(View.INVISIBLE);
                    Utilities.swipe2.setVisibility(View.INVISIBLE);
                    Utilities.next.setVisibility(View.VISIBLE);
                }
                /** Intercepts touches from going through. */
                return true;
            }
        });
        Utilities.next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(soil_N.getText().toString().length()>=1){
                    Utilities.soil_N = Float.parseFloat(soil_N.getText().toString());
                    if(soil_P.getText().toString().length()>=1){
                        Utilities.soil_P = Float.parseFloat(soil_P.getText().toString());
                        if(soil_K.getText().toString().length()>=1){
                            Utilities.soil_K = Float.parseFloat(soil_K.getText().toString());
                            if(soil_T.getText().toString().length()>=1){
                                Utilities.soil_t = Float.parseFloat(soil_T.getText().toString());
                                TabFragment.viewPager.setCurrentItem(1);
                            }
                            else soil_T.setError("Can't be left empty");
                        }
                        else soil_K.setError("Can't be left empty");
                    }
                    else soil_P.setError("Can't be left empty");
                }
                else soil_N.setError("Can't be left empty");
            }
        });

        return rootview;

    }


}