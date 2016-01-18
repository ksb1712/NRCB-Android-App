package com.nrcb.app;

/**
 * Created by ksb1712 on 10/1/16.
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TabHost;


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
      //  TabFragment.tabLayout.setSelectedTabIndicatorColor(getResources().getColor(R.color.orange));
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
                                    switch(Utilities.name){
                                        case 'g':
                                            Log.e("in calc","in g");
                                            Utilities.fert_N = (8.8f*Utilities.soil_t)-(0.73f*Utilities.soil_N);
                                            Utilities.fert_P = (0.84f*Utilities.soil_t)-(0.77f*Utilities.soil_P);
                                            Utilities.fert_K = (11.21f*Utilities.soil_t)-(0.44f*Utilities.soil_K);
                                            Utilities.multiply=3000;
                                            Utilities.plant_N = (100.0f/46.0f)*Utilities.fert_N;
                                            Utilities.plant_P = (100.0f/16.0f)*Utilities.fert_P;
                                            Utilities.plant_K = (100.0f/60.0f)*Utilities.fert_K;
                                            Utilities.urea_N = (Utilities.plant_N/50.0f)*Utilities.cost_U;
                                            Utilities.super_P = (Utilities.plant_P/50.0f)*Utilities.cost_S;
                                            Utilities.mop_K = (Utilities.plant_K/50.0f)*Utilities.cost_M;
                                            Log.e("in calc","in g"+ Utilities.fert_K);
                                            break;
                                        case 'n':
                                            Utilities.fert_N = (29.8f*Utilities.soil_t)-(0.97f*Utilities.soil_N);
                                            Utilities.fert_P = (5.45f*Utilities.soil_t)-(1.24f*Utilities.soil_P);
                                            Utilities.fert_K = (57.92f*Utilities.soil_t)-(0.92f*Utilities.soil_K);
                                            Utilities.multiply=3000;
                                            Utilities.plant_N = (100.0f/46.0f)*Utilities.fert_N;
                                            Utilities.plant_P = (100.0f/16.0f)*Utilities.fert_P;
                                            Utilities.plant_K = (100.0f/60.0f)*Utilities.fert_K;
                                            Utilities.urea_N = (Utilities.plant_N/50.0f)*Utilities.cost_U;
                                            Utilities.super_P = (Utilities.plant_P/50.0f)*Utilities.cost_S;
                                            Utilities.mop_K = (Utilities.plant_K/50.0f)*Utilities.cost_M;
                                            break;
                                        case 'p':
                                            Utilities.fert_N = (26.7f*Utilities.soil_t)-(0.76f*Utilities.soil_N);
                                            Utilities.fert_P = (3.61f*Utilities.soil_t)-(0.73f*Utilities.soil_P);
                                            Utilities.fert_K = (41.98f*Utilities.soil_t)-(0.96f*Utilities.soil_K);
                                            Utilities.multiply=2500;
                                            Utilities.plant_N = (100.0f/46.0f)*Utilities.fert_N;
                                            Utilities.plant_P = (100.0f/16.0f)*Utilities.fert_P;
                                            Utilities.plant_K = (100.0f/60.0f)*Utilities.fert_K;
                                            Utilities.urea_N = (Utilities.plant_N/50.0f)*Utilities.cost_U;
                                            Utilities.super_P = (Utilities.plant_P/50.0f)*Utilities.cost_S;
                                            Utilities.mop_K = (Utilities.plant_K/50.0f)*Utilities.cost_M;
                                            break;
                                        case 'o':
                                            Utilities.fert_N = (19f*Utilities.soil_t)-(0.84f*Utilities.soil_N);
                                            Utilities.fert_P = (2.41f*Utilities.soil_t)-(0.76f*Utilities.soil_P);
                                            Utilities.fert_K = (33.1f*Utilities.soil_t)-(0.5f*Utilities.soil_K);
                                            Utilities.multiply=2500;
                                            Utilities.plant_N = (100.0f/46.0f)*Utilities.fert_N;
                                            Utilities.plant_P = (100.0f/16.0f)*Utilities.fert_P;
                                            Utilities.plant_K = (100.0f/60.0f)*Utilities.fert_K;
                                            Utilities.urea_N = (Utilities.plant_N/50.0f)*Utilities.cost_U;
                                            Utilities.super_P = (Utilities.plant_P/50.0f)*Utilities.cost_S;
                                            Utilities.mop_K = (Utilities.plant_K/50.0f)*Utilities.cost_M;
                                            break;
                                        case 'r':
                                            Utilities.fert_N = (18.34f*Utilities.soil_t)-(0.92f*Utilities.soil_N);
                                            Utilities.fert_P = (2.77f*Utilities.soil_t)-(0.74f*Utilities.soil_P);
                                            Utilities.fert_K = (39.85f*Utilities.soil_t)-(0.78f*Utilities.soil_K);
                                            Utilities.multiply=2500;
                                            Utilities.plant_N = (100.0f/46.0f)*Utilities.fert_N;
                                            Utilities.plant_P = (100.0f/16.0f)*Utilities.fert_P;
                                            Utilities.plant_K = (100.0f/60.0f)*Utilities.fert_K;
                                            Utilities.urea_N = (Utilities.plant_N/50.0f)*Utilities.cost_U;
                                            Utilities.super_P = (Utilities.plant_P/50.0f)*Utilities.cost_S;
                                            Utilities.mop_K = (Utilities.plant_K/50.0f)*Utilities.cost_M;
                                            break;
                                        case 'k':
                                            Utilities.fert_N = (21.6f*Utilities.soil_t)-(0.83f*Utilities.soil_N);
                                            Utilities.fert_P = (3.21f*Utilities.soil_t)-(0.76f*Utilities.soil_P);
                                            Utilities.fert_K = (22.4f*Utilities.soil_t)-(0.59f*Utilities.soil_K);
                                            Utilities.multiply=2500;
                                            Utilities.plant_N = (100.0f/46.0f)*Utilities.fert_N;
                                            Utilities.plant_P = (100.0f/16.0f)*Utilities.fert_P;
                                            Utilities.plant_K = (100.0f/60.0f)*Utilities.fert_K;
                                            Utilities.urea_N = (Utilities.plant_N/50.0f)*Utilities.cost_U;
                                            Utilities.super_P = (Utilities.plant_P/50.0f)*Utilities.cost_S;
                                            Utilities.mop_K = (Utilities.plant_K/50.0f)*Utilities.cost_M;
                                            break;
                                    }
                                    Intent i = new Intent(Utilities.context,Result.class);
                                    startActivity(i);

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