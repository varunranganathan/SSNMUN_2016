package a2016.app.ssnmun.com.ssnmun2016;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link CommitteeFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link CommitteeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CommitteeFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public CommitteeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment CommitteeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static CommitteeFragment newInstance(String param1, String param2) {
        CommitteeFragment fragment = new CommitteeFragment();
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
        final View rootView = inflater.inflate(R.layout.fragment_committees, container, false);
        ImageButton disecButton = (ImageButton) rootView.findViewById(R.id.disecButton);
        ImageButton scButton = (ImageButton) rootView.findViewById(R.id.scButton);
        ImageButton hrcButton = (ImageButton) rootView.findViewById(R.id.hrcButton);
        ImageButton essButton = (ImageButton) rootView.findViewById(R.id.essButton);
        ImageButton auButton = (ImageButton) rootView.findViewById(R.id.auButton);
        ImageButton oicButton = (ImageButton) rootView.findViewById(R.id.oicButton);

        /*ImageButtonBitmapLoader imageButtonBitmapLoader = new ImageButtonBitmapLoader(this.getContext());
        imageButtonBitmapLoader.loadBitmap(R.drawable.disec,disecButton);
        imageButtonBitmapLoader.loadBitmap(R.drawable.sc,scButton);
        imageButtonBitmapLoader.loadBitmap(R.drawable.hrc,hrcButton);
        imageButtonBitmapLoader.loadBitmap(R.drawable.ess,essButton);
        imageButtonBitmapLoader.loadBitmap(R.drawable.au,auButton);
        imageButtonBitmapLoader.loadBitmap(R.drawable.oic,oicButton); */
        disecButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragment = new DisecDescription();
                //FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frameLayout,fragment).addToBackStack("DISECFragment").commit();
            }
        });
        scButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragment = new ScDescription();
                //FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frameLayout,fragment).addToBackStack("SCFragment").commit();
            }
        });
        hrcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragment = new HrcDescription();
                //FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frameLayout,fragment).addToBackStack("HRCFragment").commit();
            }
        });
        essButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragment = new EssDescription();
                //FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frameLayout,fragment).addToBackStack("ESSFragment").commit();
            }
        });
        oicButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragment = new OicDescription();
                //FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frameLayout,fragment).addToBackStack("OICFragment").commit();
            }
        });
        auButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragment = new AuDescription();
                //FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frameLayout,fragment).addToBackStack("AUFragment").commit();
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
