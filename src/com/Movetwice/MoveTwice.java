package com.Movetwice;

public abstract class MoveTwice extends DecoratorGods{
    int row=-1;
    boolean firstTime=true;


    public MoveTwice(God god) {
        super(god);
    }
    //TODO da fare anche per i block ma ora non ci interessa perchè non abbiamo parametri diversi
    public boolean moveTwice(int rStart,int rFinal){
        if(firstTime){
            super.moveWorker(rStart,rFinal );
            firstTime=false;
            row=rStart;
            return false;
        }else{
            //se rstart=rfinal devo dapere in Gods che faccio una mossa "fantasma"
            super.moveWorker(rStart,rFinal);
            row=-1;
            firstTime=true;
            return true;
        }

    }
    public boolean moveTwice(int rFinal){
        if(firstTime){
            super.moveBuilding(rFinal);
            firstTime=false;
            row=rFinal;
            return false;
        }else{
            //se rstart=rfinal devo dapere in Gods che faccio una mossa "fantasma"
            super.moveBuilding(rFinal);
            row=-1;
            firstTime=true;
            return true;
        }

    }

    public boolean stessaPos( int rFinal){
        if(row==rFinal){
            return true;
        }
        return false;
    }

}
