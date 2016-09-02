package nyc.c4q.hakeemsackesbramble;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Vehicle bike = new Bicycle(10);

        System.out.println(bike.slowDown(5));
        System.out.println(bike.speedUp(20));
        System.out.println(bike.applyBrakes());
    }
}
