package health_check;

import java.util.Scanner;

import javax.swing.JFrame;

public class Data extends JFrame {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("身長と体重を入力して下さい");
		double height = scanner.nextDouble();
		double weight = scanner.nextDouble();
		
		double bmi = weight / ((height / 100) * (height / 100));
		
		if(bmi >= 26.5) {
			System.out.println("BMI値：" + bmi + "\nチェック結果：肥満");
		} else if(bmi < 26.5 && bmi >= 24) {
			System.out.println("BMI値：" + bmi + "\nチェック結果：太り気味");
		} else if(bmi < 24 && bmi >= 20) {
			System.out.println("BMI値：" + bmi + "\nチェック結果：標準");
		} else if(bmi < 20 && bmi >= 18.5) {
			System.out.println("BMI値：" + bmi + "\nチェック結果：痩せ気味");
		} else if(bmi < 18.5) {
			System.out.println("BMI値：" + bmi + "\nチェック結果：低体重");
		} else {
			System.out.println("エラーが発生しました");
		}

	}

}
