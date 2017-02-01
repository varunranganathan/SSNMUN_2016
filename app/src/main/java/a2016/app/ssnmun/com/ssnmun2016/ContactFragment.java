package a2016.app.ssnmun.com.ssnmun2016;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.Locale;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link ContactFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link ContactFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ContactFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public ContactFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ContactFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ContactFragment newInstance(String param1, String param2) {
        ContactFragment fragment = new ContactFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_contact, container, false);
        Button button1 = (Button) rootView.findViewById(R.id.callButton1);
        Button button2 = (Button) rootView.findViewById(R.id.callButton2);
        Button button3 = (Button) rootView.findViewById(R.id.callButton3);
        Button button4 = (Button) rootView.findViewById(R.id.callButton4);
        Button button5 = (Button) rootView.findViewById(R.id.callButton5);
        Button locationButton = (Button) rootView.findViewById(R.id.locationButton);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ContextCompat.checkSelfPermission(getActivity(),
                        Manifest.permission.CALL_PHONE)
                        != PackageManager.PERMISSION_GRANTED) {

                    // Should we show an explanation?
                    if (ActivityCompat.shouldShowRequestPermissionRationale(getActivity(),
                            Manifest.permission.CALL_PHONE)) {

                        // Show an expanation to the user *asynchronously* -- don't block
                        // this thread waiting for the user's response! After the user
                        // sees the explanation, try again to request the permission.

                    } else {

                        // No explanation needed, we can request the permission.

                        ActivityCompat.requestPermissions(getActivity(),
                                new String[]{Manifest.permission.CALL_PHONE},
                                1);
                        if(ContextCompat.checkSelfPermission(getActivity(),
                                Manifest.permission.CALL_PHONE)
                                == PackageManager.PERMISSION_GRANTED) {
                            Intent in=new Intent(Intent.ACTION_CALL,Uri.parse("tel:8754507189"));
                            try{
                                startActivity(in);
                            }

                            catch (android.content.ActivityNotFoundException ex){
                                Log.v("Tag1",ex.toString());
                            }
                        }

                        // MY_PERMISSIONS_REQUEST_READ_CONTACTS is an
                        // app-defined int constant. The callback method gets the
                        // result of the request.
                    }
                } else {
                    Intent in=new Intent(Intent.ACTION_CALL,Uri.parse("tel:8754507189"));
                    try{
                        startActivity(in);
                    }

                    catch (android.content.ActivityNotFoundException ex){
                        Log.v("Tag2",ex.toString());
                    }
                }
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ContextCompat.checkSelfPermission(getActivity(),
                        Manifest.permission.CALL_PHONE)
                        != PackageManager.PERMISSION_GRANTED) {

                    // Should we show an explanation?
                    if (ActivityCompat.shouldShowRequestPermissionRationale(getActivity(),
                            Manifest.permission.CALL_PHONE)) {

                        // Show an expanation to the user *asynchronously* -- don't block
                        // this thread waiting for the user's response! After the user
                        // sees the explanation, try again to request the permission.

                    } else {

                        // No explanation needed, we can request the permission.

                        ActivityCompat.requestPermissions(getActivity(),
                                new String[]{Manifest.permission.CALL_PHONE},
                                1);
                        if(ContextCompat.checkSelfPermission(getActivity(),
                                Manifest.permission.CALL_PHONE)
                                == PackageManager.PERMISSION_GRANTED) {
                            Intent in=new Intent(Intent.ACTION_CALL,Uri.parse("tel:9566055517"));
                            try{
                                startActivity(in);
                            }

                            catch (android.content.ActivityNotFoundException ex){
                                Log.v("Tag1",ex.toString());
                            }
                        }

                        // MY_PERMISSIONS_REQUEST_READ_CONTACTS is an
                        // app-defined int constant. The callback method gets the
                        // result of the request.
                    }
                } else {
                    Intent in=new Intent(Intent.ACTION_CALL,Uri.parse("tel:9566055517"));
                    try{
                        startActivity(in);
                    }

                    catch (android.content.ActivityNotFoundException ex){
                        Log.v("Tag2",ex.toString());
                    }
                }

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ContextCompat.checkSelfPermission(getActivity(),
                        Manifest.permission.CALL_PHONE)
                        != PackageManager.PERMISSION_GRANTED) {

                    // Should we show an explanation?
                    if (ActivityCompat.shouldShowRequestPermissionRationale(getActivity(),
                            Manifest.permission.CALL_PHONE)) {

                        // Show an expanation to the user *asynchronously* -- don't block
                        // this thread waiting for the user's response! After the user
                        // sees the explanation, try again to request the permission.

                    } else {

                        // No explanation needed, we can request the permission.

                        ActivityCompat.requestPermissions(getActivity(),
                                new String[]{Manifest.permission.CALL_PHONE},
                                1);
                        if(ContextCompat.checkSelfPermission(getActivity(),
                                Manifest.permission.CALL_PHONE)
                                == PackageManager.PERMISSION_GRANTED) {
                            Intent in=new Intent(Intent.ACTION_CALL,Uri.parse("tel:9566230300"));
                            try{
                                startActivity(in);
                            }

                            catch (android.content.ActivityNotFoundException ex){
                                Log.v("Tag1",ex.toString());
                            }
                        }

                        // MY_PERMISSIONS_REQUEST_READ_CONTACTS is an
                        // app-defined int constant. The callback method gets the
                        // result of the request.
                    }
                } else {
                    Intent in=new Intent(Intent.ACTION_CALL,Uri.parse("tel:9566230300"));
                    try{
                        startActivity(in);
                    }

                    catch (android.content.ActivityNotFoundException ex){
                        Log.v("Tag2",ex.toString());
                    }
                }

            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ContextCompat.checkSelfPermission(getActivity(),
                        Manifest.permission.CALL_PHONE)
                        != PackageManager.PERMISSION_GRANTED) {

                    // Should we show an explanation?
                    if (ActivityCompat.shouldShowRequestPermissionRationale(getActivity(),
                            Manifest.permission.CALL_PHONE)) {

                        // Show an expanation to the user *asynchronously* -- don't block
                        // this thread waiting for the user's response! After the user
                        // sees the explanation, try again to request the permission.

                    } else {

                        // No explanation needed, we can request the permission.

                        ActivityCompat.requestPermissions(getActivity(),
                                new String[]{Manifest.permission.CALL_PHONE},
                                1);
                        if(ContextCompat.checkSelfPermission(getActivity(),
                                Manifest.permission.CALL_PHONE)
                                == PackageManager.PERMISSION_GRANTED) {
                            Intent in=new Intent(Intent.ACTION_CALL,Uri.parse("tel:9176358957"));
                            try{
                                startActivity(in);
                            }

                            catch (android.content.ActivityNotFoundException ex){
                                Log.v("Tag1",ex.toString());
                            }
                        }

                        // MY_PERMISSIONS_REQUEST_READ_CONTACTS is an
                        // app-defined int constant. The callback method gets the
                        // result of the request.
                    }
                } else {
                    Intent in=new Intent(Intent.ACTION_CALL,Uri.parse("tel:9176358957"));
                    try{
                        startActivity(in);
                    }

                    catch (android.content.ActivityNotFoundException ex){
                        Log.v("Tag2",ex.toString());
                    }
                }

            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ContextCompat.checkSelfPermission(getActivity(),
                        Manifest.permission.CALL_PHONE)
                        != PackageManager.PERMISSION_GRANTED) {

                    // Should we show an explanation?
                    if (ActivityCompat.shouldShowRequestPermissionRationale(getActivity(),
                            Manifest.permission.CALL_PHONE)) {

                        // Show an expanation to the user *asynchronously* -- don't block
                        // this thread waiting for the user's response! After the user
                        // sees the explanation, try again to request the permission.

                    } else {

                        // No explanation needed, we can request the permission.

                        ActivityCompat.requestPermissions(getActivity(),
                                new String[]{Manifest.permission.CALL_PHONE},
                                1);
                        if(ContextCompat.checkSelfPermission(getActivity(),
                                Manifest.permission.CALL_PHONE)
                                == PackageManager.PERMISSION_GRANTED) {
                            Intent in=new Intent(Intent.ACTION_CALL,Uri.parse("tel:9600165156"));
                            try{
                                startActivity(in);
                            }

                            catch (android.content.ActivityNotFoundException ex){
                                Log.v("Tag1",ex.toString());
                            }
                        }

                        // MY_PERMISSIONS_REQUEST_READ_CONTACTS is an
                        // app-defined int constant. The callback method gets the
                        // result of the request.
                    }
                } else {
                    Intent in=new Intent(Intent.ACTION_CALL,Uri.parse("tel:9600165156"));
                    try{
                        startActivity(in);
                    }

                    catch (android.content.ActivityNotFoundException ex){
                        Log.v("Tag2",ex.toString());
                    }
                }

            }
        });
        locationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String uri = String.format(Locale.ENGLISH, "geo:%f,%f", 12.751111, 80.197238);
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                startActivity(intent);
            }
        });
        return rootView;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }


    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p/>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
