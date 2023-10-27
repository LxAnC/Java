//定义抽象类
abstract class Animal{
    //定义抽象方法shout()
    abstract void shout();
}
//定义dog类继承抽象类Animal
class Dog extends Animal{
    //重写抽象方法shout()
    void shout(){
        System.out.println("汪汪------");
    }

}
//定义测试类
public class Example10 {
    public static void main(String[] args) {
        Dog dog=new Dog();//创建Dog类的对象
        dog.shout();//通过Dog对象调用shout()方法
    }
}
