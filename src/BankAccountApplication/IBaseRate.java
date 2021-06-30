package BankAccountApplication;

public interface IBaseRate {

    double baseInterestRate = 10;

    //Write a method that returns the base rate
    /*public double getBaseInterestRate();*/
    default double getBaseRate(){
        return 2.5;
    }

}
