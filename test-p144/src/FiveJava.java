import java.time.Month;
//定义父类Employee
class Employee{
    private String name;
    private int  month;
    public Employee(String name,int month)//父类构造方法
    {
        this.name=name;
        this.month=month;
    }
    //计算是否当前月为员工生日月份,可以加100
    double getSalary(int month){
        if(this.month==month)
            return 100;//直接输出
        else
            return 0;//输出
    }
}
//定义固定工资类的员工子类
class SalariedEmployee extends Employee{
    private double salary;
    public SalariedEmployee(String name, int month, float salary)//构造方法
    {
        super(name, month);//首先必须调用父类构造
        this.salary = salary;
    }
    //计算薪资
    double getSalary(int month){
        return salary+super.getSalary(month);
    }
}
//定义小时工的员工子类
class HourlyEmployee extends Employee{
    private double MonthHours;//一个月干了多少小时
    private double OneHourSala;//一小时多少薪资
    public HourlyEmployee(String name,int month,double MonthHours,double OneHourSala){
       super(name,month);//调用父类构造方法
       this.MonthHours= MonthHours;
       this.OneHourSala=OneHourSala;
    }
    public double getSalary(int month)//计算薪资
    {
        //判断是否超过160个小时,需要按1.5倍工资计算
        if(MonthHours>160)
            return OneHourSala*160+(MonthHours-160)*OneHourSala*1.5+super.getSalary(month);
        else
            return MonthHours*OneHourSala+super.getSalary(month);
    }
}
//定义销售人员的员工类
class SalesEmployee extends Employee{
    private double monthsales;//月销售额
    private double Ticheng;//以及他的提成率
    public SalesEmployee(String name,int month,double monthsales,double Ticheng)
    {
        super(name,month);//调用父类构造
        this.monthsales=monthsales;
        this.Ticheng=Ticheng;
    }
    //计算薪资
    double getSalary(int month)
        {
            return monthsales * Ticheng + super.getSalary(month);//销售额乘提成率为提成再判断是否为生日月份
        }
}
//定义固定底薪的员工子类
class BasedPlusSalesEmployee extends SalesEmployee{
    private  double disala;
    public BasedPlusSalesEmployee(String name, int month, double monthsales, double Ticheng, double disala)
    {
        super(name, month, monthsales, Ticheng);//调用父类的构造
        this.disala = disala;//赋值底薪
    }
    //计算薪资
    public double getSalary(int month)
    {
        return disala +super.getSalary(month);
    }
}
//测试
public class FiveJava {
    public static void main(String[] args) {
        Employee a[] = new Employee[4];
        //固定工资员工
        a[0] = new SalariedEmployee("小张", 2, 5000);
        //小时工工资
        a[1] = new HourlyEmployee("小马", 3, 165, 20);
        //销售人员的工资
        a[2] = new SalesEmployee("小杨", 4, 300, 0.1);
        //固定底薪员工
        a[3] = new BasedPlusSalesEmployee("小李", 5, 500, 0.1, 1000);
        //分别打印输出
        System.out.println("小张的工资为" + a[0].getSalary(2));
        System.out.println("小马的工资为" + a[1].getSalary(2));
        System.out.println("小杨的工资为" + a[2].getSalary(2));
        System.out.println("小李的工资为" + a[3].getSalary(2));
    }
}
