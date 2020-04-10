package com.Movetwice;

public class MoveBlockTwiceEq extends MoveTwice {

    public MoveBlockTwiceEq(God god) {
        super(god);
    }
    public boolean moveBuilding(int rFinal) {
        if(super.firstTime){
            return super.moveTwice(rFinal); //ritorna false se è la prima volta/o non ha finito il turno perchè ha sbagliato casella
        }else if (/*rFinal.getcounter()<4*/ super.stessaPos(rFinal)){
            return super.moveTwice(rFinal);
        }else{
            super.firstTime=true;
            super.row=-1;
            return true;
        }
    }
}
