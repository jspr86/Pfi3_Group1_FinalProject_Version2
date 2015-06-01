package idk14.pfi3_finalproject_group1;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;


/**
 * A simple {@link Fragment} subclass.
 */
public class InventoryFragment extends Fragment {


    public InventoryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_inventory, container, false);

        ImageAdapter myImageAdapter = new ImageAdapter(getActivity(),UserData.inventory);
        GridView gridView = (GridView) view.findViewById(R.id.gridView);
        gridView.setAdapter(myImageAdapter);

        return view;
    }


}
