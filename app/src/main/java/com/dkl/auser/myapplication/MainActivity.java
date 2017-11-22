package com.dkl.auser.myapplication;

import android.graphics.Color;
import android.graphics.Typeface;
import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.textservice.TextInfo;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    TextView[] tv = new TextView[3];
    CheckBox[] cb = new CheckBox[3];
    int price,sum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);

        setContentView(linearLayout);
        linearLayout.addView(tv);
        linearLayout.addView(cb);



        cb[0].setText("牛排100");
        cb[1].setText("屎1000");
        cb[2].setText("漢堡10");

        tv[0].setText("您買了");
        tv[1].setText("共計");


        cb[0].setOnCheckedChangeListener(new Sampleclicklistener());
        tv[0].setText("");


        for (int i = 0; i < cb.length; i++) {
            cb[i] = new CheckBox(this);

//            tv[i].setText("編號=" + i);
            linearLayout.addView(cb[i]);

        }
        for (int a = 0; a < cb.length; a++) {
            tv[a] = new CheckBox(this);

//            tv[i].setText("編號=" + i);
            linearLayout.addView(tv[a]);

        }
//        tv[0].setTextColor(Color.RED);
//        tv[1].setTextColor(Color.CYAN);
//        tv[2].setTextColor(Color.BLUE);
//
//        tv[0].setBackgroundColor(Color.GRAY);
//        tv[1].setBackgroundColor(Color.GREEN);
//        tv[2].setBackgroundColor(Color.MAGENTA);
//
//        tv[0].setTypeface(Typeface.create(Typeface.SERIF, Typeface.BOLD));
//        tv[1].setTypeface(Typeface.create(Typeface.SERIF, Typeface.ITALIC));
//        tv[2].setTypeface(Typeface.create(Typeface.SERIF, Typeface.NORMAL));
//
//        tv[0].setText("牛排");
//        tv[1].setText("屎");
//        tv[2].setText("漢堡");
    }
    private class Sampleclicklistener implements CompoundButton.OnCheckedChangeListener {
        @Override
        public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
for(int i = 0; i < cb.length; i++){
    if(isChecked ==true){

        sum++;
    }

}
        }
    }

}


