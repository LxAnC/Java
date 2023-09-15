public class Main {
    public static void main(String[] args) {
        //计算1-99的累加和
        int i=1,s=0;
        for (i=1;i<=99;i++)
        {
            if(i%2==1)
                s=s+i;
        }
        System.out.println("1-99的奇数和为"+s);
    }
}