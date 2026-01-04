package classadd;
import java.util.Scanner;

class Add {
double a,b,sum;

void getData(){
Scanner input = new Scanner(System.in);
System.out.println("Enter the first number");
a = input.nextDouble();

System.out.println("Enter the Second number");
b = input.nextDouble();
 
}
void findadd(){
getData();
sum = a+b;
}
void display(){

    findadd();
    System.out.println("The sum of two number is:" +sum);
}
}
public class Classadd {

    public static void main(String[]args){
        
        Add lhosang = new Add();
        lhosang.display();
    }
}
