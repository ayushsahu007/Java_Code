package com.grok.soild.lsp.solution;

public class Penguin extends Bird implements Swimmable {
    @Override
    public void eat(){
        System.out.println("Penguin is eating");
    }

    @Override
    public void swim(){
        System.out.println("Penguin is Swimming");
    }
    //Penguin can't fly so i can't implement Flyable interface
    //but penguin can swim so i implement swim interface
}
