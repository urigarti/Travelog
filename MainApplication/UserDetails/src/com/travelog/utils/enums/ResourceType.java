package com.travelog.utils.enums;

import com.travelog.mainapplication.userdetails.R;

/**
 * Created by yasminuri on 3/27/2015.
 */
public enum ResourceType {
    ID(R.id.class),
    Drawable(R.drawable.class),
    Layout(R.layout.class),
    String(R.string.class),
    Style(R.style.class);

    Class type;

    private ResourceType(Class type) {
        this.type = type;
    }

    public Class getType() {
        return this.type;
    }

}

