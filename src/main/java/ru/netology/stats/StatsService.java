package ru.netology.stats;

public class StatsService {

    // сумма всех продаж
    public int TotalSales(int[] sales) {
        int totalSalesPerYear = 0;
        for (int salePerMonth : sales) {
            totalSalesPerYear = totalSalesPerYear + salePerMonth;
        }
        return totalSalesPerYear;
    }

    // средняя сумма продаж в месяц
    public double AverageSales(int[] sales) {
        return (double) TotalSales(sales) / sales.length;
    }

    // номер месяца, в котором был пик продаж
    public int MonthOfMaxSales(int[] sales) {
        int month = 0;
        for (int i = 0; i < 12; i++) {
            if (sales[i] >= sales[month]) {
                month = i;
            }
        }
        return month + 1;
    }

    // номер месяца, в котором был минимум продаж
    public int MonthOfMinSales(int[] sales) {
        int month = 0;
        for (int i = 0; i < 12; i++) {
            if (sales[month] >= sales[i]) {
                month = i;
            }
        }
        return month + 1;
    }

    //количество месяцев, в которых продажи были ниже среднего
    public int NumberOfMonthWithSalesLessThanAverage(int[] sales) {
        int numberOfMonths = 0;
        double averageSales = AverageSales(sales);
        for (int i = 0; i < 12; i++) {
            if (sales[i] < averageSales) {
                numberOfMonths = numberOfMonths + 1;
            }
        }
        return numberOfMonths;
    }

    //количество месяцев, в которых продажи были выше среднего
    public int NumberOfMonthWithSalesGreaterThanAverage(int[] sales) {
        int numberOfMonths = 0;
        double averageSales = AverageSales(sales);
        for (int i = 0; i < 12; i++) {
            if (sales[i] > averageSales) {
                numberOfMonths = numberOfMonths + 1;
            }
        }
        return numberOfMonths;
    }
}