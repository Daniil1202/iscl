package homework2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.management.RuntimeErrorException;



// Реализуйте метод, который запрашивает у пользователя ввод дробного
//  числа (типа float), и возвращает введенное значение. Ввод текста вместо 
//  числа не должно приводить к падению приложения, вместо этого, необходимо повторно 
//  запросить у пользователя ввод данных.


public class zadacha {
//     public static void main(String[] args) {
//         boolean free = true;
//         BufferedReader reader = new BufferedReader(new 
//         InputStreamReader(System.in));

//         while (free) {
//             System.out.print("Введите дробное число: ");
//             try{
//                 float fNum = Float.parseFloat(reader.readLine());
//                 System.out.printf("Введённое число равно %f\n", fNum);
//                 free = false;
                
//             } catch(IOException|NumberFormatException e){
//                 System.out.println("Неверный ввод. Введите дробное число");
//             }
            
//         }
//     }
    
// }

//Задание 2. Дан код, исправьте его.
// public static void spouse(){
//     try {
//         int [] intArray = {1,2,3,4,5,6,7,8,9};
//         int d = 0;
//         double catchedRes1 = new intArray[8] / d;
//         System.out.println("catchedRes1 = " + catchedRes1);
// }  catch (ArithmeticException e) {
//    System.out.println("Catching exception: " + e);
// }
// }



// Задание 3.
// public static void main(String[] args) throws Exception {
//    try {
//        int a = 90;
//        int b = 3;
//        System.out.println(a / b);
//        printSum(23, 234);
//        int[] abc = { 1, 2 };
//        abc[3] = 9;
//    } catch (NullPointerException ex) {
//        System.out.println("Указатель не может указывать на null.");
//    } catch (IndexOutOfBoundsException ex) {
//        System.out.println("Массив выходит за пределы своего размера!");
//    } catch (Throwable ex) {
//        System.out.println("Что-то пошло не такю");
//    }
// }
// public static void printSum(Integer a, Integer b) {
//    System.out.println(a + b);
// }



// Задание 4.
// Разработайте программу, которая выбросит Exception, когда пользователь 
// вводит пустую строку. Пользователю должно показаться сообщение, что пустые 
// строки вводить нельзя.



public static void main(String[] args) {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Введите текст, без пустой строки");
    try {
        String res = reader.readLine();
        if(res.equals("")) throw new RuntimeException("Пустую строку вводить нельзя");
    } catch (IOException e) {
        throw new RuntimeException(e);
    }
    
}
}