package hexlet.code.games;

public interface Game {
    void welcomeMassage();
    void setRoundConditions();
    void printConditions();
    boolean checkAnswer(String answer);
}
