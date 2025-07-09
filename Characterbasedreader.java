import java.io.BufferedReader;
import java.io.FileReader;

public class Characterbasedreader {
    public static void main(String[] args) {
    try (BufferedReader reader = new BufferedReader(new FileReader("README.txt"))) {
    String line;
    while ((line = reader.readLine()) != null) {
        System.out.println(line);
    }
    }  catch (IDException e) {
    System.out.println("read file failed" );
    e.printStackTrace();
   
}
}
}
    
