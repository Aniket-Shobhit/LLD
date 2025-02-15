package Cricbuzz.Match;

public class MatchService {
    Team battingTeam;
    Team bowlingTeam;

     public void startMatch(Match match) {
        battingTeam = match.startToss();
        bowlingTeam = battingTeam == match.teamA ? match.teamB : match.teamA;
    }

    public void playBowlingOver(Match match, int overNumber) {
        Over over = new Over();
        for (int i = 0; i < 6; i++) {
            over.addBall(new Ball());
        }
        match.innings[0].overs[overNumber] = over;
    }
}
