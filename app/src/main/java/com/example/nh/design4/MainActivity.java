package com.example.nh.design4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView text;
    Button btn;
    RadioButton radio1;
    RadioButton radio2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         btn= (Button) findViewById(R.id.button);
        text= (TextView) findViewById(R.id.textView);
         radio1= (RadioButton) findViewById(R.id.increase);
         radio2= (RadioButton) findViewById(R.id.decrease);
        btn.setOnClickListener(this);
    }
int counter=0;
    @Override
    public void onClick(View v) {

        switch(v.getId()){
            case R.id.button:
                if(radio1.isChecked())
                {counter++;
                    text.setText(counter+"");

                }else if(radio2.isChecked())
                {
                    counter--;
                    text.setText(counter+"");
                }


        }

    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
         btn= (Button) findViewById(R.id.button);
        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.increase:
                if (checked)
                    btn.setText("+");
                    break;
            case R.id.decrease:
                if (checked)
                    btn.setText("-");
                    break;
        }
    }
}
