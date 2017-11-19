package com.gem.java.oop;

public class Demo08 {
	public static void main(String[] args) {
		Demo08 d=new Demo08();
		System.out.println(1);
		for(int row=0;row<10;row++){
			for(int col=0;col<row+2;col++){
				System.out.print(d.getY(row, col)+"\t");
			}
			System.out.println();	
		}
		}
	
	int getY(int row,int col){
		if(col==0){
			return 1;
		}else if(row+1==col){			
			return 1;
		}else{
			return getY(row-1,col-1)+getY(row-1,col);
		}
	}
}
	
