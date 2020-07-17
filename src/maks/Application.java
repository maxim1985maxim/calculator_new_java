package maks;

import java.util.Scanner;

public class Application {
    public String expression;
    // The dialog with user

    public String dialogUser (){
        System.out.println("Make a choice:");
        System.out.println("1 - read an expression from command line;");
        System.out.println("2 - read an expression from file.");
        Scanner inputData = new Scanner(System.in);
        String choice = inputData.nextLine();
        return choice;
    }

    // The realization of expression from user (or from file)
    public String getAnExpression (String rezultOfChoice) {
        switch (rezultOfChoice) {
            case "1": {
                expression = new maks.ReaderComLine().readData();
                break;
            }
            case "2": {
                expression = new maks.ReaderFromFile().readData();
                break;
            }
//            default:
//                break;
        }
        System.out.println(expression);
        return expression;
    }




}
