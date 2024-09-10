package balbon;

import java.util.Scanner;

public class Balbon {

    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
       Grade gr = new Grade();
       Sale sl = new Sale();
       Product pr = new Product();
       Account acs = new Account();
       
       
       
       int option;
       
       do{
           System.out.println("1.Grade"
                   + "\n2.Sale"
                   + "\n3.Product"
                   + "\n4.Account");
           
           System.out.print("\nEnter Your Option: ");
           option = sc.nextInt();
           
           
                switch(option){
                    case 1: 
                        gr.getGrade();
                        gr.viewGrade();
                        break;

                    case 2:
                        sl.getSale();
                        break;

                    case 3:
                        pr.getProduct();
                        pr.viewProduct();
                        break;

                    case 4:
                        acs.getAccounts();
                        break;
                        
                    default:
                        System.out.println("Invalid option, please try again. \n");
                   
           
                }
           
       }while( option > 4 || option < 0 );
    
    
       
    }
}
