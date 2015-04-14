package com.travelog.utils.buttons;

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

//	View parentView;
	TravelogImageButton selectedOption;
    List<TravelogImageButton> mainButtons = new ArrayList<TravelogImageButton>();

	List<MainMenuOperationsListener> mainMenuOperationsListeners = new ArrayList<MainMenuOperationsListener>();
    
    protected MainOptionsSwitcher() {}

	public MainOptionsSwitcher(List<TravelogImageButton> buttons) {
		selectedOption = buttons.get(0);
		selectedOption.select();
		for (int i = 0; i < buttons.size(); i++) {
			buttons.get(i).setOnClickListener(groupClickListener);
			this.mainButtons.add((TravelogImageButton)buttons.get(i));
		}

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
		if (v instanceof TravelogImageButton) {
			if (!(v.getTag().equals(selectedOption.getTag()))) {
				((TravelogImageButton) v).select();
				selectedOption.deselect();
			}
		}
	}

    View.OnClickListener groupClickListener = new View.OnClickListener() {
        public void onClick(View v) {
            switchImages(v);
            selectedOption = (TravelogImageButton)v;
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
