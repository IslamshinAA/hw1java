//Реализовать простой калькулятор
import java.util.Scanner;
public class hw3 {
    
    public static void main(String[] args) {
            int num1;
            int num2;
            int res;
            char op;
            Scanner read = new Scanner(System.in);
            System.out.print("Введите два числа: ");
            num1 = read.nextInt();
            num2 = read.nextInt();
            System.out.print("\nВведите операцию (+, -, *, /): ");
            op = read.next().charAt(0);
            switch(op) {
               case '+': res = num1 + num2;
                  break;
               case '-': res = num1 - num2;
                  break;
               case '*': res = num1 * num2;
                  break;
               case '/': res = num1 / num2;
                  break;
               default:  System.out.printf("Ошибка. Нет такой операции");
                  return;
            }
            System.out.print("\nВаш пример и результат:\n");
            System.out.printf(num1 + " " + op + " " + num2 + " = " + res);
        
      }

    }