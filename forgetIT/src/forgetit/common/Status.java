package forgetit.common;

public enum Status {
	DONE, ACTIVE, IDLE;

	private int id;

	public void setId(int id) {

		this.id = id;
	}

	public int getId() {

		return id;
	}
}
