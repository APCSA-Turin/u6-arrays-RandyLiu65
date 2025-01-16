package U6T2_lab2;

public class ArrayAlgorithms {
    
        // instance variables
        private int[] nums;
        private String[] words;
      
        /** Constructor that returns a new ArrayManipulator
         *  @param nums  The array of nums
         *  @param howManyStrings  How many elements to put in the words array
         */
        public ArrayAlgorithms(int[] nums, int howManyStrings)
        { /* implement this method! */ 
          this.nums = nums;
          words = new String[howManyStrings];
        }
      
      
        /** Returns the index of the middle element of nums; if the length of the list
         *  is even, should return the index of the earlier middle element
         *  Precondition: length of nums >= 3
         *
         *  @return  the index of the middle element of nums
         *
         *  Example: if ints[] is {4, 6, 10}, the indices are 0, 1, and 2, so this
                     method returns the middle index, 1
         *  Example: if ints[] is {4, 5, 6, 10}, the indices are 0, 1, 2, 3, and two
                     middle indices are 1 and 2, so return 1 (te earlier of the two)
         */
        public int getNumsMiddleIndex()
        { /* implement this method! */ 
          int length = nums.length;
          if (length % 2 == 0) {
            return length/2 - 1;
          } else {
            return length/2;
          }
        }
      
      
        /** Returns the average, as a double, of the average of the first, last, and
         *  middle elements of nums; the middle element should be the element at the
         *  index determined by getNumsMiddleIndex
         *
         *  @return  the average of the first, last, and middle elements
         */
        public double getNumsAverage()
        { /* implement this method! */ 
          double average = nums[0] + nums[nums.length-1] + nums[getNumsMiddleIndex()];
          return average /= 3;
        }
      
      
        /** Returns true if both the nums and words arrays have the same number of
         *  elements, returns false otherwise.
         *
         *  @return  returns true if the  two arrays are equal in length; false if not
         */
        public boolean sameLengths()
        { /* implement this method! */ 
          if (nums.length == words.length) {
            return true;
          } else {
            return false;
          }
        }
      
        /** Updates the element of the words array at index idx to the new value
         *  provided and returns true to indicate a successful update; if, however,
         *  idx exceeds the bounds of the words array, do NOT update the array and
         *  return false to indicate that the update was unsuccessful.
         *
         *  @return  true if the update was successful, false otherwise.
         */
        public boolean updateWordsListAt(int idx, String newValue)
        { /* implement this method */ 
          if (!(idx > words.length-1)) {
            words[idx] = newValue;
            return true;
          } else {
            return false;
          }
        }
      
      
        /** Returns the number of characters that are contained in the last element of
         *  the words list; however, if the last element of the array is null return 0
         *
         *  @return  how many characters are in the last element of words; 0 if the 
         *           last element is null
         */
        public int howLongLastWord()
        { /* implement this method */ 
          if (!(words[words.length-1] == null)) {
            return words[words.length-1].length();
          } else {
            return 0;
          }
        }
      
      
        /** Returns the int in the nums array located at the specified index
         *  PRECONDITION:  assume idx < length of nums
         *
         *  @return  the int in the nums array located at index idx
         */
        public int getNumAt(int idx) {
          /* implement this method */
          return nums[idx];
        }
        
      
        /** Returns the String in the words array located at the specified index
         *  PRECONDITION:  assume idx < length of words
         *
         *  @return  the int in the nums array located at index idx
         */
        public String getWordAt(int idx) {
          /* implement this method */
          return words[idx];
        }
// ------------------------------------------------------------------------------------------
// LAB 2:

  /** Changes the first and last element of nums to be num
   *
   *  THIS METHOD MUTATES (MODIFIES) ORIGINAL ARRAY
   *  PRECONDITION: nums.length > 0
   */
  public static void bookEnd(int[] nums, int num) {
    // IMPLEMENT ME
    nums[0] = num;
    nums[nums.length-1] = num;
  }


  /** Multiplies each number in numList by multiplier.
   *
   *  THIS METHOD MUTATES (MODIFIES) ORIGINAL ARRAY
   *  PRECONDITION: numList.length > 0
   */
  public static void multiplyBy(int[] numList, int multiplier) {
    // IMPLEMENT ME
    for (int i = 0; i < numList.length; i++) {
        numList[i] *= multiplier;
    }
  }

    /** Returns an array of ints where each element is the product
   *  of the corresponding element in numList and multiplier.
   *
   *  THIS METHOD DOES NOT MUTATE (MODIFY) ORIGINAL ARRAY
   *  PRECONDITION: numList.length > 0
   */
  public static int[] multiplyByNoModify(int[] numList, int multiplier) {
    // IMPLEMENT ME
    int[] newList = new int[numList.length];
    for (int i = 0; i < numList.length; i++) {
        newList[i] = numList[i] * multiplier;
    }
    return newList;

  }

    /** Adds a "!" to the end of each String in wordList.  However, if a
   *  a string already ends in an exclamation point, do NOT add another.
   *
   *  THIS METHOD MUTATES (MODIFIES) ORIGINAL ARRAY
   *  PRECONDITION: wordList.length > 0
   */
  public static void addExclamation(String[] wordList) {
    // IMPLEMENT ME
    for (int i = 0; i < wordList.length; i++) {
        if (!(wordList[i].endsWith("!"))) {
            wordList[i] += "!";
        }
    }
}

      /** Returns an array of booleans where each element reflects whether
   *  the corresponding element in tempList is at or below the freezing
   *  temperature of 32 (true) or not (false).
   *
   *  THIS METHOD DOES NOT MUTATE (MODIFY) ORIGINAL ARRAY
   *  PRECONDITION: tempList.length > 0
   */
  public static boolean[] isFreezing(int[] tempList) {
    // IMPLEMENT ME
    boolean[] freezing = new boolean[tempList.length];
    for (int i = 0; i < tempList.length; i++) {
        if (tempList[i] < 32) {
            freezing[i] = true; 
        } else {
            freezing[i] = false;
        }
    }
    return freezing;
  }



}
