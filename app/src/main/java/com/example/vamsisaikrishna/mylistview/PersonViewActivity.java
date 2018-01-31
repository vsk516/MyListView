package com.example.vamsisaikrishna.mylistview;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Vamsisaikrishna on 1/30/2018.
 */

public class PersonViewActivity extends AppCompatActivity {
    private Person mPerson;

    private TextView tvname;
    private TextView tvcompany;
    private TextView tvsalary;
    private ImageView pimage;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.personview_activity);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        tvname = (TextView)findViewById(R.id.name);
        tvcompany = (TextView)findViewById(R.id.company);
        tvsalary = (TextView)findViewById(R.id.salary);
        pimage = (ImageView)findViewById(R.id.person_image);

        mPerson = (Person) getIntent().getSerializableExtra("selectedPerson");

        tvname.setText(mPerson.getName());
        tvcompany.setText(mPerson.getCompany());
        tvsalary.setText(String.valueOf(mPerson.getSalary()));
        pimage.setImageResource((mPerson.getImage()));
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==android.R.id.home){
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
