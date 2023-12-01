import java.util.*;
public class Example04 {
    public static void main(String[] args) {
        ArrayList list=new ArrayList();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        Iterator it=list.iterator();
        while(it.hasNext()){
            Object obj=it.next();
            if("张三".equals(obj)){
                list.remove(obj);
                break;
            }
        }
        System.out.println(list);
    }
}
