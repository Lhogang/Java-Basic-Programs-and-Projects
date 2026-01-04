/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array;

/**
 *
 * @author user
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    
        int []iArray = {1,2,3,4,5};
        int iAverage = 0;
        
        int sum = 0;
        for (int i = 0; i<iArray.length; i++){
        
            sum += iArray[i];
        }
        iAverage = sum / iArray.length;
        System.out.println("Average of the Array:" +iAverage);
    }
    
}
