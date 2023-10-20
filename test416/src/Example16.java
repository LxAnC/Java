//定义Animal类
class Animal{
    public void shout(){
        System.out.println("喵喵-----");
    }
}
//定义Dog类
class Dog extends Animal{
    //重写shout()方法
    public void shout(){
        System.out.println("汪汪-----");
    }
    public void eat(){
        System.out.println("吃骨头-----");
    }
}
//定义测试类
public class Example16 {
    public static void main(String[] args) {
        Animal an=new Dog();
        Dog dog=(Dog)an;
        dog.shout();
        dog.eat();
    }

}
