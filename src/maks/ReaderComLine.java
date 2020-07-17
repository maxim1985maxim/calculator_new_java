package maks;

import java.util.Scanner;
public class ReaderComLine implements maks.Reader {
    public String readData() {
        System.out.print("Ведите выражение: ");
        Scanner str1 = new Scanner(System.in);
        return str1.nextLine();

    }
}