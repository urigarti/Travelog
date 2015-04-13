package com.travelog.utils;

/**
 * Created by yasminuri on 3/21/2015.
 */
public enum MainMenuButtonResources {

    Home("home"),
    Map("map"),
    EditDiary("editing_diary"),
    Sort("sorting"),
    AddToDiary("add_to_diary"),
    Selection("selection"),
    Sharing("sharing"),
    Delete("delete");

    String buttonPrefix;

    MainMenuButtonResources(String buttonPrefix) {
        this.buttonPrefix = buttonPrefix;
    }

    public String getButtonPrefix() {
        return this.buttonPrefix;
    }

}
