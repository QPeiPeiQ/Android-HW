package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String[] show = new String[5];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for(int i = 0; i < 5; i++) {
            show[i] = "";
        }
    }

    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }

    public void onButtonShow(View view) {
        String message = "";
        for(int i = 0; i < 5; i++) {
            if(show[i] != "") {
                message = message + " " + show[i];
            }
        }
        displayToast(message);
    }

    public void onCheckBox(View view) {
        boolean checked = ((CheckBox) view).isChecked();

        switch (view.getId()) {
            case R.id.checkBox_chocolate_syrup:
                if(checked) {
                    show[0] = getString(R.string.chocolate_syrup);
                }else{
                    show[0] = "";
                }
                break;
            case R.id.checkBox_sprinkles:
                if(checked) {
                    show[1] = getString(R.string.sprinkles);
                }else{
                    show[1] = "";
                }
                break;
            case R.id.checkBox_crushed_nuts:
                if(checked) {
                    show[2] = getString(R.string.crushed_nuts);
                }else{
                    show[2] = "";
                }
                break;
            case R.id.checkBox_cherries:
                if(checked) {
                    show[3] = getString(R.string.cherries);
                }else{
                    show[3] = "";
                }
                break;
            case R.id.checkBox_orio_cookie_crumblrs:
                if(checked) {
                    show[4] = getString(R.string.orio_cookie_crumblrs);
                }else{
                    show[4] = "";
                }
                break;
            default:
                // Do nothing.
                break;
        }
    }
}