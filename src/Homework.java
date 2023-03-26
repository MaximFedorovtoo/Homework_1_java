import java.util.Random;

public class Homework {



	public static void main(String[] args) {
        System.out.println(isSumBetween10And20(5, 15)); // true
        System.out.println(isSumBetween10And20(7, 15)); // false
        System.out.println(isSumBetween10And20(2, 6)); // false

        System.out.println(isPositive(5)); // true
        System.out.println(isPositive(-3)); // false
        System.out.println(isLeapYear(2016)); // true
        printArray(createArray(10, 5)); //должен вернуть массив длины len, каждое значение которого равно initialValue
        arrayZiroOne(20); //Задать целочисленный массив, состоящий из элементов 0 и 1.
        //* Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
        int[] test = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 }; //2. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
        printArray(multiplicatiobByTwo(test));
        
        
        printString("abcd", 5); // abcdabcdabcdabcdabcd

        int[][] array = new int[4][4]; // [[1, 0, 0, 0], [0, 1, 0, 0], [0, 0, 1, x], [0, 0, 0, 1]]
        int x = array[2][3];
        makeX(20); //Создать квадратный двумерный целочисленный массив
        
    }

    /**
     * 1. Написать метод, принимающий на вход два целых числа и проверяющий,
     * что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
     */
    private static boolean isSumBetween10And20(int a, int b) {
        if(a+b <= 20 && a+b >=10) {
        	return true;
        }
        else {
        return false;
        }
    }

    private static boolean isPositive(int x) {
        if (x > 0 ) {
        	return true;
        	
        }
        else {
        return false;
        }
    }

    private static void printString(String source, int repeat) {
    	String tmp = "";
        for(int i = 0; i < repeat; i++) {
			tmp += source;
        }
        System.out.println(tmp);
        }
    

    private static boolean isLeapYear(int year) {
        // проверить, является ли год високосным. если да - return true
        // год является високосным, если он делится на 4, но не делится на 100, но делится на 400
    	if ( (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
    		return true;
    	}
    	else {
        return false;
    	}
    }

    private static int[] createArray(int len, int initialValue) {
        // должен вернуть массив длины len, каждое значение которого равно initialValue
    	int[] array_init = new int[len];
    	for(int i = 0; i< len;i++) {
    		array_init[i]= initialValue;
    	}
        return array_init;
    }
    
    private static void printArray(int[] array){
    	for(int i = 0; i< array.length; i++) {
    		System.out.print(array[i]+",");
    	}
        System.out.println();
    }

/**
 * 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
 * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
 *
 * 2. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
 *
 * 3. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
 * и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
 * Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
 * * Также заполнить элементы побочной диагонали
 */
    private static void arrayZiroOne(int len) {
    	int[] array_init = new int[len];
    	for (int i = 0; i < len; i++) {
    		Random rnd = new Random();
    		array_init[i] = rnd.nextInt(2);
    	}
        printArray(array_init);
        for (int index = 0; index < len; index++) {
            if (array_init[index] == 0){array_init[index] = 1;}
            else {array_init[index] = 0;}
        }
        printArray(array_init);
		
    }
    private static int[] multiplicatiobByTwo(int[] array) {
    	int[] array_init = array;
    	for (int i = 0; i< array.length; i++) {
    		if (array_init[i]< 6) {
    			array_init[i] = array_init[i] * 2;
    		}
    		
    	}
    	return array_init;
    }
    private static void makeX(int len){
    	int[][] array_init = new int[len][len];
    	for(int i = 0; i< len; i++) {
    		for(int j = 0; j < len; j++) {
    			if (i == j){array_init[i][j] = 1;}
    			else if ((i+j) == (len - 1)) {array_init[i][j] = 1;}
    			else {array_init[i][j] = 0;}
    			System.out.print(array_init[i][j]);
    		}
    		System.out.println();
    	}
    	
    	
    }
}