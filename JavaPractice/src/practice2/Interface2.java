package practice2;

interface Drawble{
    void draw();
    static int cube(int x){
        return x*x*x;
    }
}
class Rectangle1 implements Drawble{
    public void draw(){
        System.out.println("drawing rectangle");
    }
}
class Interface2{
    public static void main(String[] args){
        Rectangle1 d=new Rectangle1();
        d.draw();
        System.out.println(Drawble.cube(7));

    }}
