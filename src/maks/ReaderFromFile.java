package maks;
import java.io.FileReader;
import java.io.IOException;

public class ReaderFromFile implements maks.Reader {

    @Override
    public String readData()  {
        String path = maks.Application.getPathFile();
        String expression = "";
        try(FileReader freader = new FileReader(path))
        {
            //D:\Project_Java\calculator_new_java\src\maks\File_read.txt
            // читаем посимвольно
            int c;
            while((c=freader.read())!=-1){
                expression = expression + ((char)c);
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        return expression;
    }
}
