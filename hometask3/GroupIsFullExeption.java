package com.gmail.hometask3;

/**
 * Created by MacUser on 25.02.19.
 */
public class GroupIsFullExeption extends Exception{

    @Override
    public String getMessage() {
        return "Group is full already";
    }
}
