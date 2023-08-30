package practice2;
class Student{
    int id;
    String name;
    float salary;
    void insert(int i,String n,float s){
        id=i;
        name=n;
        salary=s;

    }
    void display(){
        System.out.println(id+"  "+name+"  "+salary);
    }

}
public class ClassAndObjects {
    public static void main(String[] args){
        Student s1=new Student();
        Student s2=new Student();
        Student s3=new Student();
        s1.insert(1,"mahi",25000);
        s2.insert(2,"kiran",30000);
        s3.insert(3,"ram",45000);
        s1.display();
        s2.display();
        s3.display();


    }
}