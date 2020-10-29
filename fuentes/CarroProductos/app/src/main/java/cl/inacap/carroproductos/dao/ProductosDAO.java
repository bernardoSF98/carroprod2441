//package
package cl.inacap.carroproductos.dao;
//imports
import java.util.List;
import cl.inacap.carroproductos.dto.Producto;
//class
public interface ProductosDAO {

    List <Producto> getAll();
    Producto save (Producto p);


}
