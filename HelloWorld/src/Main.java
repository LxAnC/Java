//第二次上机实验JAVA
public class Main {
    public static void main(String[] args) {
        //计算1-99的累加和
        int i=1,s=0;  //初始化变量
        for (i=1;i<=99;i++) //建立循环语句,遍历1-99的自然数
        {
            if(i%2==1)//在这里使用if语句判断是否为奇数,如为奇数则加,反之
                s=s+i; //将i累加至s中统计
        }
        System.out.println("1-99的奇数和为"+s); //最后输出结果
    }
}