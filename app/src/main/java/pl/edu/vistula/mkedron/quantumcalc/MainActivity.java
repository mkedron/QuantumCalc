package pl.edu.vistula.mkedron.quantumcalc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private DataRepository dataRepository;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        dataRepository = DataRepository.getInstance();
        setContentView(R.layout.activity_main);
    }

    public void nextListener(View view) {
        Intent intent = new Intent(this, ChooseGatewayActivity.class);
        fillData();
        startActivity(intent);
    }

    private void fillData() {
        dataRepository.setAlphaImg(getFloatValue(R.id.alpha_img));
        dataRepository.setAlphaReal(getFloatValue(R.id.alpha_real));
        dataRepository.setBetaImg(getFloatValue(R.id.beta_img));
        dataRepository.setBetaReal(getFloatValue(R.id.alpha_real));
    }

    private Float getFloatValue(int id) {
        EditText field = (EditText) findViewById(id);
        String textValue = field.getText().toString();
        try {
            return Float.valueOf(field.getText().toString());
        } catch(Exception e) {
            return new Float(0);
        }
    }
}
