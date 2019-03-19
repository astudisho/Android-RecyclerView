package com.example.myapplication.Adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myapplication.R;

import java.util.List;

public class HistoryLogAdapter extends RecyclerView.Adapter<HistoryLogAdapter.HistoryLogViewHolder> {
    private List<String> mDataSet;
    private RecyclerView mRv;

    public static class HistoryLogViewHolder extends RecyclerView.ViewHolder{
        public TextView tv;
        public HistoryLogViewHolder(TextView v){
            super(v);
            tv = v;
        }
    }

    public HistoryLogAdapter(List<String> myDataset, RecyclerView rv){
        mDataSet = myDataset;
        mRv = rv;
    }


    @NonNull
    @Override
    public HistoryLogViewHolder onCreateViewHolder(@NonNull final ViewGroup viewGroup,final int i) {
        TextView v = (TextView) LayoutInflater
                .from(viewGroup.getContext())
                .inflate(R.layout.text_view_layout, viewGroup, false);

        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int itemPosition = mRv.getChildLayoutPosition(v);
                String item = mDataSet.get(itemPosition);
                Toast.makeText(viewGroup.getContext(), item,Toast.LENGTH_SHORT).show();
            }
        });

        HistoryLogViewHolder vh = new HistoryLogViewHolder(v);

        return vh;

    }

    @Override
    public void onBindViewHolder(@NonNull HistoryLogViewHolder historyLogViewHolder, int i) {
        historyLogViewHolder.tv.setText(mDataSet.get(i));
    }

    @Override
    public int getItemCount() {
        return mDataSet.size();
    }
}
