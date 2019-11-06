public class Recursion {

    //must consider two things : Base case, i.e. when it should end, and the Recursive Case, when it should repeat
    public int sum(int[] array, int i){
        if(i >= array.length){
            return 0;                       //Base case. If we get here, either the list is empty or we're at the end and
                                            //don't want to add this recursion on anyway.
        }
        return array[i] + sum(array, i+1);  //Recursive case
    }
}
