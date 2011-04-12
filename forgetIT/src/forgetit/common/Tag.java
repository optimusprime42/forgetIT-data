package forgetit.common;

/**
 * 
 * @author David Henn
 * @date 15.3.2011
 *
 */

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@javax.persistence.Entity
public class Tag {

	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String description;

	public Tag() {

	}

	public Tag(int id) {

		this.setId(id);
	}

	public Tag(int id, String name) {

		this.setId(id);
		this.name = name;
	}

	public Tag(int id, String name, String description) {

		this.setId(id);
		this.name = name;
		this.description = description;
	}

	public String getName() {

		return name;
	}

	public void setName(String name) {

		this.name = name;
	}

	public String getDescription() {

		return description;
	}

	public void setDescription(String description) {

		this.description = description;
	}

	public int getId() {

		return id;
	}

	private void setId(int id) {

		this.id = id;
	}

}
