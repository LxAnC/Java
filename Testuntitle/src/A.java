class Dog{
    public String name;
    Dog(String name){
        this.name=name;
    }
}
public class A{
    public static void main(String[] args) {
        Dog dog1=new Dog("xiaohuang");
        Dog dog2=new Dog("xiaohuang");
        String s1=dog1.toString();
        String s2=dog2.toString();
        String s3="xiaohuang";
        String s4="xiaohuang";
        System.out.println(s1.equals(s2));
            }
}