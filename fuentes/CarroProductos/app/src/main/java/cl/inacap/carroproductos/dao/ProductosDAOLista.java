//package
package cl.inacap.carroproductos.dao;
//imports
import java.util.ArrayList;
import java.util.List;
import cl.inacap.carroproductos.dto.Producto;
//class
public class ProductosDAOLista implements ProductosDAO {
    //variables
    private List<Producto> productos = new ArrayList<>();
    private static ProductosDAOLista instancia;
    //singleton
    private ProductosDAOLista(){
        //1
        Producto p = new Producto();
        p.setNombre("Coca Cola Zero");
        p.setDescripcion("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla nulla tortor, viverra eleifend lorem vitae, viverra porta quam. Nam vel pharetra purus.");
        p.setPrecio(1000);
        p.setFoto("https://jumbo.vteximg.com.br/arquivos/ids/336745/Principal-3942.jpg?v=637237316746070000");
        productos.add(p);
        //2
        p = new Producto();
        p.setNombre("Centella");
        p.setDescripcion("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla nulla tortor, viverra eleifend lorem vitae, viverra porta quam. Nam vel pharetra purus.");
        p.setPrecio(800);
        p.setFoto("https://www.casagamovi.cl/wp-content/uploads/2020/08/helado-centella-manzana.png");
        productos.add(p);
        //3
        p = new Producto();
        p.setNombre("Chocolate Trencito");
        p.setDescripcion("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla nulla tortor, viverra eleifend lorem vitae, viverra porta quam. Nam vel pharetra purus.");
        p.setPrecio(1500);
        p.setFoto("https://7483c243aa9da28f329c-903e05bc00667eb97d832a11f670edad.ssl.cf1.rackcdn.com/01004049-AnNMfDfJ.png");
        productos.add(p);
    }
    //get
    public static ProductosDAOLista getInstance(){
        if (instancia == null){
            instancia = new ProductosDAOLista();
        }
        return instancia;
    }

    @Override
    public List<Producto> getAll() {
        return productos;
    }

    @Override
    public Producto save(Producto p) {
        productos.add(p);
        return p;
    }
}//end