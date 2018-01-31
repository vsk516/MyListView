package com.example.vamsisaikrishna.mylistview;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

   /* simple POC on List view. things need to develop a simple list view
    Adapter view(list view), data for the list(ArrayList), Adapter(responsible to convert a data entry into view)*/

    /*if we want to make a simple POC using CustomAdapter. things needed
    adapter view(list view), data for the list(ArrayList of object type), CustomAdapter(which should override the getView().
     under the getView() we should Initialize the view and assign the data to the view with the help of ViewHolder Object*/
    ListView mlistView;
  //  List<String> mListdata;
   // ArrayAdapter<String> madapter;
    CustomAdapter mcustomAdapter;
    List<Person> mperson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            mlistView = (ListView)findViewById(R.id.mylist);
        mperson = new ArrayList<>();
        mperson.add(new Person("phani","XXXX",5600.45, android.R.drawable.alert_dark_frame));
        mperson.add(new Person("Sathish","YYYY",5600.45, android.R.drawable.ic_menu_report_image));
        mperson.add(new Person("Arjun","AAAA",5600.45,android.R.drawable.ic_menu_report_image));
        mperson.add(new Person("siva","BBBB",5600.45,android.R.drawable.ic_menu_report_image));
        mperson.add(new Person("siva ","CCCC",5600.45,android.R.drawable.ic_menu_report_image));
        mperson.add(new Person("sai","DDDD",5600.45,android.R.drawable.ic_menu_report_image));
        mcustomAdapter = new CustomAdapter(this,R.layout.custom_list,mperson);
       /* mListdata = new ArrayList<>();
        mListdata.add("phani");
        mListdata.add("sathish");
        mListdata.add("siva");
        mListdata.add("arjuna");
        mListdata.add("Siva sankar");
        mListdata.add("Sai kiran");
        madapter =new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,mListdata);
         mlistView.setAdapter(madapter);*/
        mlistView.setAdapter(mcustomAdapter);
        mlistView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               // Toast.makeText(getApplicationContext()," "+mperson.get(position).getName(),Toast.LENGTH_SHORT).show();

                Intent in = new Intent(getApplicationContext(),PersonViewActivity.class);
                Person selectedPerson =mperson.get(position);
                in.putExtra("selectedPerson", selectedPerson);
                startActivity(in);
            }
        });
    }
}
