package org.emilk.lists;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Emilio on 06/07/2015.
 */
public class MyAdapter extends ArrayAdapter<String> {
    private String[] Items;
    private LayoutInflater inflater;
    @Bind(R.id.myTextView)
    TextView myTextView;
    @Bind(R.id.myTextDescriptionView)
    TextView myDescription;
    @Bind(R.id.myImgView)
    ImageView myImg;

    public MyAdapter(Context context, int resource, String[] objects) {
        super(context, resource, objects);
        inflater=LayoutInflater.from(context);
        Items =objects;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View viewItem = inflater.inflate(R.layout.item_list,parent,false);
        ButterKnife.bind(this,viewItem);

        myTextView.setText(Items[position]);

        return viewItem;
    }

}
