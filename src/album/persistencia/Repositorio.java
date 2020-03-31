package album.persistencia;
import java.util.List;

public interface Repositorio {

	public abstract boolean adicionar(Object object);
	
	public abstract Object buscar(int id);
	
	public abstract boolean eliminar(int id);
	
	public List<Object> consultarBarcos();
}
