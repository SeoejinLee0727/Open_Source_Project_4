/*예제 5-4 : instanceof 연산자 활용*/
//instanceof 연산자를 이용하여 상속 관계에 따라 레퍼런스가 가리키는객체의 타입을 알아본다.
//실행 결과는 무엇인가?

class Person2 { }
class Student2 extends Person2 { }
class Researcher extends Person2 { }
class Professor extends Researcher { }
public class InstanceOfEx {
    static void print(Person2 p) {
        if(p instanceof Person2)
            System.out.print("Person2 ");
        if(p instanceof Student2)
            System.out.print("Student2 ");
        if(p instanceof Researcher)
            System.out.print("Researcher ");
        if(p instanceof Professor)
            System.out.print("Professor ");
        System.out.println();
    }
    public static void main(String[] args) {
        System.out.print("new Student() ->\t"); print(new Student2());
        System.out.print("new Researcher() ->\t"); print(new Researcher());
        System.out.print("new Professor() ->\t"); print(new Professor());
    }
}

//new Student() -> Person Student
//new Researcher() -> Person Researcher
//new Professor() -> Person Researcher Professor