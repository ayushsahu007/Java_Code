package com.grok.soild.ISP.solution;

public class HumanWorker implements Worker ,Eat{

    @Override
    public void work(){
        System.out.println("Working");
    }
    @Override
    public void eat(){
        System.out.println("Eating");
    }

}
