
package filereader;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Filereader {

    
    public static void main(String[] args) {
     
        String fileName = "example.txt";
        
        try{
        
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()){
            
                String Line = scanner .nextLine();
                System.out.println(Line);
            
            }
        scanner.close();
       }
        catch(FileNotFoundException  e){
        
            System.out.println("File not found:" +fileName);
        }
      
    }    
}
