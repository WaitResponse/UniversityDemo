package com.gem.java.oop;

public class Demo02 {
	
	//int[][] arr = new int[100][100];
	
	public static void main(String[] args) {
		/*
		
		for(int row = 0 ; row<d.arr.length ; row++){
			for(int col=0;col<row+2;col++){
				System.out.print(d.arr[row][col]+"\t");
			}
			System.out.println();
		}
		*/
		Demo02 d = new Demo02();
		for(int row = 0 ; row<10 ; row++){
			for(int col=0;col<row+2;col++){
				System.out.print(d.getNum(row, col)+"\t");
			}
			System.out.println();
		}
	}
	
	//����������꣨�к��У����Ҹ��������λ���ϵ����ֵ�ֵ
	int getNum(int row , int col){
		if(col==0){
			return 1 ;
		}else if(row+1==col){//ÿһ�е����һ��
			return 1 ;
		}else{
			return getNum(row-1,col-1) + getNum(row-1,col) ;
		}
	}
}
/*
      1	  1
    1	2	1
  1	  3	  3	  1
1	4	6	4	1


1	1
1	2	1
1	3	3	1
1	4	6	4	1



*/