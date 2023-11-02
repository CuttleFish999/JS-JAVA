package hw01;
//@@@@@@@@@ 01prize.html
//(迴圈, Math, 運算, 輸出…練習)  
//摸彩金 : 有11顆彩球, 彩球面額為0-10之間, 若摸到的彩球不為0,則可繼續摸彩,若摸到的彩球為0,則停止摸彩,並計算其摸彩次數及彩金總金額(單位:佰元)

public class hw01 {
	public static void main(String[] args) {
		int ballCount = 11;
		int ballNum;
		int prize = 0;
		int count = 0;
		
		do {
			ballNum = (int)(Math.random() * 10);
			prize += 100;
			count++;
			
		} while(ballNum != 0);
		
		System.out.println("第 "+ count +" 次抽獎;累積獎機為: " + prize + "元(NT)。" );
	}
}
