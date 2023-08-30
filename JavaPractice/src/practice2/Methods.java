package practice2;

public class Methods {
    int num=4;
    public static void main(String[] args){
        findoddEven(7);

    }
    public static void findoddEven(int num){
        if (num%2==0)
            System.out.println("it is even");
        else
            System.out.println("it is odd");
    }


}
