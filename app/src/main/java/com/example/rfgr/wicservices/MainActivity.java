package com.example.rfgr.wicservices;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) { //metoda wywołana po kliknięciu przycisku
        Intent intent = new Intent(this, DelayedMessageService.class); //utworzona intencja
        //do klasy DelayedMessageService
        intent.putExtra(DelayedMessageService.EXTRA_MESSAGE, //dodany tekst do intencji
                getResources().getString(R.string.button_response));
        startService(intent);
    }
}
