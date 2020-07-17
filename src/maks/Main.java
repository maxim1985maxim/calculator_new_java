package maks;

public class Main {

    public String str;
    public static void main(String[] args) {
        maks.Application temp = new maks.Application();
        String [] arr = temp.parceMethod(temp.getAnExpression(temp.dialogUser()));
        System.out.println(temp.expressionCalculate(arr));

    }
}