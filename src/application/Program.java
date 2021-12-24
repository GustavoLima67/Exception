/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Locale;
import java.util.Scanner;
import model.entities.Account;
import model.exceptions.BusinessException;

/**
 *
 * @author Gustavo
 */
public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter account data");
            System.out.print("Number: ");
            int number = sc.nextInt();
            System.out.print("Holder: ");
            sc.nextLine();
            String holder = sc.nextLine();
            System.out.print("Initial balance: ");
            double balance = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            double withDrawLimit = sc.nextDouble();
            
            Account acc = new Account(number, holder, balance, withDrawLimit);
            System.out.println();
            
            System.out.print("Enter amount for withdraw: ");
            double amount = sc.nextDouble();
            acc.wihtDraw(amount);
        }
        catch(BusinessException e){
            System.out.println(e.getMessage());
        }
        
        
    }
}
