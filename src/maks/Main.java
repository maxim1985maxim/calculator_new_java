package maks;

public class Main {

    public String str;
    public static void main(String[] args) {
        Reader reader = new ReaderComLine();
        String x1 = reader.readData();
        ReaderComLine a2 = new ReaderComLine();
        double x2 = a2.readData();
        Calculation calc = new Calculation();
        double rezult = calc.methodAdd(x1, x2);
        WriterComLine h = new WriterComLine();
        h.writeData();
        System.out.println(x1+"+"+x2+"="+rezult);
    }
}
