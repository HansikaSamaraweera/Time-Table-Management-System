package com.example.healthcare.ui.medicine;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.healthcare.AddMedicine;
import com.example.healthcare.MedicineActivity;
import com.example.healthcare.R;
import com.example.healthcare.addPatient;
import com.example.healthcare.patientDetails;

import java.util.ArrayList;

public class MedicineFragment extends Fragment {

    private MedicineViewModel medicineViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        Fragment patients1_fragment = getActivity().getSupportFragmentManager().findFragmentByTag("patients1");
        if(patients1_fragment != null)
            getActivity().getSupportFragmentManager().beginTransaction().remove(patients1_fragment).commit();

        Fragment notes1_fragment = getActivity().getSupportFragmentManager().findFragmentByTag("notes1");
        if(notes1_fragment != null)
            getActivity().getSupportFragmentManager().beginTransaction().remove(notes1_fragment).commit();

        medicineViewModel =
                ViewModelProviders.of(this).get(MedicineViewModel.class);
        View root = inflater.inflate(R.layout.fragment_medicine, container, false);
        final TextView textView = root.findViewById(R.id.text_gallery);
        final Button med = root.findViewById(R.id.addm);
        medicineViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);

                med.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(getActivity(),AddMedicine.class);
                        startActivity(i);
                    }
                });


            }
        });

        final ListView details = root.findViewById(R.id.med_list);
        final ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Penadol");
        arrayList.add("Piriton");
        arrayList.add("Balm");
        arrayList.add("Randika Ferdinando");
        arrayList.add("Thilesh Jayasinghe");
        arrayList.add("Akenya Perera");
        arrayList.add("Sonali Anesta");
        arrayList.add("Mithuni Supunsara");
        final ArrayAdapter adapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_list_item_1, arrayList);
        details.setAdapter(adapter);
        details.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String clickedItem = (String) details.getItemAtPosition(position);
                Intent i = new Intent(getActivity(), MedicineActivity.class);
                i.putExtra("medicine", clickedItem);
                startActivity(i);
            }
        });


        return root;
    }
}