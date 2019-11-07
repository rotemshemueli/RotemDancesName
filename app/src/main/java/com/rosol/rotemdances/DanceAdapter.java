package com.rosol.rotemdances;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class DanceAdapter extends RecyclerView.Adapter<DanceAdapter.MyViewHolder> {

    private List <Dance> danceList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView danceName;
        public MyViewHolder(View itemView) {
            super(itemView);
            danceName= itemView.findViewById(R.id.dance_title_text_view);
        }
    }

    public DanceAdapter (List <Dance> danceList){
        this.danceList=danceList;

    }

    @Override
    public MyViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.dance_list_item,parent,false);
        return new MyViewHolder(view);
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


    public interface ListItemClickListener{
        void onListItemClick(int clickedItemIndex);
    }


}
