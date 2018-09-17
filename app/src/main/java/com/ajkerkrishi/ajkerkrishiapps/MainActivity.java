package com.ajkerkrishi.ajkerkrishiapps;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;

import com.ajkerkrishi.ajkerkrishiapps.fragment.Frag_One;
import com.ajkerkrishi.ajkerkrishiapps.fragment.Frag_Two;
import com.nightonke.boommenu.BoomButtons.OnBMClickListener;
import com.nightonke.boommenu.BoomButtons.TextOutsideCircleButton;
import com.nightonke.boommenu.BoomMenuButton;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    BoomMenuButton bmb;
    ArrayList<Integer> imageIdList;
    ArrayList<String> titleList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bmb = findViewById(R.id.bmb);
        imageIdList = new ArrayList<>();
        titleList = new ArrayList<>();
        setInitialData();


        setTitle("আজকের কৃষি");


        for (int i = 0; i < bmb.getPiecePlaceEnum().pieceNumber(); i++) {
            int position = i;
            if (position == 0) {
                TextOutsideCircleButton.Builder builder = new TextOutsideCircleButton.Builder()
                        .normalImageRes(imageIdList.get(i))
                        .normalText(titleList.get(i))

                        .listener(new OnBMClickListener() {
                            @Override
                            public void onBoomButtonClick(int index) {


                                Intent intent = new Intent(MainActivity.this, AjkerKrishi.class);
                                startActivity(intent);
                                setTitle("আমাদের সম্পর্কে");


                            }

                        });
                bmb.addBuilder(builder);
            } else if (position == 1) {
                TextOutsideCircleButton.Builder builder = new TextOutsideCircleButton.Builder()
                        .normalImageRes(imageIdList.get(i))
                        .normalText(titleList.get(i))

                        .listener(new OnBMClickListener() {
                            @Override
                            public void onBoomButtonClick(int index) {


                                AlertDialog.Builder alertadd = new AlertDialog.Builder(MainActivity.this, R.style.AlertDialogCustom);
                                LayoutInflater factory = LayoutInflater.from(MainActivity.this);
                                final View view = factory.inflate(R.layout.developer, null);
                                alertadd.setView(view);
                                alertadd.setNeutralButton("OK", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dlg, int sumthin) {

                                    }
                                });

                                alertadd.show();



                               /* AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this,R.style.AlertDialogCustom);
                                builder.setTitle("Shayshab Azad");
                                builder

                                        .setMessage("shayshabazad@gmail.com")
                                        .setCancelable(false)
                                        .setPositiveButton("ok",new DialogInterface.OnClickListener() {
                                            public void onClick(DialogInterface dialog,int id) {
                                                dialog.cancel();
                                            }
                                        });

                                AlertDialog alertDialog = builder.create();
                                alertDialog.show();*/

                            }

                        });
                bmb.addBuilder(builder);
            } else if (position == 2) {
                TextOutsideCircleButton.Builder builder = new TextOutsideCircleButton.Builder()
                        .normalImageRes(imageIdList.get(i))
                        .normalText(titleList.get(i))

                        .listener(new OnBMClickListener() {
                            @Override
                            public void onBoomButtonClick(int index) {
                                finish();

                            }

                        });
                bmb.addBuilder(builder);
            }


        }


        ViewPager viewPager = findViewById(R.id.pager);
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());

        // Add Fragments to adapter one by one
        adapter.addFragment(new Frag_One(), "Recent");
        adapter.addFragment(new Frag_Two(), "Category");

        viewPager.setAdapter(adapter);

        TabLayout tabLayout = findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);


    }


    // Adapter for the viewpager using FragmentPagerAdapter
    class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFragment(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }

    private void setInitialData() {

        imageIdList.add(R.drawable.about);
        imageIdList.add(R.drawable.de);
        imageIdList.add(R.drawable.ex);

        titleList.add("আমাদের সম্পর্কে");
        titleList.add("ডেভেলপার");
        titleList.add("বাহির হোন");

    }
}