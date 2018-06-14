package com.example.pcpv.swipelayout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.pcpv.swipelayout.library.SwipeLayout;

public class MainActivity extends AppCompatActivity implements SwipeLayout.SwipeListener {
    private static final String TAG = "MainActivity";
    private SwipeLayout swipeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        swipeLayout = findViewById(R.id.activity_main_swipe_layout);
        LinearLayout llAdd = findViewById(R.id.activity_main_ll_add);
        LinearLayout llEdit = findViewById(R.id.activity_main_ll_edit);
        LinearLayout llDelete = findViewById(R.id.activity_main_ll_delete);

        llAdd.setOnClickListener(view -> Toast.makeText(this, "click Add", Toast.LENGTH_SHORT).show());
        llEdit.setOnClickListener(view -> Toast.makeText(this, "click Edit", Toast.LENGTH_SHORT).show());
        llDelete.setOnClickListener(view -> Toast.makeText(this, "click Delete", Toast.LENGTH_SHORT).show());

        swipeLayout.addSwipeListener(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        swipeLayout.removeAllSwipeListener();

    }

    @Override
    public void onStartOpen(SwipeLayout layout) {
        Log.d(TAG, "onStartOpen: ");
    }

    @Override
    public void onOpen(SwipeLayout layout) {
        Log.d(TAG, "onOpen: ");
    }

    @Override
    public void onStartClose(SwipeLayout layout) {
        Log.d(TAG, "onStartClose: ");
    }

    @Override
    public void onClose(SwipeLayout layout) {
        Log.d(TAG, "onClose: ");
    }

    @Override
    public void onUpdate(SwipeLayout layout, int leftOffset, int topOffset) {
        Log.d(TAG, "onUpdate: ");
    }

    @Override
    public void onHandRelease(SwipeLayout layout, float xvel, float yvel) {
        Log.d(TAG, "onHandRelease: ");
    }
}
