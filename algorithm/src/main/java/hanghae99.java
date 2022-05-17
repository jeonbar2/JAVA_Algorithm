public class hanghae99 {

    public static String solution(int month, int day) {//11 27
        String answer = "";

        int[] c = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        //11월 27일을 입력했다.. 11월 27 일 + 98일  11월 125일-> 11월은 30 12월 은 31 1월은 31일 2월은 28 일 3월은 31일 -> 151일 125-151 26 3월 31일 -26 하면 되네;\
        int i=0;
        int d=0;
        while(98+day>d){
            d+=c[(month-1+i)%12];
//            System.out.println((month-1+i)%12);
            i++;
        }
        int m = (month-1+i)%12;//3월
        int restDay = d-98+day;
//        System.out.println(d);
//        System.out.print(m+"월");
//        System.out.println(c[m-1]-restDay+"일");
        answer += m;
        answer += "월";
        answer += c[m-1]-restDay;
        answer += "일";
        return answer;
    }
    public static void main(String[] args) {

        System.out.println(solution(11,27));
        System.out.println(solution(6,22));
        System.out.println(solution(1,18));
    }
}
