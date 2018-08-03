package com.studyinghome.towersofhanoi;

public class TowersOfHanoiApplication {

    public static void main(String[] args) {
        /**
         * n:盘子个数
         * A,B,C是三个石棒
         */
        Hanoi.move(4, 'A', 'B', 'C');
        System.out.println("总共移动" + Hanoi.number + "次");
    }
}
