package practice2;
class Animal{
    void eat(){
        System.out.println("Animal is eating");
    }
}
class Dog extends Animal{
    void eat(){
        System.out.println("dog is eating");}
        void barking(){
            System.out.println("it is barking");
        }
        void work(){
        super.eat();
        barking();

        }
    }



public class SuperKeyword {
    public static void main(String[] args) {
        Dog one = new Dog();
        one.work();
    }

}
