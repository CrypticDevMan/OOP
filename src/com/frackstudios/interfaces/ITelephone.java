package com.frackstudios.interfaces;

/**
 * Created by crypticdev on 2/16/16.
 */
public interface ITelephone {
    void powerOn();
    void dial(int phoneNumber);
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();
}
