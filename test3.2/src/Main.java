class StudentGrade{
    static int snum=0;//定义全班总人数
    static double SystemGradenum=0;//定义全班的操作系统成绩
    static double EnglishGradenum=0;//定义全班的英语成绩
    String sid;
    String sname;
    double SystemGrade;
    double EnglishGrade;
    //定义输出学生信息的方法,方便统计与观察
    void OutputInfo(){
        System.out.println("学号:"+sid+" 姓名:"+sname+" 英语:"+EnglishGrade+" 操作系统:"+SystemGrade);
    }
    //定义成员方法 实现输出学生两门课的平均成绩
    void AverageGrade2(){
        System.out.println("该学生两门课的平均成绩是:"+(SystemGrade+EnglishGrade)/2);
    }
    //定义方法实现输出全班每门课的平均成绩
    static void AllaveSysGrade(){
        System.out.println("全班英语平均成绩:"+EnglishGradenum/snum);
        System.out.println("全班操作系统平均成绩:"+SystemGradenum/snum);
    }
    //定义构造方法,使得每次创建对象时全班人数加1,成绩每一个同学的存储到对应的总成绩
    public StudentGrade(String a,String b,double c,double d){
        sid=a;
        sname=b;
        SystemGrade=c;
        EnglishGrade=d;
        snum+=1;
        SystemGradenum+=c;
        EnglishGradenum+=d;
    }

}
public class Main {
    public static void main(String[] args) {
    StudentGrade s1=new StudentGrade("2010","qq",89,93);
    StudentGrade s2=new StudentGrade("2011","wx",90,94);
    //输出学生两门课的平均成绩
    s1.AverageGrade2();
    //输出全班每门课的平均成绩
    StudentGrade.AllaveSysGrade();
    //输出学生信息
    s1.OutputInfo();
    s2.OutputInfo();
    }
}