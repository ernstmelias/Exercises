package mit6092;

import java.util.Arrays;
import java.util.List;

import datastructures.Sorting;

public class Marathon {

	public static void runnerFastest()
	{
		String[] names = {
	            "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
	            "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
	            "Aaron", "Kate"
	        };

	        int[] times = {
	            341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
	            343, 317, 265
	        };
	    Integer [] wrapper = new Integer [times.length];
	    int start=0;
	    for(int a : times)
	    {
	    	wrapper[start]=a;
	    	start++;
	    }
	   
	   int [] sortedTimes = Sorting.bubbleSort(times);
	   int first = Arrays.asList(wrapper).indexOf(sortedTimes[0]);
	   int second = Arrays.asList(wrapper).indexOf(sortedTimes[1]);
	   System.out.println("Fastest time: " + sortedTimes[0] + " Name: " + names[first]);
	   System.out.println("Second Fastest time: " + sortedTimes[1] + " Name: " + names[second]);
	}
	
	
}
