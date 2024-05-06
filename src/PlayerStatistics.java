public class PlayerStatistics {
    private int games;
    private int goals;

    public PlayerStatistics(int games, int goals) {
        this.games = games;
        this.goals = goals;
    }
    public double gamesPerGoal() {
        if (goals == 0) {
            return 0;
        }
        return (double) games / goals;
    }
    public double goalsPerGame() {
        if (games == 0) {
            return 0;
        }
        return (double) goals / games;
    }
    public boolean underThirtyGames() {
        return games < 30;
    }
    public Double[] createCsvReport() {
        return new Double[] { (double) games, (double) goals, gamesPerGoal(), goalsPerGame() };
    }
    public static Player getYoungerPlayer(Player player1, Player player2) {
        return player1.getAge() < player2.getAge() ? player1 : player2;
    }

    public int getGames() {
        return games;
    }

    public void setGames(int games) {
        this.games = games;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }
}
