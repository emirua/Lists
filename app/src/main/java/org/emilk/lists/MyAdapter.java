package org.emilk.lists;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Emilio on 06/07/2015.
 */
public class MyAdapter extends ArrayAdapter<Item> {
    private List<Item> Items;
    private LayoutInflater inflater;
    @Bind(R.id.myTextView)
    TextView myTextView;
    @Bind(R.id.myTextDescriptionView)
    TextView myDescription;
    @Bind(R.id.myImgView)
    ImageView myImg;

    public MyAdapter(Context context, int resource, List<Item> objects) {
        super(context, resource, objects);
        inflater= LayoutInflater.from(context);
        Items = objects;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View itemView = inflater.inflate(R.layout.item_list,parent,false);
        ButterKnife.bind(this, itemView);

        setItem(getItem(position));

        return itemView;
    }


    public void setItem(Item item){
        myTextView.setText(item.getmName());
        myDescription.setText(item.getmDescription());
        myImg.setImageResource(item.getmDrawable());
    }
}



