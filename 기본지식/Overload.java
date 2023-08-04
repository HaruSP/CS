package CS.기본지식;

class  Calcuator{
    void multiply(int a, int b){
        System.out.println("결과는 : "+(a * b) + "입니다.");
    }
    void multiply(int a, int b, int c){
        System.out.println("결과는 : "+(a * b * c) + "입니다.");
    }
    void multiply(double a, double b){
        System.out.println("결과는 : "+(a * b) + "입니다.");
    }
}
public class MyClass {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int d = 4;
        Calcuator c = new Calcuator();
        c.multiply(a, b);
        c.multiply(a, b, d);
        double aa  = 1.2;
        double bb  = 1.4;
        c.multiply(aa, bb);
    }
}