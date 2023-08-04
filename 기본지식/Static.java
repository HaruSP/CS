package CS.기본지식;
public class Person {
    // 멤버변수(속성)
    String name;
    int IQ;
    int str;
    private static final String GUDOC = "큰돌의 터전";
    // constructor
    public Person(String name, int IQ, int str){
        this.name = name;
        this.IQ = IQ;
        this.str = str;
    }
    public Person(){
        this.name = "alanwalker";
        this.IQ = 100;
        this.str = 100;
    }
    // 메서드
    public void levelup(){
        this.IQ = this.IQ + 1;
        this.str = this.str + 1;
        System.out.println(this.name + "의 지능과 힘이 증가했습니다!" + this.IQ + " / " + this.str);
    }
// static 사용하지 않을 시,
// public void talk(Person a, Person b){
//      System.out.println(a.name + " & " + b.name + "이 대화를 시작했다!");
// }
//     public static void main(String[] args) {
//         Person a = new Person(); // 객체 >> 인스턴스
//         a.levelup();
//         Person b; // 객체
//         b = new Person("큰돌", 1000, 1); // 인스턴스
//         b.levelup();
//         b.talk(b, a); 
//         System.out.println(Person.GUDOC);
//     }
// }
// static 사용시, 명시성 있는것을 확인, 메모리 효율성도 좋음
    private static void talk(Person a, Person b){
    System.out.println(a.name + " & " + b.name + "이 대화를 시작했다!");
    }
    public static void main(String[] args) {
        Person a = new Person(); // 객체 >> 인스턴스
        a.levelup();
        Person b; // 객체
        b = new Person("큰돌", 1000, 1); // 인스턴스
        b.levelup();
        Person.talk(a, b); // b의 특정한 메서드가 아닌 Person 끼리 대화하는 메서드라는 명시성을 지니게 됨
        System.out.println(Person.GUDOC);
    }
}