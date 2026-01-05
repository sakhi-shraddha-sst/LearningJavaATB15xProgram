package ex_09_Switch;

import java.util.Scanner;

public class Lab087_Real_Switch_Automation {
    public static void main(String[] args) {
        // Web Automation
        // I will ask the user to give me the input from browser which he wants to
        // use to I will start the automation in that browser.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the browser : ");
        String browser = scanner.next();
        browser = browser.toLowerCase();

        switch (browser){
            case "chrome":
                System.out.println("Starting Chrome Browser");
                System.out.println("......");
                System.out.println("TC1");
                System.out.println("TC2");
                break;
            case "edge":
                System.out.println("Starting edge Browser");
                break;
            case "firefox":
                System.out.println("Starting firefox Browser");
                break;
            default:
                System.out.println();
                break;

        }

    }
}
