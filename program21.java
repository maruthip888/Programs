package September;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

//Reverse Words in a sentence
public class program21 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a sentence: ");
	        String sentence = sc.nextLine();
	        String[] words = sentence.split("\\s+");
	        Collections.reverse(Arrays.asList(words));
	        System.out.println("Reversed: " + String.join(" ", words));
	    }
	}

