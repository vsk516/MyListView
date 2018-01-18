package com.example.vamsisaikrishna.mylistview;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Vamsisaikrishna on 1/17/2018.
 */

public class CustomAdapter extends ArrayAdapter {

   private LayoutInflater layoutInflater;
   private Context mContext;
   private List<Person> mperson;

    public CustomAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull List <Person> objects) {

        super(context, R.layout.custom_list, (List) objects);
        mContext = context;
        mperson=objects;

    }
    public class ViewHolder{
        TextView tvname;
        TextView tvcompany;
        TextView tvsalary;
        ImageView pimage;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        if(convertView==null){
            layoutInflater =(LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView =layoutInflater.inflate(R.layout.custom_list,null);
        }

        //viewHolder object
        ViewHolder viewHolder = new ViewHolder();

        //initialize our views
        viewHolder.tvname = (TextView)convertView.findViewById(R.id.name);
        viewHolder.tvcompany = (TextView)convertView.findViewById(R.id.company);
        viewHolder.tvsalary = (TextView)convertView.findViewById(R.id.salary);
        viewHolder.pimage = (ImageView)convertView.findViewById(R.id.person_image);

        //assign data
        viewHolder.tvname.setText(mperson.get(position).getName());
        viewHolder.tvcompany.setText(mperson.get(position).getCompany());
        viewHolder.tvsalary.setText(String.valueOf(mperson.get(position).getSalary()));
        viewHolder.pimage.setImageResource(mperson.get(position).getImage());

        return convertView;
    }
}
