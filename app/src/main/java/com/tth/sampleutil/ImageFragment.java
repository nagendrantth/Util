package com.tth.sampleutil;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ImageFragment extends Fragment {

    private static String ARG_IMAGE_RESOURCE = "ARG_IMAGE_RESOURCE";
    private int imageRes;

    public static ImageFragment newInstance(int imageRes) {
        ImageFragment imageFragment = new ImageFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(ARG_IMAGE_RESOURCE, imageRes);
        imageFragment.setArguments(bundle);
        return imageFragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        imageRes = getArguments().getInt(ARG_IMAGE_RESOURCE);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View fragmentView = inflater.inflate(R.layout.fragment_image, container, false);

        ImageView iconImage = (ImageView) fragmentView.findViewById(R.id.image_icon);
        iconImage.setImageResource(imageRes);

        return fragmentView;
    }
}
