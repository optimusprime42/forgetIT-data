package forgetit.common;

public enum Category {
	TODO, NOTE, APPOINTMENT;

	private int id;

	public void setId(int id) {

		this.id = id;
	}

	public int getId() {

		return id;
	}

}
