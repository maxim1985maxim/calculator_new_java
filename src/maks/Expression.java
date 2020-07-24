package maks;

public class Expression {
    String firstDouble = "";
    String secondDouble = "";
    String operationMath = "";

    // Convert string into double1 + operationMath + double2
    public void parceMethod(String realExpression) {
        char[] rezult = realExpression.toCharArray();
        int i = 0;
        while ((rezult[i] != '+') && (rezult[i] != '-')) {
            firstDouble = firstDouble + rezult[i];
            i++;
        }
        operationMath = operationMath + rezult[i];
        int j = i + 1;
        while (j < rezult.length) {
            secondDouble = secondDouble + rezult[j];
            j++;
        }
    }
}
