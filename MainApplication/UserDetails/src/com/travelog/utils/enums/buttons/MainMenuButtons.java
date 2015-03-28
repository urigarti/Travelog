package com.travelog.utils.enums.buttons;

import com.travelog.mainapplication.userdetails.R;

/**
 * Created by yasminuri on 3/27/2015.
 */
public enum MainMenuButtons {

    mainPanelHome(R.id.main_menu_home),
    mainPanelMap(R.id.main_menu_map),
    mainPanelUserDetails(R.id.main_menu_user_profile),
    mainPanelEditDiary(R.id.main_menu_edit_diary),
    mainPanelSorting(R.id.main_menu_sort),
    mainPanelAddToDiary(R.id.main_menu_add_to_diary),
    mainPanelSelections(R.id.main_menu_selection),
    mainPanelSharing(R.id.main_menu_share),
    mainPanelDeletions(R.id.main_menu_delete);

    int buttonId;

    private MainMenuButtons(int buttonId) {
        this.buttonId = buttonId;
    }

    public int getId() {
        return this.buttonId;
    }

}


