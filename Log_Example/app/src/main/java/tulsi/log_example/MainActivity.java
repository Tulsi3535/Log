package tulsi.log_example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    EditText name;
    Button btn;
    private  String TAG = "MainActivity Log >";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.editText);
        btn = findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "Button Clicked...!!");
                if (!name.getText().toString().isEmpty()) {
                    Log.d(TAG, "Entered Name = " + name.getText().toString());
                }else {
                    Log.e(TAG, "Name is Empty...!!");
                }
            }
        });

    }
}
