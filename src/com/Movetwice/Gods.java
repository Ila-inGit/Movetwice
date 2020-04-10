package com.Movetwice;

public class Gods implements  God {

    @Override
    public boolean moveWorker(int rStart,int rFinal) {
        System.out.println("Base: ho mosso il worker da"+rStart+"a"+rFinal);
        return true;
    }

    @Override
    public boolean moveBuilding(int rFinal) {
        System.out.println("Base: ho mosso un pezzo"+"a"+rFinal);
        return true;

    }
}
