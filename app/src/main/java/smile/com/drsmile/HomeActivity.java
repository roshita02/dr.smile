package smile.com.drsmile;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {


    private RelativeLayout cavity,hygiene,toothwear,diet,askdoctor,record,team,map;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        cavity = (RelativeLayout) findViewById(R.id.cavity);
        hygiene = (RelativeLayout) findViewById(R.id.hygiene);
        toothwear = (RelativeLayout) findViewById(R.id.toothwear);
        diet = (RelativeLayout) findViewById(R.id.diet);
        askdoctor = (RelativeLayout) findViewById(R.id.askdoctor);
        record = (RelativeLayout) findViewById(R.id.record);
        team = (RelativeLayout) findViewById(R.id.team);
        map = (RelativeLayout) findViewById(R.id.map);
        cavity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, Activity_Toothdecay.class);
                startActivity(intent);
            }
        });
    }


}
