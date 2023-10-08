class Resume{
    private String name;
    private String sex;
    private int age;
    public Resume(){}
    public Resume(String name,String sex,int age){
        this.name=name;
        this.sex=sex;
        this.age=age;
    }
    String GetName(){
        return name;
    }
    String GetSex(){
        return sex;
    }
    int GetAge(){
        return age;
    }
    void introduce(){
        System.out.println("姓名:"+name);
        System.out.println("性别:"+sex);
        System.out.println("年龄:"+age);
    }
}
public class Ex5 {
    public static void main(String[] args) {
        Resume r1=new Resume("李四","男",20);
        r1.introduce();
    }
}
