package math_operations;

public class Triangle {

    public static void main(String[] args) {

        // вызов метода

        int a = 40;
        int b = 30;
        int c = 20;



        // Проверяем условие
        if (isTriangleValid(a, b, c)) {
            System.out.println("Треугольник с такими сторонами существует.");
        } else {
            System.out.println("Треугольник с такими сторонами не существует.");
        }
    }

    // Метод для проверки неравенства треугольника
    public static boolean isTriangleValid(int a, int b, int c) {
        return (a + b > c)&(a + c > b)&(b + c > a);
    }
}
