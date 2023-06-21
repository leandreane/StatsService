package ru.netology.javaqa;

public class StatsService {
    public int amountSalesMin(int[] sales) {

        int amountSales = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[amountSales]) {
                amountSales = i;
            }
        }
        return amountSales + 1;
    }

    public int amountSalesMax(int[] sales) {

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

    public int averageAmountSales(int[] sales) {

        int amountSales = 0;

        for (int i = 0; i < sales.length; i++) {

            amountSales += sales[i];
        }
        return amountSales / sales.length;

    }

    public int minAverageSales(int[] sales) {

        int minAverageMonth = 0;
        for (long sale : sales) {
            if (sale < averageAmountSales(sales)) {

                minAverageMonth++;
            }
        }
        return minAverageMonth;

    }

    public int maxAverageSales(int[] sales) {

        int maxAverageMonth = 0;

        for (long sale : sales) {
            if (sale > averageAmountSales(sales)) {

                maxAverageMonth++;
            }
        }
        return maxAverageMonth;
    }
}

