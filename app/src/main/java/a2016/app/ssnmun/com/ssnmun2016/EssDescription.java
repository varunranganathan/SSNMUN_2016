package a2016.app.ssnmun.com.ssnmun2016;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by vvvro on 8/6/2016.
 */
public class EssDescription extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public EssDescription() {
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
    public static EssDescription newInstance(String param1, String param2) {
        EssDescription fragment = new EssDescription();
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
        description.setText("This simulation of the UNGA-ESS discusses the emergence of vile entities that poison the international community. Dark forces are starting to exert their dominance as the Pandora boxes have been opened and the dominos have started falling. The old world order has collapsed like a pack of cards but when one evil head is cut, six take its place. Can the long-forgotten art of diplomacy be revived when the nations are at the cusp of its defeat? Or will chaos Trump over logic and validate the barrage of criticism on the United Nations?\n" +
                "Only you will be able to decide at UNGA-ESS, SSNMUN.");
        agenda.setText("Futuristic Emergency Special Sessions");
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
                String url = "http://www.ssnmun.com/countrymatrix/ESS.pdf";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        Button backGroundGuideButton = (Button) rootView.findViewById(R.id.backGroundGuideButton);
        backGroundGuideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "http://www.ssnmun.com/guide/ESS_BG.pdf";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        Button allotmentButton = (Button) rootView.findViewById(R.id.allotmentButton);
        allotmentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "http://www.ssnmun.com/allotments/UNGA-ESS.pdf";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });


        BitmapLoader bitmapLoader = new BitmapLoader(this.getContext());
        bitmapLoader.loadBitmap(R.drawable.esschair,chair);
        bitmapLoader.loadBitmap(R.drawable.essvc,viceChair);
        bitmapLoader.loadBitmap(R.drawable.essdirector,director);

        //chair.setImageResource(R.drawable.esschair);
        chairName.setText("Sidhaanth Dharmadheeran");
        //viceChair.setImageResource(R.drawable.essvc);
        viceChairName.setText("Sai Anand");
        //director.setImageResource(R.drawable.essdirector);
        directorName.setText("Raghav Subramanian");
        TextView viceChairText = (TextView) rootView.findViewById(R.id.viceChairText);
        viceChairText.setText("Co-Vice Chairperson");
        TextView directorText = (TextView) rootView.findViewById(R.id.directorText);
        directorText.setText("Co-Vice Chairperson");
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
