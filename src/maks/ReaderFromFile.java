package maks;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderFromFile implements maks.Reader {
    public String readData()  {
        String expression = "";
        try(FileReader freader = new FileReader("D:\\Project_Java\\calculator_new_java\\src\\maks\\File_read.txt"))
        {
            // читаем посимвольно
            int c;
            while((c=freader.read())!=-1){
                expression = expression + ((char)c);
            }
        }
        catch (FileNotFoundException ex)
        {
            System.out.println("File is not found");
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        return expression;
    }
}
