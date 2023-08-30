import java.util.Scanner;

public class Conditions {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int marks=scanner.nextInt();
        char grade;
        if (marks>=90){
            grade='A';

        }
        else if(marks>=80){
            grade='B';
        }
        else if (marks >= 70) {
            grade = 'C';
        } else if (marks>= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("grade "+  grade);






        //basic programs prime number
        int number=scanner.nextInt();
        boolean isPrime=true;

        if(number<=1){
            isPrime=false;
        }
        else{
            for(int i=2;i<=Math.sqrt(number);i++){
                if(number%i==0){
                    isPrime=false;
                    break;
                }
                if (isPrime){
                    System.out.println(number+"it is prime");

                }
                else{
                    System.out.println(number+ "  it is not prime");
                }
            }
        }

        //switch statements
        int day=scanner.nextInt();
        switch(day){
            case 1:
                System.out.println("its monday");
                break;


            case 2:
                System.out.println("its tuesday");
                break;

            case 3:
                System.out.println("its wednesday");
            case 4:
                System.out.println("its thursday");
                break;


            case 5:
                System.out.println("it is friday");
                break;

            case 6:
                System.out.println("its saturday");
                break;

            case 7:
                System.out.println("its sunday");
                break;


            default:
                System.out.println("invalid day");
        }


    }
}
