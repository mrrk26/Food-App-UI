package com.shadowtech.foodadda.Adapter;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.shadowtech.foodadda.Model.PopularItems;
import com.shadowtech.foodadda.R;
import com.shadowtech.foodadda.databinding.FragmentSplashBinding;

import java.util.ArrayList;

public class PopularItemsRecyclerAdapter extends RecyclerView.Adapter<PopularItemsRecyclerAdapter.viewHolder> {

    Context context;
    ArrayList<PopularItems> popularItems;

    public PopularItemsRecyclerAdapter(Context context, ArrayList<PopularItems> popularItems) {
        this.context = context;
        this.popularItems = popularItems;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.popularitems_sample, parent, false);

        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        PopularItems model = popularItems.get(position);
        holder.sampleimg.setImageResource(model.getImage());
        holder.sampletext.setText(model.getName());

    }

    @Override
    public int getItemCount() {
        return popularItems.size();
    }

    public static class viewHolder extends RecyclerView.ViewHolder {
        ImageView sampleimg;
        TextView sampletext;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            sampleimg = itemView.findViewById(R.id.igsampleimage);
            sampletext = itemView.findViewById(R.id.txsampleitem);
        }
    }
}
