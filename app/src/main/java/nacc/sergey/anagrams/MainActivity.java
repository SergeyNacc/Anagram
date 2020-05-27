package nacc.sergey.anagrams;

import androidx.appcompat.app.AppCompatActivity;

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
            @Override
            public void onClick(View v) {
                String textInput = eText.getText().toString();

                StringBuilder sb = new StringBuilder();

                for (int i = textInput.length() - 1; i >= 0; i--) {
                    sb.append(textInput.charAt(i));
                }

                tView.setText(sb);
            }
        });

    }
}
