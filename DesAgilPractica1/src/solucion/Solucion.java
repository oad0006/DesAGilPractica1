package solucion;
/**
 * Clase que se encarga de dar una solución a un bug
 * @author Oscar Eduardo Aguado Diaz
 *
 */
public class Solucion {

	/**
	 * Propiedad que almacena un booleano indicando
	 * si existe un bug o no
	 */
	private boolean _existeBug;
	
	/**
	 * Constructor
	 */
	public Solucion() {
		_existeBug = false;
 	}

	/**
	 * Obtener si existe un bug
	 * @return
	 */
	public boolean is_existeBug() {
		return _existeBug;
	}

	/**
	 * Asignar si existe bug
	 * @param _existeBug
	 */
	public void set_existeBug(boolean _existeBug) {
		this._existeBug = _existeBug;
	}

}
