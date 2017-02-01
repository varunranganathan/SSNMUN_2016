package a2016.app.ssnmun.com.ssnmun2016;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link IPFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link IPFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class IPFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public IPFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment IPFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static IPFragment newInstance(String param1, String param2) {
        IPFragment fragment = new IPFragment();
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
        View rootView = inflater.inflate(R.layout.fragment_i, container, false);
        CircleImageView IPHead1 = (CircleImageView) rootView.findViewById(R.id.ip1);
        CircleImageView IPHead2 = (CircleImageView) rootView.findViewById(R.id.ip2);
        CircleImageView IP3 = (CircleImageView) rootView.findViewById(R.id.ip3);
        CircleImageView IP4 = (CircleImageView) rootView.findViewById(R.id.ip4);


        BitmapLoader bitmapLoader = new BitmapLoader(this.getContext());
        bitmapLoader.loadBitmap(R.drawable.ip1,IPHead1);
        bitmapLoader.loadBitmap(R.drawable.ip2,IPHead2);
        bitmapLoader.loadBitmap(R.drawable.ip3,IP3);
        bitmapLoader.loadBitmap(R.drawable.ip4,IP4);

        TextView IPDescription1 = (TextView) rootView.findViewById(R.id.ipDescription1);
        IPDescription1.setText("A fourth year college student at VIT-Chennai, Kanishka Nambiar's attended 18 MUN's solely as a member of the International Press for the very notion of public speaking, forming alliances and debate has scared the bejesus out of him - leaving him with an extraordinary amount of time to brush-up on his penmanship and avid sarcasm. He considers the International Press to be \"a dam that stretches from either end, regulating seas worth of information from various sources, be it the waterfall of knowledge, the straits of satire or the marshes of refugee-centered writing\" and believes that it exists to give people access to the information that they desire, hence preserving memories in the metaphorical carbonite; unlike Han Solo however, the results of journalism do not deteriorate/get stabbed by their offspring. His role models include Sarte, Camus, Hitler and Kafka, and he thrives on obscure references, indie games and dank memes. ");
        TextView IPDescription2 = (TextView) rootView.findViewById(R.id.ipDescription2);
        IPDescription2.setText("\"The half-Bengali Civil Engineer\" is how his friends would probably have referred to him in an alternate timeline. However, after 14 MUNs as a member of the International Press, a (still-ongoing) tenure as a member of a charity organisation for Syrian refugees, and endless debates - on diplomatic and Battle Studies, creating a Big Echo of public political awareness and Giving Up the Gun, among other things - Arshish Z Vania seems insistent on subverting that timeline with resolve, dedication, humility and panache. Shish (as he is affectionately referred to) has an excellent understanding of topics ranging from the policies of Barack Obama to the intricacies of the Oxford Comma, and will never hesitate to 'fight the good fight'. A student of SRM University, Chennai, AZV has built the rock-solid Wall of his International Press reputation Brick by Brick, and will add an excellent layer to it as the co-Head of International Press at SSN MUN 2016. ");
        TextView IPDescription3 = (TextView) rootView.findViewById(R.id.ipDescription3);
        IPDescription3.setText("A third year student pursuing History and Tourism at Stella Maris College and a veteran of 6 MUNs, Srishti Sankaranarayanan’s short stature belies an intellect and talent of incredible proportions. Having won her first Best Reporter Award at her very first MUN conference at VITC MUN 2015, there has been no looking back for her ever since.  Srishti’s passions include art, history and travel and she hopes to pursue a Masters in the field of archaeology, art history and curatorial studies someday. A true ice- cream connoisseur, Srishti prides herself on being able to finish more than one tub in a single day.  Her work is truly some of the best this circuit has seen and she will be bringing to SSN MUN 2016, her own signature style of dynamism, vibrancy and absolute awesomeness. ");
        TextView IPDescription4 = (TextView) rootView.findViewById(R.id.ipDescription4);
        IPDescription4.setText("Rohini Mitra is diminutive and portly - diminutive are her inabilities, and portly are her skills. She's outworldly, what with her unshakeable faith in the goodness of love, the world and its mankind. Many call her the 'harbinger of truth'. Raising your eyebrows, eh? Wait until she throws facts, statistics and other quantifiable data your way. She's got nerves of steel too, for she has patiently and respectfully disproved the BS that delegates have said at many a press conference. She paints a picture with her words, and her words, mind you, are mightier than a sword.You might be lost in the beauty of her mystical locks. But even more beautiful are her thoughts that never fail to inspire and amaze one and all. She's a friend to everybody, and a therapist to many. But first, she's a writer in a passionate relationship with literature. 19-year-old Rohini Mitra, fondly known as 'Ro' in her intimate circles, is a gift of God to the world. She's all the goodness of a chocolate truffle cake, minus all its calories, that the world requires and deserves. ");
        /*bitmapLoader.loadBitmap(R.drawable.delaffairs1,delaffairs1);
        bitmapLoader.loadBitmap(R.drawable.delaffairs2,delaffairs2);
        bitmapLoader.loadBitmap(R.drawable.delaffairs3,delaffairs3);
        bitmapLoader.loadBitmap(R.drawable.delaffairs4,delaffairs4);
        bitmapLoader.loadBitmap(R.drawable.delaffairs5,delaffairs5);
        bitmapLoader.loadBitmap(R.drawable.delaffairs6,delaffairs6);
        bitmapLoader.loadBitmap(R.drawable.delaffairs7,delaffairs7); */
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
