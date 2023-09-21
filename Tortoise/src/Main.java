class Tor{
    int sed=0;//已经走过的路程
    int v=4;//乌龟的速度
}
class zuoye{
    public static void main(String[] args){
        int i;
        Tor T1=new Tor();
        for(i=1;true;i++){
            T1.sed+=4;
            if(T1.sed>=100) //每往前面爬4米判断,是否达到路程
                break;
            T1.sed-=1;
            //验证语句
            //System.out.print(i+"小时:");
            //System.out.println("乌龟爬了"+T1.sed+"米");
        }
        System.out.println("乌龟爬完用了"+i+"小时");
    }
}