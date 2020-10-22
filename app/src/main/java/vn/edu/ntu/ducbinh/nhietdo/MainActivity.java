package vn.edu.ntu.ducbinh.nhietdo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText doC, doF;
    Button btndoi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        doC = findViewById(R.id.doC);
        doF = findViewById(R.id.doF);
        findViewById(R.id.btndoi).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                 if(TextUtils.isEmpty(doC.getText())&&TextUtils.isEmpty(doF.getText()))
                 {
                     Toast.makeText(MainActivity.this,"Nhập Thông Tin Đầy Đủ",Toast.LENGTH_LONG).show();
                 }else {
                     if(TextUtils.isEmpty(doC.getText()))
                     {
                         final  float dof = Float.parseFloat(doF.getText().toString());
                         doC.setText(""+(dof-32)/1.8);
                     }
                     if(TextUtils.isEmpty(doF.getText()))
                     {
                         final float doc = Float.parseFloat(doC.getText().toString());
                         doF.setText("" + (((doc * 2) + 30)));
                     }
                 }


            }
        });


    }
}
