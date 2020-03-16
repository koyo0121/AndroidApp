package com.example.book_library;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ReadedBook extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        // 表示する画面IDを設定
        View view = inflater.inflate(R.layout.fragment_readed_book,container,false);

        // fragment_readed_bookのimageView2にic_launcher_foregroundを設定
        ImageView image1 = (ImageView)view.findViewById(R.id.imageView2);
        image1.setImageResource(R.drawable.ic_launcher_foreground);

        // fragment_readed_bookのimageView2にic_launcher_foregroundを設定
        ImageView image2 = (ImageView)view.findViewById(R.id.imageView3);
        image2.setImageResource(R.drawable.ic_launcher_foreground);

        return view;
    }
}
