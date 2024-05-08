package com.example.test0508;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class StuDataAdapter extends RecyclerView.Adapter<StuDataAdapter.ViewHolder> {

    private List<StuData> listData;

    public  StuDataAdapter (List<StuData> listData){
        this.listData = listData;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        View view = View.inflate(context,R.layout., null);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}