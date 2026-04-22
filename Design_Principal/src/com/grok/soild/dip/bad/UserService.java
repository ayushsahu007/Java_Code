package com.grok.soild.dip.bad;

public class UserService {
    private Database db = new Database();
    public void saveUser(){
        db.save();
    }
}

