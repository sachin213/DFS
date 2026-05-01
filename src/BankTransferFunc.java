import java.math.BigDecimal;

public class BankTransferFunc {
    public static void main(String[] args) {
        Account fromAcct = new Account("1",new BigDecimal("1000"));
        Account toAcct = new Account("2",new BigDecimal("2000"));
        new BankTransferFunc().transfer(fromAcct,toAcct,new BigDecimal("800"));
    }

    public void transfer(Account fromAccount,Account toAccount,BigDecimal amount){
           //case fromaccount has balance > amount
//           if(fromAccount.getBalance().compareTo(amount) < 0){
//               return;
//           }
            synchronized (fromAccount){
                synchronized (toAccount){
                    if(fromAccount.getBalance().compareTo(amount) < 0){
                        return;
                    }
                    BigDecimal subtractAmount = fromAccount.getBalance().subtract(amount);
                    fromAccount.setBalance(subtractAmount);

                    BigDecimal addAmount =  toAccount.getBalance().add(amount);
                    toAccount.setBalance(addAmount);
                }

            }
    }
}

class Account{
    public Account(String identifier, BigDecimal balance) {
        this.identifier = identifier;
        this.balance = balance;
    }

    String identifier;
    BigDecimal balance;

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}

