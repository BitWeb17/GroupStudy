package JAVA_2021_01_07_Seventh;

class Triangle {
    float base;
    float height;

    public void setBase(float base) {
        this.base = base;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float Tri_extent() {
       return base * height * 0.5f;
    }
}

public class Quiz03_1 {
    public static void main(String[] args) {
        // 3) 클래스를 활용하여 삼각형의 넓이를 구하는 프로그램을 만들어보자!
        Triangle triangle = new Triangle();
        triangle.setBase(3.0f);
        triangle.setHeight(4.0f);
        System.out.printf("삼각형의 넓이는 = %f",triangle.Tri_extent());
        // 클래스 변수(인스턴스)를 통해서 내부에 있는 매서드 호출이 가능하다.
        // 사용방법은 . 을 입력해서 내부에 접근하겠음을 알린다.
    }
}
