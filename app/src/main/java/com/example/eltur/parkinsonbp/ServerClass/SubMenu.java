package com.example.eltur.parkinsonbp.ServerClass;

import static java.lang.String.format;

/**
 * Created by Eltur on 20/08/2017.
 */

public class SubMenu {

    private String subMenu;
    public SubMenu(){}
    @Override
    public String toString(){
        return format("{subMenu:\"%s\"}",subMenu);
    }

    public String getSubMenu() {
        return subMenu;
    }

    public void setSubMenu(String subMenu) {
        this.subMenu = subMenu;
    }
}
