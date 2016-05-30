package com.frackstudios.sortedCollections;

import java.util.Iterator;
import java.util.Map;

/**
 * Created by CrypticDev on 4/6/2016.
 */
public class Main {
    private static StockList stockList = new StockList();

    public static void main(String[] args) {
        StockItem temp = new StockItem("bread", 0.86, 100);
        stockList.addStock(temp);

        temp = new StockItem("cake", 1.10, 7);
        stockList.addStock(temp);

        temp = new StockItem("car", 12.10, 2);
        stockList.addStock(temp);

        temp = new StockItem("cup", 0.50, 70);
        stockList.addStock(temp);

        temp = new StockItem("chair", 15.70, 200);
        stockList.addStock(temp);

        temp = new StockItem("coffee", 5.75, 10);
        stockList.addStock(temp);

        temp = new StockItem("milk", 2.36, 50);
        stockList.addStock(temp);

        temp = new StockItem("eggs", 3.25, 30);
        stockList.addStock(temp);

        temp = new StockItem("bacon", 2.50, 10);
        stockList.addStock(temp);

        temp = new StockItem("soda", 4.40, 75);
        stockList.addStock(temp);

        temp = new StockItem("paper", 0.65, 500);
        stockList.addStock(temp);

        temp = new StockItem("video-game", 63.50, 300);
        stockList.addStock(temp);

        temp = new StockItem("beer", 110.50, 3);
        stockList.addStock(temp);

        System.out.println(stockList);

        stockList.Items().keySet().forEach(System.out::println);

        Basket CrypticsBasket = new Basket("Cryptic");
        sellItem(CrypticsBasket, "car", 1);
        System.out.println(CrypticsBasket);

        sellItem(CrypticsBasket, "car", 1);
        System.out.println(CrypticsBasket);

        sellItem(CrypticsBasket, "car", 1);
        sellItem(CrypticsBasket, "pokemon", 1);
        System.out.println(CrypticsBasket);

        sellItem(CrypticsBasket, "paper", 50);
        sellItem(CrypticsBasket, "beer", 50);
        sellItem(CrypticsBasket, "soda", 50);
        sellItem(CrypticsBasket, "video-game", 50);
        System.out.println(CrypticsBasket);

        System.out.println(stockList);

        stockList.Items().get("car").adjustStock(1500);

        System.out.println(stockList);

        for (Iterator<Map.Entry<String, Double>> iterator = stockList.PriceList().entrySet().iterator(); iterator.hasNext(); ) {
            Map.Entry<String, Double> price = iterator.next();
            System.out.println(price.getKey() + " costs " + price.getValue());
        }


    }

    public static int sellItem(Basket basket, String item, int quantity) {
        StockItem stockItem = stockList.get(item);
        if (stockItem == null) {
            System.out.println("Sorry, we don't sell " + item);
            return 0;
        }
        if (stockList.reserveStock(item, quantity) != 0) {
            return basket.addToBasket(stockItem, quantity);
        }
        return 0;
    }

    public static int removeItem(Basket basket, String item, int quantity) {
        StockItem stockItem = stockList.get(item);
        if (stockItem == null) {
            System.out.println("Sorry, we don't sell " + item);
            return 0;
        }
        if (basket.removeFromBasket(stockItem, quantity) == quantity) {
            return stockList.unreserveStock(item, quantity);
        }
        return 0;
    }

    public static void checkOut(Basket basket) {
        for (Map.Entry<StockItem, Integer> item : basket.Items().entrySet()) {
            stockList.sellStock(item.getKey().getName(), item.getValue());
        }
        basket.clearBasket();
    }
}
