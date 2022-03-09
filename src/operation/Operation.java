package operation;

public class Operation {

    public static void main(String[] args) {
        int a = 10;       //0000 1010
        int b = 5;        //0000 0101

        System.out.println(a & b);  //按位 与运算，输出0
        System.out.println(a | b);  //按位 或运算  输出15
        System.out.println(a ^ b);  //按位 亦或运算，相同为0，不同为1 输出 15
        System.out.println(~a);     //按位 取反运算，  0->1  1->0  输出 5

        int cur = 6;    //0000 0110
        System.out.println(~cur);   //1111 1001

        int A = 60;     //0011 1100
        int B = 13;     //0000 1101
        System.out.println(A ^ B);        //按位与运算，0011 0001   输出49
        System.out.println(~B);
    }
}
