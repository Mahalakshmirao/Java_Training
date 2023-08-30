package practice2;
class Office{

    int id;
    String name;
    int age;
    Office(int i,String n){
        id=i;
        name=n;
    }
    Office(int i,String n,int a){
        id=i;
        name=n;
        age=a;
    }
    void display(){
        System.out.println(id+" "+name+" "+age);
    }

}
public class ConstructorOverLoading {
    public static void main(String[] args) {
        Office off = new Office(1, "krishna");
        Office off1 = new Office(2, "rama", 25);
        off.display();
        off1.display();
    }
}
