// 5장 실습문제 3번


import java.util.Scanner;

abstract class Converter {
    abstract protected double convert(double src);
    abstract protected String getSrcString();
    abstract protected String getDestString();
    protected double ratio;

    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(getSrcString() + "을 " + getDestString() + "로 바꿉니다.");
        System.out.print(getSrcString() + "을 입력하세요>> ");
        double val = scanner.nextDouble();
        double res = convert(val);
        System.out.println("반환 결과: " + res + getDestString() + "입니다");
        scanner.close();
    }
}

class Won2Dollar extends Converter {
    public Won2Dollar(double ratio) {
        this.ratio = ratio;
    }

    protected double convert(double src) {
        return src / ratio;
    }

    protected String getSrcString() {
        return "원";
    }

    protected String getDestString() {
        return "달러";
    }
}

public class Example_5_3 {
    public static void main(String[] args) {
        Won2Dollar toDollar = new Won2Dollar(1200);
        toDollar.run();
    }
}
