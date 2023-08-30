class MethodOverloading{


        void sum(int a, int b){
            System.out.println(a+b);

        }
        void sum(int a,int b,int c){
            System.out.println(a+b+c);

        }
        void fun(int a,int b){
            System.out.println(a+b);


        }
        void fun(String name1,String name2){
            System.out.println(name1+" "+
                    name2);
        }
    public static  void main(String[] args){
            MethodOverloading Mo=new MethodOverloading();
            Mo.sum(11,34);
            Mo.sum(34,5,61);
            Mo.fun("andhra","telengana");
            Mo.fun(100,200);

    }


}