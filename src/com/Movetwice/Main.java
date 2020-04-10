package com.Movetwice;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean finito=false;
        int rStart;
        int rFinal;
        God gods=new MoveWorkerTwice(new Gods());
        while(!finito){
            System.out.print("Riga start: ");
            Scanner r = new Scanner(System.in);
            rStart=Integer.parseInt(r.nextLine());
            System.out.print("Riga final: ");
            Scanner r2 = new Scanner(System.in);
            rFinal=Integer.parseInt(r2.nextLine());
            finito=gods.moveWorker(rStart,rFinal);
        }
    }
}
