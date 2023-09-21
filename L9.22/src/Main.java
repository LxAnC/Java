class Student {
    String school;
    String name;
    int age;
    void setName(String n){
    name=n;
    }
    void setSchool(String n){
        school=n;
    }
    void setAge(int n){
        age=n;
    }
    String getname(){
        return name;
    }
    String getschool(){
        return school;
    }
    int  getage(){
        return age;
    }
}
class Example03{
    public static void main(String[] args){
        Student s1=new Student();//创建学生对象1
        Student s2=new Student();//创建学生对象2
        s1.setAge(18);
        s1.setName("小明同学");
        s1.setSchool("重庆师范大学");
        s2.setAge(26);
        s2.setName("小李同学");
        s2.setSchool("重庆师范大学");
        System.out.println("以下是打印的学生信息");
        //第一个学生信息
        System.out.println("姓名:"+s1.getname()+" 年龄:"+s1.getage()+" 目前在读"+s1.getschool());
        //第二个学生信息
        System.out.println("姓名:"+s2.getname()+" 年龄:"+s2.getage()+" 目前在读"+s2.getschool());
    }
}