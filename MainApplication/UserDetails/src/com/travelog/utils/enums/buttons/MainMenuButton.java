package com.travelog.utils.enums.buttons;

import com.travelog.mainapplication.fragments.TravelogFragment;
import com.travelog.mainapplication.fragments.impl.*;
import com.travelog.mainapplication.mainmenu.R;

/**
 * Created by yasminuri on 3/27/2015.
 */
public enum MainMenuButton {

    mainMenuHome(R.id.main_menu_home, R.layout.home_fragment, new HomeFragment()),
    mainMenuMap(R.id.main_menu_map, R.layout.map_fragment, new MapFragment()),
    mainMenuUserDetails(R.id.main_menu_user_details, R.layout.user_details_fragment, new UserDetailsFragment()),
    mainMenuEditDiary(R.id.main_menu_edit_diary, R.layout.edit_diary_fragment, new EditDiaryFragment()),
    mainMenuSorting(R.id.main_menu_sort, R.layout.sorting_fragment, new SortingFragment()),
    mainMenuAddToDiary(R.id.main_menu_add_to_diary, R.layout.add_to_diary_fragment, new AddToDiaryFragment()),
    mainMenuSelections(R.id.main_menu_selection, R.layout.selections_fragment, new SelectionsFragment()),
    mainMenuSharing(R.id.main_menu_share, R.layout.sharing_fragment, new SharingFragment()),
    mainMenuDeletions(R.id.main_menu_delete, R.layout.deletions_fragment, new DeletionsFragment());

    int buttonId;
    int targetFragmentId;
    TravelogFragment componentClass;

    private MainMenuButton(int buttonId, int targetFragmentId, TravelogFragment componentClass) {
        this.buttonId = buttonId;
        this.targetFragmentId = targetFragmentId;
        this.componentClass = componentClass;
    }

    public int getButtonId() {
        return this.buttonId;
    }
    public int getTargetFragmentId() {
        return targetFragmentId;
    }
    public TravelogFragment getComponentClass() {
        return this.componentClass;
    }

}


