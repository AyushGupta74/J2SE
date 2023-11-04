import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
//import static java.lang.Math.*;
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
		List<Integer> s1=lst.stream().filter(ob->ob>5).collect(Collectors.toList());
        System.out.println(s1);
        Predicate<String> p=(ob)->{return ob.length()>5;};
        Supplier<String> s=()->{String[] str={"Hello","Welcome","greet"};
        int x=(int) Math.random()*2+1;   
        return str[x];
        };
        System.out.println(s.get());
        System.out.println(s.get());
        List<Integer> squares=lst.stream().map(ob->ob*ob).collect(Collectors.toList());
        System.out.println(squares);
        Optional<Integer> ob=lst.stream().reduce((accum,num)->{return accum+num;});
        int ans=0;
        if(ob.isPresent()) {
        	 ans=ob.get();
        }
        System.out.println(ans);
        ob=lst.stream().reduce((accum,num)->accum>num?accum:num);
        System.out.println(ob.orElse(0));
        
        ob=lst.stream().filter(ob1->ob1>5).findFirst();
        System.out.println(ob.orElse(0));
        boolean ans1=lst.stream().allMatch(a->{
        	System.out.println("in allmatch  "+a);
        	return a<=10;});
        System.out.println(ans1);
        ob=lst.stream().max(Integer::compareTo);
        System.out.println(ob.orElse(0));
        lst.stream().sorted().forEach(System.out::println);
	}

}
