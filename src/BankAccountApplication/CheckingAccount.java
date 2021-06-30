package BankAccountApplication;

public class CheckingAccount extends Account  {

    //List the properties specific to Checking Account
    private int debitCardNumber;
    private int debitCardPin;

       //Constructor to initialize checking account properties
    public CheckingAccount(String name,String sSN, double initDeposit){
        super(name,sSN,initDeposit);
        accountNumber = "2" + accountNumber;
        setDebitCard();
        //System.out.println("Account Number: "+this.accountNumber);
       // System.out.println(" Account Type: checking");
        //System.out.println(name);
    }
    @Override
    public void setRate(){
        //System.out.println("Implement rate for checking ");
        rate = getBaseRate() * .15;
    }

    private void setDebitCard(){
        debitCardNumber = (int)(Math.random() * Math.pow(10,12 ));
        debitCardPin = (int) (Math.random() * Math.pow(10,4));

    }

   //List any method specific to Checking Account
    public void showInfo(){
        super.showInfo();
        System.out.println("Your checking account features"+
                "\n Debit card number: "+ debitCardNumber+
                "\n Debit card Pin: " + debitCardPin
        );
    }

}
