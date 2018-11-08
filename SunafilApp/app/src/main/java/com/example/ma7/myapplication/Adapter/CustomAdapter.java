package com.example.ma7.myapplication.Adapter;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.battleent.ribbonviews.RibbonLayout;
import com.example.ma7.myapplication.Model.Item;
import com.example.ma7.myapplication.R;
import com.squareup.picasso.Picasso;

import java.util.List;

class CustomViewHolder extends RecyclerView.ViewHolder {
    RibbonLayout ribbonLayout;
    TextView txt_direccion,txt_orden,txt_empleador;
    public CustomViewHolder(View itemView){
        super (itemView);

        ribbonLayout = (RibbonLayout)itemView.findViewById(R.id.ribbonLayout);
        txt_direccion = (TextView)itemView.findViewById(R.id.txt_direccion);
        txt_orden = (TextView)itemView.findViewById(R.id.txt_num_orden);
        txt_empleador = (TextView)itemView.findViewById(R.id.txt_empleador);
    }
}
public class CustomAdapter extends RecyclerView.Adapter<CustomViewHolder> {
    Context context;
    List<Item> itemList;

    public  CustomAdapter(Context context, List<Item> itemList){
        this.context = context;
        this.itemList = itemList;
    }

    public CustomViewHolder onCreateViewHolder (ViewGroup parent, int viewType){
        View itemView = LayoutInflater.from(context).inflate(R.layout.item_layout,parent, false);
        return new CustomViewHolder(itemView);
    }

    public void onBindViewHolder(CustomViewHolder holder, int position){
        Item item = itemList.get(position);
        if(item.type == 0){
            holder.ribbonLayout.setShowBottom(false);
            holder.ribbonLayout.setShowBottom(false);

            holder.txt_direccion.setText(item.direccion);
            holder.txt_empleador.setText(item.empleador);
            holder.txt_orden.setText(item.orden);


        }
        else if (item.type == 1){
            holder.ribbonLayout.setShowBottom(false);
            holder.ribbonLayout.setShowBottom(false);

//            holder.ribbonLayout.setHeaderRibbonColor(Color.parseColor("#B94948"));
//            holder.ribbonLayout.setHeaderTextColor(Color.parseColor("#FFFFFF"));
            holder.txt_direccion.setText(item.direccion);
            holder.txt_empleador.setText(item.empleador);
            holder.txt_orden.setText(item.orden);

        }
        else {
            holder.ribbonLayout.setShowBottom(false);
            holder.ribbonLayout.setShowBottom(false);


        }
    }
    public int getItemCount(){
        return itemList.size();
    }
}
