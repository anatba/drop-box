package model;

import java.io.File;
import java.util.ArrayList;


public class file {
	File myFile;
	ArrayList<userData> allows=new ArrayList<userData>();//the user who allow each file
	userData userFile;//the file's own
	
	public file(File file, userData user) {
		// TODO Auto-generated constructor stub
		System.out.println("init file");
		myFile=file;
		userFile=user;
		
	}
}
