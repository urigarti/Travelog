package utils.enums.buttons;

import com.travelog.mainapplication.userdetails.R;

/**
 * Created by yasminuri on 3/27/2015.
 */
public enum MainMenuButtons {

    mainPanelHome(R.id.mainPanelHome),
    mainPanelMap(R.id.mainPanelMap),
    mainPanelUserDetails(R.id.mainPanelUserDetails),
    mainPanelEditDiary(R.id.mainPanelEditDiary),
    mainPanelSorting(R.id.mainPanelSorting),
    mainPanelAddToDiary(R.id.mainPanelAddToDiary),
    mainPanelSelections(R.id.mainPanelSelections),
    mainPanelSharing(R.id.mainPanelSharing),
    mainPanelDeletions(R.id.mainPanelDeletions);

    int buttonId;

    private MainMenuButtons(int buttonId) {
        this.buttonId = buttonId;
    }

    public int getId() {
        return this.buttonId;
    }

}


