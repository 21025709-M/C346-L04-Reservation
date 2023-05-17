package sg.edu.rp.c346.id21025709.l04_reservation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etName;
    EditText etTelephone;
    EditText etSize;
    DatePicker datePicker;
    TimePicker timePicker;
    CheckBox smokingArea;
    Button btnReset;
    Button btnReserve;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = findViewById(R.id.input_Name);
        etTelephone = findViewById(R.id.input_Number);
        etSize = findViewById(R.id.input_GroupSize);
        datePicker = findViewById(R.id.datePicker);
        timePicker = findViewById(R.id.timePicker);
        smokingArea = findViewById(R.id.checkSmokingArea);
        btnReset = findViewById(R.id.button_Reset);
        btnReserve = findViewById(R.id.button_Confirm);

        datePicker.updateDate(2023, 6, 1);

        btnReserve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String isSmoke = "";
                if (smokingArea.isChecked()) {
                    isSmoke = "smoking";
                }
                else {
                    isSmoke = "non-smoking";
                }

                Toast.makeText(MainActivity.this,
                        "Hi, " + etName.getText().toString() + "/n" + " You have booked a "
                                + etSize.getText().toString() + " person(s) "
                                + isSmoke + " table on " + "/n"
                                + datePicker.getYear() + "/" + (datePicker.getMonth() + 1) + "/" + datePicker.getDayOfMonth() + " at "
                                + timePicker.getHour() + ":" + timePicker.getMinute() + "/n" + "    Your phone number is "
                                + etTelephone.getText().toString() + ".",
                        Toast.LENGTH_LONG).show();
            }
        });


    }
}