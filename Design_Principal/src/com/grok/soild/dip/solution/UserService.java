package com.grok.soild.dip.solution;

public class UserService {
    private Database db;
    UserService(Database db){
        this.db = db;
    }

    void saveUser(){
        db.save();
    }
}
