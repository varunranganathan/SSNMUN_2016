package a2016.app.ssnmun.com.ssnmun2016;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import de.hdodenhof.circleimageview.CircleImageView;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link OCFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link OCFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class OCFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public OCFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment OCFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static OCFragment newInstance(String param1, String param2) {
        OCFragment fragment = new OCFragment();
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
        View rootView = inflater.inflate(R.layout.fragment_oc, container, false);
        CircleImageView secgen = (CircleImageView) rootView.findViewById(R.id.secgen);
        CircleImageView depsecgen = (CircleImageView) rootView.findViewById(R.id.depsecgen);
        BitmapLoader bitmapLoader = new BitmapLoader(this.getContext());
        bitmapLoader.loadBitmap(R.drawable.secgen,secgen);
        bitmapLoader.loadBitmap(R.drawable.depsecgen,depsecgen);
        Button delegateAffairsButton = (Button) rootView.findViewById(R.id.delegateAffairsButton);
        Button sponsorshipButton = (Button) rootView.findViewById(R.id.sponsorshipButton);
        Button financeButton = (Button) rootView.findViewById(R.id.financeButton);
        Button hospitalityButton = (Button) rootView.findViewById(R.id.hospitalityButton);
        Button logisticsButton = (Button) rootView.findViewById(R.id.logisticsButton);
        Button technicalButton = (Button) rootView.findViewById(R.id.technicalButton);
        delegateAffairsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragment = new DelegateAffairsFragment();
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frameLayout,fragment).addToBackStack("AUFragment").commit();
            }
        });
        sponsorshipButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragment = new SponsorshipFragment();
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frameLayout,fragment).addToBackStack("AUFragment").commit();
            }
        });
        financeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragment = new FinanceFragment();
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frameLayout,fragment).addToBackStack("AUFragment").commit();
            }
        });
        hospitalityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragment = new HospitalityFragment();
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frameLayout,fragment).addToBackStack("AUFragment").commit();
            }
        });
        logisticsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragment = new LogisticsFragment();
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frameLayout,fragment).addToBackStack("AUFragment").commit();
            }
        });
        technicalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragment = new TechnicalFragment();
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
