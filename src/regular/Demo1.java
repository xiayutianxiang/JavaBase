package regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 测试字符串是否都是数字
 */
public class Demo1 {
    public static void main(String[] args) {
        /*String str = "1234 56 ";
        boolean digit2 = isDigit2(str);
        System.out.println(str.trim()+ " " + str.trim().length());
        System.out.println(digit2);*/
        /*String str2 = "igfAUHjfklasdnasdsfhuh";
        System.out.println(isDigit3(str2));*/
        String str3 = "QBFC12sdasdas";
        //str3.equals()
        /*if(checkVinIsLegitimate(str3)){
            System.out.println("字符串合法"+str3.length());
        }else {
            System.out.println("字符串不合法"+str3.length());
        }*/
       //System.out.println(str3.contains("Q"));
        Integer.toString(135,7);
        Integer i1 = 40;
        Integer i2 = new Integer(40);
        System.out.println(i1==i2);
        System.out.println(i1.equals(i2));
    }

    /**
     * 检测vin码是否合法
     */
    private static boolean checkVinIsLegitimate(String vinStr) {
        if (vinStr.length() < 11 || vinStr.length() > 17) {
            return false;
        } else if (vinStr.contains("I") || vinStr.contains("O") || vinStr.contains("Q")) {
            return false;
        } else if (isDigitNum(vinStr) || isDigitEn(vinStr) || specialCharacters(vinStr)) {
            return false;
        }else {
            return true;
        }
    }

    //判断一个字符串是否都为数字
    public static boolean isDigitNum(String strNum) {
        Pattern pattern = Pattern.compile("[0-9]{1,}");
        Matcher matcher = pattern.matcher((CharSequence) strNum);
        return matcher.matches();
    }

    //判断一个字符串是否都为英文字符
    public static boolean isDigitEn(String strNum) {
        Pattern pattern = Pattern.compile("[a-zA-Z]+");
        Matcher matcher = pattern.matcher((CharSequence) strNum);
        return matcher.matches();
    }
    /*
     * 判断字符串中是否有特殊字符
     * 有返回true 没有false
     *
     * */
    public static boolean specialCharacters(String stb) {
        String regEx = "[ _`~!@#$%^&*()+=|{}':;',\\[\\].<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。，、？]|\n|\r|\t";
        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(stb);
        //System.out.println(m.find());
        return m.find();
    }
}
