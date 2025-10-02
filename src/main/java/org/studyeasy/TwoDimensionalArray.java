package org.studyeasy;

public class TwoDimensionalArray {
    int[][] arr=null;

    public TwoDimensionalArray(int rows,int column){
        this.arr=new int[rows][column];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=Integer.MIN_VALUE;
            }
        }
    }

    public void insertValueInArray(int row,int col,int valueToBeInserted){
        try {
            if(arr[row][col]==Integer.MIN_VALUE){
                arr[row][col]=valueToBeInserted;
                System.out.println("Value Inserted Successfully");
            }else
                System.out.println("The cell is already occupied");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index for 2D array");
        }
    }
    public void accessValueInArray(int row,int col){
        try {
            System.out.println("Accessing row:"+row+"and Column:"+col);
            System.out.println("Cell value is "+arr[row][col]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index for 2D array");
        }
    }
    public void traverse2dArray(){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.println(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public void search(int valueToBeSearch){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==valueToBeSearch){
                    System.out.println("value found at row:"+i+" column:"+j);
                    return;
                }
            }
        }
        System.out.println("it is not in array");
    }
    public void deleteValueInArray(int row,int col){
        try {
            System.out.println("Successfully deleted value of"+row+"and Column:"+col);
            arr[row][col]=Integer.MIN_VALUE;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index for 2D array");
        }
    }
}
