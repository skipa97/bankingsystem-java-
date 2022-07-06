package com.banking.system;


import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class Account {

    int balance;
    int prevTrans;
    String customerName;
    String customerId;

    Account(String custName, String custId){
        customerId = custId;
        customerName = custName;
    }

    //this is a function to deposit money
    void deposit (int depAmount){
         if (depAmount != 0){
             balance = balance + depAmount;
             prevTrans = depAmount;
         }
    }

    //this is a function to withdraw money
    void withdrawal(int withDrawAmount){
        if (withDrawAmount !=0){
            balance = balance - withDrawAmount;
            prevTrans = -withDrawAmount;
        }
    }

    //this is a function to show the previous transaction
    void getPreviousTransaction(){
        if (prevTrans > 0){
            System.out.println("Madi a a tsentswe, a lekana le R: "+ prevTrans);

        }else if (prevTrans < 0){
            System.out.println("Madi a ntshitsweng a kana ka: "+ prevTrans);
        }
        else{
            System.out.println("Ga go se go nne le tsenyo kgotso go ntshiwa goa madi.");
        }
    }

    void Options (){

        char option = ('\0');
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dumela: "+ customerName + "!");
        System.out.println("Nomoro ya gago ya ID ke: " + customerId);
        System.out.println();
        System.out.println("A re ka go thusa ka eng? ");
        System.out.println();
        System.out.println("1. Go bona gore o na le bokae");
        System.out.println("2. Go tsenya madi");
        System.out.println("3. Go goga madi");
        System.out.println("4. Go bontsha ketsagalo e e fitileng");
        System.out.println("0. Go tswa");


        do{
            System.out.println();
            System.out.println("Tsenya kgetho ya gao: ");
            char option1 = scanner.next().charAt(0);
            option = Character.toUpperCase(option1);
            System.out.println();

            switch(option){
                case 'A':
                    System.out.println("====================");
                    System.out.println("Madi a o nang le o ne, a lekana R"+balance);
                    System.out.println("=====================");
                    System.out.println();
                    break;
                case 'B':
                    System.out.println("Tsena madi a o batlang go a deposit: ");
                    int amount = scanner.nextInt();
                    deposit(amount);
                    System.out.println();
                    break;
                case 'C':
                    System.out.println("O batla go ntsha bokae?:  ");
                    int withAmount = scanner.nextInt();
                    withdrawal(withAmount);
                    System.out.println();
                    break;
                case 'D':
                    System.out.println("=======================");
                    getPreviousTransaction();
                    System.out.println("=======================");
                    System.out.println();
                    break;
                case 'E':
                    System.out.println("=========================");
                    break;

            }
        } while(option!='E');
        System.out.println("Re a leboga, fa re le mmogo re ka dira go le gontsi.");

    }
}
