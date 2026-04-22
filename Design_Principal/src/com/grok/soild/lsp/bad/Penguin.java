package com.grok.soild.lsp.bad;

public class Penguin extends Bird{
    @Override
    public void fly(){
        throw new UnsupportedOperationException();
    }
    //penguin can't fly
}
