package com.innovach.echeckin.adapter;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.innovach.echeckin.R;

import java.util.List;
import java.util.jar.Attributes;

import butterknife.Bind;
import butterknife.ButterKnife;

public class NameListAdapter extends RecyclerView.Adapter<NameListAdapter.NameViewHolder> {
    private List<Name> mNames;
    private Context mContext;

    public NameListAdapter(Context context, List<Name> names) {
        mContext = context;
        mNames = names;
    }

    @Override
    public NameListAdapter.NameViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.name_list_item, parent, false);
        NameViewHolder viewHolder = new NameViewHolder(view);
        return viewHolder;
    }




    public class NameViewHolder extends RecyclerView.ViewHolder {
        @Bind(R.id.personNameTextView) TextView mPersonNameTextView;
        @Bind(R.id.checkinButton) Button mCheckinButton;
        private Context mContext;

        public NameViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            mContext = itemView.getContext();
        }
    }
}