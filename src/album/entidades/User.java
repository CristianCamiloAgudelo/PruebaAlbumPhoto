package album.entidades;

public abstract class User {

	private int id;
	private String name;
	private String password;
	private String email;
	private String document;
		
	public User(int id, String name, String password, String email, String document) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.email = email;
		this.document = document;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDocument() {
		return document;
	}

	public void setDocument(String document) {
		this.document = document;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	

}
