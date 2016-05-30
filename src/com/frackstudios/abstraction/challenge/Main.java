package com.frackstudios.abstraction.challenge;

/**
 * Created by crypticdev on 2/25/16.
 */
public class Main {
    public static void main(String[] args) {
        MyLinkedLists list = new MyLinkedLists(null);
        list.traverse(list.getRoot());
        String stringData = "5 7 3 9 8 2 1 0 4 6";

        String[] data = stringData.split(" ");
        for (String s : data){
            // create new item with value set to the string s
            list.addItem(new Node(s));
        }

        list.traverse(list.getRoot());
        list.removeItem(new Node("3"));
        list.traverse(list.getRoot());
    }
}
