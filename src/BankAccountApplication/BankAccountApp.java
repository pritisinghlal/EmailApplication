package BankAccountApplication;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

    public static void main(String[] args) {
        List<Account> accounts = new LinkedList<Account>();

        String file = "C:\\Users\\priti\\Downloads\\NewBankAccounts.csv";
        //String file = "C:\Users\priti\Downloads\NewBankAccounts.csv";
        //Read a CSV fule then create nw accounts bases on that data
        List<String[]> newAccountHolder = utitlities.CSV.read(file);
         for (String[] accountHolder : newAccountHolder){
            // System.out.println("New Account");
                String name = accountHolder[0];
                String sSN = accountHolder[1];
                String accountType = accountHolder[2];
                double initDeposit = Double.parseDouble(accountHolder[3]);
            // System.out.println("name: "+ name+ " SSN: " +sSN+ " Account Type: " +accountType+ " Initial Deposit: "+ initDeposit);

             if (accountType.equals("Savings")){
                 //System.out.println("Open a savings account");
                 accounts.add(new CheckingAccount(name,sSN,initDeposit));
             }else if(accountType.equals("Checking")) {
                 //System.out.println("Open a checking account");
                 accounts.add(new SavingAccount(name,sSN,initDeposit));
             }else {
                 System.out.println("Error reading account type");
             }
         }

         //accounts.get(5).showInfo();
        for (Account account: accounts){
            System.out.println("\n **********************");
            account.showInfo();
        }

        //accounts.get((int) Math.random() * accounts.size()).deposit(1000);

  /*      CheckingAccount checkingAccount = new CheckingAccount("Priti","123456789",500);
        SavingAccount savingAccount = new SavingAccount("Singh","321654987",1000);
        savingAccount.showInfo();
        System.out.println("***********************");
        checkingAccount.showInfo();
        savingAccount.compoud();
        savingAccount.deposit(500);
        savingAccount.withdraw(100);
       // savingAccount.transfer(savingAccount.accountNumber, 50);
        savingAccount.transfer("Mortgage $",100);
*/



        //Read a CSV file then create new accounts based on the data

    }
}
