package Dice;

import java.util.List;

import static Dice.DIE_RES.*;
import static Dice.DIE_COL.*;

public class DiceReader {

    public void readAttack(List<DIE_RES> resultDice){
        int hits = (int) resultDice.stream().filter(d->d == HIT).count();
        int surges = (int) resultDice.stream().filter(d->d == SURGE).count();
        int crits = (int) resultDice.stream().filter(d->d == CRIT).count();
        int blanks = (int) resultDice.stream().filter(d->d == BLANK).count();
        System.out.printf("""
                *** Attack Dice Readout ***
                Hits:  %d | Surges: %d
                Crits: %d | Blanks: %d
                ****************************
                """, hits, surges, crits, blanks);
    }

//    public void readPool(List<DIE_RES> resultDice){
//        int hits = (int) resultDice.stream().filter(d->d == HIT).count();
//        int surges = (int) resultDice.stream().filter(d->d == SURGE).count();
//        int crits = (int) resultDice.stream().filter(d->d == CRIT).count();
//        int blanks = (int) resultDice.stream().filter(d->d == BLANK).count();
//        System.out.printf("""
//                *** Attack Dice Readout ***
//                Hits:  %d | Surges: %d
//                Crits: %d | Blanks: %d
//                ****************************
//                """, hits, surges, crits, blanks);
//    }
}
