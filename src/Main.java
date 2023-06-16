import java.util.*;

public class Main {

    public static String findOddNumbers(List<Integer> nums){
        Set<Integer> numsSet = new HashSet<>(nums);
        List<Integer> numsOdd = new ArrayList<>();
        for (Integer num : numsSet) {
            if(num%2!=0){
                numsOdd.add(num);
            }
        }
        return numsOdd.toString();
    }

    public static String findEvenNumbers(List<Integer> nums){
        Set<Integer> numsSet = new HashSet<>(nums);
        List<Integer> numsEven = new ArrayList<>();
        for (Integer num : numsSet) {
            if(num%2==0){
                numsEven.add(num);
            }
        }
        Collections.sort(numsEven);
        return numsEven.toString();
    }

    public static String findUniqueWords(List<String> words){
        Set<String> wordsSet = new HashSet<>(words);
        return wordsSet.toString();
    }

    public static void countUniqueWords(List<String> strings){
        Set<String> stringsSet = new HashSet<>(strings);
        for (String stri : stringsSet) {
            int count = 0;
            for (String strj : strings) {
                if (stri.equals(strj)){
                    count++;
                }
            }
            System.out.println(count);
        }
    }


    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }

    public static void task1 () {
        System.out.println("Задача 1");
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        System.out.println(findOddNumbers(nums));
    }

    public static void task2 () {
        System.out.println("Задача 2");
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        System.out.println(findEvenNumbers(nums));

    }

    public static void task3 () {
        System.out.println("Задача 3");
        List<String> words = new ArrayList<>(List.of("moon", "sun", "sky", "moon"));
        System.out.println(findUniqueWords(words));
    }

    public static void task4 () {
        System.out.println("Задача 4");
        List<String> strings = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));
        countUniqueWords(strings);

    }
}
