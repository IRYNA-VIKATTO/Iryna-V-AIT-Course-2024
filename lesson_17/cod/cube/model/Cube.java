package cube.model;

public class Cube {

    //Создать класс Cube, описывающий куб c пропуском a.
    // Реализовать в нем методы определения периметра p (сумма длин всех ребер),
    // площадей s (сумма площадей всех граней) и объема v.
    // Создать приложение CubeAppl, в котором создадим несколько экземпляров класса Cube.
    // Для каждого экземпляра вызываются методы класса Cube и объекты p, s и v.

    private double a; // длина ребра куба

    // Конструктор
    public Cube(double a) {
        this.a = a;
    }

    // Метод для вычисления периметра (сумма длин всех ребер)
    public double getPerimeter() {
        return 12 * a;
    }

    // Метод для вычисления площади поверхности
    public double getSurfaceArea() {
        return 6 * (a * a);
    }

    // Метод для вычисления объема
    public double getVolume() {
        return a * a * a;
    }

    // Метод для получения длины стороны куба
    public double getSide() {
        return a;
    }



}
