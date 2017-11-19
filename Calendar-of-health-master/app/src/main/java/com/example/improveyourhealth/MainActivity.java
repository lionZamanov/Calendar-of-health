package com.example.improveyourhealth;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_item);
        final CompactCalendarView compactCalendarView = (CompactCalendarView) findViewById(R.id.compactcalendar_view);
        final TextView ex1 = (TextView) findViewById(R.id.Name);
        final TextView partofbody1 = (TextView) findViewById(R.id.part_of_the_body1);
        final TextView ex2 = (TextView) findViewById(R.id.name);//??
        final TextView partofbody2 = (TextView) findViewById(R.id.part_of_the_body2);
        GregorianCalendar newCal = new GregorianCalendar();
        int day = newCal.get( Calendar.DAY_OF_WEEK);
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
        }
