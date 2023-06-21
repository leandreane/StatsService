package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void checkMinSalesDay() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedDay = 9;
        int actualDay = service.amountSalesMin(sales);

        Assertions.assertEquals(expectedDay, actualDay);
    }

    @Test
    public void checkMaxSalesDay() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedDay = 8;
        int actualDay = service.amountSalesMax(sales);

        Assertions.assertEquals(expectedDay, actualDay);
    }

    @Test
    public void checkAllSalesDay() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 180;
        long actual = service.getAllAmountSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void AverageAmountSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 15;
        long actual = service.averageAmountSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minAverageSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedDay = 5;
        int actualDay = service.minAverageSales(sales);

        Assertions.assertEquals(expectedDay, actualDay);
    }

    @Test
    public void maxAverageSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedDay = 5;
        int actualDay = service.maxAverageSales(sales);

        Assertions.assertEquals(expectedDay, actualDay);
    }
}
