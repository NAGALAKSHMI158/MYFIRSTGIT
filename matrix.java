import java.util.*;
public class matrix {
	public static void main(String[] args){
		int sum = 0,i,j;
	Scanner a=new Scanner(System.in);
	System.out.println("enter the number of rows: ");
	int num_row = a.nextInt();
	System.out.println("enter the number of columns: ");
	int num_col = a.nextInt();
	int[][] mat =new int [num_row][num_col]; 
    int[][] transpose = new int [5][5];
	System.out.println("enter the elements of the matrix: ");
	for(i=0;i<num_row;i++){
		for(j=0;j<num_col;j++){
			mat[i][j]=a.nextInt();
		}
	}
	System.out.println("the matrix is: ");
	for(i=0;i<num_row;i++){
		for(j=0;j<num_col;j++){
			System.out.println(mat[i][j] + "\t");
		}
		System.out.println(" ");
	}
	for(i=0;i<num_row;i++){
		for(j=0;j<num_col;j++){
			if(i==j){
				sum=sum+mat[i][j];
			}
		}}
		for(i=0;i<num_row;i++){
		for(j=0;j<num_col;j++){
			transpose[i][j]=mat[j][i];
		}}
		System.out.println("transpose of the matrix: ");

        for(i=0;i<num_row;i++){
		for(j=0;j<num_col;j++){
			System.out.println(transpose[i][j]);
		}
		System.out.println(" ");}
		
		System.out.println("sum of the diagonal matrix: " + sum);
	}
}