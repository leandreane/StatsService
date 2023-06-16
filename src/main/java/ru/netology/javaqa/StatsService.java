package ru.netology.javaqa;

public class StatsService {
    public int AmountSalesMin(int[] sales) {
        int amountSales = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[amountSales]) {
                amountSales = i;
            }

        }
        return amountSales + 1;
    }

    public int AmountSalesMax(int[] sales) {
        int amountSales = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[amountSales]) {
                amountSales = i;
            }

        }
        return amountSales + 1;
    }

    public int getAllAmountSales(int[] sales) {

        int amountSales = 0;
        for (int i = 0; i < sales.length; i++) {

            amountSales += sales[i];

        }
        return amountSales;
    }

    public int AverageAmountSales(int[] sales) {

        int amountSales = 0;
        for (int i = 0; i < sales.length; i++) {

            amountSales += sales[i];
        }
        return amountSales / sales.length;

    }

    public int minAverageSales(int[] sales) {

        int minAverageMonth = 0;
        int averageSum = minAverageSales(sales);
        for (long sale : sales) {
            if (sale <= averageSum) {
                minAverageMonth++;
            }
        }
        return minAverageMonth;

    }

    public int maxAverageSales(int[] sales) {

        int maxAverageMonth = 0;
        int averageSum = maxAverageSales(sales);
        for (long sale : sales) {
            if (sale >= averageSum) {
                maxAverageMonth++;
            }
        }
        return maxAverageMonth;
    }
}

