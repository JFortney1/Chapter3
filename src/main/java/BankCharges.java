
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jfortney
 */
public class BankCharges {
    public static void main(String[] args) {


    Scanner scanner = new Scanner(System.in);
    System.out.println("Input number of checks");
    int n = scanner.nextInt();
    double fee = 10;
    if(n < 20){
      fee += 0.10*n;
    }
    else if(n < 40){
      fee += 0.08*n;
    }
    else if(n < 60){
      fee += 0.06*n;
    }
    else{
      fee += 0.04*n;
    }
    System.out.println("Total fee is equal to "+ fee);
  }
}
