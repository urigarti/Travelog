package com.travelog.utils.events.mainmenuoperations;

import com.travelog.utils.enums.buttons.MainMenuButton;

import java.util.EventListener;

/**
 * Created by Administrator on 10/04/2015.
 */
public interface MainMenuOperationsListener extends EventListener {
//    public void mainMenuOperationClicked(MainMenuOperationsEvent mainMenuOperationsEvent);
        public void mainMenuOperationClicked(String buttonId);
}
