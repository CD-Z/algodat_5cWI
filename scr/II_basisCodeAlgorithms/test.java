package II_basisCodeAlgorithms;

import II_basisCodeAlgorithms.II_baseAlgorithms.*;
import II_basisCodeAlgorithms.I_basis.dataGenerator;
import II_basisCodeAlgorithms.sortierverfahren.*;

public class test {
    public static void main(String[] args) throws Exception {
        int[] arr1 = dataGenerator.generateDataArray(12);
        int[] arr3 = dataGenerator.generateDataArray(14);
        int[] arr2 = dataGenerator.generateDataArray(13);
        int[] arr4 = dataGenerator.generateDataArray(15,10,900);
        int[] arr5 = dataGenerator.generateDataArray(100000,-214748364,214748364);
        int[] arr6 = dataGenerator.generateDataArray(17,-900,-12);
        //dataGenerator.printArray(arr1);
        //dataGenerator.printArray(arr2);
        //dataGenerator.printArray(arr3);
        //dataGenerator.printArray(arr4);
        //dataGenerator.printArray(arr5);
        //dataGenerator.printArray(arr6);

        //dataGenerator.printArray(baseAlgorithms.revert(arr6));
        //System.out.println(" Max: " + baseAlgorithms.max(arr6));
        //System.out.println(" Min: " + baseAlgorithms.min(arr6));
        //dataGenerator.printArray(sort.selectionSort(arr6));
        //dataGenerator.printArray(sort.bubbleSort(arr6));

        dataGenerator.printArray(sort.selectionSort(arr5));
    }
}
