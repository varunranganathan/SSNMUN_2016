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
 * {@link SponsorshipFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link SponsorshipFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SponsorshipFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public SponsorshipFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment SponsorshipFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static SponsorshipFragment newInstance(String param1, String param2) {
        SponsorshipFragment fragment = new SponsorshipFragment();
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
        View rootView = inflater.inflate(R.layout.fragment_sponsorship, container, false);
        CircleImageView sponUSG = (CircleImageView) rootView.findViewById(R.id.usgspon1);
        CircleImageView sponUSG2 = (CircleImageView) rootView.findViewById(R.id.usgspon2);
        CircleImageView sponsor1 = (CircleImageView) rootView.findViewById(R.id.sponsor1);
        CircleImageView sponsor2 = (CircleImageView) rootView.findViewById(R.id.sponsor2);
        CircleImageView sponsor3 = (CircleImageView) rootView.findViewById(R.id.sponsor3);
        CircleImageView sponsor4 = (CircleImageView) rootView.findViewById(R.id.sponsor4);
        CircleImageView sponsor5 = (CircleImageView) rootView.findViewById(R.id.sponsor5);
        CircleImageView sponsor6 = (CircleImageView) rootView.findViewById(R.id.sponsor6);
        CircleImageView sponsor7 = (CircleImageView) rootView.findViewById(R.id.sponsor7);
        CircleImageView sponsor8 = (CircleImageView) rootView.findViewById(R.id.sponsor8);

        BitmapLoader bitmapLoader = new BitmapLoader(this.getContext());
        bitmapLoader.loadBitmap(R.drawable.usgspon1,sponUSG);
        bitmapLoader.loadBitmap(R.drawable.usgspon2,sponUSG2);
        bitmapLoader.loadBitmap(R.drawable.sponsor1,sponsor1);
        bitmapLoader.loadBitmap(R.drawable.sponsor2,sponsor2);
        bitmapLoader.loadBitmap(R.drawable.sponsor3,sponsor3);
        bitmapLoader.loadBitmap(R.drawable.sponsor4,sponsor4);
        bitmapLoader.loadBitmap(R.drawable.sponsor5,sponsor5);
        bitmapLoader.loadBitmap(R.drawable.sponsor6,sponsor6);
        bitmapLoader.loadBitmap(R.drawable.sponsor7,sponsor7);
        bitmapLoader.loadBitmap(R.drawable.sponsor8,sponsor8);
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
