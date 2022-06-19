package Dice;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

import static Dice.DIE_RES.*;
import static Dice.DIE_COL.*;

public class DiceMachine {

    // Attack Dice D8s
    static final DIE_RES[] redAttack = {HIT, HIT, HIT, HIT, HIT, BLANK, CRIT, SURGE};
    static final DIE_RES[] blackAttack = {HIT, HIT, HIT, BLANK, BLANK, BLANK, CRIT, SURGE};
    static final DIE_RES[] whiteAttack = {HIT, BLANK, BLANK, BLANK, BLANK, BLANK, CRIT, SURGE};

    // Defense Dice D6s
    static final DIE_RES[] redDefense = {BLOCK, BLOCK, BLOCK, BLANK, BLANK, SURGE};
    static final DIE_RES[] whiteDefense = {BLOCK, BLANK, BLANK, BLANK, BLANK, SURGE};

    public void attackPhaseProcess(){
    }

    public DIE_RES rollDie(DIE_RES die){
        return switch (die){
            case aRED -> redAttack[ThreadLocalRandom.current().nextInt(8)];
            case aBLACK -> blackAttack[ThreadLocalRandom.current().nextInt(8)];
            case aWHITE -> whiteAttack[ThreadLocalRandom.current().nextInt(8)];
            case dRED -> redDefense[ThreadLocalRandom.current().nextInt(6)];
            case dWHITE -> whiteDefense[ThreadLocalRandom.current().nextInt(6)];
        };
    }

    public ArrayList<DIE_RES> rollDice(ArrayList<DIE_RES> dicePool) {
        ArrayList<DIE_RES> rolledDice = new ArrayList<>();
        dicePool.forEach(e->{
            rolledDice.add(rollDie(e));
        });
        return rolledDice;
    }

    // Takes dicePool as List and value to surge to
    public ArrayList<DIE_RES> surgeTo(ArrayList<DIE_RES> dicePool, DIE_RES convertTo) {
        // Create New Modified Pool
        ArrayList<DIE_RES> modifiedPool = new ArrayList<>();
        dicePool.forEach(e->{
            if (e.equals(SURGE)) {
                modifiedPool.add(convertTo);
            } else {
                modifiedPool.add(e);
            }
        });
        return modifiedPool;
    }

    // Removes Cover from the Attack Pool
    public ArrayList<DIE_RES> removeCover(ArrayList<DIE_RES> dicePool, int c) {
        int hits = dicePool.stream().filter(e->e.equals(HIT)).toList().size();
        for (int i = 1; i <= c; i++) {
            if (hits == 0) {
                break;
            } else {
                dicePool.remove(HIT);
                hits--;
            }
        }
        return dicePool;
    }

    public ArrayList<DIE_RES> applyCritical(ArrayList<DIE_RES> dicePool, int c) {
        int surges = dicePool.stream().filter(e->e.equals(SURGE)).toList().size();
        for (int i = 1; i <= c; i++) {
            if (surges == 0) {
                break;
            } else {
                dicePool.remove(SURGE);
                dicePool.add(CRIT);
                surges--;
            }
        }
        return dicePool;
    }

    public ArrayList<DIE_COL> genAttackPoolV1() {
        ArrayList<DIE_COL> attackPool = switch (ThreadLocalRandom.current().nextInt(5)){
            // Rebel Troopers
            case 0 -> new ArrayList<>(Arrays.asList(
                    aBLACK, aBLACK, aBLACK, aBLACK, aBLACK, // 4 + 1 Rebels
                    aWHITE, aWHITE, aWHITE, aWHITE, aWHITE, aWHITE)); // Z6
            // X34 Trooper
            case 1 -> new ArrayList<>(Arrays.asList(
                    aRED, aWHITE, aBLACK, // RP6
                    aWHITE, aWHITE, // Driver or Rifle gunner
                    aBLACK, aBLACK, aBLACK, aBLACK)); // Mark 2 Blaster
            // T47 + Mark 2 Fire Support
            case 2 -> new ArrayList<>(Arrays.asList(
                    aRED, aRED, aRED, aBLACK, aBLACK, aBLACK, // T47
                    aBLACK, aBLACK, aBLACK, aBLACK)); // Mark 2
            // Op Vader with Tenacity
            case 3 -> new ArrayList<>(Arrays.asList(
                    aRED, aRED, aRED, aRED, aRED));
            // Phase 2 with z 6 fping a Sabertanks Main Guns, and HE Shells
            case 4 -> new ArrayList<>(Arrays.asList(
                    aBLACK, aBLACK, aBLACK, aBLACK, aBLACK,
                    aWHITE, aWHITE, aWHITE, aWHITE, aWHITE, aWHITE,
                    aRED, aRED, aBLACK, aBLACK, aWHITE, aWHITE,
                    aRED, aRED, aWHITE));
            // B6s
            default -> new ArrayList<>(Arrays.asList(
                    aWHITE, aWHITE, aWHITE, aWHITE, aWHITE, aWHITE));

        };

        Collections.shuffle(attackPool);
        int diceDrop = ThreadLocalRandom.current().nextInt(4);
        for (int i = 0; i <= diceDrop; i++){
            int last = List.of().lastIndexOf(diceDrop);
            attackPool.remove(++last);
        }
        Collections.sort(attackPool);
        return attackPool;
    }

    public ArrayList<DIE_RES> rollDefense(DIE_COL defDiceColor,Boolean surge, ArrayList<DIE_RES> attackDicePool) {
        ArrayList<DIE_COL> defensePool = new ArrayList<DIE_COL>();
        attackDicePool.forEach(die_res -> defensePool.add(defDiceColor));



        ArrayList<DIE_RES> defenseRoll = rollDice(attackDicePool);
        defenseRoll.forEach(System.out::println);
        if(surge){
            return surgeTo(defenseRoll,BLOCK);
        }else{
            return defenseRoll;
        }
    }
}
