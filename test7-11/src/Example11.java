import java.util.TreeSet;
public class Example11 {
    public static void main(String[] args) {
        TreeSet ts=new TreeSet();
        ts.add(3);
        ts.add(29);
        ts.add(101);
        ts.add(21);
        System.out.println("创建的TreeSet集合为:"+ts);
        System.out.println("TreeSet集合的首元素为:"+ts.first());
        System.out.println("TreeSet集合的尾部元素为:"+ts.last());
        System.out.println("TreeSet集合中小于或等于9的最大元素为:"+ts.floor(9));
        System.out.println("TreeSet集合中大于10的最小元素为:"+ts.higher(10));
        System.out.println("TreeSet集合中大于100的最小元素为:"+ts.higher(100));
        Object first=ts.pollFirst();
        System.out.println("删除的第一个元素为:"+first);
        System.out.println("删除的第一个元素后集合变为:"+ts);



    }
}
