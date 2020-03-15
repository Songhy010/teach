package khay.dy.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int a = 10;
    private TextView tv_dis;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_dis = findViewById(R.id.tv_dis);
    }
    public void action(View view){
        final Button btn = (Button)view;
        switch (view.getId()){
            case R.id.btn_1:
                tv_dis.setText(btn.getText());
                Toast.makeText(MainActivity.this, "Hello", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_2:
                tv_dis.setText(btn.getText());
                Toast.makeText(MainActivity.this, "Hello Wordl", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}