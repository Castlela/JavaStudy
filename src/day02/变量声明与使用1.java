package day02;
//变量例子
public class 变量声明与使用1 {

	public static void main(String[] args) {
		/*
		 * 变量声明 & 命名：
		 * 1、名称不能以数字或特殊符号开头
		 * 2、名称建议以小写字母开头、下划线_、$符号开头 
		 * 3、见名知意
		 * 4、不能使用关键字命名*/
		int age;
		int height,weight;
		double salary = 6000;
//******************************************************		
		/*
		 * 变量初始化 & 赋值
		 */
		int a = 100; //声明同时赋值	
		long l; //先声明，使用前要先赋值
//-------------------------------------------------------		
		//System.out.println(l); //未赋值就打印，会报错。
		l = 2000; 
		System.out.println(l); //放在这个位置才对
//-------------------------------------------------------			
		//int c = 4.5;  //必须与数据类型匹配
			
	}

}
