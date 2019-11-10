package com.rosol.rotemdances;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class DanceAdapter extends RecyclerView.Adapter<DanceAdapter.MyViewHolder> {

    private List <Dance> danceList;
    private OnClickListenerItem mOnClickListener;


    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView danceName;
        OnClickListenerItem onClickListener;
        public MyViewHolder(View itemView, OnClickListenerItem onClickListener) {
            super(itemView);
            danceName = itemView.findViewById(R.id.dance_title_text_view);
            this.onClickListener=onClickListener;
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
        onClickListener.onItemClick(getAdapterPosition());
        }
    }

    public DanceAdapter (List <Dance> danceList, OnClickListenerItem onClickListenerItem){
        this.danceList=danceList;
        this.mOnClickListener=onClickListenerItem;

    }

    @Override
    public MyViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.dance_list_item,parent,false);
        return new MyViewHolder(view,mOnClickListener);
    }

    @Override
    public void onBindViewHolder( MyViewHolder holder, int position) {
        Dance dance=danceList.get(position);
        holder.danceName.setText(dance.getDanceTitle());

    }

    @Override
    public int getItemCount() {
        return danceList.size();
    }

    public interface OnClickListenerItem{
        void onItemClick(int position);
    }

}
