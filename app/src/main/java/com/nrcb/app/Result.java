package com.nrcb.app;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.widget.TextView;

public class Result extends AppCompatActivity {


    private TextView fert_cost;
    private TextView gross_profit;
    private TextView net_profit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);



        fert_cost = (TextView)findViewById(R.id.fert_cost);
        gross_profit = (TextView)findViewById(R.id.gross);
        net_profit = (TextView)findViewById(R.id.net);
        fert_cost.setText("Cost of Fertilizers (Rs) : "+(Utilities.urea_N+Utilities.super_P+Utilities.mop_K));
        gross_profit.setText("Gross profit (Rs/ha) : "+ Utilities.soil_t*1000f*Utilities.cost_P);
        net_profit.setText("Net profit (Rs/ha) : "+ (( Utilities.soil_t*1000f*Utilities.cost_P)-
                (Utilities.urea_N+Utilities.super_P+Utilities.mop_K)-(Utilities.cost_C*Utilities.multiply)));
    }


}
