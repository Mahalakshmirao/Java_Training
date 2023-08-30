package practice2;

class Students{
    int rollno;
    String name;
    float fee;

    Students(int rollno,String name,float fee){
        this.rollno=rollno;
        this.name=name;
        this.fee=fee;


    }
    void display(){
        System.out.println(rollno+" "+name+"  "+fee);
    }
}
public class This {
    public static void main(String[] args){
        Students s1=new Students(1,"mahesh",30000);
        Students s2=new Students(2,"vamsiba",25000);
        s1.display();
        s2.display();
    }
}

//method overloading
