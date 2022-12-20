package org.cisco.projectphase1.services;

import org.cisco.projectphase1.Welcome.FileOperations;
import org.cisco.projectphase1.Welcome.Screen;
import org.cisco.projectphase1.Welcome.WelcomePage;

public class ScreenService {
    public static WelcomePage WelcomePage = new WelcomePage();
    public static FileOperations FileOperations = new FileOperations();



    public static Screen CurrentScreen = WelcomePage;


    public static Screen getCurrentScreen() {

        return CurrentScreen;
    }


    public static void setCurrentScreen(Screen currentScreen) {

        CurrentScreen = currentScreen;
    }



}

