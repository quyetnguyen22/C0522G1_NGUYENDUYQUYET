package ss7_interface_and_abstract_class.practice.comparable;

public class TennisGame {

    public static boolean getScore(String firstPlayerName, String secondPlayerName, int firstPlayerMatchScore, int secondPlayerMatchScore) {
        String advantage = "";
        int tempScore = 0;
        final boolean isEqualScore = firstPlayerMatchScore == secondPlayerMatchScore;
        return isEqualScore;
        //        if (isEqualScore) {
//            switch (firstPlayerMatchScore) {
//                case 0:
//                    return "Love-All";
//                case 1:
//                    return "Fifteen-All";
//                case 2:
//                    return "Thirty-All";
//                case 3:
//                    return "Forty-All";
//                default:
//                    return "Deuce";
//
//            }
//        } else if (firstPlayerMatchScore >= 4 || secondPlayerMatchScore >= 4) {
//            int minusResult = firstPlayerMatchScore - secondPlayerMatchScore;
//            if (minusResult == 1)
//                return "Advantage player1";
//            else if (minusResult == -1)
//                return  "Advantage player2";
//            else if (minusResult >= 2)
//                return  "Win for player1";
//            else
//                return  "Win for player2";
//        } else {
//            for (int i = 1; i < 3; i++) {
//                if (i == 1) tempScore = firstPlayerMatchScore;
//                else {
//                    advantage += "-";
//                    tempScore = secondPlayerMatchScore;
//                }
//                switch (tempScore) {
//                    case 0:
//                        advantage += "Love";
//                        break;
//                    case 1:
//                        advantage += "Fifteen";
//                        break;
//                    case 2:
//                        advantage += "Thirty";
//                        break;
//                    case 3:
//                        advantage += "Forty";
//                        break;
//                }
//            }
//        }
//        return advantage;
    }

    public static String isEqualScore(int firstPlayerMatchScore) {
        switch (firstPlayerMatchScore) {
            case 0:
                return "Love-All";
            case 1:
                return "Fifteen-All";
            case 2:
                return "Thirty-All";
            case 3:
                return "Forty-All";
            default:
                return "Deuce";
        }
    }

    public static void main(String[] args) {
        getScore("a", "b", 1, 1);
        isEqualScore(1);
    }
}
