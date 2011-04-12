package forgetit.db;

import org.junit.Test;

import forgetit.common.Entity;

public class DBNoteHandlerTest {

	@Test
	public void testAddNote() {

		DBEntityHandler handler = new DBEntityHandler();
		Entity entity = new Entity();
		entity.setDescription("Test");
		entity.setTitle("Test");
		handler.addEntity(entity);
	}
}
