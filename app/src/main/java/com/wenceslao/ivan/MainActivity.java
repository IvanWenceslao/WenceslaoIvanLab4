package com.wenceslao.ivan;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showToast(View toast) {
        Toast.makeText ( this, "Toast message test...", Toast.LENGTH_LONG).show();
    }

    public void showSnackbar(View bar) {
        Snackbar.make(bar,  "Snackbar message test...", Snackbar.LENGTH_LONG).show();
    }

    protected void onStart(){
        super.onStart();
        Log.d("ICS115", "onStart() has started");
    }

    protected void onResume(){
        super.onResume();
        Log.d("ICS115", "onResume() has started");
    }

    protected void onPause(){
        super.onPause();
        Log.d("ICS115", "onPause() has started");
    }
    protected void onStop(){
        super.onStop();
        Log.d("ICS115", "onStop() has started");
    }
    protected void onRestart(){
        super.onRestart();
        Log.d("ICS115", "onRestart() has started");
    }
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ICS115", "onDestroy() has started");
    }
}
