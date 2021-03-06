package com.example.eric.Personal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ImageButton;

import com.example.eric.Core.InfSetting;
import com.example.eric.Core.MainActivity;
import com.example.eric.R;

/**
 * Created by Eric_ on 2018/7/19.
 */

public class MedicalRecord extends Activity{
    ImageButton ImaBtnBack;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.personal_medical);
        ImaBtnBack = findViewById(R.id.medical_imaBtm_back);
        ImaBtnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backIntent = new Intent();
                //把返回数据存入Intent
                backIntent.putExtra("result", "");
                //设置返回数据
                MedicalRecord.this.setResult(RESULT_OK, backIntent);
                finish();
            }
        });
    }
}
