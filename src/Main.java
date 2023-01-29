public class Main {
    public static void main(String[] args) {
        homeWork();
    }


    public static void homeWork(){
        System.out.println("-----Task1-----");
        int integerVariable = 1000;
        byte byteVariable = 44;
        short shortVariable = 1;
        long longVariable = 3333333;
        float floatVariable = 23.34f;
        double doubleVariable = 32.1;
        System.out.println("Значение переменной integerVariable c типом int равно " + integerVariable);
        System.out.println("Значение переменной byteVariable c типом byte равно " + byteVariable);
        System.out.println("Значение переменной shortVariable c типом short равно " + shortVariable);
        System.out.println("Значение переменной longVariable c типом long равно " + longVariable);
        System.out.println("Значение переменной floatVariable c типом float равно " + floatVariable);
        System.out.println("Значение переменной doubleVariable c типом double равно " + doubleVariable);
        // Task 2
        float f1 = 27.12f;
        long l1 = 987_678_965_549L;
        double d1 = 2.786;
        int i1 = 569;
        short s1 = -159;
        short s2 = 27897;
        byte b1 = 67;
        System.out.println("-----Task3-----");
        int ludmilaPavlovna = 23;
        int annaSergeevna = 27;
        int ekaterinaAndreevna = 30;
        int generalCount = 480;
        int result = (generalCount / (ekaterinaAndreevna + annaSergeevna + ludmilaPavlovna));
        System.out.println("На каждого ученика рассчитано " + result + " листов бумаги");
        System.out.println("-----Task4-----");
        int perMinute = 16 / 2;
        int firstValue = perMinute * 20;
        int secondValue = perMinute * (24 * 60);
        int thirdValue = perMinute * ((24 * 3) * 60);
        int fourthValue = perMinute * ((24 * 30) * 60);
        System.out.println("За 20 минут машина произвела " + firstValue + " шт бутылок");
        System.out.println("За сутки машина произвела " + secondValue + " шт бутылок");
        System.out.println("За 3 суток машина произвела " + thirdValue + " шт бутылок");
        System.out.println("За месяц машина произвела " + fourthValue + " шт бутылок");
        System.out.println("-----Task5-----");
        int neededDye = 120;
        int whiteDyePerClass = 2;
        int brownDyePerClass = 4;
        int classCount = neededDye / (whiteDyePerClass + brownDyePerClass);
        int whiteCount = whiteDyePerClass * classCount;
        int brownCount = brownDyePerClass * classCount;
        System.out.println("В школе, где " + classCount + " классов, нужно " + whiteCount + " банок белой краски и " + brownCount + " банок коричневой краски");
        System.out.println("-----Task6-----");
        int bananaWeight = 5 * 80;
        double milkWeight = 200 * 1.05;
        int iceCreamWeight = 2 * 100;
        int eggsWeight = 4 * 70;
        double resultInGram = bananaWeight + milkWeight + iceCreamWeight + eggsWeight;
        double resultInKilo = resultInGram/1000;
        System.out.println("Вес в килограммах " + resultInKilo + "\nВес в граммах " + resultInGram);
        System.out.println("-----Task7-----");
        int needToLose = 7 * 1000;
        int perDay1 = 250;
        int perDay2 = 500;
        int days1 = needToLose/perDay1;
        int days2 = needToLose/perDay2;
        double averageValue = (days2 + days1) / 2d;
        System.out.println("Если худеть на 250гр в день - " + days1);
        System.out.println("Если худеть на 500гр в день - " + days2);
        System.out.println("В среднем на похудение уйдет - " + averageValue + " дней");
        System.out.println("-----Task8-----");
        int mariaStartSalary = 67_760;
        int denisStartSalary = 83_690;
        int kristinaStartSalary = 76_230;
        float mariaIncreasedSalary = mariaStartSalary * 1.1f;
        float denisIncreasedSalary = denisStartSalary * 1.1f;
        float kristinaIncreasedSalary = kristinaStartSalary * 1.1f;
        int mariaYearStartSalary = mariaStartSalary * 12;
        int denisYearStartSalary = denisStartSalary * 12;
        int kristinaYearStartSalary = kristinaStartSalary * 12;
        float mariaYearStartSalaryNew = mariaIncreasedSalary * 12f;
        float denisYearStartSalaryNew = denisIncreasedSalary * 12f;
        float kristinaYearStartSalaryNew = kristinaIncreasedSalary * 12f;
        System.out.println("Маша теперь получает "  + mariaYearStartSalaryNew + " рублей.Годовой доход вырос на " + (mariaYearStartSalaryNew - mariaYearStartSalary) + " рублей.");
        System.out.println("Денис теперь получает "  + denisYearStartSalaryNew + " рублей.Годовой доход вырос на " + (denisYearStartSalaryNew - denisYearStartSalary) + " рублей.");
        System.out.println("Кристина теперь получает "  + kristinaYearStartSalaryNew + " рублей.Годовой доход вырос на " + (kristinaYearStartSalaryNew - kristinaYearStartSalary) + " рублей.");
    }
}