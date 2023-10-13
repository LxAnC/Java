class Animal{
    private String name;
    private int age;
    public final String COLOR="黑色";
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
}
class Dog extends Animal{

}
public class Example01 {
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.setName("牧羊犬");
        dog.setAge(3);
        System.out.println("名称:"+dog.getName()+",年龄:"+dog.getAge()+",颜色:"+dog.COLOR);
    }
}
