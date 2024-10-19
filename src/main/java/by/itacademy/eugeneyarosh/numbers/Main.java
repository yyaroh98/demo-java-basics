package by.itacademy.eugeneyarosh.numbers;


public class Main {
    public static void main(String[] args) {
        int number = 5;
        String numberAsAString = "";

        switch (number) {
            case 0:
                numberAsAString = "ноль";
                break;
            case 1:
                numberAsAString = "один";
                break;
            case 2:
                numberAsAString = "два";
                break;
            case 3:
                numberAsAString = "три";
                break;
            case 4:
                numberAsAString = "четыре";
                break;
            case 5:
                numberAsAString = "пять";
                break;
            case 6:
                numberAsAString = "шесть";
                break;
            case 7:
                numberAsAString = "семь";
                break;
            case 8:
                numberAsAString = "восемь";
                break;
            case 9:
                numberAsAString = "девять";
                break;
            default:
                numberAsAString = "недопустимое число";
                break;

        }
        System.out.println(numberAsAString); // один
    }
}
