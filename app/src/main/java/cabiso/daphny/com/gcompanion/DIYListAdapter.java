package cabiso.daphny.com.gcompanion;

import android.app.Activity;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

import cabiso.daphny.com.gcompanion.Model.DIYitem;

/**
 * Created by Lenovo on 7/30/2017.
 */

public class DIYListAdapter extends ArrayAdapter<DIYitem> {

    private Activity context;
    private int resource;
    private List<DIYitem> listDIY;

    public DIYListAdapter(@NonNull Activity context, @LayoutRes int resource, @NonNull List<DIYitem> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        listDIY = objects;
    }

    @Nullable
    @Override
    public View getView(int position, @Nullable View convertView, @Nullable ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();

        View v = inflater.inflate(resource, null);
        TextView tvName = (TextView) v.findViewById(R.id.fetch_diy_name);
        TextView tvPrice = (TextView) v.findViewById(R.id.fetch_diy_price);
        ImageView img = (ImageView) v.findViewById(R.id.fetch_image);

        tvPrice.setText(listDIY.get(position).getDiyName());
        tvName.setText(listDIY.get(position).getDiyPrice());
        Glide.with(context).load(listDIY.get(position).getImage_URL()).into(img);

        return v;
    }

}
