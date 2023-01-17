//package intermediatoryops;
package intermediatoryops;
import java.util.*;
import java.util.stream.Stream;
public class NestedlistDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List animal1=Arrays.asList("cat","Lion","Tiger","Leapord","cheetah");
		List animal2=Arrays.asList("Dog","wolf","Fox","Bear");
		List animal3=Arrays.asList("wolf","lion","tiger","bear");
		Stream<List<String>>mylist=Stream.of(animal1,animal2,animal3);
		mylist.flatMap((a)->a.stream()).distinct().forEach(System.out::println();

	}

}

