package sg.edu.rp.c346.demoradiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    RadioGroup rg1;
    RadioButton rb1,rb2,rb3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = (Button)findViewById(R.id.button);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RadioGroup rg = (RadioGroup)findViewById(R.id.radioGroup1);
                int selectedButton = rg.getCheckedRadioButtonId();

                RadioButton rb = (RadioButton)findViewById(selectedButton);

                Toast.makeText(getBaseContext(),rb.getText(),Toast.LENGTH_SHORT).show();


            }
        });





    }
}
