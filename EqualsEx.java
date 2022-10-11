/*예제 6-3 : Point 클래스에 equals() 작성*/
//Point 클래스에 두 점의 좌표가 같으면 true를 리턴하는 equals()를 작성하라

class PointEquals {
    int x, y;
    public PointEquals(int x, int y) {
        this.x = x; this.y = y;
    }
    public boolean equals(Object obj) {
    	PointEquals p = (PointEquals)obj;
        if(x == p.x && y == p.y) return true;
        else return false;
    }
}

public class EqualsEx {
    public static void main(String[] args) {
    	PointEquals a = new PointEquals(2,3);
    	PointEquals b = new PointEquals(2,3);
    	PointEquals c = new PointEquals(3,4);
        if(a == b) // false
            System.out.println("a==b");
        if(a.equals(b)) // true
            System.out.println("a is equal to b");
        if(a.equals(c)) // false
            System.out.println("a is equal to c");
    }
}
