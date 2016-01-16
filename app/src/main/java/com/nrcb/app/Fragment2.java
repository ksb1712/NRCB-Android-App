package com.nrcb.app;

/**
 * Created by ksb1712 on 10/1/16.
 */

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class Fragment2 extends Fragment {

    private EditText cost_U;
    private EditText cost_S;
    private EditText cost_M;
    private EditText cost_C;
    private EditText cost_P;
    private Button calc;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.layout_fragment2, null);
        cost_U = (EditText)rootview.findViewById(R.id.cost_U);
        cost_S = (EditText)rootview.findViewById(R.id.cost_S);
        cost_M = (EditText)rootview.findViewById(R.id.cost_M);
        cost_C = (EditText)rootview.findViewById(R.id.cost_C);
        cost_P = (EditText)rootview.findViewById(R.id.cost_P);
        calc = (Button)rootview.findViewById(R.id.calc_button);
        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cost_U.getText().toString().length()>=1){
                    Utilities.cost_U = Float.parseFloat(cost_U.getText().toString());
                    if(cost_S.getText().toString().length()>=1){
                        Utilities.cost_S = Float.parseFloat(cost_S.getText().toString());
                        if(cost_M.getText().toString().length()>=1){
                            Utilities.cost_M = Float.parseFloat(cost_M.getText().toString());
                            if(cost_C.getText().toString().length()>=1){
                                Utilities.cost_C = Float.parseFloat(cost_C.getText().toString());
                                if(cost_P.getText().toString().length()>=1){
                                    Utilities.cost_P = Float.parseFloat(cost_P.getText().toString());
                                    TabFragment.viewPager.setCurrentItem(2);
                                }
                                else cost_P.setError("Can't be empty");
                            }
                            else cost_C.setError("Can't be empty");
                        }
                        else cost_M.setError("Can't be empty");
                    }
                    else cost_S.setError("Can't be empty");
                }
                else cost_U.setError("Can't be empty");

            }
        });


        return rootview;
    }
}