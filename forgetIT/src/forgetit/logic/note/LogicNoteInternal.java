package forgetit.logic.note;

import forgetit.common.Entity;
import forgetit.db.DBEntityHandler;
import forgetit.db.IDBEntity;
import forgetit.logic.interfaces.ILogicInternalNote;

/**
 * 
 * @author David Henn
 * @date 2.3.2011
 * implementation of ILogicInternalNote
 * @see ILogicInternalNote
 */
public class LogicNoteInternal implements ILogicInternalNote{
	
	private IDBEntity dbNote;
	
	public LogicNoteInternal(){
		dbNote = new DBEntityHandler();
	}

	@Override
	public void addNote(Entity note) {
		//TODO add check input
		dbNote.addEntity(note);
	}

	@Override
	public void deleteNode(Entity note) {
		//TODO check input
		dbNote.deleteEntity(note);
		
	}

	@Override
	public void changeNote(Entity note) {
		//TODO check input
		dbNote.editEntity(note);
		
	}

}
