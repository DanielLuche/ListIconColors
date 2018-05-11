package com.example.daniel.listiconcolors;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

import adapter.ColorAdapter;

public class MainActivity extends AppCompatActivity {

    private Context context;
    private ListView lv_tst;
    private ColorAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initVar();

        initAction();
    }

    private void initVar() {
        context = getBaseContext();
        //
        lv_tst = findViewById(R.id.main_lv);
    }

    private void initAction() {
        mAdapter = new ColorAdapter(
                context,
                generateSource()
        );

        lv_tst.setAdapter(mAdapter);
    }

    private ArrayList<MObj> generateSource() {
        ArrayList<MObj> mObjs = new ArrayList<>();
        String[] colors = {
                "#0F4D61",
                "#FFD27F",
                "#D9534F",
                "#5CB85C",
                "#FF1493",
                "#3C93A9",
                "#800080",
                "#A2C854",
                "#FFED42",
                //"#ADADAD",
                "#28A745",
                "#D9534F",
                "#5CB85C",
                "#FF1493",
                "#3C93A9",
                "#800080",
                "#A2C854",
                "#FFED42",
        };


        for (int i = 0; i < 15; i++) {
            MObj obj = new MObj();
            obj.setTexto("Texto " + i);
            obj.setColor(colors[i]);
            mObjs.add(obj);
        }

        return mObjs;
    }
}
