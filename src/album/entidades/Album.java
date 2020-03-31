package album.entidades;

public class Album {
	private int id;
	private String name;
	private String description;
	private User userId;
	
	public Album(int id, String name, String descripcion, User userId) {
		this.id = id;
		this.name = name;
		this.description = descripcion;
		this.userId = userId;
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
	public User getUserId() {
		return userId;
	}
	public void setUserId(User userId) {
		this.userId = userId;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}

	
	
}
