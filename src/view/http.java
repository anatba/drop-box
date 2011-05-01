package view;


public class http implements webInterface {
	public http() {
		// TODO Auto-generated constructor stub
		System.out.println("init http");
	}
	
	public void download(){ //this function will return the requested file
		System.out.println("ask for download");
		controller.downloadFile.getInstance().execute();
	}
}
