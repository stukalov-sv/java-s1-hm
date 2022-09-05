/*
 * Написать консольный калькулятор принимающий два числа и оператор 
 * (умножение, деление, сложение, вычитание) и 
 * завершающий процесс по решению пользователя. 
 * Завершающее слово должно быть не регистрочувствительным 
 * (Пример: поданные слова в разном регистре "Да", "да", "дА", "ДА" -
 *  должны быть однозначно трактованы, как "Да").
 */

import java.util.Scanner;
public class Task1HM {
    public static void main(String[] args) {
        start();
    }

    public static void start() {
        Scanner iScanner = new Scanner(System.in, "Cp866");
                     
        System.out.println("Enter first number: ");
        float firstNum = iScanner.nextFloat();
        System.out.println("Enter second number: ");
        float secondNum = iScanner.nextFloat();
        System.out.println("Enter operator: ");
        iScanner.nextLine();
        String getOperator = iScanner.nextLine();

        int doOperator = 0;
        float result = 0;

        if (getOperator.toCharArray()[0] == '*')  {
            doOperator = 1;
        } else if (getOperator.toCharArray()[0] == '/')  {
            doOperator = 2;
        } else if (getOperator.toCharArray()[0] == '+')  {
            doOperator = 3;
        } else if (getOperator.toCharArray()[0] == '-')  {
            doOperator = 4;
        } else {
            System.out.printf("Incorrect data - %s.\nUse *, /, +, -\n", getOperator);
        }

        switch (doOperator) {
            case 1:
                result = firstNum * secondNum;
                System.out.printf("Result: %.3f\n", result);
                break;
            case 2:
                result = firstNum / secondNum;
                System.out.printf("Result: %.3f\n", result);
                break;
            case 3:
                result = firstNum + secondNum;    
                System.out.printf("Result: %.3f\n", result);
                break;
            case 4:
                result = firstNum - secondNum;
                System.out.printf("Result: %.3f\n", result);
                break;
            default:
                break;
            }
        System.out.println("Do you want to continue? (да, нет)");
        String answer = iScanner.nextLine().toLowerCase();
        if (answer.equals("да")) {
            start();
        }
        iScanner.close();
    }
}
