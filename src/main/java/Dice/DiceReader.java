package Dice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

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

    public void readDice(List<DIE_COL> dice){
        Map<String, Integer> diceMap = new HashMap<>();
        Arrays.stream(DIE_COL.values()).forEach(
                die_col ->{
                    if (dice.contains(die_col)) {
                        diceMap.put(
                                switch (die_col){
                                    case aRED -> "Red Attack";
                                    case aBLACK -> "Black Attack";
                                    case aWHITE -> "White Attack";
                                    case dRED -> "Red Defense";
                                    case dWHITE -> "White Defense";
                                },
                                (int) dice.stream().filter(die -> die.equals(die_col)).count()
                                );
                    }
                }
        );

        if(!diceMap.isEmpty()){
            diceMap.forEach((d,r) -> {
                    System.out.printf("""
                            %s : %s
                            """, d, r);
                    });
        }
    }
}
