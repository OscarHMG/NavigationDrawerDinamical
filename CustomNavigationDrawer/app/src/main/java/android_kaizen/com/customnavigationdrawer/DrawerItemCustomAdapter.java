package android_kaizen.com.customnavigationdrawer;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import android_kaizen.com.customnavigationdrawer.model.ObjectDrawerItem;

/**
 * Created by Andy on 10-Dec-14.
 */
public class DrawerItemCustomAdapter extends BaseAdapter {

    Context mContext;
    int mLayoutResourceId;
    List<ObjectDrawerItem> mData = null;

    public DrawerItemCustomAdapter(Context context, int layoutResourceId,  List<ObjectDrawerItem> data) {
        this.mContext = context;
        this.mLayoutResourceId = layoutResourceId;
        this.mData = data;
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public Object getItem(int position) {
        return mData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItem = convertView;
        ObjectDrawerItem objectDrawerItem = mData.get(position);

        LayoutInflater inflater = ((Activity) mContext).getLayoutInflater();
        listItem = inflater.inflate(mLayoutResourceId, parent, false);

        ImageView iconImageView = (ImageView) listItem.findViewById(R.id.drawer_item_icon);
        TextView nameTextView = (TextView) listItem.findViewById(R.id.drawer_item_name);

        iconImageView.setImageDrawable(listItem.getResources().getDrawable(objectDrawerItem.getIcon()));
        nameTextView.setText(objectDrawerItem.getName());

        return listItem;
    }
}
