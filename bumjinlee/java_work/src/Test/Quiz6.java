package Test;

// 휴대폰은 전자제품임을 표현하는 코드 작성

class Electronicproducts {

    private String name;
    private String Rechargeable;

    public Electronicproducts(String name, String Rechargeable) {
        this.name = name;
        this.Rechargeable = Rechargeable;
    }

    public String getName() {
        return name;
    }

    public String Rechargeable() {
        return Rechargeable;
    }

    @Override
    public String toString() {
        return "Electronicproducts{" +
                "name='" + name + '\'' +
                ", Rechargeable=" + Rechargeable +
                '}';
    }
}

class Phon extends Electronicproducts {
    private String Phonefunction;

    public Phon(String name, String Rechargeable, String Phonefunction) {
        super(name, Rechargeable);
        this.Phonefunction = Phonefunction;
    }

    @Override
    public String toString() {

        return "Phon{" + "name='" + super.getName() +
                "', Rechargeable=" + super.Rechargeable() +
                ", Phonefunction='" + Phonefunction + '\'' +
                '}';
    }
}

public class Quiz6 {
    public static void main(String[] args) {

        Electronicproducts tv = new Electronicproducts("Lg tv", "비 충전식");
        System.out.println(tv);

        Phon s = new Phon(
                "Iphon SE2", "충전식 , 충전후 사용 가능", "가능");
        System.out.println(s);
    }
}

