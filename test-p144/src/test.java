
class Employee{
    private String name;
    private int  month;
    public Employee(String name,int month)//构造方法
    {
        this.name=name;
        this.month=month;
    }
    double getSalary(int month){
        if(this.month==month)
            return 100;
        return 0;
    }
}

class SalariedEmployee extends Employee{
    private double salary;
    public SalariedEmployee(String name, int month, float salary)//构造方法
    {
        super(name, month);
        this.salary = salary;
    }
    //计算薪资
    double getSalary(int month){
        return salary+super.getSalary(month);
    }
}

class HourlyEmployee extends Employee{
    private double Hours;
    private double Sala;
    public HourlyEmployee(String name,int month,double Hours,double Sala){
       super(name,month);
       this.Hours= Hours;
       this.Sala=Sala;
    }
    public double getSalary(int month)
    {
        //判断是否超过160个小时
        if(Hours>160)
            return Sala*160+(Hours-160)*Sala*1.5+super.getSalary(month);
        else
            return Hours*Sala+super.getSalary(month);
    }
}

class SalesEmployee extends Employee{
    private double sales;//月销售额
    private double percent;
    public SalesEmployee(String name,int month,double sales,double percent)
    {
        super(name,month);//调用父类构造
        this.sales=sales;
        this.percent=percent;
    }
    double getSalary(int month)
        {
            return sales * percent + super.getSalary(month);
        }
}
class BasedPlusSalesEmployee extends SalesEmployee{
    private  double basesalary;
    public BasedPlusSalesEmployee(String name, int month, double sales, double percent, double basesalary)
    {
        super(name, month, sales, percent);
        this.basesalary = basesalary;
    }
    public double getSalary(int month)
    {
        return basesalary +super.getSalary(month);
    }
}
public class test {
    public static void main(String[] args) {
        Employee a[] = new Employee[4];
        a[0] = new SalariedEmployee("A", 5, 1005);
        a[1] = new HourlyEmployee("B", 12, 200, 14);
        a[2] = new SalesEmployee("C", 6, 5000, 0.5);
        a[3] = new BasedPlusSalesEmployee("D", 5, 5000, 0.2, 2000);
        System.out.println("A的工资为" + a[0].getSalary(5));
        System.out.println("B的工资为" + a[1].getSalary(5));
        System.out.println("C的工资为" + a[2].getSalary(5));
        System.out.println("D的工资为" + a[3].getSalary(5));
    }
}
