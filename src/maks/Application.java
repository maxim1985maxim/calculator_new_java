package maks;

import java.util.Scanner;

public class Application {

    // ENUM for connect user choice with the name of the war of reading
    enum ChoiceUser {
        consoleRead,
        fileRead
    }

    public String expression;

    // The dialog with user
    public int dialogUser() {
        System.out.println("Make a choice:");
        System.out.println("0 - read an expression from command line;");
        System.out.println("1 - read an expression from file.");
        Scanner inputData = new Scanner(System.in);
        //String choice = inputData.nextLine();
        int choice = Integer.parseInt(inputData.nextLine());
        return choice;
    }

    // Getting path to file reading
    public static String getPathFile() {
        System.out.println("Please, write path to File");
        Scanner inputData = new Scanner(System.in);
        String path = inputData.nextLine();
        return path;
    }

    // The realization of expression from user (or from file)
    public String getExpression(int rezultOfChoice) {
        if (rezultOfChoice == ChoiceUser.consoleRead.ordinal()) {
            expression = new maks.ReaderComLine().readData();
            return expression;
        } else if (rezultOfChoice == ChoiceUser.fileRead.ordinal()) {
            expression = new maks.ReaderFromFile().readData();
            return expression;
        } else {
            System.out.println("You wrote invalid choice");
            System.out.println("Please choose valid choice");
            dialogUser();
            return null;
        }
    }

    // Find mathMethod and Calculate expression
    public double expressionCalculate(maks.Expression expres) {
        double rezult = 0;
        maks.Expression objExpression = new maks.Expression();
        objExpression.parceMethod(expression);
        switch (objExpression.operationMath) {
            case "+": {
                rezult = maks.Calculation.Add(Double.parseDouble(objExpression.firstDouble), Double.parseDouble(objExpression.secondDouble));
                break;
            }
            case "-": {
                rezult = maks.Calculation.Sub(Double.parseDouble(objExpression.firstDouble), Double.parseDouble(objExpression.secondDouble));
                break;
            }
            case "*": {
                rezult = maks.Calculation.Mult(Double.parseDouble(objExpression.firstDouble), Double.parseDouble(objExpression.secondDouble));
                break;
            }
//            default:
//                break;
        }
        return rezult;
    }

    // The method for MAIN  !!!
    public void run() {
        Application varApplication = new Application();
        maks.Expression varExpression = new maks.Expression();
        varExpression.parceMethod(varApplication.getExpression(varApplication.dialogUser()));
        varApplication.expressionCalculate(varExpression);
        System.out.println(varApplication.expressionCalculate(varExpression));
    }
}
