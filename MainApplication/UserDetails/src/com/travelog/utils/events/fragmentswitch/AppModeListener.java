package com.travelog.utils.events.fragmentswitch;

import java.util.EventListener;

/**
 * Created by Administrator on 10/04/2015.
 */
public interface AppModeListener extends EventListener {
    public void appModeChanged(AppModeChangedEvent appModeChangedEvent);
}
