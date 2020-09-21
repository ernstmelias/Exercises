package datastructures;

import java.util.Stack;

public class HammingDistance {
	
	/* The Hamming distance between two integers is the number of positions at which the corresponding bits are different. */
	/* 1   (0 0 0 1)*/
	/* 4   (0 1 0 0) */
	/* i3 - i1 = 2 */
	public int hammingDistance(int x, int y) {
	    int xor = x ^ y, count = 0;
	    /*
	     * xor = x ^ y 3 ^ 1
	     * x | y | o | i
	     * ---------------
	     * 0   0   0   0
	     * 0   0   0   1
	     * 1   0   1   2
	     * 1   0   1   3
	     */
	    for (int i=0;i<32;i++)
	   /* xor / i  & 1 will return the matching bits */
	   count += (xor >> i) & 1;
	    
	    return count;
	}
}
