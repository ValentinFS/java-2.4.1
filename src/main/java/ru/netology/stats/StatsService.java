package ru.netology.stats;

public class StatsService {

    //    Метод вычисления суммы продаж

    public long calcSum(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
//        System.out.println(sum);
        return sum;
    }

    //    Метод вычисления средней суммы продаж в месяц

    public long calcAvarage(long[] sales) {
        long sum = calcSum(sales);
//        System.out.println(sum);
        return sum / sales.length;
    }

    //    Вычисление номера месяца, в котором был пик продаж

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        maxMonth = maxMonth + 1;

        return maxMonth;
    }

    //    Вычисление номера месяца, в котором был минимум продаж

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;

        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    //    Кол-во месяцев, в которых продажи были ниже среднего

    public long monthNumberBelowAvarage(long[] sales) {
        long avarageSum = calcAvarage(sales);
        int monthAmount = 0;
        for (long sale : sales) {
            if (sale < avarageSum) {
                monthAmount = monthAmount + 1;
            }
        }
        return monthAmount;
    }

    //    Кол-во месяцев, в которых продажи были выше среднего

    public long monthNumberOverAvarage(long[] sales) {
        long avarageSum = calcAvarage(sales);
        int monthAmount = 0;
        for (long sale : sales) {
            if (sale > avarageSum) {
                monthAmount = monthAmount + 1;
            }
        }
        return monthAmount;
    }


}
