package com.codegnan.Overload;

import java.util.Scanner;

public class DataMatrix {

	private int matrixId;
	private int rows;
	
	public DataMatrix(int matrixId) {
		super();
		this.matrixId = matrixId;
	}

	public DataMatrix(int matrixId, int rows) {
		super();
		this.matrixId = matrixId;
		this.rows = rows;
	}

	public int findMax(int[][] matrix) {
		int max = Integer.MIN_VALUE;
		for(int[] row: matrix) {
			for(int val : row) {
				if(val>max) {
					max= val;
				}
			}
		}
		if(max>1000000)
			max=1000000;
		return max;
	}
	
	public int findMax(int[][] matrix, int rowIndex) {
		int max = Integer.MIN_VALUE;
		for(int val: matrix[rowIndex]) {
			if(val > max) {
				max = val;
			}
		}
		if(max>1000000)
			max=1000000;
		return max;
	}
	
	public int findMaxByColumn(int[][] matrix, int colIndex) {
		int max = Integer.MIN_VALUE;
		for(int i=0;i<matrix.length;i++) {
			if(matrix[i][colIndex] > max) {
				max = matrix[i][colIndex];
			}
		}
		if(max>1000000)
			max=1000000;
		return max;
	}
	
	public void showMatrixId() {
        System.out.println(matrixId);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        int[][]matrix = new int[rows][columns];
        for(int i=0;i<rows;i++) {
        	for(int j=0;j<columns;j++) {
        		matrix[i][j]=sc.nextInt();
        	}
        }
        
        // Inputs for method 2 and method 3
        int rowIndex = sc.nextInt();
        int colIndex = sc.nextInt();
        
        // Constructor inputs

        int id1 =sc.nextInt();
        int id2 = sc.nextInt();
        int rows2 = sc.nextInt();
        
        // Object creation
        DataMatrix d1 = new DataMatrix(id1);
        DataMatrix d2 = new DataMatrix(id2, rows2);

        System.out.println(d1.findMax(matrix));
        System.out.println(d1.findMax(matrix, rowIndex));
        System.out.println(d1.findMaxByColumn(matrix, colIndex));
        d1.showMatrixId();
        d2.showMatrixId();
        
        sc.close();
	}

}
