package my.edu.tarc.lab12bmi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editTextWeight, editTextHeight;
    private TextView textViewResult;
    private ImageView imageViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextWeight = (EditText)findViewById(R.id.editTextWeight);
        editTextHeight = (EditText)findViewById(R.id.editTextHeight);
        textViewResult = (TextView)findViewById(R.id.textViewBMI);
        imageViewResult = (ImageView)findViewById(R.id.imageViewResult);
    }

    public void calculateBMI(View view){
        //TODO: do

        double weight, height, bmi;
        weight = Double.parseDouble(editTextWeight.getText().toString());
        height = Double.parseDouble(editTextHeight.getText().toString());
        bmi = weight / Math.pow(height/100,2);


        if(bmi<=18.5){
            imageViewResult.setImageResource(R.drawable.under);
            textViewResult.setText("Underweight");
        }
        else if(bmi>=21){
            imageViewResult.setImageResource(R.drawable.over);
            textViewResult.setText("Overweight");
        }
        else{
            imageViewResult.setImageResource(R.drawable.normal);
            textViewResult.setText("Normal");
        }
    }

    public void reset(View view){
        editTextHeight.setText("");
        editTextWeight.setText("");
        textViewResult.setText("BMI");
        imageViewResult.setImageResource(R.drawable.empty);
    }
}
