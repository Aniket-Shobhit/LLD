package Cricbuzz.Team;

import Cricbuzz.Inning.ScoreBoard.BattingScoreboard;
import Cricbuzz.Inning.ScoreBoard.BowlingScoreboard;
import Cricbuzz.Player.Player;

public class Team {
    Player[] players;
    String name;
    BattingScoreboard battingScoreboard;
    BowlingScoreboard bowlingScoreboard;

    public String getName() {
        return name;
    }

}
