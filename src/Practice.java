import java.util.*;


public class Practice {

  // Time Complexity:O(n)
  // Space Complexity: O(1)
  public static List<Integer> findEvens(int[] array) {
    List<Integer> evens = new ArrayList<>();
    for (int num : array) {
      if (num % 2 == 0) {
        evens.add(num);
      }
    }
    return evens;
  }

  // Time Complexity: O(n^2)
  // Space Complexity: O(1)
  public static int sumDiagonal(int[][] matrix){
    int sum = 0;
    for (int i = 0; i < matrix.length; i++) {
      sum += matrix[i][i];
    }
    return sum;
  }
  

 
  // Time Complexity: O(n)
  // Space Complexity: O(n) 
  // Does the 'T' look confusing? Consider refreshing on generic methods
  // We'll revisit generics as a class later
  public static <T> Map<T, Integer> countFrequencies(T[] array) {
    HashMap<T, Integer> frequencies = new HashMap<>();
    for (T val : array) {
      frequencies.put(val, frequencies.getOrDefault(val, 0) + 1);
    }
    return frequencies;
  }

  /**
   * Returns the integer that shows up most frequently in an array.
   * If there is a tie, any one of the most common can be returned
   * arbitrarily.
   * 
   * THIS METHOD MUST RUN IN O(n) TIME. n = nums.size()
   * 
   * Once you finish, WRITE TESTS FOR IT in PracticeTest.java
   * 
   * Time Complexity: O(n)
   * Space Complexity: O(1)
   * 
   * @param nums An array of integers
   * @return the integer that shows up most commonly
   */
  public static int mostCommonTimeEfficient(int[] nums) {
    // TODO: Complete this method with an implementation that runs
    // in O(n) time. n = nums.size()
    int highestValue = 0;
    Map <Integer, Integer> mostCommon = new HashMap<Integer, Integer>();
    for (int i : nums) {
      if(mostCommon.containsKey(i)){
        mostCommon.put(i, mostCommon.get(i) + 1);

        if(highestValue < mostCommon.get(i)){
          highestValue = i;
        }

      }
      else{
        mostCommon.put(i, 0);
      }
    }
    return highestValue;
  }

  /**
   * Returns the integer that shows up most frequently in an array.
   * If there is a tie, any one of the most common can be returned
   * arbitrarily.
   * 
   * THIS METHOD MUST USE ONLY O(1) SPACE.
   * 
   * Once you finish, WRITE TESTS FOR IT in PracticeTest.java
   * 
   * Time Complexity:  O(n)
   * Space Complexity: O(1)
   * 
   * @param nums An array of integers
   * @return the integer that shows up most commonly
   */
  public static int mostCommonSpaceEfficient(int[] nums) {
    // TODO: Complete this method with an implementation that runs
    // in O(1) space.
    int highestCommon = 0;
    int mostFrequentNum = nums[0];;

    Map <Integer, Integer> mostCommon = new HashMap<Integer, Integer>();
    
    for (int num: nums) {
      
      if(mostCommon.containsKey(num)){
        mostCommon.put(num, mostCommon.get(num) + 1);
        
      }else{
        mostCommon.put(num, 0);
      }

      int count = mostCommon.get(num);
      if( count >= highestCommon){
        highestCommon = count;
        mostFrequentNum = num;
      }

    }
    
    return mostFrequentNum;
  }
}