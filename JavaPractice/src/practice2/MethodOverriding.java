package practice2;

class Bank{
    int getRateOfInterest(){
        return 0;
    }


}
class SBI{
    int getRateOfInterest(){
        return 7;

    }
}

class HDFC{
    int getRateOfInterest(){
        return 9;
    }
}

public class MethodOverriding {
    public static void main(String [] args){
        SBI s=new SBI();
        System.out.println("SBI offers " +s.getRateOfInterest()+"% interest");
        HDFC h=new HDFC();
        System.out.println("HDFC offers  "+h.getRateOfInterest()+" % interst");
    }
}
