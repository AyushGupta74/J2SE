package assingment25;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class reflection {

	public static void main(String[] args) {
		ref ob=new ref();
		Class cls=ob.getClass();
		Field[] flist=cls.getDeclaredFields();
		for(Field f:flist) {
			System.out.println("Name : "+f.getName()+"---Modifier : "+f.getModifiers());
		}
		
		flist[0].setAccessible(true);
		System.out.println(ob);
		try {
			flist[0].setInt(ob, 20);
		} catch (IllegalArgumentException | IllegalAccessException e) {
		
			e.printStackTrace();
		}
		System.out.println(ob);
		
		Method[] mlist=cls.getMethods();
		for(Method m:mlist) {
			System.out.println(m.getName());
		}
		
		try {
			Method m=cls.getDeclaredMethod("method1", int.class);
			m.invoke(ob, 56);
		} catch (InvocationTargetException |NoSuchMethodException|SecurityException|IllegalAccessException|IllegalArgumentException e) {
			
			e.printStackTrace();
		}   
		
		Constructor[] clist=cls.getConstructors();
		for(Constructor c:clist) {
			System.out.println("Name : "+c.getName()+" parameters : "+c.getParameterCount());
			
		}
		
	
		System.out.println("Using static members");
		Class cls1=ref.class;
		Method[] mstatic=cls1.getMethods();
		for(Method m1:mstatic) {
		
			if(m1.getModifiers()==9)
			   System.out.println(m1.getName()+"---"+m1.getModifiers());
		}
		
		Field[] fstatic=cls1.getDeclaredFields();
		for(Field f:fstatic) {
			
			if(f.getModifiers()==8)
			System.out.println(f.getName()+","+f.getModifiers());
		}
		
		Method m;
		try {
			m=cls1.getDeclaredMethod("mystaticmethod");
			try {
				m.invoke(ref.class);
			} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
				
				e.printStackTrace();
			}
		} catch (NoSuchMethodException | SecurityException e) {
			
			e.printStackTrace();
		}
		

	}

}
