package practice2;

class AccountBalance{

    int accountNo;
    String name;
    float salary;
    void insert(int a, String n,float s){
        accountNo=a;
        name=n;
        salary=s;
    }
    void deposit(int amount){
        salary=salary+amount;
        System.out.println(salary+"deposited");
    }
    void withdraw(int amount){
        if (salary<amount){
            System.out.println("insufficient balance");
        }
        else{
            salary=salary-amount;
            System.out.println(amount+"withdrawn");


        }

    }
    void checkBalance(){
        System.out.println("balance is"+ salary);
    }



}
class BankAccount{
    public static  void main(String[] args){
        AccountBalance AB=new AccountBalance();
        AB.insert(6247577,"mahesh",50000);
        AB.checkBalance();
        AB.deposit(10000);
        AB.checkBalance();
        AB.withdraw(5000);
        AB.checkBalance();

    }

}
