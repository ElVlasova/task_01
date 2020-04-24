public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        System.out.println("Задание 1");
        int number1 = 5;
        System.out.println("Переменная " + number1);
        int number2 = 9;
        System.out.println("Переменная " + number2);
        int number3 = number2 + number1;
        System.out.println("Сумма " + number3);
        System.out.println("Задание 2");
        double x = 7.5D;
        double a = x * 2.0D;
        double b = x * 3.0D;
        System.out.println("Переменная " + x);
        System.out.println("Больше чем х в 2 раза " + a);
        System.out.println("Больше чем х в 3 раза " + b);
        System.out.println("Задание 3");
        System.out.println("Напишите фрагмент класса, в котором переменным а и b будут присваиваться числовые значения из диапазона \"однозначное положительное число\". Затем следует присвоить переменной с значение, составленное следующим образом: значение переменной а является числом десятков, значение переменной b является числом единиц. Например, если переменной а присваивается значение 4, а переменной b – значение 7, то переменная с получает значение 47.");
        int w = 4;
        int y = 7;
        int p = 47;
        System.out.println("Переменная w " + w);
        System.out.println("Переменная y " + y);
        System.out.println("Переменная p " + p);
        System.out.println("Задание 4");
        System.out.println("Напишите фрагмент класса, который присваивает переменной х целочисленное значение, а затем присваивает переменной треть от значения переменной х");
        int u = 120;
        System.out.println("Переменная х " + u);
        int d = u / 3;
        System.out.println("Ответ  " + d);
        System.out.println("Задание 5");
        String name = "IVAN";
        int age = 32;
        String city = "Moscow";
        System.out.println("Hello " + name);
        System.out.println("age " + age);
        System.out.println("city " + city);
        System.out.println("Задание 6");
        System.out.println("Напиши программу, которая выводит на экран квадрат переменной number;");
        double number = 4.0D;
        double number0 = 2.0D;
        System.out.println("Переменная number   " + number);
        System.out.println("Переменная number0  " + number0);
        PrintStream var10000 = System.out;
        double var10001 = Math.pow(number, number0);
        var10000.println("Число 4 в квадрате равно " + var10001);
    }
}
