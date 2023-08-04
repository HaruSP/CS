interface Animal{
    public void eat();
}
class Person implements Animal{
    @Override
    public void eat(){
        System.out.println("사람처럼 먹습니다.");
    }
}
public class MyClass {
    public static void main(String[] args) {
        Person a = new Person();
        a.eat();
    }
}