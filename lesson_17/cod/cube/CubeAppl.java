package cube;

import cube.model.Cube;

public class CubeAppl {
    public static void main(String[] args) {
        // Создаем несколько объектов кубов

        Cube cube1 = new Cube(2);
        Cube cube2 = new Cube(5);
        Cube cube3 = new Cube(7);



        // Выводим информацию о каждом кубе
        displayCubeInfo(cube1);
        displayCubeInfo(cube2);
        displayCubeInfo(cube3);
    }

    // Метод для вывода информации о кубе
    public static void displayCubeInfo(Cube cube) {
        System.out.println("Куб со стороной: " + cube.getSide());
        System.out.println("  Периметр: " + cube.getPerimeter());
        System.out.println("  Площадь поверхности: " + cube.getSurfaceArea());
        System.out.println("  Объем: " + cube.getVolume());
        System.out.println();
    }


}
