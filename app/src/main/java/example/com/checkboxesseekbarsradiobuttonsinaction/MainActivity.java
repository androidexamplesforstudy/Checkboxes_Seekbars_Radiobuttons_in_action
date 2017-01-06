package example.com.checkboxesseekbarsradiobuttonsinaction;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    CheckBox meal1;
    CheckBox meal2;
    CheckBox meal3;
    CheckBox meal4;
    CheckBox meal5;
    CheckBox meal6;
    SeekBar seekBar;
    RadioGroup radioGroup;
    RadioButton radioButton;
    RadioButton radioButton2;

    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        textView = (TextView) findViewById(R.id.textView);

        meal1 = (CheckBox) findViewById(R.id.Posiłek1);
        meal2 = (CheckBox) findViewById(R.id.Posiłek2);
        meal3 = (CheckBox) findViewById(R.id.Posiłek3);
        meal4 = (CheckBox) findViewById(R.id.Posiłek4);
        meal5 = (CheckBox) findViewById(R.id.Posiłek5);
        meal6 = (CheckBox) findViewById(R.id.Posiłek6);

        seekBar = (SeekBar) findViewById(R.id.seekBar);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        radioButton = (RadioButton) findViewById(R.id.radioButton);
        radioButton2 = (RadioButton) findViewById(R.id.radioButton2);

        meal1.setOnCheckedChangeListener(MainActivity.this);
        meal2.setOnCheckedChangeListener(MainActivity.this);
        meal3.setOnCheckedChangeListener(MainActivity.this);
        meal4.setOnCheckedChangeListener(MainActivity.this);
        meal5.setOnCheckedChangeListener(MainActivity.this);
        meal6.setOnCheckedChangeListener(MainActivity.this);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                textView.setText(String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.radioButton:
                        Toast.makeText(MainActivity.this, "Tak", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radioButton2:
                        Toast.makeText(MainActivity.this, "Nie", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        int viewID = buttonView.getId();

        switch(viewID) {
            case R.id.Posiłek1:
                if (isChecked)
                    Toast.makeText(this, "Posiłek 1 clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.Posiłek2:
                if (isChecked)
                    Toast.makeText(this, "Posiłek 2 clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.Posiłek3:
                if (isChecked)
                    Toast.makeText(this, "Posiłek 3 clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.Posiłek4:
                if (isChecked)
                    Toast.makeText(this, "Posiłek 4 clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.Posiłek5:
                if (isChecked)
                    Toast.makeText(this, "Posiłek 5 clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.Posiłek6:
                if (isChecked)
                    Toast.makeText(this, "Posiłek 6 clicked", Toast.LENGTH_SHORT).show();
                break;
        }
    }

}
