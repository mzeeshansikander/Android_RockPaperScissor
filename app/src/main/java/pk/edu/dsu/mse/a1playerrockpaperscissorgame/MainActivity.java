package pk.edu.dsu.mse.a1playerrockpaperscissorgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText et_name = findViewById(R.id.name);
        final Button start = findViewById(R.id.gameId);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = et_name.getText().toString();
                Intent intent = new Intent(MainActivity.this,GameActivity.class);
                intent.putExtra("name",name);
                startActivity(intent);

            }
        });

    }
}
