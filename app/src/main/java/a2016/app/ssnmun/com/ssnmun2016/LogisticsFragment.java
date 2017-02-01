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
 * {@link LogisticsFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link LogisticsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class LogisticsFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public LogisticsFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment LogisticsFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static LogisticsFragment newInstance(String param1, String param2) {
        LogisticsFragment fragment = new LogisticsFragment();
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
        View rootView = inflater.inflate(R.layout.fragment_logistics, container, false);
        CircleImageView logUSG1 = (CircleImageView) rootView.findViewById(R.id.logusg);
        CircleImageView logUSG2 = (CircleImageView) rootView.findViewById(R.id.logusg2);
        CircleImageView log1 = (CircleImageView) rootView.findViewById(R.id.log1);
        CircleImageView log2 = (CircleImageView) rootView.findViewById(R.id.log2);
        CircleImageView log3 = (CircleImageView) rootView.findViewById(R.id.log3);
        CircleImageView log4 = (CircleImageView) rootView.findViewById(R.id.log4);
        CircleImageView log5 = (CircleImageView) rootView.findViewById(R.id.log5);
        CircleImageView log6 = (CircleImageView) rootView.findViewById(R.id.log6);

        BitmapLoader bitmapLoader = new BitmapLoader(this.getContext());
        bitmapLoader.loadBitmap(R.drawable.logusg,logUSG1);
        bitmapLoader.loadBitmap(R.drawable.logusg2,logUSG2);
        bitmapLoader.loadBitmap(R.drawable.log1,log1);
        bitmapLoader.loadBitmap(R.drawable.log2,log2);
        bitmapLoader.loadBitmap(R.drawable.log3,log3);
        bitmapLoader.loadBitmap(R.drawable.log4,log4);
        bitmapLoader.loadBitmap(R.drawable.log5,log5);
        bitmapLoader.loadBitmap(R.drawable.log6,log6);
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
