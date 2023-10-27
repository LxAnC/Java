interface Animal{
    public String NAME="牧羊犬";
    public void info();
}
interface Color{
    public void black();
}
interface Action extends Animal,Color{
    public void shout();
}
class Dog implements Action{
    public void info(){
        System.out.println("名称:"+NAME);
    }
    public void black(){
        System.out.println("黑色");
    }
    public void shout(){
        System.out.println("汪汪-----");
    }

}
public class Example13 {
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.info();
        dog.shout();
        dog.black();
    }
}
