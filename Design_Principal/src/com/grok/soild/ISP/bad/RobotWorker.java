package com.grok.soild.ISP.bad;

public class RobotWorker implements Worker{
    @Override
    public void work(){
        System.out.println("Working");
    }

    @Override
    public void eat() {

//        Robot Worker cant eat but mandatory
//                to override bcoz i implement interface

        System.out.println("");
    }
}
