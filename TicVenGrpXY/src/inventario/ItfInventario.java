package inventario;

import java.time.LocalDateTime;

import extras.Localizacion;
import extras.TicVenError;

/****
 * 
 * @author JoseA
 * @comentario El borrado de elementos del inventario se gestiona a través de su fecha de baja. 
 * No se borrar nunca nada, pero se debe controlar en que búsquedas se utilizan los elementos dados de baja
 * para que no figuren como desactualizados o en capital inmovilizado
 *
 */
public interface ItfInventario {
	// Funciones contra lista de inventario
	int creaElementoInventario(int idFactura, int tipo, String modelo, Localizacion loc, String responsableDNI) throws TicVenError; // return idInv
	ElementoInventario getElementoInventario(int idInv);						// null si no existe.
	ElementoInventario modificaInventario(int idInv, Localizacion loc);			// null si no modifica.
	ElementoInventario modificaInventario(int idInv, String responsableDNI);	// null si no modifica.
	void baja(int idInv, LocalDateTime fechabaja) throws TicVenError;
	int[] buscar(int tipo, String Modelo, Localizacion loc, String responsableDNI); // null si no hay; (null en campos sin filtro)
	
	// Funciones de colaboraci�n con gesti�n econ�mica.
	int getIdFactura(int idInv) throws TicVenError;
	float getCoste(int idInv) throws TicVenError;
	void pagaElementoInventario(int idInv) throws TicVenError; // la excepci�n distingue error con inventario o con factura.

}
