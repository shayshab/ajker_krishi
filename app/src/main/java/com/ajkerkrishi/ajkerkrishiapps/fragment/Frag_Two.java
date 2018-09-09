package com.ajkerkrishi.ajkerkrishiapps.fragment;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.ajkerkrishi.ajkerkrishiapps.AjkerKrishi;
import com.ajkerkrishi.ajkerkrishiapps.Poramorsho;
import com.ajkerkrishi.ajkerkrishiapps.R;

public class Frag_Two extends Fragment {


    LinearLayout aff;


    public Frag_Two() {


        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.frag_two, container, false);


        CardView btn = v.findViewById(R.id.ajkcard);
        CardView btn1 = v.findViewById(R.id.sodosho);
        CardView btn2 = v.findViewById(R.id.poramorsho);
        CardView btn3 = v.findViewById(R.id.krishitotho);
        CardView btn4 = v.findViewById(R.id.nogor);
        CardView btn5 = v.findViewById(R.id.krishiprojokti);
        CardView btn6 = v.findViewById(R.id.chasabad);
        CardView btn7 = v.findViewById(R.id.motsosompod);
        CardView btn8 = v.findViewById(R.id.pranisompod);
        CardView btn9 = v.findViewById(R.id.poka);
        CardView btn10 = v.findViewById(R.id.oddekta);
        CardView btn11 = v.findViewById(R.id.jogajog);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), AjkerKrishi.class);
                startActivity(intent);
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Coming soon",
                        Toast.LENGTH_SHORT).show();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Coming soon",
                        Toast.LENGTH_SHORT).show();
            }
        });


        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Coming soon",
                        Toast.LENGTH_SHORT).show();
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Coming soon",
                        Toast.LENGTH_SHORT).show();
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "coming soon",
                        Toast.LENGTH_SHORT).show();
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Coming soon",
                        Toast.LENGTH_SHORT).show();
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "coming soon",
                        Toast.LENGTH_SHORT).show();
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder1 = new AlertDialog.Builder(getActivity());
                builder1.setMessage("you have to member first");
                builder1.setCancelable(true);

                builder1.setPositiveButton("Yes",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                Intent intent = new Intent(getActivity(), Poramorsho.class);
                                startActivity(intent);
                            }
                        });

                builder1.setNegativeButton(
                        "No",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });

                AlertDialog alert11 = builder1.create();
                alert11.show();
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "coming soon",
                        Toast.LENGTH_SHORT).show();
            }
        });
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Poramorsho.class);
                startActivity(intent);
            }
        });
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "coming soon",
                        Toast.LENGTH_SHORT).show();
            }
        });


        return v;

    }

}
