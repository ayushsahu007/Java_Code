package com.grok.soild.lsp.solution;

public class Sparroe extends Bird implements Flyable{
    @Override
    public void fly(){
        System.out.println("Sparroe is Flying");
    }

    @Override
    public void eat(){
        System.out.println("Sparrow is eating");
    }
}
