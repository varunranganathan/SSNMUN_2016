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
public class OicDescription extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public OicDescription() {
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
    public static OicDescription newInstance(String param1, String param2) {
        OicDescription fragment = new OicDescription();
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
        description.setText("The Organization of Islamic Cooperation (OIC) was officially founded in 1969, when leaders of Muslim nations met in Rabat to establish a body that would adequately and appropriately assess their unique concerns. The Charter of the OIC aims to preserve Islamic social and economic values, promote solidary amongst member states, increase cooperation in social, economic, cultural and scientific areas, and uphold international peace and security. A revision made to this charter in 2007 set out to include promotion of human rights and good governance as well. The Organization of Islamic Union operates as a fully fledged institution of its own- unique from the European Union, or the African Union, in that it is constituted by committees and financial institutions, and has modeled itself almost as a United Nations in the Muslim World- claiming to uphold the same values, but within Islamic tradition and culture. ");
        agenda.setText("Addressing Multiculturalism in the Muslim World, with Special Reference to Minority Rights ");
        CircleImageView chair = (CircleImageView) rootView.findViewById(R.id.chairImage);
        TextView chairName = (TextView) rootView.findViewById(R.id.chairName);
        CircleImageView viceChair = (CircleImageView) rootView.findViewById(R.id.vicechairImage);
        TextView viceChairName = (TextView) rootView.findViewById(R.id.vicechairName);
        CircleImageView director = (CircleImageView) rootView.findViewById(R.id.directorImage);
        TextView directorName = (TextView) rootView.findViewById(R.id.directorName);
        TextView chairText = (TextView) rootView.findViewById(R.id.chairText);
        chairText.setText("Co-Chairperson");
        TextView viceChairText = (TextView) rootView.findViewById(R.id.viceChairText);
        viceChairText.setText("Co-Chairperson");

        Button countryMatrixButton = (Button) rootView.findViewById(R.id.countryMatrixButton);
        countryMatrixButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "http://www.ssnmun.com/countrymatrix/OIC.pdf";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        Button backGroundGuideButton = (Button) rootView.findViewById(R.id.backGroundGuideButton);
        backGroundGuideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "http://www.ssnmun.com/guide/OIC_BG.pdf";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        Button allotmentButton = (Button) rootView.findViewById(R.id.allotmentButton);
        allotmentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "http://www.ssnmun.com/allotments/OIC.pdf";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        BitmapLoader bitmapLoader = new BitmapLoader(this.getContext());
        bitmapLoader.loadBitmap(R.drawable.oicchair,chair);
        bitmapLoader.loadBitmap(R.drawable.oiccc,viceChair);
        bitmapLoader.loadBitmap(R.drawable.oicdirector,director);

        //chair.setImageResource(R.drawable.oicchair);
        chairName.setText("Sarthak Tandon");
        //viceChair.setImageResource(R.drawable.oiccc);
        viceChairName.setText("Priya Subramanian");
        //director.setImageResource(R.drawable.oicdirector);
        directorName.setText("Aditya Tamar");
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
