package maks;

import java.util.Scanner;
public class ReaderComLine implements Reader{
    @Override
    public double readData() {
        System.out.print("Ведите число: ");
        Scanner str1 = new Scanner(System.in);
        return Double.parseDouble(str1.nextLine());
    }
}
