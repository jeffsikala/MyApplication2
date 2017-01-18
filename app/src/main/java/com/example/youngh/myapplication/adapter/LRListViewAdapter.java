package com.example.youngh.myapplication.adapter;


import android.content.Context;
import android.database.DataSetObserver;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;

import com.example.youngh.myapplication.R;

/**
 * Created by YoungH on 1/18/17.
 */

public class LRListViewAdapter extends BaseAdapter {
    private final Context mContext;
    private final LayoutInflater mInflater;

    public LRListViewAdapter(Context context) {
        mContext = context;
        mInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return 20;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

//    @Override
//    public View getView(int position, View convertView, ViewGroup parent) {
//        TextView view = new TextView(mContext);
//        view.setText(String.valueOf(position));
//        return view;
//    }



//   @Override
//    public View getView(int position, View convertView, ViewGroup parent) {
//       View rowView = mInflater.inflate(R.layout.adapter_list_lr, parent, false);
//       TextView textView = (TextView)rowView.findViewById(R.id.adapter_list_lr_text);
//       textView.setText(String.valueOf(position));
//       return rowView;
//    }



    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if(convertView == null) {
            convertView = mInflater.inflate(R.layout.adapter_list_lr, parent, false);
            holder = new ViewHolder();
            holder.textView = (TextView)convertView.findViewById(R.id.adapter_list_lr_text);
            convertView.setTag(holder);
        }
        else{
            holder = (ViewHolder) convertView.getTag();
        }
        holder.textView.setText(String.valueOf(position));
        return convertView;
    }

    private static class ViewHolder {
        public TextView textView;
    }

}
