package Mechanics;

import Dice.*;
import lombok.*;

import java.util.List;

@Data
public class InitialAttack {

//    Unit uAttacker;
//    Unit uDefender;


    // Attacker Data
    List<DIE_COL> AttackerDice;
    int kPierce;
    int tAim;
    int tSurge;

    // Defender Data
    List<DIE_COL> DefenderDice;
    int cover;
    int kImpervious;


    public InitialAttack(int cover, List<DIE_COL> AttackerDice,
            List<DIE_COL> DefenderDice){
        this.cover = cover;
        this.AttackerDice = AttackerDice;
        this.DefenderDice = DefenderDice;

    }
}
