//定义接口
interface Animal{
    int ID=1;   //定义全局常量,编号
    String NAME="牧羊犬";//定义全局常量,名称
    void shout();//定义抽象方法shout()
    public void info();//定义抽象方法info()
    static int getID(){//定义静态方法getID(),用于返回ID值
        return Animal.ID;
    }
}
interface Action{
    public void eat();//定义抽象方法eat()
}
//定义Dog类实现Animal接口和Action接口
class Dog implements Animal,Action{
    //重写Action接口中的eat()方法
    public void eat(){
        System.out.println("喜欢吃骨头");
    }
    //重写Animal接口中的抽象方法shout()
    public void shout() {
        System.out.println("汪汪------");
    }

    public void info() {
        System.out.println("名称:"+NAME);
    }
}
//定义测试类
public class Example11 {
    public static void main(String[] args) {
        System.out.println("编号" + Animal.getID());
        Dog dog = new Dog();//创建Dog类的实例对象
        dog.info();//调用Dog类中重写的info()方法
        dog.shout();//调用Dog类中重写的shout()方法
        dog.eat();//调用Dog类中重写的eat()方法
    }
}
