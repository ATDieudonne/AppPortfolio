package com.example.android.appportfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }
    int duration = Toast.LENGTH_SHORT;

    Toast button_msg = Toast(getContext());

    //Runs when one of the ListView buttons is clicked
    public void printPurpose (View view){
        button_msg.setView(view);

        button_msg.setText(R.string.button_toast_msg + getText((Button) view.findViewById(R.id.list_item_portfolio_button) ) );
        button_msg.show();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //Make sure to create View to inflate for future searches
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        //Create ArrayList of Button objects to populate the listview with
        ArrayList<Button> portAppList = new ArrayList<Button>();
        portAppList.add(0, new Button(getContext()));
        portAppList.get(0).setText(getString(R.string.button_text0));
        portAppList.add(1, new Button(getContext()));
        portAppList.get(1).setText(getString(R.string.button_text1));
        portAppList.add(2, new Button(getContext()));
        portAppList.get(2).setText(getString(R.string.button_text2));
        portAppList.add(3, new Button(getContext()));
        portAppList.get(3).setText(getString(R.string.button_text3));
        portAppList.add(4, new Button(getContext()));
        portAppList.get(4).setText(getString(R.string.button_text4));
        portAppList.add(5, new Button(getContext()));
        portAppList.get(5).setText(getString(R.string.button_text5));


        //TIme to create the arrayAdapter
        ArrayAdapter<Button> aPortfolioList = new ArrayAdapter<Button>(
                //first argument is a context. Use function getcontext() to use the current context
                getContext(),
                //Second Argument is the layout you created for the Button.
                R.layout.list_item_portfolio,
                //Third argument is ith ID you gave the button in the layout above
                R.id.list_item_portfolio_button,
                //Finally include the name of the ArrayList created above.
                portAppList
        );


        // Create a reference to the ListView so we cam bind the adapter to it.
        ListView my_listview_porfolio = (ListView) rootView.findViewById(R.id.listview_portfolio_app);

        //Now bind the Listview to the adapter
        my_listview_porfolio.setAdapter(aPortfolioList);
        return rootView;
    }
}
