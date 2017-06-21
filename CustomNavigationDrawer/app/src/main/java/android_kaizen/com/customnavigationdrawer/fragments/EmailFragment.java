package android_kaizen.com.customnavigationdrawer.fragments;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import android_kaizen.com.customnavigationdrawer.DrawerItemCustomAdapter;
import android_kaizen.com.customnavigationdrawer.MainActivity;
import android_kaizen.com.customnavigationdrawer.OnTaskCompleted;
import android_kaizen.com.customnavigationdrawer.R;
import android_kaizen.com.customnavigationdrawer.model.ObjectDrawerItem;


/**
 * A simple {@link Fragment} subclass.
 */
public class EmailFragment extends Fragment implements View.OnClickListener, OnTaskCompleted {

    private OnTaskCompleted taskCompleted;


    public EmailFragment() {
        // Required empty public constructor
    }


    public void setTaskListener(OnTaskCompleted listener) {
        this.taskCompleted = listener;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_email,
                container, false);
        ImageView image = (ImageView) view.findViewById(R.id.imageView);
        image.setOnClickListener(this);
        return view;

    }

    @Override
    public void onClick(View v) {
        Toast.makeText(getActivity(),"Click",Toast.LENGTH_LONG).show();
        List<ObjectDrawerItem> drawerItem = new ArrayList<>();

        drawerItem.add( new ObjectDrawerItem(R.drawable.ic_action_email, "Email"));
        drawerItem.add( new ObjectDrawerItem(R.drawable.ic_action_email, "Email"));
        drawerItem.add( new ObjectDrawerItem(R.drawable.ic_action_email, "Email"));
        drawerItem.add( new ObjectDrawerItem(R.drawable.ic_action_email, "Email"));
        drawerItem.add( new ObjectDrawerItem(R.drawable.ic_action_email, "Email"));
        drawerItem.add( new ObjectDrawerItem(R.drawable.ic_action_email, "Email"));
        drawerItem.add( new ObjectDrawerItem(R.drawable.ic_action_email, "Email"));
        drawerItem.add( new ObjectDrawerItem(R.drawable.ic_action_email, "Email"));


        MainActivity x = (MainActivity) getActivity();
        x.mNavigationDrawerHelper.items.clear();
        x.mNavigationDrawerHelper.items.add(new ObjectDrawerItem(R.drawable.ic_action_email, "Email"));
        //x.mNavigationDrawerHelper.adapter = new DrawerItemCustomAdapter(getActivity(), R.layout.listview_drawer_item_row, drawerItem);
        x.mNavigationDrawerHelper.adapter.notifyDataSetChanged();


    }

    @Override
    public void onTaskCompleted(String response) {

    }
}
