package homework_20.model;

public class MinMaxValues {

    public static void main(String[] args) {

        // Если аргументы не переданы, выводим значения для всех типов
        if (args.length == 0) {
            printAllMinMaxValues();
        } else {
            for (String arg : args) {
                switch (arg.toLowerCase()) {
                    case "byte":
                        System.out.println("byte: MIN=" + Byte.MIN_VALUE + ", MAX=" + Byte.MAX_VALUE);
                        break;
                    case "short":
                        System.out.println("short: MIN=" + Short.MIN_VALUE + ", MAX=" + Short.MAX_VALUE);
                        break;
                    case "char":
                        System.out.println("char: MIN=" + (int) Character.MIN_VALUE + ", MAX=" + (int) Character.MAX_VALUE);
                        break;
                    case "int":
                        System.out.println("int: MIN=" + Integer.MIN_VALUE + ", MAX=" + Integer.MAX_VALUE);
                        break;
                    case "long":

                        System.out.println("long: MIN=" + Long.MIN_VALUE + ", MAX=" + Long.MAX_VALUE);
                        break;
                    case "float":
                        System.out.println("float: MIN=" + Float.MIN_VALUE + ", MAX=" + Float.MAX_VALUE);
                        break;
                    case "double":
                        System.out.println("double: MIN=" + Double.MIN_VALUE + ", MAX=" + Double.MAX_VALUE);
                        break;
                    default:
                        System.out.println("Неверный тип: " + arg);
                }
            }
        }
    }

    // Метод для вывода минимальных и максимальных значений всех типов
    private static void printAllMinMaxValues() {
        System.out.println("byte: MIN=" + Byte.MIN_VALUE + ", MAX=" + Byte.MAX_VALUE);
        System.out.println("short: MIN=" + Short.MIN_VALUE + ", MAX=" + Short.MAX_VALUE);
        System.out.println("char: MIN=" + (int) Character.MIN_VALUE + ", MAX=" + (int) Character.MAX_VALUE);
        System.out.println("int: MIN=" + Integer.MIN_VALUE + ", MAX=" + Integer.MAX_VALUE);
        System.out.println("long: MIN=" + Long.MIN_VALUE + ", MAX=" + Long.MAX_VALUE);
        System.out.println("float: MIN=" + Float.MIN_VALUE + ", MAX=" + Float.MAX_VALUE);
        System.out.println("double: MIN=" + Double.MIN_VALUE + ", MAX=" + Double.MAX_VALUE);
    }
}
