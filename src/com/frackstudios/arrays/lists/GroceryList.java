package com.frackstudios.arrays.lists;

import java.util.ArrayList;

/**
 * Created by CrypticDev on 2/3/2016.
 */
public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void printGroceryList() {
        System.out.println("You have " +groceryList.size() + " items in your grocery list");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(String currentItem, String newItem) {
        int posiiton = findItem(currentItem);
        if (posiiton >= 0) {
            modifyGroceryItem(posiiton, newItem);
        }
    }
    private void modifyGroceryItem(int positon, String newItem) {
        groceryList.set(positon, newItem);
        System.out.println("Grocery item " + (positon + 1) + " has been modified");
    }

    public void removeGroceryItem(String item) {
        int posiiton = findItem(item);
        if (posiiton >= 0) {
            removeGroceryItem(posiiton);
        }
    }

    private void removeGroceryItem(int position) {
        groceryList.remove(position);
    }

    private int findItem(String searchItem) {
        return groceryList.indexOf(searchItem);
    }

    public boolean onFile(String searchItem) {
        int position = findItem(searchItem);
        if (position >= 0)
            return true;
        return false;
    }


}
