import java.util.Scanner;

class Account{  
    int acc_no;  
    String name;  
    float amount; 

    //Method to initialize object  
    void insert(int a,String n,float amt){  
    acc_no=a;  
    name=n;  
    amount=amt;  
        }  

    //deposit method  
    void deposit(float amt){  
    amount=amount+amt;  
    System.out.println(amt+" Rs. Deposited Sucessfully");  
        } 

    //withdraw method  
    void withdraw(float amt){  
    if(amount<amt){  
    System.out.println("Insufficient Balance");  
    }else{  
    amount=amount-amt;  
    System.out.println(amt+" withdrawn");  
        }  
    }  

    //method to check the balance of the account  
    void checkBalance(){
        System.out.println("Balance is: "+amount);
    }  

    //method to display the values of an object  
    void display(){
        System.out.println("Account No. : "+acc_no);
        System.out.println("Account Name : "+name);
        System.out.println("Account Balance : "+amount);
    }  
    public static void main(String[] args){ 
       
        Scanner a1=new Scanner(System.in); 
        Account b1=new Account();

        System.out.println("Enter Account Number :");
        System.out.println("Enter Name :");
        System.out.println("Enter Amount :");

        int a=a1.nextInt();
        a1.nextLine();
        String b=a1.nextLine();
        float c=a1.nextFloat();
        
        b1.insert(a,b,c);
        b1.display();

        System.out.println("Enter amount to be deposited :");
        b1.deposit(a1.nextFloat());
        b1.checkBalance();

        System.out.println("Enter amount to be withdraw :");
        b1.withdraw(a1.nextFloat());
        b1.checkBalance();

        }
    }  
    