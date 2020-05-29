package nacc.sergey.anagrams;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText eText;
    private TextView tView;
    private Button btnText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        eText = findViewById(R.id.textInput);
        tView = findViewById(R.id.textOutput);
        btnText = findViewById(R.id.btnPress);

        btnText.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void onClick(View v) {
                String textInput = eText.getText().toString();

                char[] charArray = textInput.toCharArray();

                String resultString = "";
                for (int i = charArray.length - 1; i >= 0; i--) {
                    resultString += charArray[i];
                }
                tView.setText(resultString);
            }
        });

    }
}
