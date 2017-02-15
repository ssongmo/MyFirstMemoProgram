package com.example.goodgoodman.myfirstmemoprogram;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.goodgoodman.myfirstmemoprogram.interfaces.EditInterface;

import java.sql.SQLException;
import java.util.Date;

public class EditFragment extends Fragment implements View.OnClickListener{

    EditInterface editInterface = null;
    Context context = null;
    View view = null;

    Button btnSave;
    EditText editMemo;
    public EditFragment() {
        // Required empty public constructor
    }

    public static EditFragment newInstance() {
        EditFragment fragment = new EditFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_edit, container, false);
        btnSave = (Button)view.findViewById(R.id.btnSave);
        editMemo = (EditText)view.findViewById(R.id.editMemo);

        btnSave.setOnClickListener(this);

        return view;
    }

//    public void onButtonPressed(Uri uri) {
//        if (mListener != null) {
//            mListener.onFragmentInteraction(uri);
//        }
//    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.context = context;
        this.editInterface = (EditInterface)context;
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnSave:
                try {
                    Memo memo = new Memo();
                    String saveText = editMemo.getText().toString();
                    editMemo.setText("");
                    memo.setMemo(saveText);
                    memo.setDate(new Date(System.currentTimeMillis()));
                    editInterface.saveToList(memo);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            break;
        }
    }

}
