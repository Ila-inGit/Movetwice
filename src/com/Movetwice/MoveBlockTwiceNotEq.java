package com.Movetwice;

public class MoveBlockTwiceNotEq extends MoveTwice {

    public MoveBlockTwiceNotEq(God god) {
        super(god);
    }
    public boolean moveBuilding( int rFinal) {
        if (!super.stessaPos(rFinal)) {
            return super.moveTwice(rFinal);//ritorna false se è la prima volta/o non ha finito il turno perchè ha sbagliato casella e true se ne ha fatte due
        } else {
            return false;
        }
    }
}
