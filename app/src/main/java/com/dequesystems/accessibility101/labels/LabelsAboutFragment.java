package com.dequesystems.accessibility101.labels;

import android.os.Bundle;
import android.app.Fragment;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.dequesystems.accessibility101.R;

public class LabelsAboutFragment extends Fragment {

    View mView;

    TextView mTextView1;
    TextView mTextView2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        mView = inflater.inflate(R.layout.fragment_labels_about, container, false);

        mTextView1 = (TextView) mView.findViewById(R.id.aacLabelsTextView1);
        mTextView2 = (TextView) mView.findViewById(R.id.aacLabelsTextView2);

        mTextView1.setMovementMethod(LinkMovementMethod.getInstance());
        mTextView2.setMovementMethod(LinkMovementMethod.getInstance());

        int linkColor = getResources().getColor(R.color.aac_text_link);

        mTextView1.setLinkTextColor(linkColor);
        mTextView2.setLinkTextColor(linkColor);

        return mView;
    }

}
