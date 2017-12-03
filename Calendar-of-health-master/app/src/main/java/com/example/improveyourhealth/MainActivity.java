package com.example.improveyourhealth;

import android.os.CountDownTimer;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toolbar;

import com.github.sundeepk.compactcalendarview.CompactCalendarView;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class MainActivity extends AppCompatActivity {

    private ImageView imageview1,imageview2;
    public TextView counter1,counter2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final CompactCalendarView compactCalendarView = (CompactCalendarView) findViewById(R.id.compactcalendar_view);
        final TextView ex1 = (TextView) findViewById(R.id.Name);
        final TextView partofbody1 = (TextView) findViewById(R.id.part_of_the_body1);
        final TextView ex2 = (TextView) findViewById(R.id.name);//??
        final TextView partofbody2 = (TextView) findViewById(R.id.part_of_the_body2);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_item);
        GregorianCalendar newCal = new GregorianCalendar();
        imageview1 = (ImageView) findViewById(R.id.Task1);
        imageview2 = (ImageView) findViewById(R.id.task6);
        counter1 = (TextView) findViewById(R.id.counter);
        counter2 = (TextView) findViewById(R.id.counter2);
        int day = newCal.get( Calendar.DAY_OF_WEEK);
        imageview1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                timer(ex1,counter1);
            }
        });
        switch(day){
            case 1: ex1.setText("");
                    partofbody1.setText("Пресс");
                    ex2.setText("Отжимания");
                    partofbody2.setText("Руки");
                    break;
            case 2:
                ex1.setText("Приседания");
                partofbody1.setText("Ноги");
                ex2.setText("Растяжка ног");
                partofbody2.setText("Ноги");
                break;
            case 3:
                ex1.setText("Отдых");
                partofbody1.setText("Отдых");
                ex2.setText("Отдых");
                partofbody2.setText("Отдых");
                break;
            case 4:
                ex1.setText("Ножницы ногами");
                partofbody1.setText("Пресс");
                ex2.setText("Отжимания");
                partofbody2.setText("Руки");
                break;
            case 5:
                ex1.setText("Приседания");
                partofbody1.setText("Ноги");
                ex2.setText("Отжимания");
                partofbody2.setText("Руки");
                break;
            default:
                ex1.setText("Отдых");
                partofbody1.setText("Отдых");
                ex2.setText("Отдых");
                partofbody2.setText("Отдых");
                break;
        }
        }
        public void timer(TextView ex, final TextView counter){
            CountDownTimer timer = new CountDownTimer(60000,1000) {
                @Override
                public void onTick(long l) {
                    counter.setText(" "+l/1000);
                }
                @Override
                public void onFinish() {
                    counter.setText("");
                }
            };
        }

        }
