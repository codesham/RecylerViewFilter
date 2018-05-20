package com.shyamkumarbora.recyclerfilterexample;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class CountryNamesAdapter extends RecyclerView.Adapter<CountryNamesAdapter.CountryNamesViewHolder> {
    private String [] mCountryNames;
    public CountryNamesAdapter(String [] mCountryNames){
        this.mCountryNames = mCountryNames;
    }
    @Override
    public CountryNamesAdapter.CountryNamesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View mView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recyler_item_layout,parent,false);
        CountryNamesViewHolder mCountryNamesViewHolder = new CountryNamesViewHolder(mView);
        return mCountryNamesViewHolder;
    }

    @Override
    public void onBindViewHolder(CountryNamesAdapter.CountryNamesViewHolder holder, int position) {
        holder.mCountryNamesTextView.setText(mCountryNames[position]);
    }

    @Override
    public int getItemCount() {
        return mCountryNames.length;
    }

    public class CountryNamesViewHolder extends RecyclerView.ViewHolder {
        public TextView mCountryNamesTextView;
        public CountryNamesViewHolder(View itemView) {
            super(itemView);
            mCountryNamesTextView = itemView.findViewById(R.id.country_name_tv);
        }
    }
    public void updateList(String [] mCountryNames){
        this.mCountryNames = mCountryNames;
        notifyDataSetChanged();
    }
}
