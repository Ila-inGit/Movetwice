package com.Movetwice;

public class ShiftWorker extends MoveTwice {
    public ShiftWorker(God god) {
        super(god);
    }

    @Override
    public boolean moveWorker(int rStart, int rFinal) {
        if(super.firstTime){
            super.moveTwice(rStart);
        }
        return true;
    }
}
