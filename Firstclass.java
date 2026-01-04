package firstclass;
import java.util.Scanner;

class Interest {

    double p, t, r, si;
    
    
    void getData() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the principal:");
        p = input.nextDouble();
        
        System.out.println("Enter the time:");
        t = input.nextDouble();
        
        System.out.println("Enter the rate:");
        r = input.nextDouble();
    }
    

    void findInterest() {
        getData();
        si = p * t * r / 100;
    }
    
    
    void display() {
        findInterest(); // Calculate interest before displaying
        System.out.println("The Simple Interest is: " + si);
    }

}

public class Firstclass {
    public static void main(String[] args) {
        Interest lhosang = new Interest(); 
          
        lhosang.display();  
    }
}
