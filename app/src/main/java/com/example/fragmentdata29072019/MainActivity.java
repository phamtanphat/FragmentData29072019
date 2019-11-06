package com.example.fragmentdata29072019;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.widget.Button;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    Button btnAddAndroidFragment;
    SeekBar skMain;
    AndroidFragment androidFragment;
    FragmentManager fragmentManager = getSupportFragmentManager();
    ListenDataSeekbar listenDataSeekbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnAddAndroidFragment = findViewById(R.id.buttonAddAndroidFragment);
        skMain = findViewById(R.id.seekbarMain);

        androidFragment = (AndroidFragment) fragmentManager.findFragmentById(R.id.fragmentAndroid);

        skMain.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if (androidFragment != null){
                   listenDataSeekbar.onChange(progress);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
    public void onListenDataSeekbar(ListenDataSeekbar listenDataSeekbar){
        this.listenDataSeekbar = listenDataSeekbar;
    }
}
