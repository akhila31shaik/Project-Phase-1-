package org.cisco.projectphase1.Welcome;
import org.cisco.projectphase1.services.DirectoryService;
import org.cisco.projectphase1.services.ScreenService;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class WelcomePage implements Screen{
    private String Text = "\n******** Welcome to LockedMe Application ********\n";
    private String developerText = "Developer: Shaik Akhila";

    private ArrayList<String> options = new ArrayList<>();


    public WelcomePage() {
        options.add("1. Show Files which are in the existing directory");
        options.add("2. Show File Options Menu to perform operations");
        options.add("3. Exit the Welcome Screen");

    }

    public void userPage() {
        System.out.println(Text);
        System.out.println(developerText);
        System.out.println();
        Show();
    }



    @Override
    public void Show() {
        System.out.println("## Dashboard ##");
        System.out.println("Enter the Choice from the menu : ");
        for (String s : options)  {
            System.out.println(s);
        }

    }

    public void GetUserChoice() {
        int choice  = 0;
        while ((choice = this.getChoice()) != 3) {
            this.NavigateOption(choice);
        }
    }

    @Override
    public void NavigateOption(int option) {
        switch(option) {

            case 1: // Show Files in Directory
                this.DisplayFiles();

                this.Show();

                break;

            case 2: // Show File Options menu
                ScreenService.setCurrentScreen(ScreenService.FileOperations);
                ScreenService.getCurrentScreen().Show();
                ScreenService.getCurrentScreen().GetUserChoice();

                this.Show();

                break;

            default:
                System.out.println("Invalid Option");
                break;
        }

    }

    public void DisplayFiles() {

        //TODO: Get the files from the Directory

        //Finished TODO Task

        System.out.println("List of Files in the Directory: ");
        DirectoryService.PrintFiles();

    }

    private int getChoice() {
        Scanner in = new Scanner(System.in);

        int returnPage = 0;
        try {
            returnPage= in.nextInt();
        }
        catch (InputMismatchException ex) {

        }
        return returnPage;

    }
}
