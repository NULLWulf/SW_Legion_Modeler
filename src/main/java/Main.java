import Dice.*;
import Mechanics.InitialAttack;

import javax.swing.text.rtf.RTFEditorKit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import static Dice.DIE_COL.*;
import static Dice.DIE_RES.*;

public class Main {
    public static void main(String[] args) {
        int cover = ThreadLocalRandom.current().nextInt(2);
        DiceReader diceReader = new DiceReader();

//        diceReader.readDice(
//                new ArrayList<>(
//                        Arrays.asList(dWHITE, dRED)
//                )
//        );

        DiceMachine diceMachine = new DiceMachine();
        ArrayList<DIE_COL> arrs = diceMachine.genAttackPoolV1();
        System.out.println("Dice Pool");
        diceReader.readDice(arrs);
        System.out.println("After Roll");
        List<DIE_RES> rolledDice = diceMachine.rollDice(arrs);
        diceReader.readAttack(rolledDice);
        System.out.println("Natural Surges");
        rolledDice = diceMachine.surgeTo(rolledDice, CRIT);
        diceReader.readAttack(rolledDice);
        System.out.printf("After Cover %s\n",cover);
        rolledDice = diceMachine.removeCover((ArrayList<DIE_RES>) rolledDice, cover);
        diceReader.readAttack(rolledDice);
    }

}