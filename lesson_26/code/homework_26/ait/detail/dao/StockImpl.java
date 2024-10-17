package homework_26.ait.detail.dao;

import homework_26.ait.detail.model.Detail;

import java.util.Arrays;

public class StockImpl implements Stock {

    private Detail[] details;  // Массив для хранения деталей
    private int size;          // Количество добавленных деталей

    // Конструктор, принимающий вместимость склада
    public StockImpl(int capacity) {
        this.details = new Detail[capacity];
        this.size = 0;  // Начальное количество деталей равно 0
    }

    @Override
    public void addDetail(Detail detail) {
        if (size >= details.length) {
            System.out.println("Склад заполнен! Невозможно добавить деталь.");
            return;
        }
        details[size++] = detail;  // Добавляем деталь и увеличиваем счётчик
        // Успешное добавление
    }

    @Override
    public Detail removeDetail(long barCode) {
        for (int i = 0; i < size; i++) {
            if (details[i].getBarCode() == barCode) {
                Detail removedDetail = details[i];
                details[i] = details[size - 1];  // Заменяем удаляемую деталь последней
                details[size - 1] = null;        // Удаляем последнюю деталь
                size--;                          // Уменьшаем счётчик
                return removedDetail;            // Возвращаем удалённую деталь
            }
        }
        return null;  // Деталь не найдена
    }
    @Override
    public Detail findDetailByBarCode(long barCode) {
        for (int i = 0; i < size; i++) {
            if (details[i].getBarCode() == barCode) {
                return details[i];  // Если деталь найдена, возвращаем её
            }
        }
        return null;  // Деталь не найдена
    }

    @Override
    public void updateDetail(Detail detail) {

    }

    @Override
    public Detail updateDetail(long barCode, Detail newDetail) {
        for (int i = 0; i < size; i++) {
            if (details[i].getBarCode() == barCode) {
                Detail oldDetail = details[i];
                details[i] = newDetail;  // Обновляем деталь
                return oldDetail;        // Возвращаем старую деталь
            }
        }
        return null;  // Деталь с таким баркодом не найдена
    }

    @Override
    public int quantity() {
        return size;  // Возвращаем количество деталей на складе
    }
    @Override
    public void printDetails() {
        System.out.println("Список всех деталей на складе:");
        for (int i = 0; i < size; i++) {
            System.out.println(details[i]);
        }
    }

    @Override
    public double getTotalWeight() {
        double totalWeight = 0;
        for (int i = 0; i < size; i++) {
            totalWeight += details[i].getWeight();  // Суммируем вес всех деталей
        }
        return totalWeight;
    }
    @Override
    public double getAverageWeight() {
        if (size == 0) {
            return 0;  // Если деталей нет, средний вес равен 0
        }
        return getTotalWeight() / size;  // Средний вес = общая масса / количество деталей
    }

    @Override
    public Detail[] findDetailsByWeightRange(double min, double max) {
        Detail[] result = new Detail[size];
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (details[i].getWeight() >= min && details[i].getWeight() <= max) {
                result[count++] = details[i];  // Добавляем деталь в результат, если её вес в заданном диапазоне
            }
        }
        return Arrays.copyOf(result, count);  // Возвращаем массив деталей с учётом их количества
    }
}
