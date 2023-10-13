class Animal{
    private String name;
    private int age;
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
    private String color;
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color=color;
    }
}

public class Example02 {
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.setName("牧羊犬");
        dog.setAge(3);
        dog.setColor("黑色");
        System.out.println("名称:"+dog.getName()+",年龄:"+dog.getAge()+",颜色:"+dog.getColor());
    }
}
