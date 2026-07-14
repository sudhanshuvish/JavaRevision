import java.util.ArrayList;
import java.util.List;

class InsufficientBalance extends Exception{
    public InsufficientBalance(String s){
        super(s);
    }
}

class AgeError extends Exception{
    public AgeError(String s){
        super(s);
    }
}

class AccountNotFound extends Exception{
    public AccountNotFound(String s){
        super(s);
    }
}

class Account{

    int accountNum;
    String customerName;
    int age;
    int balance;

    public int getAccountNum() {
        return accountNum;
    }

    public Account(int accountNum, String customerName, int age, int balance) {
        this.accountNum = accountNum;
        this.customerName = customerName;
        this.age = age;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNum=" + accountNum +
                ", customerName='" + customerName + '\'' +
                ", age=" + age +
                ", balance=" + balance +
                '}';
    }

    public void setAccountNum(int accountNum) {
        this.accountNum = accountNum;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}

class AccountService{

    public int showBalance(List<Account> ls, int accNo) throws AccountNotFound{
        int bal = 0;


        for(Account a : ls){
            if(a.getAccountNum() == accNo){
               bal = a.getBalance();
            }

        }
        if(bal == 0){
            throw new AccountNotFound("Account Not found");
        }

        return bal;
    }

    public void withdraw(int accNo, List<Account> ls) throws Exception{

        int age = 0;
        for(Account a: ls){
            if(a.getAge()>=18 && a.getAccountNum()==accNo) {
                System.out.println("Withdrawal Successfully!");
                age = a.getAge();
            }

        }
        if(age == 0){
            throw new AgeError("Age less than 18");
        }
    }

}

public class ExceptionHandlingAssignment {



    public static void main(String[] args) {

        List<Account> ls = new ArrayList<>();

        ls.add(new Account(101, "Tabitha", 39, 51000));
        ls.add(new Account(102, "Jade", 34, 910000));
        ls.add(new Account(103, "Ethan", 11, 1000));
        ls.add(new Account(104, "Boyd", 59, 94600));

        AccountService as = new AccountService();
        int bal = 0;

        try {
            bal = as.showBalance(ls, 104);
            System.out.println(bal);
            as.withdraw(104, ls);
        } catch (AccountNotFound e){
            System.out.println(e.getLocalizedMessage());
        } catch (AgeError e){
            System.out.println(e.getLocalizedMessage());
        } catch (Exception e){
            System.out.println(e.getLocalizedMessage());
        }


        //I am not sure about File Reader Simulation







    }
}
