package edu.hw3;

import edu.hw3.task6.Stock;
import edu.hw3.task6.StockMarket;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Task6Test {
    @Test
    @DisplayName("Test most valuable stock (sequence of stocks)")
    public void mostValuableStockSequence() {
        Stock YNDX = new Stock(2000);
        Stock TCSG = new Stock(3000);
        Stock SBER = new Stock(300);
        StockMarket stockMarket = new StockMarket(YNDX, TCSG, SBER);
        Assertions.assertEquals(TCSG, stockMarket.mostValuableStock());

        Stock TATN = new Stock(1000);
        stockMarket.add(TATN);
        Assertions.assertEquals(TCSG, stockMarket.mostValuableStock());

        Stock GMKN = new Stock(6000);
        stockMarket.add(GMKN);
        Assertions.assertEquals(GMKN, stockMarket.mostValuableStock());

        stockMarket.remove(GMKN);
        stockMarket.remove(TCSG);
        Assertions.assertEquals(YNDX, stockMarket.mostValuableStock());

        stockMarket.remove(YNDX);
        Assertions.assertEquals(TATN, stockMarket.mostValuableStock());

        stockMarket.remove(TATN);
        stockMarket.remove(SBER);
        Assertions.assertNull(stockMarket.mostValuableStock());
    }

    @Test
    @DisplayName("Test most valuable stock (list of stocks)")
    public void mostValuableStockList() {
        List<Stock> stocks = new ArrayList<>();

        Stock YNDX = new Stock(2000);
        Stock TCSG = new Stock(3000);
        Stock SBER = new Stock(300);

        stocks.add(YNDX);
        stocks.add(TCSG);
        stocks.add(SBER);

        StockMarket stockMarket = new StockMarket(stocks);
        Assertions.assertEquals(TCSG, stockMarket.mostValuableStock());

        Stock TATN = new Stock(1000);
        stockMarket.add(TATN);
        Assertions.assertEquals(TCSG, stockMarket.mostValuableStock());

        Stock GMKN = new Stock(6000);
        stockMarket.add(GMKN);
        Assertions.assertEquals(GMKN, stockMarket.mostValuableStock());

        stockMarket.remove(GMKN);
        stockMarket.remove(TCSG);
        Assertions.assertEquals(YNDX, stockMarket.mostValuableStock());

        stockMarket.remove(YNDX);
        Assertions.assertEquals(TATN, stockMarket.mostValuableStock());

        stockMarket.remove(TATN);
        stockMarket.remove(SBER);
        Assertions.assertNull(stockMarket.mostValuableStock());
    }
}
