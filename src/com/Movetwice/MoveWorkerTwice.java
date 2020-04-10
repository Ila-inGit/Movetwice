package com.Movetwice;

public class MoveWorkerTwice extends MoveTwice {

    public MoveWorkerTwice(God god) {
        super(god);
    }

    //da richiamare anche se non vuole fare la seconda mossa con rstart=rfinal
    public boolean moveWorker(int rStart, int rFinal) {
        if(!super.stessaPos(rFinal)){
            return super.moveTwice(rStart,rFinal);//ritorna false se è la prima volta/o non ha finito il turno perchè ha sbagliato casella e true se ne ha fatte due
        }else{
            return false;
        }
    }
}
