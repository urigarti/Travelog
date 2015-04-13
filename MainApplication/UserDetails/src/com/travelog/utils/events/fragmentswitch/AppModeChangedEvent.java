package com.travelog.utils.events.fragmentswitch;

import com.travelog.utils.enums.buttons.MainMenuButton;

import java.util.EventObject;

/**
 * Created by Administrator on 10/04/2015.
 */
public class AppModeChangedEvent extends EventObject {

    MainMenuButton targetComponent;


    public AppModeChangedEvent(Object source, MainMenuButton targetComponent) {
        super(source);
        setTargetComponent(targetComponent);
    }

    public MainMenuButton getTargetComponent() {
        return targetComponent;
    }

    public void setTargetComponent(MainMenuButton targetComponent) {
        this.targetComponent = targetComponent;
    }

}
