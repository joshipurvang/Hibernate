package prg;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Purvang
 * Using HashSet :

This method is better than the Brute Force method. It gives O(n) performance.
 You know that HashSet holds only unique elements. It never allows duplicate elements
  We use this property of HashSet to find duplicates in an array. 
 What we do is we try to add each element of an array into HashSet using add() method.
  This method adds only unique elements into HashSet. If you try to add duplicate element, it will return false.
 *
 */
public class DuplicatesInArray {
	public static void main(String[] args) {
		String[] strArray = { "abc", "def", "mno", "xyz", "pqr", "xyz", "def" };

		HashSet<String> set = new HashSet<String>();

		for (String arrayElement : strArray) {
			if (!set.add(arrayElement)) {
				System.out.println("Duplicate Element is : " + arrayElement);
			}
		}
	}
}
