package Cricbuzz.Match;

public class Match {
    Inning[] innings;
    Team teamA;
    Team teamB;
    Team tossWinner;
    Team winner;
    Date matchDate;
    String matchVenue;
    MatchType matchType;

    Match(Team teamA, Team teamB, Date matchDate, String matchVenue, MatchType matchType) {

    }

    public Team startToss() {
        tossWinner = Math.random() > 0.5 ? teamA : teamB;
        return tossWinner;
    }

    public Team getWinner() {
        return winner;
    }
}
