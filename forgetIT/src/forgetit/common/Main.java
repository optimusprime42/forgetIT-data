package forgetit.common;

import forgetit.db.DBNoteHandler;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Display display = new Display();
		// new MainWindow(display);
		// display.dispose();

		DBNoteHandler handler = new DBNoteHandler();
		
		Entity entityOne = new Entity();
		entityOne.setDescription("Hello, I am number one!");
		entityOne.setTitle("TestEntityNumberOne");
		handler.addNote(entityOne);
		
		Entity entityTwo = new Entity();
		entityTwo.setDescription("Hello, I am number two!");
		entityTwo.setTitle("TestEntityNumberTwo");
		handler.addNote(entityTwo);
		
		handler.listNotes();
		
	
		
		
	}
}
