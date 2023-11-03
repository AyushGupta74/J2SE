import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestStreamFunction {

	public static void main(String[] args) {
		List<Integer> lst=Arrays.asList(10,23,14,151,2,3,5,15,67);
		List<Integer> selected=new ArrayList<>();
		//find all members > 5
		for(Integer ob:lst) {
			if(ob>5) {
				selected.add(ob);
			}
		}
		System.out.println(selected);
		
		//java 1.8
		List<Integer> s=lst.stream().filter(ob->ob>5).collect(Collectors.toList());
        System.out.println(s);
	}

}
