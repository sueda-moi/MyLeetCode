package zeroFiveOneFour;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class solution {


    public String intToRoman(int num) {
        StringBuffer answer = new StringBuffer();

        if (num == 0 ) return null;

        if (num == 4) {

            answer.append("IV");
            return answer.toString();
        } else if (num == 9) {

            answer.append("IX");
            return answer.toString();
        } else if (num == 40) {

            answer.append("XL");
            return answer.toString();
        } else if (num == 90) {

            answer.append("XC");
            return answer.toString();
        } else if (num == 400) {

            answer.append("CD");
            return answer.toString();
        } else if (num == 900) {

            answer.append("CM");
            return answer.toString();
        }


        int m = num/1000;
        int c = (num - 1000*m)/100;
        int x = (num - 1000*m - 100*c)/10;
        int i = (num - 1000*m - 100*c - 10*x);


        int d = 500;
        int l = 50;
        int v = 5;


        while(m != 0) {
            answer.append("M");
            m--;
        }
        while (c != 0) {
            if (c < 4) {
                answer.append("C");
                c--;
            } else if (c == 4) {
                answer.append("CD");
                break;
            } else if (c > 4 && c < 9) {
                answer.append("D");
                int a = c - 5;
                for (int j = 0; j < a; j++) {
                    answer.append("C");
                }
                break;
            } else if (c == 9) {
                answer.append("CM");
                break;
            }
        }

        while (x != 0) {
            if (x < 4) {
                answer.append("X");
                x--;
            } else if (x == 4) {
                answer.append("XL");
                break;
            } else if (x > 4 && x < 9) {
                answer.append("L");
                int a = x - 5;
                for (int j = 0; j < a; j++) {
                    answer.append("X");
                }
                break;
            } else if (x == 9) {
                answer.append("XC");
                break;
            }
        }

        while (i != 0) {
            if (i < 4) {
                answer.append("I");
                i--;
            } else if (i == 4) {
                answer.append("IV");
                break;
            } else if (i > 4 && i < 9) {
                answer.append("V");
                int a = i - 5;
                for (int j = 0; j < a; j++) {
                    answer.append("I");
                }
                break;
            } else if (i == 9) {
                answer.append("IX");
                break;
            }
        }


        return answer.toString();



//        if (num/10 < 1 ) {
//            if (num < 5 ) {
//                if (num < 4) {
//                    for (int i = 0; i < num ; i++) {
//                        answer.append("I");
//                    }
//                    return answer.toString();
//                } else if (num == 4) {
//                    answer.append("IV");
//                    return answer.toString();
//                }
//            } else if (num == 5) {
//                answer.append("V");
//                return answer.toString();
//            } else if (num > 5 && num < 9) {
//                answer.append("V");
//                for (int i = num - 5; i > 0; i--) {
//                    answer.append("V");
//                    answer.append("I");
//                }
//                return answer.toString();
//            } else if (num == 9) {
//                answer.append("IX");
//            }
//        }











    }


}
