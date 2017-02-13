package day07.oop;

public class Game_俄罗斯方块格子 {
	int row; //行号
	int column; //列号
	
	void drop(){ //下落一格
		row++; //行号+1
	}
	
	void moveLeft(int n){ //左移n格
		column -= n; //列号-n
	}
	
	String position(){ //获取行号和列号（位置）
		return row+","+column;
	}
}
