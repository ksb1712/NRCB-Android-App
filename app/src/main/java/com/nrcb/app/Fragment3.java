package com.nrcb.app;


import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.app.Fragment;
import android.widget.TextView;

/**
 * Created by ksb1712 on 16/1/16.
 */
public class Fragment3 extends Fragment{
    private TextView fert_cost;
    private TextView gross_profit;
    private TextView net_profit;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.layout_fragment3,null);
        fert_cost = (TextView)rootview.findViewById(R.id.fert_cost);
        gross_profit = (TextView)rootview.findViewById(R.id.gross);
        net_profit = (TextView)rootview.findViewById(R.id.net);
        switch(Utilities.name){
            case 'g': Utilities.fert_N = (8.8f*Utilities.soil_t)-(0.73f*Utilities.soil_N);
                      Utilities.fert_P = (0.84f*Utilities.soil_t)-(0.77f*Utilities.soil_P);
                      Utilities.fert_K = (11.21f*Utilities.soil_t)-(0.44f*Utilities.soil_K);
                      Utilities.multiply=3000;
                      Utilities.plant_N = (100.0f/46.0f)*Utilities.fert_N;
                      Utilities.plant_P = (100.0f/16.0f)*Utilities.fert_P;
                      Utilities.plant_K = (100.0f/60.0f)*Utilities.fert_K;
                      Utilities.urea_N = (Utilities.plant_N/50.0f)*Utilities.cost_U;
                      Utilities.super_P = (Utilities.plant_P/50.0f)*Utilities.cost_S;
                      Utilities.mop_K = (Utilities.plant_K/50.0f)*Utilities.cost_M;
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
        fert_cost.setText("Cost of Fertilizers (Rs) : "+(Utilities.urea_N+Utilities.super_P+Utilities.mop_K));
        gross_profit.setText("Gross profit (Rs/ha) : "+ Utilities.soil_t*1000f*Utilities.cost_P);
        net_profit.setText("Net profit (Rs/ha) : "+ (( Utilities.soil_t*1000f*Utilities.cost_P)-
                (Utilities.urea_N+Utilities.super_P+Utilities.mop_K)-(Utilities.cost_C*Utilities.multiply)));
        Log.e("net"," Rs" + (( Utilities.soil_t*1000f*Utilities.cost_P)-
                (Utilities.urea_N+Utilities.super_P+Utilities.mop_K)-(Utilities.cost_C*Utilities.multiply)));


        return rootview;
    }

}
