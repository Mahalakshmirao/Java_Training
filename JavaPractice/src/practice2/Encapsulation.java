package practice2;

class Account{
    private long acc_no;
    private String name;
    private float amount;

    public long getAcc_no(){
        return acc_no;

    }
    public void setAcc_no(long acc_no){
        this.acc_no=acc_no;
    }
    public String getName(){
        return name;

    }
    public void setName(String name){
        this.name=name;
    }
    public float getAmount(){
        return amount;
    }
    public void setAmount(float amount){
        this.amount=amount;
    }
}

public class Encapsulation {
    public static void main(String[] args){
        Account acc=new Account();
        acc.setAcc_no(7899999);
        acc.setName("mahesh");
        acc.setAmount(60000);
        System.out.println(acc.getAcc_no()+"   "+acc.getName()+"   "+ acc.getAmount());
    }
}
