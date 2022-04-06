package com.example;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.widgets.R;

import org.jetbrains.annotations.NotNull;

public class MyViewHolder extends RecyclerView.ViewHolder {

    public TextView name;

        public MyViewHolder(@NotNull View itemView) {
            super(itemView);
            name=itemView.findViewById(R.id.name);
        }

}
