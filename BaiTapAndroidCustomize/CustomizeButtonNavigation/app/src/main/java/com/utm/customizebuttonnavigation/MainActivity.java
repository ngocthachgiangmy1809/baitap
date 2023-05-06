package com.utm.customizebuttonnavigation;

import android.app.Activity;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AHBottomNavigation bottomNavigation = findViewById(R.id.bottom_navigation);

        // Create items
        AHBottomNavigationItem item1 = new AHBottomNavigationItem(R.string.tab_1, R.drawable.baseline_home_black_24, R.color.blue);
        AHBottomNavigationItem item2 = new AHBottomNavigationItem(R.string.tab_2, R.drawable.baseline_favorite_border_black_24, R.color.grey);
        AHBottomNavigationItem item3 = new AHBottomNavigationItem(R.string.tab_3, R.drawable.baseline_account_circle_black_24, R.color.orange);

        // Add items
        bottomNavigation.addItem(item1);
        bottomNavigation.addItem(item2);
        bottomNavigation.addItem(item3);

        bottomNavigation.setColered(false);

        bottomNavigation.setDefaultBackgroundColor(getResources().getColor(R.color.orange));
        bottomNavigation.setAccentColor(getResources().getColor(R.color.teal_700));
        bottomNavigation.setInactiveColor(getResources().getColor(R.color.white));

        AHNotification notification = new AHNotification.Builder()
                .setText("10")
                .setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.green))
                .setTextColor(ContextCompat.getColor(MainActivity.this, R.color.white))
                .build();
        bottomNavigation.setNotification(notification, 1);

        bottomNavigation.setTitleState(AHBottomNavigation.TitleState.ALWAYS_HIDE);

    }
}