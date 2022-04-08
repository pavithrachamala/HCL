
import java.util.Arrays;
import java.util.List;

public class ForEachEx {
	
	public static void main(String args[]) {
		List<Integer> list=Arrays.asList(1,2,3,4);
		list.forEach(i-> System.out.println(i));
	}
	
}
