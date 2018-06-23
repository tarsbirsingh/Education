package com.example.tarsbir.education;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editText1;
    EditText editText2;
    /**
     * RadioButton Define here with numeric series
     */

    RadioButton radioButton1;
    RadioButton radioButton2;
    RadioButton radioButton3;
    RadioButton radioButton4;
    RadioButton radioButton5;
    RadioButton radioButton7;
    RadioButton radioButton8;
    private int score;
    /**
     * Radio Group
     */
    private RadioGroup radioGroup1;
    private RadioGroup radioGroup2;
    private RadioGroup radioGroup3;
    private RadioGroup radioGroup4;
    private RadioGroup radioGroup5;
    //private TextView displayText;
    private RadioGroup radioGroup7;
    private RadioGroup radioGroup8;
    private CheckBox checkBox1;
    private CheckBox checkBox3;
    private CheckBox checkBox4;
    private EditText editName;
    private Button showButton;

    private void getView() {
        radioGroup1 = findViewById(R.id.radioGroup_Q1);
        radioGroup2 = findViewById(R.id.radioGroup_Q2);
        radioGroup3 = findViewById(R.id.radioGroup_Q3);
        radioGroup4 = findViewById(R.id.radioGroup_Q4);
        radioGroup5 = findViewById(R.id.radioGroup_Q5);
        radioGroup7 = findViewById(R.id.radioGroup_Q7);
        radioGroup8 = findViewById(R.id.radioGroup_Q8);
        //Checkbox here
        checkBox1 = findViewById(R.id.checkbox_Q6_op1);
        checkBox3 = findViewById(R.id.checkbox_Q6_op3);
        checkBox4 = findViewById(R.id.checkbox_Q6_op4);
        editText1 = findViewById(R.id.Q9_ans_view);
        editText2 = findViewById(R.id.QuestionTen_ans_view);
        editName = findViewById(R.id.nameText);
        showButton = findViewById(R.id.button_show);
        //displayText = findViewById(R.id.textView_name);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getView();
        showButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score = 0;
                String name = editName.getText().toString();
                //radio button for FIRST QUESTION
                int selectedId1 = radioGroup1.getCheckedRadioButtonId();
                int selectedId2 = radioGroup2.getCheckedRadioButtonId();
                int selectedId3 = radioGroup3.getCheckedRadioButtonId();
                int selectedId4 = radioGroup4.getCheckedRadioButtonId();
                int selectedId5 = radioGroup5.getCheckedRadioButtonId();
                int selectedId7 = radioGroup7.getCheckedRadioButtonId();
                int selectedId8 = radioGroup8.getCheckedRadioButtonId();
                radioButton1 = findViewById(selectedId1);
                radioButton2 = findViewById(selectedId2);
                radioButton3 = findViewById(selectedId3);
                radioButton4 = findViewById(selectedId4);
                radioButton5 = findViewById(selectedId5);
                radioButton7 = findViewById(selectedId7);
                radioButton8 = findViewById(selectedId8);
                checkBox1.isChecked();
                checkBox3.isChecked();
                checkBox4.isChecked();
                //if statement for radio button
                if (selectedId1 == R.id.radioButton_Q1_op1) {
                    score += 1;
                }

                if (selectedId2 == R.id.radioButton_Q2_op4) {
                    score += 1;
                }

                if (selectedId3 == R.id.radioButton_Q3_op4) {
                    score += 1;
                }

                if (selectedId4 == R.id.radioButton_Q4_op2) {
                    score += 1;
                }

                if (selectedId5 == R.id.radioButton_Q5_op1) {
                    score += 1;
                }

                if (selectedId7 == R.id.radioButton_Q7_op4) {
                    score += 1;
                }
                if (selectedId8 == R.id.radioButton_Q8_op4) {
                    score += 1;
                }
                if (checkBox4.isChecked() && checkBox3.isChecked() && checkBox1.isChecked()) {
                    score += 1;
                }

                String questionNine = editText1.getText().toString();
                if (questionNine.equals("James Gosling")) {
                    score += 1;
                }
                String questionTen = editText2.getText().toString();
                if (questionTen.equals("False")) {
                    score += 1;
                }

                String finalScore = getString(R.string.hi) + name + getString(R.string.youHaveScored) + score + getString(R.string.ten);
                Toast.makeText(getApplicationContext(), finalScore, Toast.LENGTH_LONG).show();


                //String hell ="Thanks "+name+"your score is"+score;

                //display value on screen
                //displayText.setText(hell);
            }
        });

    }
}