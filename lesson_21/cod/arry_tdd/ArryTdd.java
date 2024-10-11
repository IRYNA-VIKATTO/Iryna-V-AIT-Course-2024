package arry_tdd;

import java.util.Arrays;
import java.util.Objects;

public class ArryTdd {

    private int[] array;

    public ArryTdd(int[] array) {
        this.array = array;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    @Override
    public String toString() {
        return "ArryTdd{" +
                "array=" + Arrays.toString(array) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ArryTdd arryTdd)) return false;
        return Objects.deepEquals(array, arryTdd.array);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(array);
    }

    // count positive numbers in array
    public int countPositive(int[] array){
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0){
                count++;
            }

        }
        return  count;
    }
}
