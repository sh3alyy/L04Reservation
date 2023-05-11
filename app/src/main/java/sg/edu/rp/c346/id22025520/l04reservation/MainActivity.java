package sg.edu.rp.c346.id22025520.l04reservation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    DatePicker dp;
    TimePicker tp;
    Button btnDisplayDate;
    Button btnDisplayTime;
    TextView textDisplay;
    Button btnReset;
    CheckBox checkBoxDisplay;
    Button btnReserve;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dp = findViewById(R.id.datePicker);
        tp = findViewById(R.id.timePicker);
        btnDisplayDate = findViewById(R.id.buttonDate);
        btnDisplayTime= findViewById(R.id.btnDisplayTime);
        textDisplay = findViewById(R.id.textView);
        btnReserve = findViewById(R.id.button);
    }
}
    btnDisplayTime.setOnClickListener(new View.OnClickListener() {
    @Override
public void onClick(View v) {
        tp.setIs24HourView(true);
        int Hour = tp.getCurrentHour();
        int Minute = tp.getCurrentMinute();

        textDisplay.setText("The time is " + Hour + ":" + Minute);

        }


        });

        btnDisplayDate.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
        int Year = dp.getYear();
        int Month = dp.getMonth();
        int Day_of_Month = dp.getDayOfMonth();

        textDisplay.setText("The date is " + Day_of_Month + "/" + Month + "/" + Year);

        }
        });
