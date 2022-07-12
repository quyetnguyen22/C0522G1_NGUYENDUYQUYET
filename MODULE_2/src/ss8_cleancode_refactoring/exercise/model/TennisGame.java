package ss8_cleancode_refactoring.exercise.model;

public class TennisGame {

    public static String getScore(String firstPlayerName, String secondPlayerName, int firstPlayerMatchScore, int secondPlayerMatchScore) {
        String advantage = "";
        int tempScore = 0;
        final boolean isEqualScore = firstPlayerMatchScore == secondPlayerMatchScore;
        if (isEqualScore) {
            switch (firstPlayerMatchScore) {
                case 0:
                    advantage = "Love-All";
                    break;
                case 1:
                    advantage = "Fifteen-All";
                    break;
                case 2:
                    advantage = "Thirty-All";
                    break;
                case 3:
                    advantage = "Forty-All";
                    break;
                default:
                    advantage = "Deuce";
                    break;

            }
        } else if (firstPlayerMatchScore >= 4 || secondPlayerMatchScore >= 4) {
            int minusResult = firstPlayerMatchScore - secondPlayerMatchScore;
            if (minusResult == 1) advantage = "Advantage player1";
            else if (minusResult == -1) advantage = "Advantage player2";
            else if (minusResult >= 2) advantage = "Win for player1";
            else advantage = "Win for player2";
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) tempScore = firstPlayerMatchScore;
                else {
                    advantage += "-";
                    tempScore = secondPlayerMatchScore;
                }
                switch (tempScore) {
                    case 0:
                        advantage += "Love";
                        break;
                    case 1:
                        advantage += "Fifteen";
                        break;
                    case 2:
                        advantage += "Thirty";
                        break;
                    case 3:
                        advantage += "Forty";
                        break;
                }
            }
        }
        return advantage;
    }
}

