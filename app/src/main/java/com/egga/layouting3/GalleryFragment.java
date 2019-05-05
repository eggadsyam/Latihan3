package com.egga.layouting3;
/*Nama : Egga Dinarul Syam
Nim : 10116393
Kelas : AKB IF 9
TGL : 3 Mei 2019
 */
import android.os.Bundle;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;

public class GalleryFragment extends Fragment implements RecyclerViewAdapter.ItemListener{
    private RecyclerView recyclerView;
    ArrayList arrayList;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.fragment_gallery);
        View view = inflater.inflate(R.layout.fragment_gallery, container, false);



        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
        arrayList = new ArrayList();
        arrayList.add(new GalleryData("Item 1", R.drawable.image_1, "#09A9FF"));
        arrayList.add(new GalleryData("Item 2", R.drawable.image_2, "#3E51B1"));
        arrayList.add(new GalleryData("Item 3", R.drawable.image_3, "#673BB7"));
        arrayList.add(new GalleryData("Item 4", R.drawable.image_4, "#4BAA50"));
        arrayList.add(new GalleryData("Item 5", R.drawable.image_5, "#F94336"));
        arrayList.add(new GalleryData("Item 6", R.drawable.image_6, "#0A9B88"));

        RecyclerViewAdapter adapter = new RecyclerViewAdapter(getActivity(), arrayList, this);
        recyclerView.setAdapter(adapter);

        GridLayoutManager manager = new GridLayoutManager(getActivity(), 2, GridLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(manager);

        return view;
    }



    @Override
    public void onItemClick(GalleryData item) {
        Toast.makeText(getActivity().getApplicationContext(), item.text + " is clicked", Toast.LENGTH_SHORT).show();
    }
}
