package BankAccountApplication;

public abstract class Account implements IBaseRate {
    //List common properties of saving and checking accounts
   // String accountType;
   protected String accountNumber;
    private String name;
    //int accountHolderAge;
    private double balance;
    private String sSN;
    private static int index = 10000;
    protected double rate;


    //Constructor to set base properties and initialize the account
    public Account(String name,String sSN,double initDeposit){
        this.name = name;
        this.sSN = sSN;
        this.balance = initDeposit;
        //System.out.print("Name: "+name+" SSN: "+sSN+" Initial Deposit: "+ balance);

        //Set Account  Number
        index++;
        this.accountNumber= setAccountNumber();

       // System.out.println("Account Number: "+this.accountNumber);
        //System.out.println(getBaseRate());
        setRate();

    }
    public abstract void setRate();

    private String setAccountNumber(){
        String lastTwoOfSSN = sSN.substring(sSN.length()-2,sSN.length());
        int uniqueID = index;
        int randomNumber = (int)(Math.random() * Math.pow(10,3));
        return lastTwoOfSSN + uniqueID + randomNumber;
    }

    /*public Account(String accountType, String accountNumber, String accountHolderName, int accountHolderAge, double balance, int securityNumber) {
        this.accountType = accountType;
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountHolderAge = accountHolderAge;
        this.balance = balance;
        this.securityNumber = securityNumber;
        System.out.println(accountType+" "+accountNumber+" "+accountHolderName+" "+accountHolderAge+" "+balance+" "+securityNumber);
    }*/


    //List common method
    public void compoud()
    {
        double accruedInerest = balance * (rate/100);
         balance = balance + accruedInerest;
        System.out.println("Accrued Interest: $"+ accruedInerest);
        pritnBalance();
    }

    public void deposit(double amount){
        balance = balance + amount;
        System.out.println("Depositing $"+ amount);
        pritnBalance();
    }



    public void withdraw(double amount){
    balance = balance - amount;
        System.out.println("Withdrawing $"+ amount);
        pritnBalance();


    }
    public void transfer(String toWhere, double amount) {
    balance = balance - amount;
        System.out.println("Transfering $" + amount + "to " + toWhere);
        pritnBalance();

    }

    public void pritnBalance(){
        System.out.println("Your balance is now: $" +balance);

    }

    public void showInfo(){
        System.out.println(
                "Name: "+name+
                        "\nAccount Number: "+accountNumber+
                        "\nBalance: "+balance+
                        " \n Rate: "+rate+"%"




        );
    }




}
