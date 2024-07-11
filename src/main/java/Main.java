
import jakarta.persistence.EntityManager;
import java.util.List;
import org.luisDeleon.webapp.model.Producto;
import org.luisDeleon.webapp.util.JPAUtil;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author informatica
 */
public class Main {
    private static EntityManager em = JPAUtil.getEntityManager();
    
    public static void main(String [] args){
        List<Producto> productos = em.createQuery("SELECT p FROM Producto p",Producto.class).getResultList();
                          
        productos.forEach(producto -> System.out.println(producto));
    }
}
