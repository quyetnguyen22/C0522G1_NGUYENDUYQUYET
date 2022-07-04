//package SS1_Introduction_to_java.Exercise;
//
//import java.util.Scanner;
//
//public class ConvertNumberToWord {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Input a number: ");
//        int number = scanner.nextInt();
//        int div = number % 10;
//        String show;
//        switch (div) {
//            case 0:
//                show = "Zero";
//                break;
//            case 1:
//                show = "One";
//                break;
//            case 2:
//                show = "Two";
//                break;
//            case 3:
//                show = "Three";
//                break;
//            case 4:
//                show = "Four";
//                break;
//            case 5:
//                show = "Five";
//                break;
//            case 6:
//                show = "Six";
//                break;
//            case 7:
//                show = "Seven";
//                break;
//            case 8:
//                show = "Eight";
//                break;
//            case 9:
//                show = "Night";
//                break;
//            case 10:
//                show = "Ten";
//                break;
//            case 11:
//                show = "Eleven";
//                break;
//            case 12:
//                show = "Twelve";
//                break;
//            case 13:
//                show = "Thirteen";
//                break;
//            case 15:
//                show = "Fifteen";
//                break;
//            case 20:
//                show = "Twenty";
//                break;
//            case 100:
//                show = "Hundred";
//                break;
//            case 1000:
//                show = "Thousand";
//                break;
//            case 1000000:
//                show = "Million";
//                break;
//            case 1000000000:
//                show = "Billion";
//                break;
//            default:
//                show = "Out of ability.";
//        }
//        if (number >= 0 && number < 10) {
//            System.out.println(show);
//        }
//        else if (number > 10 && number <= 100) {
//            System.out.println(show + "teen");
//        }
//    }
//}
