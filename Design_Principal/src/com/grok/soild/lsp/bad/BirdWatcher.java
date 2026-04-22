package com.grok.soild.lsp.bad;

public class BirdWatcher {
    public void watchBirdFly(Bird bird){
        bird.fly();
    }

    public static void main(String[] args) {
        BirdWatcher watcher = new BirdWatcher();

        Bird sparrow = new Bird();
        watcher.watchBirdFly(sparrow);

      Penguin penguin = new Penguin();
       watcher.watchBirdFly(penguin);
    }
}
