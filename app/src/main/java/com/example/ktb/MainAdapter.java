package com.example.ktb;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MyHolder> {
    Context context;
    List<ContactList_Model> contactListModels = new ArrayList<>();

    public MainAdapter(List<ContactList_Model> contactListModelList, Context applicationContext) {
        this.context = applicationContext;
        this.contactListModels = contactListModelList;
    }

    @NonNull
    @Override
    public MainAdapter.MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout, parent, false);
        return new MainAdapter.MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MainAdapter.MyHolder holder, int position) {
        holder.tv_name.setText(contactListModels.get(position).getContactName());
        holder.tv_number.setText(contactListModels.get(position).getContactNumber());
    }

    @Override
    public int getItemCount() {
        return contactListModels.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder {
        TextView tv_name,tv_number;
        public MyHolder(@NonNull View itemView) {
            super(itemView);
            tv_name =  itemView.findViewById(R.id.tv_name);
            tv_number =  itemView.findViewById(R.id.tv_number);


        }
    }
}
