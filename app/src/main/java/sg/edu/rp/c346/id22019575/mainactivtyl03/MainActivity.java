package sg.edu.rp.c346.id22019575.mainactivtyl03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    Button btn; //step 2 create an object of UI element
    TextView txt;
    EditText edit;
    ToggleButton tog;
    RadioGroup rgGender;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btn);
        txt = findViewById(R.id.textViewDisplay);
        edit = findViewById(R.id.editTextInput);
        tog = findViewById(R.id.toggleButtonEnabled);
        rgGender = findViewById(R.id.RadioGroup);


        //step 3, linking object with Ui element by ID





        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "button is clicked", Toast.LENGTH_LONG).show();
                edit.getText().toString();
                String stringResponse = edit.getText().toString();
                int checkedRadioId = rgGender.getCheckedRadioButtonId();
                String gender;
                if (checkedRadioId == R.id.radioButton){
                    gender = "He says ";
                }else {
                    gender = "She says ";
                }

                txt.setText(gender+stringResponse);

            }
        });
        tog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V){
                if (tog.isChecked()) {
                    tog.setChecked(true);
                }else{
                    tog.setChecked(false);
                }
            }
        });
    }
}