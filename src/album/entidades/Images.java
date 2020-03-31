package album.entidades;

public class Images {
	private int id;
	private String name;
	private String route;
	private Album albumId;
	
	public Images(int id,String name,String route,Album albumId) {
		this.id = id;
		this.name = name;
		this.route= route;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRoute() {
		return route;
	}
	public void setRoute(String route) {
		this.route = route;
	}
	public Album getAlbumId() {
		return albumId;
	}
	public void setAlbumId(Album albumId) {
		this.albumId = albumId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}
