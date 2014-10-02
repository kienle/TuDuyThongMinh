package com.kienle.sachnoi.tuduythongminh.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.kienle.sachnoi.tuduythongminh.R;

public class MucLucAdapter extends BaseAdapter {

	private LayoutInflater mInflater;

//    private final Context mContext;
    private String[] mMucLucs;

    public MucLucAdapter(Activity context, String[] mucLucs) {
//        this.mContext = context;
        this.mMucLucs = mucLucs;
        this.mInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return mMucLucs != null ? mMucLucs.length : 0;
    }

    @Override
    public Object getItem(int position) {
        return mMucLucs[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        final ViewHolder holder;
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.item_muc_luc, null);

            holder = new ViewHolder();
            holder.mucLuc = (TextView) convertView.findViewById(R.id.tvMucLuc);

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.mucLuc.setText(mMucLucs[position]);

        return convertView;
    }

    static class ViewHolder {
        TextView mucLuc;
    }

}
