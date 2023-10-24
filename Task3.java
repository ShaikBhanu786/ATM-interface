import java.util.Scanner;  
 class ATM  
{ 
    public static void main(String args[] )  
    {  
        int amt = 10000, with_draw, deposit,transfer;  
        Scanner sc = new Scanner(System.in);  
          
        while(true)  
        {  
            System.out.println("ATM Interface");  
            System.out.println("1.Withdraw");
            System.out.println("2.Deposit");
            System.out.println("3.Transfer");
            System.out.println("4.balance");
            System.out.println("5.Exit");
            System.out.print("Choose any operation you want to perform:");  
            int ch = sc.nextInt();  
        switch(ch)  
        {  
          case 1:  
            System.out.print("Enter money to be withdrawn from account:");  
            with_draw = sc.nextInt();  
            if(amt >= with_draw)  
            {  
            amt = amt - with_draw;  
            System.out.println("amount withdrawn successfully");  
            }  
            else  
            {  
             System.out.println("Insufficient amtance");  
            }  
            System.out.println("");  
            break;  
   
        case 2:             
           System.out.print("Enter the amount you want to deposit:");   
           deposit = sc.nextInt();  
           amt = amt + deposit;  
           System.out.println("Your Money has been successfully deposited");  
           System.out.println("");  
           break;  
   
        case 3:  
          System.out.print("Enter money to be transfered from account:");  
          transfer = sc.nextInt();  
          if(amt >= transfer)  
          {    
            amt = amt - transfer;  
            System.out.println("amount transfered successfully");  
          }  
          else  
          {  
            System.out.println("Insufficient amtance");  
          }  
          System.out.println("");  
          break;
        case 4:  
            System.out.println("amtance=" +amt);
            System.out.println("");  
            break;  
   
        case 5:   
            System.exit(0);  
            } 
        } 
    }
}
   


