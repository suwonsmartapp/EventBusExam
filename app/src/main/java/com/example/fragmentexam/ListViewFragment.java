package com.example.fragmentexam;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import org.greenrobot.eventbus.EventBus;

import java.util.ArrayList;
import java.util.List;

public class ListViewFragment extends Fragment implements AdapterView.OnItemClickListener {

    private ListView mListView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list_view, container, false);

        mListView = (ListView) view.findViewById(R.id.list_view);

        ArrayList<String> data = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            data.add("data " + i);
        }
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, data);

        mListView.setAdapter(adapter);

        mListView.setOnItemClickListener(this);

        return view;
    }

    public void setData(List<String> data) {

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        // MainActivity#onMyEvent()
        EventBus.getDefault().post(new MyEvent(view, position));
    }

}
