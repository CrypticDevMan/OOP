package com.frackstudios.interfaces.challenge;
;
import java.util.List;

/**
 * Created by crypticdev on 2/17/16.
 */
public interface ISaveable {
    List<String> write();
    void read(List<String> savedValues);
}
