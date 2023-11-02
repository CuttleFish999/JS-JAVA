package hw01;
//請寫一個rand(min,max)函數,可以傳入min與max的整數,並回傳一個介於min和max間的整數值 (大於等於min,小於等於max)

//(Math, 函式練習)

public class hw03 {
	public static void main(String[] args) {
		rand(10, 100);
	}

	public static int rand(int min, int max) {
		
		int rand = (int)(Math.random() * (max - min + 1) + min);
		System.out.print(rand);
		return rand;
	}
}
