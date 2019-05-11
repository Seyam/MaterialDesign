package com.example.materialdesign;

import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private CoordinatorLayout coordinatorLayout;
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        coordinatorLayout = findViewById(R.id.coordinatorLayout);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar snackbar = Snackbar.make(coordinatorLayout, "No internet!", Snackbar.LENGTH_INDEFINITE)
                                            .setAction("Retry", new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {
                                                    Snackbar snackbar2 = Snackbar.make(coordinatorLayout, "Reconnecting...",Snackbar.LENGTH_INDEFINITE);
                                                    snackbar2.show();
                                                }
                                            });

                snackbar.show();
            }
        });

    }
}
