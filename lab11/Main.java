
public class Main {
    public static void main(String[] args) {
        try {
            CheckingAccount acct1 = new CheckingAccount(1000, "A0001", 500);
            Customer cust = new Customer("Sompong", "Sookjai", acct1);
            cust.getAcct().deposit(500);
            cust.getAcct().withdraw(1800);
            cust.getAcct().withdraw(300);
            cust.getAcct().deposit(1000);
            cust.getAcct().withdraw(200);
        }catch(WithdrawException ex){
            System.out.println(ex);
        }finally{
            System.out.println("Thank you.");
        }
    }
}
//Exception in thread "main" java.lang.RuntimeException: Uncompilable code - unreported exception WithdrawException; must be caught or declared to be thrown