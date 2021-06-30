package emailApplicaion;

public class Test {

    public static void main(String[] args) {
        EmailAccount emailAccount = new EmailAccount("priti","singh");
        //emailAccount.setAlternateEmail("pritisingh@gmail.com");
        //System.out.println(emailAccount.getAlternateEmail());
       //emailAccount.dispayInfo();//This wil not print the display method until we print it
        System.out.println(emailAccount.dispayInfo());

    }
}
