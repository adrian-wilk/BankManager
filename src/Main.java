import java.util.Date;
public class Main {

    public static void main(String[] args){

        SavingsAccount newSavingsAccount = new SavingsAccount();
        newSavingsAccount.account = "Adrian Wilk";
        newSavingsAccount.balance = 5050.64;
        newSavingsAccount.transfers = 5;

        CertificateOfDeposit newCOD = new CertificateOfDeposit();
        newCOD.account = "Adrian Wilk";
        newCOD.balance = 5050.64;
        newCOD.duration = 12;

        CheckingAccount CA = new CheckingAccount();
        CA.account = "Adrian Wilk";
        CA.balance = 5050.64;
        CA.limit = 100000.00;
    }

}
