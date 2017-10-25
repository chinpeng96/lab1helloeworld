package my.edu.tarc.lab1helloeworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editTextName, editTextAge;
    private TextView textViewMessage;

    //oncreate = main() function
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setcontentView method display the UI
        //R = resource class
        setContentView(R.layout.activity_main);

        //Linking program with UI
        editTextName = (EditText)findViewById(R.id.editName);
        editTextAge = (EditText)findViewById(R.id.editAge);
        textViewMessage = (TextView)findViewById(R.id.textViewMessage);
    }
    // A method handle view click event
    public void displayMessage(View view){
        String name;
        int age;
        name = editTextName.getText().toString();
        age = Integer.parseInt(editTextAge.getText().toString());
        age++;
        textViewMessage.setText("Hi "+name + " You will be " + age+ " years old in 2018");
    }

    public void resetScreen(View view){
        textViewMessage
    }
}
