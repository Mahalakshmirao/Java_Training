package practice2;
interface  Work{
    void run();
    default void fun(){
    System.out.println("he is smiling");}
}

  class interfaceuse implements Work{
    public void run(){
        System.out.println("it is running");
    }
    public static  void main(String[] args){
        interfaceuse ic=new interfaceuse();
        ic.run();;
        ic.fun();


    }


}
