package BankAccountApplication;

public class SavingAccount extends Account {

    //List the properties specific to Saving Account
   private int safetyDepositBoxID;
    private int safetyDepositBoxKey;

    //Constructor to initialize saving account properties

    public SavingAccount(String name,String sSN, double initDeposit) {
        super(name,sSN,initDeposit);
        accountNumber = "1" + accountNumber;
        //System.out.println("Account Number: "+this.accountNumber);
       // System.out.println(" Account Type: Saving");
       // System.out.println(name);
    }

    public void setRate(){
        //System.out.println("Implement rate for saving");
        rate = getBaseRate() - .25;
    }
    private void setSafetyDepositBox(){
        safetyDepositBoxID = (int)(Math.random() * Math.pow(10,3));
        //System.out.println(safetyDepositBoxID);
        safetyDepositBoxKey = (int)(Math.random() * Math.pow(10,4));

    }

    //List any method specific to saving Account
    public void showInfo(){
        super.showInfo();
        System.out.println(
                "Your Saving Account Features"+
                        "\nSafety Deposit Box ID: " + safetyDepositBoxID+
                        "\nSafety Deposit Box Key: " + safetyDepositBoxKey
        );


    }
}
