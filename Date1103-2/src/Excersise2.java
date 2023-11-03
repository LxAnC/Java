class Dog{
    private String Name;
    private Double weight;
    public  static Double TotalWeight=0.0;
    Dog(String name,Double Weight){
        this.Name=name;
        this.weight=Weight;
        TotalWeight+=Weight;
    }
    public static void Avgweight(){
    Double s=TotalWeight;
        System.out.println("平均的体重是:"+s/4);
    }
    public void MaxDog(Dog d1,Dog d2,Dog d3,Dog d4){
        if(d1.weight>d2.weight&&d1.weight>d3.weight&&d1.weight>d4.weight)
            System.out.println("最大的狗是:"+d1.Name);
        else if(d2.weight>d1.weight&&d2.weight>d3.weight&&d2.weight>d4.weight)
            System.out.println("最大的狗是:"+d2.Name);
        else if(d3.weight>d1.weight&&d3.weight>d2.weight&&d3.weight>d4.weight)
            System.out.println("最大的狗是:"+d3.Name);
        else
            System.out.println("最大的狗是:"+d4.Name);
    }
    public void MinDog(Dog d1,Dog d2,Dog d3,Dog d4){
        if(d1.weight<d2.weight&&d1.weight<d3.weight&&d1.weight<d4.weight)
            System.out.println("最小的狗是:"+d1.Name);
        else if(d2.weight<d1.weight&&d2.weight<d3.weight&&d2.weight<d4.weight)
            System.out.println("最小的狗是:"+d2.Name);
        else if(d3.weight<d1.weight&&d3.weight<d2.weight&&d3.weight<d4.weight)
            System.out.println("最小的狗是:"+d3.Name);
        else
            System.out.println("最小的狗是:"+d4.Name);
    }
    public static void FindDog(Dog d1, Dog d2, Dog d3, Dog d4, String args){
        if(args.equals(d1.Name))
            System.out.println(d1.weight);
        else if(args.equals(d2.Name))
            System.out.println(d2.weight);
        else if(args.equals(d3.Name))
            System.out.println(d3.weight);
        else if(args.equals(d4.Name))
            System.out.println(d4.weight);
        else
            System.out.println("输入错误");
    }

}
public class Excersise2 {
    public static void main(String[] args) {
        Dog d1=new Dog("花花",4.5);
        Dog d2=new Dog("白白",5.6);
        Dog d3=new Dog("黑黑",78.0);
        Dog d4=new Dog("红红",9.0);
        d1.MaxDog(d1,d2,d3,d4);
        d1.MinDog(d1,d2,d3,d4);
        Dog.Avgweight();
        Dog.FindDog(d1,d2,d3,d4,args[0]);
    }
}
