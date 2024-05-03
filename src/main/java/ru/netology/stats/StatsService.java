package ru.netology.stats;

public class StatsService {
    public int minSales(long[] sales) { //Номер месяца, в котором был минимум продаж
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }
        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int maxSales(long[] sales) { //Номер месяца, в которым был максимум продаж
        int maxMonth = 0; // номер мемяца с максимальными продажами среди просмотренных ранее
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int totalSales(long[] sales) { //Сумма всех продаж
        int sum = 0; //номер месяца, с которого начались продажи
        for (long i : sales) {
            sum += i;
        }
        return sum;
    }

    public int averageSales(long[] sales) { //Средняя сумма продаж в месяц
        return totalSales(sales) / sales.length; //Average = Sum of Elements / Number of Elements
    }

    public int lessThanAverageSales(long[] sales) { //Последний месяц, когда продажи были ниже среднего
        int lessAverageMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= averageSales(sales)) {
                lessAverageMonth = i;
            }
        }
        return lessAverageMonth + 1;
    }

    public int moreThanAverageSales(long[] sales) { //Последний месяц, когда продажи были выше среднего
        int moreAverageMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= averageSales(sales)) {
                moreAverageMonth = i;
            }
        }
        return moreAverageMonth + 1;
    }
}