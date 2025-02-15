package Cricbuzz.Inning.Over.Bowl;

public class Bowl {
    int speed;
    LengthType bowlLength;
    BowlType bowlType;
    RunType runType;
    Player bowledBy;
    Player striker;

    Bowl(int speed, LengthType ballLength) {
        this(speed, ballLength, BowlType.LEGAL);
    }

    Bowl(int speed, LengthType ballLength, BowlType ballType, RunType runType, Player bowledBy, Player striker) {
        this.speed = speed;
        this.bowlLength = ballLength;
        this.bowlType = ballType;
        this.runType = runType;
        this.bowledBy = bowledBy;
        this.striker = striker;
    }

}
