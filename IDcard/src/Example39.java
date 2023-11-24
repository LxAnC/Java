import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example39 {
    public static void main(String[] args) {
        // 匹配身份证号（18位）
        Pattern p =Pattern.compile( "\\d{17}[0-9Xx]");
        // 匹配车牌号（格式可根据实际情况调整）
        Pattern p2 =Pattern.compile("[\\u4e00-\\u9fa5]{1}[A-Z]{1}[A-Z_0-9]{5}" ); ;
        // 测试身份证号
        Matcher  m1 =p.matcher( "500114200407060215");
        System.out.println("身份证号匹配结果：" + m1.matches());

        // 测试车牌号
        Matcher m2 = p2.matcher("京A12345");
        System.out.println("车牌号匹配结果：" + m2.matches());
    }


}