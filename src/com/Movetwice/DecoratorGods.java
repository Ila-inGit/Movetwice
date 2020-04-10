package com.Movetwice;

public abstract class DecoratorGods implements God {
    protected God god;

    public DecoratorGods(God god) {
        this.god = god;
    }

    @Override
    public boolean moveWorker(int rStart, int rFinal) {
        return god.moveWorker(rStart,rFinal);
    }

    @Override
    public boolean moveBuilding(int rFinal) {
       return god.moveBuilding(rFinal);
    }
}
