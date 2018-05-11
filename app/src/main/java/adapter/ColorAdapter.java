package adapter;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.daniel.listiconcolors.MObj;
import com.example.daniel.listiconcolors.R;

import java.util.ArrayList;

public class ColorAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<MObj> source;
    private int resource;

    public ColorAdapter(Context context, ArrayList<MObj> source) {
        this.context = context;
        this.source = source;
        this.resource = R.layout.cell_layout;
    }

    @Override
    public int getCount() {
        return source.size();
    }

    @Override
    public Object getItem(int position) {
        return source.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0L;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(resource,parent,false);
        }
        MObj obj = source.get(position);
        //
        TextView tv1 = convertView.findViewById(R.id.cell_tv1);
        ImageView iv1 = convertView.findViewById(R.id.cell_iv1);
        //
        tv1.setText(obj.getTexto());
        //
        //Drawable drawable = context.getDrawable(R.drawable.ic_label_black_24dp);
        Drawable drawable = context.getDrawable(R.drawable.ic_tag);
        String sColor = obj.getColor();//.replace("#", "#7F");
        drawable.setColorFilter(Color.parseColor(obj.getColor()), PorterDuff.Mode.SRC_ATOP);
        drawable.mutate();
        iv1.setImageDrawable(drawable);
        //
        return convertView;
    }
}
