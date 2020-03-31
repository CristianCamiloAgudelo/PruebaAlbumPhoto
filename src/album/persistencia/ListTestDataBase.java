package album.persistencia;

import java.util.*;

import album.entidades.*;

public class ListTestDataBase implements Repositorio{

	private List<User> users;
	private List<Album> albums;
	private List<Images> images;
	private int idUserIncrement = 1;
	private int idAlbumIncrement = 1;
	private int idImagesIncrement = 1;
	
	public ListTestDataBase() {
		users = new ArrayList<User>();
		albums = new ArrayList<Album>();
		images = new ArrayList<Images>();
	}
	
	@Override
	public boolean adicionar(Object object) {
		
		return false;
	}

	@Override
	public Object buscar(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean eliminar(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Object> consultarBarcos() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	public boolean addUser(User usuario) {
		for (User user : users) {
			if (usuario.getEmail().equals(user.getEmail())) {
				return false;
			}
			
		}
		idUserIncrement++;
		return users.add(usuario);
	}

	public User BuscarUser(int userId) {
		for (User user : users) {
			if (user.getId()==userId) {
				return user;
			}
		}
		return null;
	}
	
	public User Login(String email, String contraseña) {
		for (User user : users) {
			if (user.getEmail().equals(email) && user.getPassword().equals(contraseña)) {
				return user;
			}
		}
		return null;
	}
	
	public boolean deleteUser(int userId) {
		for (User user : users) {
			if (user.getId()==userId) {
				return users.remove(user);
			}
		}
		return false;
	}
	
	
	public boolean addAlbum(Album albu) {
		for (Album album : albums) {
			if (album.getName().equals(album.getName())) {
				return false;
			}
			
		}
		idAlbumIncrement++;
		return albums.add(albu);
	}

	public Album BuscarAlbum(String nombre) {
		for (Album album : albums) {
			if (album.getName().equals(nombre)) {
				return album;
			}
		}
		return null;
	}
	
	public boolean deleteAlbum(int albumId) {
		for (Album album : albums) {
			if (album.getId()==albumId) {
				return albums.remove(album);
			}
		}
		return false;
	}
	
	public boolean addPhoto(Images image) {
		for (Images imagen : images) {
			if (imagen.getName().equals(imagen.getName())) {
				return false;
			}
			
		}
		idImagesIncrement++;
		return images.add(image);
	}

	public Images buscarImage(String nombreImage) {
		for (Images image : images) {
			if (image.getName().equals(nombreImage)) {
				return image;
			}
		}
		return null;
	}
	
	public boolean DeleteImage(int imageId) {
		for (Images image : images) {
			if (image.getId()==imageId) {
				return images.remove(image);
			}
		}
		return false;
	}

	public int getIdUserIncrement() {
		return idUserIncrement;
	}

	public int getIdAlbumIncrement() {
		return idAlbumIncrement;
	}

	public int getIdImagesIncrement() {
		return idImagesIncrement;
	}

	
}

