package com.example.retrofittt;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class userAdapter extends RecyclerView.Adapter<userAdapter.userModel> {
   MainActivity mainActivity;
   List<com.example.retrofittt.userModel> allUserList;

    public userAdapter(MainActivity mainActivity, List<com.example.retrofittt.userModel> allUserList) {
        this.mainActivity=mainActivity;
        this.allUserList=allUserList;
    }

    @NonNull
    @Override
    public userModel onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new userModel(LayoutInflater.from(mainActivity).inflate(R.layout.item_user, parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull userModel holder, int position) {
         holder.textView.setText(allUserList.get(position).getTitle());
    }

    @Override
    public int getItemCount() {
        return allUserList.size();
    }

    class userModel extends RecyclerView.ViewHolder {
        TextView textView;
        public userModel(@NonNull View itemView) {
            super(itemView);
            textView=itemView.findViewById(R.id.textView);
        }
    }
}
