package com.gem.java.oop;

public class Demo02 {
	public static void main(String[] args) {
		Demo02 d=new Demo02();
		for(int i=0;i<10;i++){
			for(int j=0;j<i+2;j++){
			System.out.print(d.getZB(i,j)+"\t");
			}
			System.out.println();
		}
	}
	
	
	//你告我行数和列数，我告诉你这个位置上的数
	public int getZB(int row,int col){
	if(col==0){
		return 1;
	}else if(col==row+1){
		return 1;	
	}else{
		return getZB(row-1,col-1)+getZB(row-1,col);
	}
	
}
}
