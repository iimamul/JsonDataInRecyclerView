package nayeem.recyclerviewjasonparse;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;

import java.util.List;

import static android.R.attr.fragment;

/**
 * Created by Lenovo on 7/2/2018.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private List<listView> listItems;
    private Context context;

    public MyAdapter(List<listView> listItems, Context context) {
        this.listItems = listItems;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item,parent,false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        listView listItem=listItems.get(position);

        holder.textViewhead.setText(listItem.getHead());
        holder.textViewdesc.setText(listItem.getDesc());
        //Picasso.get().load(listItem.getImageurl()).into(holder.imageView);
        Glide.with(context)
                .load(listItem.getImageurl())
                .into(holder.imageView);

    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView textViewhead;
        public TextView textViewdesc;
        public ImageView imageView;

        public ViewHolder(View itemView) {
            super(itemView);

            textViewhead=(TextView)itemView.findViewById(R.id.heading);
            textViewdesc=(TextView)itemView.findViewById(R.id.desc);
            imageView=(ImageView)itemView.findViewById(R.id.imageview);

        }
    }
}
