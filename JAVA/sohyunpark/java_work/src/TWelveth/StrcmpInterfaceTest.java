package TWelveth;

import static TWelveth.Utility.MYSTRCMP;
import static TWelveth.Utility.STRCMPTEST;

// String compare with Interface
public class StrcmpInterfaceTest {
    public static void main(String[] args) {
        MyStrcmp ms1 = new MyStrcmp(105.3);
        MyStrcmp ms2 = new MyStrcmp(87.3);

        StrcmpTest st = new StrcmpTest(105.3);

        if(ms1.compareTo(ms2, MYSTRCMP) > 0) {
            System.out.println("ms1이 ms2 보다 더 크다.");
        } else if(ms2.compareTo(ms2, MYSTRCMP) < 0) {
            System.out.println("ms1이 ms2 보다 더 작다.");
        } else {
            System.out.println("ms1과 ms2는 같다.");
        }

        if(ms1.compareTo(st, STRCMPTEST) == 0) {
            System.out.println("이게 되네 ?");
        }
    }
}
