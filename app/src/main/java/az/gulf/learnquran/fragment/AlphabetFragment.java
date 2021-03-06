package az.gulf.learnquran.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import az.gulf.learnquran.R;
import az.gulf.learnquran.adapter.AlphabetAdapter;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link AlphabetFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link AlphabetFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AlphabetFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public AlphabetFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment AlphabetFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static AlphabetFragment newInstance(String param1, String param2) {
        AlphabetFragment fragment = new AlphabetFragment();
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

        View rootView = inflater.inflate(R.layout.fragment_alphabet, container, false);

        RecyclerView  mRecyclerView = (RecyclerView) rootView.findViewById(R.id.my_recycler_view);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        mRecyclerView.setHasFixedSize(true);

        // use a linear layout manager
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(mLayoutManager);




        // specify an adapter (see also next example)
        RecyclerView.Adapter mAdapter = new AlphabetAdapter(prepareFragmentDataSet());
        mRecyclerView.setAdapter(mAdapter);


        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_alphabet, container, false);
        return rootView;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
//            throw new RuntimeException(context.toString()
//                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
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

    public ArrayList<String> prepareFragmentDataSet(){

        ArrayList<String> myDataset = new ArrayList<>();
        myDataset.add("01. Giriş");
        myDataset.add("02. Qurani-Kərim Əlifbası");
        myDataset.add("03. Hərflərin ərəb dilində səslənməsi");
        myDataset.add("04. Hərəkələr");
        myDataset.add("05. Hərəkələrin məşqi üçün tapşırıqlar");
        myDataset.add("06.  Ərəb əlifbasında oxşar hərflərin oxunuşu (fəthəyə aid misallar)");
        myDataset.add("07.  Fəthə mövzusuna aid əlavə çalışma");
        myDataset.add("08.  Ərəb əlifbasında oxşar hərflərin oxunuşu");
        myDataset.add("09.  Kəsrə mövzusuna aid əlavə çalışma");
        myDataset.add("10.  Ərəb əlifbasında oxşar hərflərin oxunuşu");
        myDataset.add("11.  Dammə mövzusuna aid əlavə çalışma");
        myDataset.add("12.  Mədd (Uzatma) hərfləri");
        myDataset.add("13.  Sukun");
        myDataset.add("14.  Şəddə");
        myDataset.add("15.  Sukun və şəddəyə aid misallar");
        myDataset.add("16.  Tənvinlər");
        myDataset.add("17.  Həmzə");
        myDataset.add("18.  Çəkər");
        myDataset.add("19.  Vəsləli həmzə");
        myDataset.add("20.  “Əlif-Ləm” birləşməsi");
        myDataset.add("21.  Bəzi Qurani-Kərim nüsxələrindən");
        myDataset.add("22.  yazılış nümunələri");
        myDataset.add("23.  Tətbiqat üçün ayələr");


        return myDataset;

    }




}
