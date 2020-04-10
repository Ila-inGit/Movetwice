package com.Movetwice;

public class MoveBlockWorkerBlock extends MoveTwice {
    private boolean workerMoved=false;

    public MoveBlockWorkerBlock(God god) {
        super(god);
    }

    @Override
    public boolean moveWorker(int rStart, int rFinal) {
        if(super.firstTime){
            workerMoved=true;
            return super.moveWorker(rStart,rFinal);//ritorna sempre vero
        }else if(!super.firstTime /*controllo altezza partenza e arrivo=>scende o rimane uguale*/){
            workerMoved=true;
            return super.moveWorker(rStart,rFinal);
        }else{
            return false;
        }
    }

    @Override
    public boolean moveBuilding(int rFinal) {
        if(super.firstTime && workerMoved){
            //da controllare che sia lo stesso worker che costruisce
            return super.moveBuilding(rFinal);
        }else if (!workerMoved && super.firstTime){
            return super.moveTwice(rFinal);
        }else{
            return super.moveTwice(rFinal);
        }
    }
}
