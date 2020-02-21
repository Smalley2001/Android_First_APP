package dorian.example.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView)  findViewById(R.id.textView)).setTextColor(
                        getResources().getColor(R.color.colorAccent));
            }
        });
        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.rootView).setBackgroundColor(getResources()
                        .getColor(R.color.Red));
            }
        });
        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newText=((EditText)  findViewById(R.id.editText)).getText().toString();
                if (TextUtils.isEmpty(newText)){
                    ((TextView)  findViewById(R.id.textView)).setText("Hello Dorian!");

                }else {
                    ((TextView)  findViewById(R.id.textView)).setText(newText);
                }
            }
        });
        findViewById(R.id.rootView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView)  findViewById(R.id.textView)).setTextColor(
                        getResources().getColor(R.color.Yellow));
                findViewById(R.id.rootView).setBackgroundColor(getResources()
                        .getColor(R.color.colorPrimary));
                ((TextView)  findViewById(R.id.textView)).setText("Hello Dorian!");
            }
        });
    }
}
