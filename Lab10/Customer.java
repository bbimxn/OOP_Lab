public class Customer {
    private String firstName;
    private String lastName;
    private Account[] acct;
    private int numOfAccount;
    
    public Customer(){
        this.firstName = "";
        this.lastName = "";
        acct = new Account[5];
        this.numOfAccount = 0;
    }
    
    public Customer(String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        acct = new Account[5];
        this.numOfAccount = 0;
    }
    
    public void addAccount(Account acct){
        this.acct[numOfAccount] = acct;
        numOfAccount++;
    }
    
    public Account getAccount(int index){
        return acct[index];
    }
    
    public int getNumOfAccount(){
        return numOfAccount ;
    }
    
    @Override
    public String toString(){
        return firstName +" "+ lastName +" has "+numOfAccount+" account.";
    }
}