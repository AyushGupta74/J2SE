package com.demo.beans;

public class ChildOfAccessModifier extends AccessModifiers
{
	AccessModifiers c = new AccessModifiers();
	
	
	public void display()
	{
		System.out.println(c.getEmail());   // email get accessed as it is protected ( protected members accessed to subclass)
		try {
			finalize();
		} catch (Throwable e) {
			
			e.printStackTrace();
		}
	}
	
	
	@SuppressWarnings("deprecation")
	protected void finalize() throws Throwable
    {
        try {
 
            System.out.println("inside ChildOfAccessModifiers class of finalize() method :");
        }
        catch (Throwable e) {
 
            throw e;
        }
        finally {
 
            System.out.println("Calling finalize method of the Object class");
 
            // Calling finalize() of Object class
            super.finalize();
        }
    }
	
	
}
