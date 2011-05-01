package model;

import java.util.ArrayList;

public class manager {
	ArrayList<userData> users;
	//database
	 private final static manager INSTANCE = new manager();		
		//CTOR
		private manager() {}
		
	   public static manager getInstance() {
		     return INSTANCE;
	   }
	   
	   public void download(){
		   System.out.println("download file success");
		   
	   }

}
