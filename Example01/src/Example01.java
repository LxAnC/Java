class Student {
    String name;
    void read(){
        System.out.println("大家好,我是"+name);
    }
}
public class Example01 {
    public static void main(String[] args){
        Student stu1=new Student();
        Student stu2=new Student();
        stu1.name="小明";
        stu1.read();
        stu2.name="李华";
        stu2.read();
    }
}