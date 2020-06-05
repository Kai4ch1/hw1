import java.util.ArrayList;
import java.util.Arrays;

public class x78 {
	public static void main(String args[]) {
		Task1();
		Task2();
		Task3();
		Task4();
		Task5();
		Task7();
		Task8();
		Task9();
		Task10();
		Task11();
	}
	private static void Task1(){
		int a = -3, b = 0;
		a = a + b;
		b = b - a;
		b = -b;
		a = a - b;
		System.out.println("1)Exodus : " + a + " " + b );
	}

	public static void Task2 (){
		int start, shortBreak, longBreak, duration, numberOfLesson, currentHour, currentMin;

		start = 9; // hours
		shortBreak = 5; //min
		longBreak = 15; // min
		duration = 45; // min

		numberOfLesson = 3; // input the number of lesson
		currentHour = numberOfLesson * duration /60;
		currentMin = (((numberOfLesson - 1) / 2) + shortBreak * (numberOfLesson / 2) * longBreak * start * duration * numberOfLesson) %60;

	}
	private static void Task3(){

		int difference, time1, minutes1, seconds1, time2, minutes2, seconds2;
		time1 = 1;
		time2 = 1;

		minutes1 = 4;
		minutes2 = 6;

		seconds1 = 55;
		seconds2 = 56;

		seconds1 += time1 * 3600 + minutes1 * 60;
		seconds2 += time2 * 3600 + minutes2 * 60;

		difference =  seconds2 - seconds1;
		System.out.println("3)Answer is: " + difference );
	}
	private static void Task4(){
		int n, m, v, d;
		n = 700;
		m = 2100;
		v = n / 24;
		d = (m / v) / 24;
		d = (((m / v) %24) >0) ? d + 1 : d + 0;
		System.out.println("4)Answer is " + d);
	}
	private static void Task5(){
		int a, b, h, d;
		h = 10;
		a = 3;
		b = 2;
		d = h / (a - b);
		System.out.println("5)Answer is " + d);


	}
	private static void Task7(){
		int x, y, x1, y1;
		x = 1;
		y = 1;
		x1 = 2;
		y1 = 2;
		if (x == x1 || y == y1){
			System.out.println("7)Yes");
		}
		else {
			System.out.println("7)NO");
		}

		}
		private static void Task8(){
		int a, b, c, d;

		a = 1;
		b = 2;
		c = 2;
		d = (a == b || b == c )? (a == c? 3 : 2) : 0;
		System.out.println("8)Answer is" + d);

	}
	private static void Task9(){
		int array[] = new int[5];
		array[0] = 1;
		array[1] = 2;
		array[2] = 3;
		array[3] = 4;
		array[4] = 5;
		int count = 0;
		for(int i = 0; i < array.length - 1; i++){
			if (array[i + 1] > array[i] ) count++;
			}
		System.out.println("10)Answer is "+ count);
		}
	private static void Task10(){
		int array[] = new int[5];
		array[0] = 1;
		array[1] = 2;
		array[2] = 3;
		array[3] = 4;
		array[4] = 5;
		int count = 0;
		for(int i = 1; i < array.length - 1; i++){
			if (array[i] > array[i - 1] && array[i] > array[i + 1]) count++;
		}
		System.out.println("10)Answer is " + count);
	}
	private static void Task11(){
		int array[] = new int[6];
		array[0] = 4;
		array[1] = 5;
		array[2] = 3;
		array[3] = 4;
		array[4] = 2;
		array[5] = 3;
		int temp;
		for(int i = 0; i < array.length - 1; i++) {
			if(i %2 == 0){
				temp = array[i];
				array[i] = array[i + 1];
				array[i + 1] = temp;
			}


		}
		System.out.print("11)Answer is " + Arrays.toString(array));
	}

	}






