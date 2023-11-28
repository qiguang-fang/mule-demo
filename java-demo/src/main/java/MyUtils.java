import java.util.Random;

public class MyUtils {
	public static String appendRandom(String base) {
		return base + new Random().nextInt();
	}
}
