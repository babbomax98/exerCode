package testone13.exer;

/**

 */
public class InterviewTest1 {
    public static void main(String[] args) {

    }

}

class Base1{
    public void add(int a,int...arr){
        System.out.println("base1");
    }
}
class Sub1 extends Base1{
    public void add(int a,int[] arr){
        System.out.println("sub_1");
    }
    public void add(int a,int b,int c){
        System.out.println("sub_2");
    }
}
