package com.example.android.bookquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int score =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onCheckBox(View view){

        CheckBox book1 = (CheckBox) findViewById(R.id.EN_checkbox);
        boolean isbook1 = book1.isChecked();
        Log.v("MainActivity.java","book name" +isbook1);

        CheckBox book2 = (CheckBox) findViewById(R.id.PBE_checkbox);
        boolean isbook2 = book2.isChecked();
        Log.v("MainActivity.java","book name" +isbook2);

        CheckBox book3 = (CheckBox) findViewById(R.id.DCE_checkbox);
        boolean isbook3 = book3.isChecked();
        Log.v("MainActivity.java","book name" +isbook3);

        if(isbook1 ==true && isbook2 == true && isbook3==true)
        {
            Toast.makeText(this, "Please select only two options", Toast.LENGTH_SHORT).show();
        }

        if(isbook1 ==true || isbook2 == true || isbook3==true)
        {
            Toast.makeText(this, "Request to select two options", Toast.LENGTH_SHORT).show();
        }
    }

    public void evaluateScore(View view) {

        //***Question 1***

        RadioButton rbook1 = (RadioButton) findViewById(R.id.GG_radio_button);
        boolean isrbook1 = rbook1.isChecked();
        Log.v("MainActivity.java","book name:" +isrbook1);

        RadioButton rbook2 = (RadioButton) findViewById(R.id.EB_radio_button);
        boolean isrbook2 = rbook2.isChecked();
        Log.v("MainActivity.java","book name:" +isrbook2);

        RadioButton rbook3 = (RadioButton) findViewById(R.id.SK_radio_button);
        boolean isrbook3 = rbook3.isChecked();
        Log.v("MainActivity.java","book name:" +isrbook3);


        if(isrbook1 == true){
            score = score +1;
        }



        //*** Question 2 ****
        EditText editName = (EditText) findViewById(R.id.CD_edit_text);
        String inputName = editName.getText().toString();
        Log.v("MainActivity.java", inputName);


        if(inputName.equalsIgnoreCase("Charles Dickens")) {
            score = score +1;
        }

       //***Question 3****

        CheckBox book1 = (CheckBox) findViewById(R.id.EN_checkbox);
        boolean isbook1 = book1.isChecked();
        Log.v("MainActivity.java","book name" +isbook1);

        CheckBox book2 = (CheckBox) findViewById(R.id.PBE_checkbox);
        boolean isbook2 = book2.isChecked();
        Log.v("MainActivity.java","book name" +isbook2);

        CheckBox book3 = (CheckBox) findViewById(R.id.DCE_checkbox);
        boolean isbook3 = book3.isChecked();
        Log.v("MainActivity.java","book name" +isbook3);

        if(isbook1 ==true){
            score = score +1;
        }
        if(isbook3==true){
            score = score +1;
        }

        //***Question 4***

        RadioButton rbook4 = (RadioButton) findViewById(R.id.VW_radio_button);
        boolean isrbook4 = rbook4.isChecked();
        Log.v("MainActivity.java","book name:" +isrbook4);

        RadioButton rbook5 = (RadioButton) findViewById(R.id.WS_radio_button);
        boolean isrbook5 = rbook5.isChecked();
        Log.v("MainActivity.java","book name:" +isrbook5);

        RadioButton rbook6 = (RadioButton) findViewById(R.id.LS_radio_button);
        boolean isrbook6 = rbook6.isChecked();
        Log.v("MainActivity.java","book name:" +isrbook6);


        if(isrbook5 == true){
            score = score +1;
        }

        display(score);
        score=0;
    }

    public void display(int score){
        TextView textView= (TextView) findViewById(R.id.score_text_view);
        Toast.makeText(this,"Evaluating your score...",Toast.LENGTH_SHORT).show();
        if(score >=3)
        {
            textView.setText("Congratulations.! Your score is " +score + " out of 5");

        } else if (score > 0)
        {
            textView.setText("Keep improving your IQ. You score only " +score + " out of 5");

        }


    }

}
