package com.ev04.myapplication;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.ev04.myapplication.network.TelefonoEntry;

public class HomeFragment extends Fragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public View onCreateView (@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.home_fragment, container, false);



        RecyclerView recyclerView = view.findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2, GridLayoutManager.VERTICAL, false));
        TelefonoCardRecyclerViewAdapter adapter = new TelefonoCardRecyclerViewAdapter(
                TelefonoEntry.initProductEntryList(getResources()));
        recyclerView.setAdapter(adapter);
        int largePadding = getResources().getDimensionPixelSize(R.dimen.telefono_grid_spacing);
        int smallPadding = getResources().getDimensionPixelSize(R.dimen.telefono_grid_spacing_small);
        recyclerView.addItemDecoration(new TelefonoGridItemDecoration(largePadding, smallPadding));

        //set shape corner background for API 23+
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            view.findViewById(R.id.telefono_grid).setBackgroundResource(R.drawable.background_shape);
        }


        return view;

    }


}
