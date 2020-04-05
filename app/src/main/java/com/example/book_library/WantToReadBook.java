package com.example.book_library;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class WantToReadBook extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        DatabaseHelper helper = new DatabaseHelper(getActivity());

        // 表示する画面IDを設定
        View view = inflater.inflate(R.layout.fragment_want_to_read_book,container,false);
        GridView gridView = (GridView)view.findViewById(R.id.gridView3);
        ArrayList<String> list = new ArrayList<String>();

        for(int i = 1; i< 42; i++){

            list.add("読みたい本"+i);
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                getActivity().getApplicationContext(), android.R.layout.simple_list_item_1, list);

        gridView.setAdapter(adapter);


        return view;    }
}
