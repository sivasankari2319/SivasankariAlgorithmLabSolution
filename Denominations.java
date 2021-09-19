package com.greatlearning.main;

import java.util.Scanner;

public class Denominations {
	private static Scanner sc = new Scanner( System.in );
	
	public static void main(String[] args) {
		
		System.out.println(" How many denominations? ");
		int size = sc.nextInt();
		
		int[] denominations = new int[size];
		System.out.println(" Enter the currency denomination: ");
		for( int i =0; i < size; i++) {
			denominations[i] = sc.nextInt();
		}
		
		MergeSortImplementation ms = new MergeSortImplementation();
		ms.sort(denominations, 0, denominations.length -1);
		
		for( int i = 0; i < size; i++) {
			System.out.println( denominations[i] );
		}
		
		System.out.println("What is the amount that you need to pay? ");
		int amount = sc.nextInt();
	
		for( int i = 0; i < denominations.length; i++) {
			int n = (int) ( amount / denominations[i] );
			System.out.println( denominations[i] + " : " + n );
			
			amount = amount - ( n* denominations[i] );
			
			if( i == denominations.length -1 && amount != 0 ) {
				System.out.println("This amount is not possible to pay!" );
			}
			
		}
	}

}
