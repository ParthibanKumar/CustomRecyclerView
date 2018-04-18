package com.example.saran.customadapterrecycleview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder>{
    Context context;
    ArrayList<ListModel> arrayList = new ArrayList<>();


    public CustomAdapter(Context context, ArrayList<ListModel> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
       View appearence = LayoutInflater.from(parent.getContext()).inflate(R.layout.singlerow,parent,false);
       MyViewHolder myViewHolder = new MyViewHolder(appearence);
       return myViewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position)
    {
        ListModel listModel = arrayList.get(position);

      holder.tv1.setText(listModel.getName());
      holder.tv2.setText(listModel.getEmail());
      holder.tv2.setText(listModel.getGender());
      holder.im1.setText(listModel.getLogo());
      holder.im2.setText(listModel.getLogo());
      holder.im3.setText(listModel.getLogo());
    }

    @Override
    public int getItemCount()
    {
        return 0;
    }

public class MyViewHolder extends RecyclerView.ViewHolder

{
    TextView tv1, tv2, tv3, im1, im2,im3;

    public MyViewHolder(View itemView) {
        super(itemView);

        tv1=itemView.findViewById(R.id.textView);
        tv2=itemView.findViewById(R.id.textView2);
        tv3=itemView.findViewById(R.id.textView3);
        im1=itemView.findViewById(R.id.imageView);
        im2=itemView.findViewById(R.id.imageView2);
        im3=itemView.findViewById(R.id.imageView3);
    }
}

}



