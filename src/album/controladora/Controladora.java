package album.controladora;

import album.entidades.*;
import album.persistencia.ListTestDataBase;

public class Controladora {

	private ListTestDataBase dataBase;
	
	public Controladora() throws PhotoAlbumException {
		dataBase = new ListTestDataBase();
	}
	
	public User iniciarSesion(String email, String password) throws PhotoAlbumException {
		User usuario;
		usuario = dataBase.Login(email, password);
		
		if (usuario == null) {
			throw new PhotoAlbumException("El correo o contraseña con coinciden");
			
		}
		
		if (usuario != null) {
			return usuario;
		}
		return null;
	}
	
	public boolean crearPerfil(String name, String password, String email, String document) {
		User user = new  Client(dataBase.getIdUserIncrement(), name, password, email, document);
		return dataBase.addUser(user);
	}
	
	public boolean crearAlbum(String name, String descripcion, User userId)
	{
		Album album = new Album(dataBase.getIdAlbumIncrement(), name, descripcion, userId);
		
		return dataBase.addAlbum(album);
	}
	
	public boolean agregarImagenAlAlbum(String name,String route,Album albumId) {
		Images imagen = new Images(dataBase.getIdImagesIncrement(), name, route, albumId);
		
		return dataBase.addPhoto(imagen);
	}
	
	public Album buscarAlbum(String nombreAlbun) throws PhotoAlbumException {
		Album album = dataBase.BuscarAlbum(nombreAlbun);
		
		if (album == null) {
			throw new PhotoAlbumException("El album no existe con ese nombre");
			
		}
		return album;
		
	}
	
	public Images buscarPhoto(String nombrePhoto) throws PhotoAlbumException {
		Images imagen = dataBase.buscarImage(nombrePhoto);
		
		if (imagen == null) {
			throw new PhotoAlbumException("La foto no existe con ese nombre");
			
		}
		return imagen;
		
	}
	
	
	
	
}
