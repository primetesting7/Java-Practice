package src;

/**
 * Created by Jay Vaghani on 30/03/2019.
 */
public class JavaVariablePractice {
    int a =10;
    String myName ="Prime";
    static int b =20;

    public JavaVariablePractice() {
    }

    public static void main(String[] args) {
        JavaVariablePractice jv = new JavaVariablePractice();
        int add = jv.test4(10, 20, 30);
        System.out.println(add);
        System.out.println(jv.test4(20,30, 40));
    }

    public void test(){
        System.out.println(a);
        System.out.println(myName);
        System.out.println(JavaVariablePractice.b);
    }

    public static void test2(){
        JavaVariablePractice javaVariablePractice = new JavaVariablePractice();
        System.out.println(javaVariablePractice.a);
        System.out.println(javaVariablePractice.myName);
        System.out.println(b);
    }

    public void test3(int a, int b){
        System.out.println(a+b);
    }

    public int test4(int d, int b, int c){
        int sum = a+b+c;
        return sum;
    }
}
