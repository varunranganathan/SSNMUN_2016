package a2016.app.ssnmun.com.ssnmun2016;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link HomeFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public HomeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HomeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
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
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);
        TextView description = (TextView) rootView.findViewById(R.id.letterDescription);
        description.setText("Ladies and Gentlemen,\n" +
                "\n" +
                "On behalf of the organizing committee, it gives me immense pleasure to welcome you to SSN Model United Nations 2016.\n" +
                "\n" +
                "This is one of those times where the world is engaged in multiple issues which are a major concern for the future generations. Be it environmental protection, human rights violation, international security, unemployment or food security, the world has never been more threatened. The regional differences and a lack of consensus among the international community have further stimulated the issues to a large extent. The United Nations, in itself has been a catalyst of advocating change where hopes have been lost and efforts have failed. The very tool of diplomacy has facilitated enormous results in some of the extremely marginalized situations around the world. And these efforts have been made keeping in mind global geopolitics . And for the same, the very concept of Model United Nations exists.\n" +
                "\n" +
                "From the first edition in 2014 to the third edition now, it has been a wonderful journey of growth and learning. With innovative councils, a brilliant Executive Board and participants from across the country, there have been discussions and deliberations in hope of resolving, in their capacities some of the most pressing issues the world faces today. The 6 councils which are to be simulated at SSN MUN 2016 hold extreme importance and will surely give you immense exposure to the most prominent global issues and will help you realizing your role as a diplomat.\n" +
                "\n" +
                "I invite all of you to SSN MUN 2016 to experience three days of intense debate and deliberation.\n" +
                "\n" +
                "Yours sincerely,\n" +
                "Radhakrishnan Venkataraman,\n" +
                "Secretary General,\n" +
                "SSN MUN 2016. ");
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
