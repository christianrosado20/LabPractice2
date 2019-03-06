import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Staircase {
	// Complete the staircase function below.
    static void staircase(int n) {
    	String space = " ";
    	String hashtag = "#";
    	String totalSpace = "";
    	String totalHashtag = "";
    	int spaceNum = 0;
    	int hashtagNum = 0;
    	
    	
    	for (int i = 1; i <= n; i++) {
    		spaceNum = n - i;   
    		hashtagNum = i;
    		totalHashtag = "";
    		totalSpace = "";
    		for (int u = 0; u < spaceNum; u++) {
    			totalSpace += space;
    		}
    		for (int u = 0; u < hashtagNum; u++) {
    			totalHashtag += hashtag;
    		}
    		
    		System.out.println(totalSpace + totalHashtag);
    	}
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}
