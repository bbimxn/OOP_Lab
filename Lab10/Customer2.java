
import java.util.ArrayList;

public class Customer2 {
    private String firstName;
    private String lastName;
    private ArrayList acct;
    private int numOfAccount;
    
    public Customer2(){
        this.firstName = "";
        this.lastName = "";
        acct = new ArrayList();
        this.numOfAccount = 0;
    }
    
    public Customer2(String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        acct = new ArrayList();
        this.numOfAccount = 0;
    }
    
    public void addAccount(Account acct){
        this.acct.add(acct);
        numOfAccount++;
    }
    
    public Account getAccount(int index){
        return (Account) acct.get(index);
    }
    
    public int getNumOfAccount(){
        return acct.size() ;
    }
    
    @Override
    public String toString(){
        return firstName +" "+ lastName +" has "+numOfAccount+" account.";
    }
}