package com.travelog.mainapplication.custom.buttons;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.travelog.mainapplication.mainmenu.R;

/**
 * Created by Administrator on 04/04/2015.
 */
public class OptionMenuComponent extends LinearLayout {
    String itemText = "";

    public OptionMenuComponent(Context context) {
        super(context);
        LayoutInflater mInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        mInflater.inflate(R.layout.option_menu_component_view, this, true);
    }


    public OptionMenuComponent(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater mInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        mInflater.inflate(R.layout.option_menu_component_view, this, true);
        if(isInEditMode()) {
            return;
        }


        TypedArray buttonAttributes = context.getTheme().obtainStyledAttributes(
                attributeSet,
                R.styleable.OptionMenuComponent,
                0, 0);

        try {
            itemText = buttonAttributes.getString(R.styleable.OptionMenuComponent_optionName);
        } finally {
            if(!isInEditMode())
                buttonAttributes.recycle();
        }

        TextView text = (TextView) getChildAt(0);
        text.setText(itemText);

    }

}
