/**
 * Michael Litvinenko
 */
package litvinenko.simple;

/*В переменной n хранится вещественное число с ненулевой дробной частью.
Создайте программу, округляющую число n до ближайшего целого и выводящую результат на экран.
*/


import litvinenko.simple.operator.ReadDouble;

public class Task4 {
    static long rounding(double a) {
        return Math.round(a);
    }

    public static void main(String[] args) {

        System.out.println("Enter your double number for rounding: ");
        System.out.println("Your result: " + rounding(ReadDouble.read()));

    }
}

