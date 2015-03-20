package com.travelog.mainapplication.userdetails;

import android.graphics.Point;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.widget.ImageButton;

public class UserDetailsActivity extends FragmentActivity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.masterscreen);


        Point displaySize = new Point();
        getWindowManager().getDefaultDisplay().getSize(displaySize);

        int buttonHeight = displaySize.y / 9;

        ImageButton homeImageButton = (ImageButton)findViewById(R.id.mainPanelHome);
        ImageButton mapImageButton = (ImageButton)findViewById(R.id.mainPanelMap);
        ImageButton userDetailsImageButton = (ImageButton)findViewById(R.id.mainPanelUserDetails);
        ImageButton editDiaryImageButton = (ImageButton)findViewById(R.id.mainPanelEditDiary);
        ImageButton sortingImageButton = (ImageButton)findViewById(R.id.mainPanelSorting);
        ImageButton addToDiaryImageButton = (ImageButton)findViewById(R.id.mainPanelAddToDiary);
        ImageButton selectionImageButton = (ImageButton)findViewById(R.id.mainPanelSelections);
        ImageButton sharingImageButton = (ImageButton)findViewById(R.id.mainPanelSharing);
        ImageButton deletionImageButton = (ImageButton)findViewById(R.id.mainPanelDeletions);

        homeImageButton.setImageResource(R.drawable.delete_selected);
        android.view.ViewGroup.LayoutParams params = homeImageButton.getLayoutParams();
        params.height = buttonHeight;
        homeImageButton.setLayoutParams(params);

        params = mapImageButton.getLayoutParams();
        params.height = buttonHeight;
        mapImageButton.setLayoutParams(params);

        params = userDetailsImageButton.getLayoutParams();
        params.height = buttonHeight;
        userDetailsImageButton.setLayoutParams(params);

        params = editDiaryImageButton.getLayoutParams();
        params.height = buttonHeight;
        editDiaryImageButton.setLayoutParams(params);

        params = sortingImageButton.getLayoutParams();
        params.height = buttonHeight;
        sortingImageButton.setLayoutParams(params);

        params = addToDiaryImageButton.getLayoutParams();
        params.height = buttonHeight;
        addToDiaryImageButton.setLayoutParams(params);

        params = selectionImageButton.getLayoutParams();
        params.height = buttonHeight;
        selectionImageButton.setLayoutParams(params);

        params = sharingImageButton.getLayoutParams();
        params.height = buttonHeight;
        sharingImageButton.setLayoutParams(params);

        params = deletionImageButton.getLayoutParams();
        params.height = buttonHeight;
        deletionImageButton.setLayoutParams(params);


    }
//    @Override
//    public View onCreateView(View parent, String name, Context context, AttributeSet attrs) {
////        View rootView = inflater.inflate(R.layout.masterscreen, container, false);
//
//        //Obtener el mensaje desde el intent en MainActivity
////        Intent intent = getActivity().getIntent();
////        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
//        //Buscar el textview en la vista
////        ImageButton textView = (ImageButton) parent.findViewById(R.id.mainPanelDeletions);
//
//
//        ImageButton homeImageButton = (ImageButton)findViewById(R.id.mainPanelHome);
//        ImageButton userDetailsImageButton = (ImageButton)findViewById(R.id.mainPanelUserDetails);
//        ImageButton editDiaryImageButton = (ImageButton)findViewById(R.id.mainPanelEditDiary);
//        ImageButton sortingImageButton = (ImageButton)findViewById(R.id.mainPanelSorting);
//        ImageButton addToDiaryImageButton = (ImageButton)findViewById(R.id.mainPanelAddToDiary);
//        ImageButton selectionImageButton = (ImageButton)findViewById(R.id.mainPanelSelections);
//        ImageButton sharingImageButton = (ImageButton)findViewById(R.id.mainPanelSharing);
//        ImageButton deletionImageButton = (ImageButton)findViewById(R.id.mainPanelDeletions);
//        android.view.ViewGroup.LayoutParams params = homeImageButton.getLayoutParams();
//        params.height = 200;
//        homeImageButton.setLayoutParams(params);
////        textView.setMaxHeight(100);
//        return parent;
//    }
}
