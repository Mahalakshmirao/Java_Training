public class Loops{
    public static void main(String[] args){
        //for loop
        int n=10;
        for(int i=0;i<=n;i++){
            System.out.println(i);

        }





        //whileloop

        int i=0;
        while(i<=n){
            System.out.println(i);
            i++;
        }


        //basic programs palindrome number
        int number=121;
        int impNumber=number;
        int reverse=0;

        while(number>0){
            int remainder=number%10;
            reverse=reverse*10+remainder;
            number/=10;

        }
        if (impNumber==reverse){
            System.out.println(impNumber+"    it is palindrome number");

        }
        else{
            System.out.println(impNumber+"   it is not a palindromenumber");
        }




    }
}
