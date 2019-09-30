package com.example.solarcalculator2;

import android.content.Context;

import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;

import org.w3c.dom.Text;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Chris Andasei on Sep 27,2019
 * https://twitter.com/qristopabs
 * Nigeria.
 */

public class ConsumptionAdapter extends RecyclerView.Adapter<ConsumptionAdapter.ViewHolder> {
    private final Context context;
    private List<Energy> items;

    //Pass the data from the activity or fragment to the adapter to and fro here.
    public ConsumptionAdapter(List<Energy> items, Context context) {
        this.items = items;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent,
                                         int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_energy, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Energy item = items.get(position);
        holder.set(item);

        holder.mRemove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Handle what happens when the remove is clicked here
                int id = item.getId();
                deleteItem(position);
                onDelete(id);
            }
        });

    }

    private void deleteItem(int position) {
        items.remove(position);
        notifyItemRemoved(position);
    }

    private void onDelete(int id) {
        if (items.size() > 0) items.remove(id);
        Toast.makeText(context, "Deleted " + id, Toast.LENGTH_SHORT).show();
    }

    @Override
    public int getItemCount() {
        if (items == null) {
            return 0;
        }
        return items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.appliance_name)
        TextView mApplianceName;
        @BindView(R.id.count)
        TextView mCount;
        @BindView(R.id.watt)
        TextView mWatt;
        @BindView(R.id.remove)
        ImageView mRemove;

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        public void set(Energy item) {
            //UI setting code
            mApplianceName.setText(item.getName());
            mCount.setText(item.getCount());
            mWatt.setText(item.getWatt());
        }
    }
}