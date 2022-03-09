public class StringTest {

    private static int k=1;
    int a;
    int b;
    public static void main(String[] args) {
        String str1 = new String("abc");
        String str2 = "abc";
        /*System.out.println(str1==str2);
        System.out.println(str1.equals(str2));
        System.out.println(str1);*/
        String str3 = "yjkhigpwegjgkjgdghsdnbgj";
        //System.out.println(str3.substring(5));

        //System.out.println(str3.indexOf("jk"));
//        int result=0;
//        for(int i=0;i<=20;i++ ){
//            for(int j=0;j<=10;j++){
//                if(5*i+10*j+20*(100-i-j)==100){
//                    result++;
//                }
//            }
//        }
        StringTest stringTest = new StringTest();
        stringTest.a=2;
        stringTest.b=5;
        System.out.println(stringTest.a+stringTest.b);
    }
}
