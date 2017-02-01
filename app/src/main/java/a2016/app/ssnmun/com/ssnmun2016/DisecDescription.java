package a2016.app.ssnmun.com.ssnmun2016;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link DisecDescription.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link DisecDescription#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DisecDescription extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public DisecDescription() {
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
    public static DisecDescription newInstance(String param1, String param2) {
        DisecDescription fragment = new DisecDescription();
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
        View rootView = inflater.inflate(R.layout.fragment_disec_description, container, false);
        TextView description = (TextView) rootView.findViewById(R.id.aboutCommittee);
        TextView agenda = (TextView) rootView.findViewById(R.id.agenda);
        description.setText("The UNGA-DISEC was formed at a time when a committee was required by the United Nations for resolving a number of security issues and political tensions resulting from the Second World War. The first committee of the General Assembly, its main purpose is creating and maintaining cooperation and peace globally between states related to educational, security, cultural, health, social and economic concerns. The DISEC issues resolutions thus focusing on the establishment of disarmament and security at a global level. Relevant measures are taken by the committee to reduce or prevent conflicts and hostilities between various countries. Despite being mandated with considering the general principles related to cooperation for maintaining security and peace at an international level, the DISEC does not possess power for authorized intervention of arms or imposing sanction, unlike the Security Council of the United Nations. There are 193 member countries of the United Nations that have a voice and vote to the DISEC. Every year the committee meets for the purpose of discussing different issues that come under its mandate. Accordingly as far as global peace is concerned, a considerable role is being played by DISEC.");
        agenda.setText("Review and rework of international framework/treaties to prevent the proliferation of SALWs.");
        CircleImageView chair = (CircleImageView) rootView.findViewById(R.id.chairImage);
        TextView chairName = (TextView) rootView.findViewById(R.id.chairName);
        CircleImageView viceChair = (CircleImageView) rootView.findViewById(R.id.vicechairImage);
        TextView viceChairName = (TextView) rootView.findViewById(R.id.vicechairName);
        CircleImageView director = (CircleImageView) rootView.findViewById(R.id.directorImage);
        TextView directorName = (TextView) rootView.findViewById(R.id.directorName);

        Button countryMatrixButton = (Button) rootView.findViewById(R.id.countryMatrixButton);
        countryMatrixButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "http://www.ssnmun.com/countrymatrix/DISEC.pdf";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        Button allotmentButton = (Button) rootView.findViewById(R.id.allotmentButton);
        allotmentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "http://www.ssnmun.com/allotments/DISEC.pdf";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        Button backGroundGuideButton = (Button) rootView.findViewById(R.id.backGroundGuideButton);
        backGroundGuideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "http://www.ssnmun.com/guide/DISEC_BG.pdf";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        BitmapLoader bitmapLoader = new BitmapLoader(this.getContext());
        bitmapLoader.loadBitmap(R.drawable.disecchair,chair);
        bitmapLoader.loadBitmap(R.drawable.disecvc,viceChair);
        bitmapLoader.loadBitmap(R.drawable.disecdirector,director);

        //chair.setImageResource(R.drawable.disecchair);
        chairName.setText("Brahadeesh Srinivasan");
        //viceChair.setImageResource(R.drawable.disecvc);
        viceChairName.setText("Abijit Hariharan");
        //director.setImageResource(R.drawable.disecdirector);
        directorName.setText("Yatharth Kapoor");
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
