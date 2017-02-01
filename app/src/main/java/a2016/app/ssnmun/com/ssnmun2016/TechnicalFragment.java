package a2016.app.ssnmun.com.ssnmun2016;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import de.hdodenhof.circleimageview.CircleImageView;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link TechnicalFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link TechnicalFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TechnicalFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public TechnicalFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment TechnicalFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static TechnicalFragment newInstance(String param1, String param2) {
        TechnicalFragment fragment = new TechnicalFragment();
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
        View rootView = inflater.inflate(R.layout.fragment_technical, container, false);
        CircleImageView techUSG = (CircleImageView) rootView.findViewById(R.id.techusg);
        CircleImageView tech1 = (CircleImageView) rootView.findViewById(R.id.tech1);
        CircleImageView tech2 = (CircleImageView) rootView.findViewById(R.id.tech2);
        CircleImageView tech3 = (CircleImageView) rootView.findViewById(R.id.tech3);
        CircleImageView tech4 = (CircleImageView) rootView.findViewById(R.id.tech4);
        CircleImageView publicityusg = (CircleImageView) rootView.findViewById(R.id.publicityusg);

        BitmapLoader bitmapLoader = new BitmapLoader(this.getContext());
        bitmapLoader.loadBitmap(R.drawable.techusg,techUSG);
        bitmapLoader.loadBitmap(R.drawable.tech1,tech1);
        bitmapLoader.loadBitmap(R.drawable.tech2,tech2);
        bitmapLoader.loadBitmap(R.drawable.tech3,tech3);
        bitmapLoader.loadBitmap(R.drawable.tech4,tech4);
        bitmapLoader.loadBitmap(R.drawable.publicityusg,publicityusg);
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
