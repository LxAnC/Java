class Student {
    private String name;
    private int age;
    public Student (){
        System.out.println("调用了无参构造方法");
    }
    public Student(String name,int age){
        this();
        this.name=name;
        this.age=age;
    }
    public String read(){
        return "我是:"+name+",年龄:"+age;
    }
}
public class Example11 {
    public static void main(String[] args) {
        Student stu=new Student("张三",18);
        System.out.println(stu.read());

    }
}
