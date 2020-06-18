package section6;

public class LinearSearch {

    public static void main(String[] args) {

        //dataset for searches
        int[] numbers = {10, 25, 433, 26, 73, 132, 5};

        //1) linear Search - O(n) search time
        int pos = linearSearch(numbers, 73);
        System.out.println("Position: " + pos);

    }

    public static int linearSearch(int[] dataSet, int target)
    {
        for(int i = 0; i < dataSet.length; i++)
        {
            if(dataSet[i] == target)
            {
                return i;
            }
        }
        return -1;
    }

    //binary search assumes a sorted array and can continually split our search domain in half
    public static int binarySearch(int[] dataSet, int target, int start, int end)
    {
        int middle = Math.floorDiv(start,end);
        int value = dataSet[middle];

        if(target > value)
        {
            System.out.println("bla");
            binarySearch(dataSet,target,middle,end);
        }
        else if (target < value)
        {
            //binarySearch(dataSet,target,0, middle);
            System.out.println("test 2");
        }
        return middle;
    }

}
