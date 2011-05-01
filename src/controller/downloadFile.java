package controller;

public class downloadFile implements command {
	 private final static downloadFile INSTANCE = new downloadFile();		
		//CTOR
		private downloadFile() {}
		
	   public static downloadFile getInstance() {
		     return INSTANCE;
	   }

	public void execute() {
		// TODO Auto-generated method stub
		System.out.println("send to the manager to download file");
		model.manager.getInstance().download();
		
	}

}

