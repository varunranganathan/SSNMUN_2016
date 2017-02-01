package a2016.app.ssnmun.com.ssnmun2016;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by vvvro on 8/6/2016.
 */
public class ScDescription extends Fragment{
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public ScDescription() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment DisecDescription.
     */
    // TODO: Rename and change types and number of parameters
    public static ScDescription newInstance(String param1, String param2) {
        ScDescription fragment = new ScDescription();
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
        View rootView = inflater.inflate(R.layout.fragment_sc_description, container, false);
        TextView introduction = (TextView) rootView.findViewById(R.id.introductionCommittee);
        TextView history = (TextView) rootView.findViewById(R.id.historyCommittee);
        TextView agenda = (TextView) rootView.findViewById(R.id.agenda);
        introduction.setText("The United Nations Security Council is one of the six principal organs of the United Nations which comprises of 15 UN member states, of which the China, the United States of America, United Kingdom of Great Britain and North Ireland, Russia and France hold permanent seats. Apart from the 5 aforementioned nations, the General Assembly selects 10 other non-permanent members for a period of 2 years. ");
        history.setText("The Security Council since its inception in 1945 has passed more than 1700 resolutions on some of the most pressing issues that the world has faced. After many heated debates and at the insistence of the major powers, the veto power was made official in Article 30 and was extended to the five countries commonly referred to as the “Perm 5.” The Security Council held its first historic meeting January 17, 1946, and has been taking actions for peace ever since. Due to diplomatic pressure in 1965 the number of members in the Security Council was increased to 15, but the permanent positions remained the same. Since 1948, over 65 peacekeeping operations have been authorized by the UNSC all around the world and over 1700 resolutions have been passed helping achieve international peace and security. ");
        agenda.setText("The Arab-Israeli War of 1967");
        CircleImageView chair = (CircleImageView) rootView.findViewById(R.id.scchairImage);
        TextView chairName = (TextView) rootView.findViewById(R.id.scchairName);
        CircleImageView viceChair = (CircleImageView) rootView.findViewById(R.id.scvicechairImage);
        TextView viceChairName = (TextView) rootView.findViewById(R.id.scvicechairName);
        CircleImageView director = (CircleImageView) rootView.findViewById(R.id.scdirectorImage);
        TextView directorName = (TextView) rootView.findViewById(R.id.scdirectorName);

        Button countryMatrixButton = (Button) rootView.findViewById(R.id.scCountryMatrixButton);
        countryMatrixButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "http://www.ssnmun.com/countrymatrix/SC.pdf";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        Button scbackGroundGuideButton = (Button) rootView.findViewById(R.id.scbackGroundGuideButton);
        scbackGroundGuideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "http://www.ssnmun.com/guide/SC_BG.pdf";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        Button allotmentButton = (Button) rootView.findViewById(R.id.scAllotmentButton);
        allotmentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "http://www.ssnmun.com/allotments/SC.pdf";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        /*chair.setImageBitmap(MainActivity.decodeSampledBitmapFromResource(getResources(),R.drawable.unscchair,100,100));
        viceChair.setImageBitmap(MainActivity.decodeSampledBitmapFromResource(getResources(),R.drawable.unscvc,100,100));
        director.setImageBitmap(MainActivity.decodeSampledBitmapFromResource(getResources(),R.drawable.unscdirector,100,100)); */
        BitmapLoader bitmapLoader = new BitmapLoader(this.getContext());
        bitmapLoader.loadBitmap(R.drawable.unscchair,chair);
        bitmapLoader.loadBitmap(R.drawable.unscvc,viceChair);
        bitmapLoader.loadBitmap(R.drawable.unscdirector,director);
        //chair.setImageResource(R.drawable.unscchair);
        chairName.setText("Yash Vijay");
        //viceChair.setImageResource(R.drawable.unscvc);
        viceChairName.setText("Anirudh Vaidhyaa");
        //director.setImageResource(R.drawable.unscdirector);
        directorName.setText("Ayush R");
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
