package com.frackstudios.abstraction.challenge;

/**
 * Created by crypticdev on 2/25/16.
 */
public interface NodeList {

    ListItem getRoot();
    boolean addItem(ListItem item);
    boolean removeItem(ListItem item);
    void traverse(ListItem root);
}
