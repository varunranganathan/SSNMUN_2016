package a2016.app.ssnmun.com.ssnmun2016;

import android.content.Intent;
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
public class HrcDescription extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public HrcDescription() {
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
    public static HrcDescription newInstance(String param1, String param2) {
        HrcDescription fragment = new HrcDescription();
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
        description.setText("When the power of love overcomes the love of power the world will know peace”. In a world where power manifests in peace and violence alike, the United Nations Human Rights Council sustains the balance by protecting and promoting human rights universally. Formed in 2006, the Council of 47 members makes decisions on pressing human rights issues in a fair and equal manner. It serves as a forum for dialogue, promotes implementation of human rights obligations undertaken by States, and works to mainstream human rights within the UN system. As part of the Human Rights Council, delegates will be expected to engage on crucial issues that affect the functioning of human rights systems, and work to tackle them. No cause can justify abuse of human rights, and it is imperative for all states to realise their responsibilities in respecting rights and fundamental freedoms for all, without discrimination. Peace, security, and development cannot sustain without human rights. Now more than ever, states must continue efforts to enhance understanding and ensure human rights remain what they should be— universal. ");
        agenda.setText("Assessing the role of the Rome Statute in addressing crimes under the ICC's jurisdiction. ");
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
                String url = "http://www.ssnmun.com/countrymatrix/HRC.pdf";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        Button backGroundGuideButton = (Button) rootView.findViewById(R.id.backGroundGuideButton);
        backGroundGuideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "http://www.ssnmun.com/guide/HRC_BG.pdf";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        Button allotmentButton = (Button) rootView.findViewById(R.id.allotmentButton);
        allotmentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "http://www.ssnmun.com/allotments/HRC.pdf";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        BitmapLoader bitmapLoader = new BitmapLoader(this.getContext());
        bitmapLoader.loadBitmap(R.drawable.hrcchair,chair);
        bitmapLoader.loadBitmap(R.drawable.hrcvc,viceChair);
        bitmapLoader.loadBitmap(R.drawable.hrcdirector,director);

        //chair.setImageResource(R.drawable.hrcchair);
        chairName.setText("Vishnu Srinivasan");
        //viceChair.setImageResource(R.drawable.hrcvc);
        viceChairName.setText("Siddhaarth Sudhakaran");
        //director.setImageResource(R.drawable.hrcdirector);
        directorName.setText("Varsha Mohan");
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
