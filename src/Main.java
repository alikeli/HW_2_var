public class Main {
    public static void main(String[] args) {
        //Задача 1

        int years = 17;
        byte children = 1;
        short weight = 50;
        float hours = 5.5f;
        double money = 10.45;
        char symbol = 42;
        long tooLong = 99888888985885L;
        boolean d = 20 > 18;

        /*System.out.println(years);
        System.out.println(children);
        System.out.println(weight);
        System.out.println(hours);
        System.out.println(money);
        System.out.println(symbol);
        System.out.println(tooLong);
        System.out.println(d);*/

        //Задача 2

        double weightFirstBoxer = 78.2;  //вес первого спортсмена
        double weightSecondBoxer = 82.7;  //вес второго спортсмена
        double totalWeight = weightSecondBoxer + weightFirstBoxer;  //суммарный вес спортсменов
        double differenceWeight = weightSecondBoxer % weightFirstBoxer;  //разница в весе спортсменов
        System.out.println("Общий вес двух бойцов " + totalWeight + " кг");
        System.out.println("Разница между весами бойцов " + differenceWeight + " кг");

        //Задача 3

        double bananas = 5;  //количество
        double weightBananas = 80;  //вес единицы продукта
        double milk = 2; //количество
        double weightMilk = 105;  //вес единицы продукта
        double iceCream = 2; //количество
        double weightIceCream = 100;  //вес единицы продукта
        double eggs = 4; //количество
        double weightEggs = 70;  //вес единицы продукта
        int grPerKg = 1000;  //перевод гр в кг
        double totalWeightBreakfastGr = (bananas * weightBananas + milk * weightMilk + iceCream * weightIceCream + eggs * weightEggs);  //вес завтрака в гр
        double totalWeightBreakfastKg = totalWeightBreakfastGr / grPerKg;  //вес завтрака в кг
        System.out.println("Вес спорт-завтрака " + totalWeightBreakfastKg + "кг");

        // Задача 4

        int loseWeight = 7;  //Необходимо похудеть на это кол-во кг
        int kgPerGr = 1000;  //перевод в кг
        int  loseWeightGr = loseWeight * kgPerGr ;
        int  firstWay = 250;   // первый способ похудения
        int  secondWay = 500;   //второй способ похудения
        int numberOfWay = 2;  //количество способов похудения
        int  daysFirsWay = loseWeightGr / firstWay; //необходимое количество дней для первого способа
        int  daysSecondWay = loseWeightGr / secondWay;  //необходимое количество дней для второго способа
        int  averageOfDays = (daysFirsWay + daysSecondWay) / numberOfWay;  //Среднее арифметическое для двух способов похудения


        System.out.println(daysFirsWay + " дней необходимо на похудение, если терять в день по " + firstWay + " грамм веса." );
        System.out.println(daysSecondWay + " дней необходимо на похудение, если терять в день по " + secondWay + " грамм веса." );
        System.out.println(averageOfDays + " день необходим на похудение со средней скоростью.");

        //Задача 5

        //Исходные данные

        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        double increasePercent = 10;
        double monthsYear = 12;

        // Зарплата Маши
        double salaryIncreaseMasha = salaryMasha + (increasePercent / 100) * salaryMasha;  //Увеличение зарплаты
        double yearSalaryMashaBefore = salaryMasha * monthsYear;  //Годовой доход до повышения
        double yearSalaryMashaNew = salaryIncreaseMasha * monthsYear;  //Годовой доход после повышения
        double differenceSalaryMasha = yearSalaryMashaNew % yearSalaryMashaBefore;  // На сколько увеличился годовой доход

        //Зарплата Дениса
        double  salaryIncreaseDenis = salaryDenis + (increasePercent / 100) * salaryDenis;  //Увеличение зарплаты
        double yearSalaryDenisBefore = salaryDenis * monthsYear; //Годовой доход до повышения
        double yearSalaryDenisNow = salaryIncreaseDenis * monthsYear;  //Годовой доход после повышения
        double differenceSalaryDenis = yearSalaryDenisNow % yearSalaryDenisBefore;  // На сколько увеличился годовой доход

        //Зарплата Кристины
        double salaryIncreaseKristina = salaryKristina + (increasePercent / 100) * salaryKristina; //Увеличение зарплаты
        double yearSalaryKristinaBefore = salaryKristina * monthsYear; //Годовой доход до повышения
        double yearSalaryKristinaNow = salaryIncreaseKristina * monthsYear;  //Годовой доход после повышения
        double differenceSalaryKristina = yearSalaryKristinaNow% yearSalaryKristinaBefore;  // На сколько увеличился годовой доход

        System.out.println("Маша теперь получает " + (int) salaryIncreaseMasha + " рублей. Годовой доход вырос на " +  (int) differenceSalaryMasha + " рублей." );
        System.out.println("Денис теперь получает " + (int) salaryIncreaseDenis + " рублей. Годовой доход вырос на " +  (int) differenceSalaryDenis + " рублей." );
        System.out.println("Кристина теперь получает " + (int) salaryIncreaseKristina + " рублей. Годовой доход вырос на " +  (int) differenceSalaryKristina + " рублей." );

    }
}