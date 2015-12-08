package com.example.android.appportfolio;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    Toast button_msg = new Toast(getContext());
    public MainActivityFragment() {

    }
    //int duration = Toast.LENGTH_SHORT;



    //Runs when one of the ListView buttons is clicked
    public void printPurpose (View view){

        button_msg.setView(view);
        Button buttonShell = (Button) view;
        CharSequence buttonText = buttonShell.getText();
        String castedText = buttonText.toString();
        button_msg.setText(R.string.button_toast_msg + castedText);
        button_msg.show();

        /*
        switch  (view.getId())
        {
            case R.id.button0:
                Button buttonShell = (Button) view;
                CharSequence buttonText = buttonShell.getText();
                String castedText = buttonText.toString();
                button_msg.setText(R.string.button_toast_msg + castedText);
                button_msg.show();
                        break;
            case R.id.button1:
                displayToast(R.string.button_toast_msg + R.id.button0);
                        break;
            case R.id.button2:
                displayToast(R.string.button_toast_msg + R.id.button);
                        break;
            case R.id.button3:
                displayToast(R.string.button_toast_msg + R.id.button);
                        break;
            case R.id.button4:
                displayToast(R.string.button_toast_msg + R.id.button);
                        break;
            case R.id.button5:
                displayToast(R.string.button_toast_msg + R.id.button);
                        break;

        };

        String buttonName = new String(this.getText());
        button_msg.setText(R.string.button_toast_msg );
        button_msg.show();
        */
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //Make sure to create View to inflate for future searches
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);


        return rootView;
    }
}
