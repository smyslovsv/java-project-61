package hexlet.code.games;

public interface Game {
    public void welcomeMassage();
    public void setRoundConditions();
    public void printConditions();
    public boolean checkAnswer(String answer);
}
