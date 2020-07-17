package maks;

import java.util.Scanner;

public class Application {
    public String expression;

    // The dialog with user
    public String dialogUser() {
        System.out.println("Make a choice:");
        System.out.println("1 - read an expression from command line;");
        System.out.println("2 - read an expression from file.");
        Scanner inputData = new Scanner(System.in);
        String choice = inputData.nextLine();
        return choice;
    }

    // The realization of expression from user (or from file)
    public String getAnExpression(String rezultOfChoice) {
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
        System.out.print(expression + "=");
        return expression;
    }

    // Convert string into double1 + operationMath + double2
    public String[] parceMethod(String realExpression) {
        String firstDouble = "";
        String secondDouble = "";
        String operationMath = "";
        char[] rezult = realExpression.toCharArray();
        int i = 0;
        while ((rezult[i] != '+') && ((rezult[i] != '-')) && (rezult[i] != '*') && (rezult[i] != '/')) {
            firstDouble = firstDouble + rezult[i];
            i++;
        }
        operationMath = operationMath + rezult[i];
        for (int j = i + 1; j < rezult.length; j++) {
            secondDouble = secondDouble + rezult[j];
        }
        String[] array = new String[3];
        array[0] = firstDouble;
        array[1] = operationMath;
        array[2] = secondDouble;
        return array;
    }

    // Find mathMethod and Calculate expression
    public double expressionCalculate(String[] arr) {
        double rezult = 0;
        maks.Calculation temp2 = new maks.Calculation();
        switch (arr[1]) {
            case "+": {
                rezult = temp2.methodAdd(Double.parseDouble(arr[0]), Double.parseDouble(arr[2]));
                break;
            }
            case "-": {
                rezult = new maks.Calculation().methodSub(Double.parseDouble(arr[0]), Double.parseDouble(arr[2]));
                break;
            }
//            default:
//                break;
        }
        return rezult;
    }

}
