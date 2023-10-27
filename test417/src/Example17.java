//定义Animal类
class Animal{
    public void shout(){
        System.out.println("动物叫-----");
    }
}
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
public class Example17 {
    public static void main(String[] args) {
        Animal a1=new Dog();
        System.out.println("Animal a1=new DOg():"+(a1 instanceof Animal));
        System.out.println("Animal a1=new DOg():"+(a1 instanceof Dog));
        Animal a2=new Animal();
        System.out.println("Animal a2=new DOg():"+(a2 instanceof Animal));
        System.out.println("Animal a2=new DOg():"+(a2 instanceof Dog));


    }
}
