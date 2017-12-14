package by.htp.lesson4;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//int[] x = newArr(100);
		//double[] y = newArrDouble(20);
		//printArr(x);
		//printArr(delOnMax(x));
		//printArr(y);
		//printArr(arrMagic(y));
		int[][] mat  = newMatrix();
		//printMatrix(mat);
		//swapRow(mat);
		//colMax(mat);
		//printMatrix(mat);
		//isItIt(mat, 5);
		iGotHeadAcheWhenDevelopThis(mat);
	}

	// Task1
	public static double[] delOnMax(int[] x) {
		double[] del = new double[x.length];
		double max = max(x);
		for (int i = 0; i < x.length; i++) {
			del[i] = x[i] / max;
		}
		return del;
	}

	// Task2
	public static double[] arrMagic(double[] x) {
		int counter = 0;
		double sum =0;
		for (int i=0;i<x.length;i++){
			if (i%2==0 && x[i]>0){
				counter++;
				sum = sum + (x[i]*x[i]);
			}
		}
		double[] B = new double[counter];
		int countB=0;
		for (int j=0;j<x.length;j++){
			if (j%2==0 && x[j]>0){
				B[countB] = x[j];
				countB++;
			}
		}
		System.out.println("Sum = "+sum);
		return B;
	}
	//Task3
	public static void swapRow(int[][] x){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first row to swap (from 1 to "+x[0].length+")");
		int row1 = sc.nextInt()-1;
		System.out.println("Enter seckond row to swap(from 1 to "+x[0].length+")");
		int row2 = sc.nextInt()-1;
		int tempRow =0;
		int tempCol =0;
		int temp = 0;
		for (int i=0;i<x[row1].length;i++){
			temp = x[row1][i];
			x[row1][i] = x[row2][i];
			x[row2][i]= temp;
		}
	}
	//Task4
	public static void colMax(int[][] x){
		for(int i=0;i<x[0].length;i++){
			int max = x[0][i];
			int index=1+i;
			for (int j=0;j<x.length;j++){
				if (x[j][i]>max){
					max = x[j][i];
				}
			}
			System.out.println("Column "+index+" is "+max);
		}
	}
	//Task5
	public static void isItIt(int[][] x,int it){
		int counter =0;
		for (int i=0;i<x[0].length;i++){
			for (int j=0;j<x.length;j++){
				if (x[i][j]==it){
					counter++;
				}
			}
		}
		System.out.println(it + "occur "+counter+" times!");
	}
	//Task6
	public static void iGotHeadAcheWhenDevelopThis(int[][] x){
		int counter =0;
		for (int i=0;i<x[0].length;i++){
			for (int j=0;j<x.length;j++){
				if (x[i][j]>9 && x[i][j]<100){
					int first = x[i][j]/10;
					int second = x[i][j]%10;
					int result = first + second;
					if (result%2==0){
						counter++;
					}
				}
			}
		}
		System.out.println("They occur "+counter+" times!");
	}
	
	public static void printMatrix(int[][] x){
		int row = x[0].length;
		int col = x.length;
		for (int i=0;i<row;i++){
			for (int j=0;j<col;j++){
				System.out.print(x[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static int[][] newMatrix(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int row = sc.nextInt();
		System.out.println("Enter number of columns");
		int col = sc.nextInt();
		int[][] mat = fillMatrix(row, col);
		return mat;
	}

	
	
	
	
	
	public static int[] newArr(int x) {
		int[] arr = new int[x];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100);
		}
		System.out.println("Array is generated.");
		return arr;
	}
	public static double[] newArrDouble(int x){
		double[] arr = new double[x];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Math.random()*30-15;
		}
		System.out.println("Array is generated.");
		return arr;
	}

	public static int max(int[] x) {
		int max = x[0];
		for (int i = 0; i < x.length; i++) {

			if (x[i] > max) {
				max = x[i];
			}
		}
		return max;
	}

	public static void printArr(int[] x) {
		System.out.println("TEST");
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + " ");
		}
		System.out.println("\nTEST");
	}

	public static void printArr(double[] x) {
		System.out.println("TEST");
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + " ");
		}
		System.out.println("\nTEST");
	}
	public static int[][] fillMatrix(int row, int col){
		int[][] mat = new int[row][col];
		for (int i=0;i<row;i++){
			for (int j=0;j<col;j++){
				mat[i][j] = (int) (Math.random() * 100);
			}
		}
		return mat;
	}

}
