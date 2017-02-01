package a2016.app.ssnmun.com.ssnmun2016;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link SponsorFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link SponsorFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SponsorFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public SponsorFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment SponsorFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static SponsorFragment newInstance(String param1, String param2) {
        SponsorFragment fragment = new SponsorFragment();
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
        View rootView = inflater.inflate(R.layout.fragment_sponsor, container, false);
        ImageView spon1 = (ImageView) rootView.findViewById(R.id.spon1);
        ImageView spon2 = (ImageView) rootView.findViewById(R.id.spon2);
        ImageView spon3 = (ImageView) rootView.findViewById(R.id.spon3);
        ImageView spon4 = (ImageView) rootView.findViewById(R.id.spon4);
        ImageView spon5 = (ImageView) rootView.findViewById(R.id.spon5);
        ImageView spon6 = (ImageView) rootView.findViewById(R.id.spon6);
        ImageView spon7 = (ImageView) rootView.findViewById(R.id.spon7);
        ImageView spon8 = (ImageView) rootView.findViewById(R.id.spon8);
        ImageViewBitmapLoader imageViewBitmapLoader = new ImageViewBitmapLoader(this.getContext());
        imageViewBitmapLoader.loadBitmap(R.drawable.spon1,spon1);
        imageViewBitmapLoader.loadBitmap(R.drawable.spon2,spon2);
        imageViewBitmapLoader.loadBitmap(R.drawable.spon3,spon3);
        imageViewBitmapLoader.loadBitmap(R.drawable.spon4,spon4);
        imageViewBitmapLoader.loadBitmap(R.drawable.csb,spon5);
        imageViewBitmapLoader.loadBitmap(R.drawable.spon6,spon6);
        imageViewBitmapLoader.loadBitmap(R.drawable.spon7,spon7);
        imageViewBitmapLoader.loadBitmap(R.drawable.jamboree,spon8);
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
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
