class Student{
    String name;
    int age;
    String gender;
    String phone;
    String adress;
    String email;
    void setterName(String a)
    {
        name=a;
    }
    void setterAge(int a)
    {
        age=a;
    }
    void setterGender(String a)
    {
        gender=a;
    }
    void setterPhone(String a)
    {
        phone=a;
    }
    void setterAdress(String a)
    {
        adress=a;
    }
    void setterEmail(String a)
    {
        email=a;
    }

    void getterName()
    {
        System.out.println("Name="+name);
    }
    void getterAge()
    {
        System.out.println("Age="+age);
    }
    void getterGender()
    {
        System.out.println("Gender="+gender);
    }
    void getterPhone()
    {
        System.out.println("Phone="+phone);
    }
    void getterAdress()
    {
        System.out.println("Adress="+adress);
    }
    void getterEmail()
    {
        System.out.println("email="+email);
    }

    void Eat(){
        System.out.println("学生正在拿着勺子吃饭");
    }
    void Drink(){
        System.out.println("学生正在拿着杯子喝水");
    }
    void Play(){
        System.out.println("学生正在玩游戏");
    }
    void Sleep(){
        System.out.println("学生去在床上睡觉");
    }
}
public class Main {
    public static void main(String[] args) {
        //创建一个对象,并使用成员变量的方法来赋值
        Student s1=new Student();
        s1.setterName("李华");
        s1.setterAge(18);
        s1.setterGender("男");
        s1.setterPhone("130656569898");
        s1.setterAdress("重庆师范大学嘉风苑");
        s1.setterEmail("5001363@qq.com");
        //描述吃喝玩睡的方法
        s1.Play();
        s1.Drink();
        s1.Eat();
        s1.Sleep();
        //取出对象的静态属性
        s1.getterName();
        s1.getterAge();
        s1.getterGender();
        s1.getterPhone();
        s1.getterAdress();
        s1.getterEmail();
    }
}