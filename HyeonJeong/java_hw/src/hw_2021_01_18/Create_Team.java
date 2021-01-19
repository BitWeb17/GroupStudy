package hw_2021_01_18;

public class Create_Team {
    public static void main(String[] args) {
        final int NUMBER_OF_JO = 2;
        System.out.println("지금부터 랜덤 팀 구성을 시작합니다.\n");

        String[] jo_A = {
                "고동영", "장해솔", "류슬기", "박재민", "한다은",
                "최현정", "오진욱", "조진형", "이정현"
        };
        String[] jo_B = {
                "이범진", "박소현", "탁성진", "노찬욱",
                "박기범", "하진주", "이승윤", "최임식"
        };
        String[] jo_C = {
                "고동영", "장해솔", "류슬기", "박재민", "한다은",
                "최현정", "오진욱", "조진형", "이정현", "이범진",
                "박소현", "탁성진", "노찬욱", "박기범", "하진주",
                "신동일", "최성민", "정진웅", "송광자", "강진수",
                "나정주", "김문주", "윤상구", "이승윤", "최임식",
                "이재윤", "예호준", "정광용", "박계욱", "조태호",
                "정용주", "고영복", "박장욱", "박상호", "최병덕",
                "장재승", "김기범", "김태희", "김영호", "김형석",
                "이승종", "이미라", "한성우", "이재복", "김명일",
                "고은옥", "최상옥", "임혜성", "손형석", "허성준",
                "허영주", "허근영", "이민규", "장세창", "유섬나",
                "한동훈", "김길민", "정경태", "오치균", "송민철",
                "유기재", "박일호", "조도진", "김광숙", "윤덕진",
                "조규용", "이재성",

        };

        Set_Random_Member srm = new Set_Random_Member(jo_A, jo_B, NUMBER_OF_JO);

        srm.set_Random_jo();
        System.out.println("------------A조-----------\n");
        srm.print_arraylist(srm.getJo_A_arraylist());

        System.out.println("------------B조-----------\n");
        srm.print_arraylist(srm.getJo_B_arraylist());

        Set_Random_Member Test_jo = new Set_Random_Member(jo_C, NUMBER_OF_JO);

        Test_jo.set_Random_jo_C();
        System.out.println("------------C조-----------\n");
        Test_jo.print_arraylist(Test_jo.getJo_C_arraylist());
    }
}
