package forgetit.common;

import forgetit.db.DBEntityHandler;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Display display = new Display();
		// new MainWindow(display);
		// display.dispose();

		DBEntityHandler handler = new DBEntityHandler();
		
		/*Entity entityOne = new Entity();
		entityOne.setDescription("Hello there!");
		entityOne.setTitle("SomeTestEntity");
		handler.addEntity(entityOne);*/
		
		handler.listEntities();
		
	
		
		
	}
}
