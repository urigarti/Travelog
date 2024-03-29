package com.travelog.utils.buttons;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.travelog.utils.events.mainmenuoperations.MainMenuOperationsEvent;
import com.travelog.utils.events.mainmenuoperations.MainMenuOperationsListener;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by yasminuri on 3/20/2015.
 */
public class MainOptionsSwitcher {

	TravelogImageButton selectedOption;
    List<TravelogImageButton> mainButtons = new ArrayList<TravelogImageButton>();

	List<MainMenuOperationsListener> mainMenuOperationsListeners = new ArrayList<MainMenuOperationsListener>();
    
    protected MainOptionsSwitcher() {}

	public MainOptionsSwitcher(List<TravelogImageButton> buttons) {
		for (int i = 0; i < buttons.size(); i++) {
			buttons.get(i).setOnClickListener(groupClickListener);
			this.mainButtons.add((TravelogImageButton)buttons.get(i));
		}
		selectedOption = buttons.get(0);
		switchImages(buttons.get(0));

	}

    public void autoAdjustHeights(int buttonHeight) {
		int height = buttonHeight / mainButtons.size();
        for(TravelogImageButton currentButton : mainButtons) {
        	ViewGroup.LayoutParams lp = currentButton.getLayoutParams();
        	lp.height = height;
        	currentButton.setLayoutParams(lp);
        }
    }

	public void switchImages(View v) {
		Log.v("switchImages", "current button: " + selectedOption.getTag() + "/ New button: " + v.getTag());
		if (v instanceof TravelogImageButton) {
				((TravelogImageButton) v).select();
			if (!(v.getTag().equals(selectedOption.getTag()))) {
				selectedOption.deselect();
				selectedOption = (TravelogImageButton)v;
			}
		}
	}

    View.OnClickListener groupClickListener = new View.OnClickListener() {
        public void onClick(View v) {
            switchImages(v);
//			Fire an event to notify the containing fragment about the click
			mainMenuChanged(((TravelogImageButton) v).getTag().toString());
        }
    };

    public List<TravelogImageButton> getMainButtons() {
        return mainButtons;
    }

	public synchronized void mainMenuChanged(String buttonId) {
		fireEvent(buttonId);
	}
	public synchronized void addMainOptionChangedListener(MainMenuOperationsListener l) {
		mainMenuOperationsListeners.add( l );
	}

	public synchronized void removeMainOptionChangedListener( MainMenuOperationsListener l ) {
		mainMenuOperationsListeners.remove( l );
	}

	private synchronized void fireEvent(String buttonId) {
		MainMenuOperationsEvent optionChangedEvent = new MainMenuOperationsEvent(this);
		Iterator<MainMenuOperationsListener> listeners = mainMenuOperationsListeners.iterator();
		while(listeners.hasNext() ) {
			( (MainMenuOperationsListener) listeners.next() ).mainMenuOperationClicked(buttonId);
		}
	}
}
