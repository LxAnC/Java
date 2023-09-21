
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //p38 2-1
        int num=4;
        //修改前:byte b=num;无法正常运行,原因:int转到byte可能会有损失
        //修改后:
        byte b=(byte)num;
        System.out.println(b);
        System.out.println("----------------------------");
        //p39 2-2
        byte a;
        int c=298;
        a=(byte) c;
        System.out.println("b="+b);
        System.out.println("a="+a); //显示结果为-42是因为int本身范围过大,byte类型范围为-128-127所以范围超出,因此显示此错误值
        System.out.println("----------------------------");
        //p41 2-4
        int x=12;
        {
            int y=96;
            System.out.println("x is "+x);
            System.out.println("y is "+y);
            // 修改前:y=x;无法正常运行 原因:y的作用域仅限在花括号里,所以出了花括号无法识别
            //把y=x放进花括号即可
            y=x;
        }

        System.out.println("x is "+x);
    }
}