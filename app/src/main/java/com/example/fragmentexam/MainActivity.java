package com.example.fragmentexam;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements ListViewFragment.OnMyClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListViewFragment fragment = (ListViewFragment) getSupportFragmentManager().findFragmentById(R.id.list_frag);

        fragment.setOnMyClickListener(this);
    }

    @Override
    public void onMyClick(View view, int position) {
        Toast.makeText(this, "" + position, Toast.LENGTH_SHORT).show();
    }
}
