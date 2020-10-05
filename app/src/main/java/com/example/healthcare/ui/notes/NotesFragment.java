package com.example.healthcare.ui.notes;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;
import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.healthcare.EditNotesActivity;
import com.example.healthcare.Model.Notes;
import com.example.healthcare.NotesActivity;
import com.example.healthcare.R;
import com.example.healthcare.database.DBHandler;

import java.util.ArrayList;

public class NotesFragment extends Fragment {

    private NotesViewModel notesViewModel;
    private Notes notes;
    DBHandler ob;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        Fragment patients1_fragment = getActivity().getSupportFragmentManager().findFragmentByTag("patients1");
        if(patients1_fragment != null)
            getActivity().getSupportFragmentManager().beginTransaction().remove(patients1_fragment).commit();

        Fragment medicine1_fragment = getActivity().getSupportFragmentManager().findFragmentByTag("medicine1");
        if(medicine1_fragment != null)
            getActivity().getSupportFragmentManager().beginTransaction().remove(medicine1_fragment).commit();

        notesViewModel =
                ViewModelProviders.of(this).get(NotesViewModel.class);
        View root = inflater.inflate(R.layout.fragment_notes, container, false);
        ob=new DBHandler(getContext());

        final TextView textView = root.findViewById(R.id.text_tools);
        final Button next=root.findViewById(R.id.bb_n);
        final Spinner spinn =root.findViewById(R.id.Spinner01);
        final ListView list = root.findViewById(R.id.list);
        notes=new Notes();
        final ArrayList<String> arrayList = new ArrayList<>();
        arrayList.removeAll(arrayList);

        notesViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
                next.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(getActivity(), "This is my Toast message!",
                                Toast.LENGTH_LONG).show();
                        Intent i = new Intent(getActivity(), NotesActivity.class );
                        startActivity(i);

                    }
                });
                final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(getContext(),android.R.layout.simple_list_item_1, arrayList);
                list.setAdapter(arrayAdapter);
                list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String clickedItem=(String) list.getItemAtPosition(position);
                        Intent i = new Intent(getActivity(), EditNotesActivity.class );
                        i.putExtra("details",clickedItem);
                        startActivity(i);

                    }
                });
                spinn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                        // your code here
                        if(id==1) {
                            arrayList.removeAll(arrayList);

                            String[] arr = ob.displayNotesImportant();

                            for(String x:arr){
                                arrayList.add(x);
                            }

                            arrayAdapter.notifyDataSetChanged();
                        }  else {
                            arrayList.removeAll(arrayList);

                            String[] arr1 = ob.displayNotesToDo();

                            for(String x:arr1){
                                arrayList.add(x);
                            }

                            arrayAdapter.notifyDataSetChanged();
                        }
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parentView) {
                        // your code here
                    }

                });



            }
        });
        return root;
    }
}