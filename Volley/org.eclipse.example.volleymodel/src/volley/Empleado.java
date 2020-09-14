/**
 */
package volley;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Empleado</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link volley.Empleado#getCargo <em>Cargo</em>}</li>
 *   <li>{@link volley.Empleado#getSueldo <em>Sueldo</em>}</li>
 *   <li>{@link volley.Empleado#getFechaInicio <em>Fecha Inicio</em>}</li>
 *   <li>{@link volley.Empleado#getFechaFin <em>Fecha Fin</em>}</li>
 * </ul>
 *
 * @see volley.VolleyPackage#getEmpleado()
 * @model
 * @generated
 */
public interface Empleado extends Persona {
	/**
	 * Returns the value of the '<em><b>Cargo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cargo</em>' attribute.
	 * @see #setCargo(String)
	 * @see volley.VolleyPackage#getEmpleado_Cargo()
	 * @model
	 * @generated
	 */
	String getCargo();

	/**
	 * Sets the value of the '{@link volley.Empleado#getCargo <em>Cargo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cargo</em>' attribute.
	 * @see #getCargo()
	 * @generated
	 */
	void setCargo(String value);

	/**
	 * Returns the value of the '<em><b>Sueldo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sueldo</em>' attribute.
	 * @see #setSueldo(double)
	 * @see volley.VolleyPackage#getEmpleado_Sueldo()
	 * @model
	 * @generated
	 */
	double getSueldo();

	/**
	 * Sets the value of the '{@link volley.Empleado#getSueldo <em>Sueldo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sueldo</em>' attribute.
	 * @see #getSueldo()
	 * @generated
	 */
	void setSueldo(double value);

	/**
	 * Returns the value of the '<em><b>Fecha Inicio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fecha Inicio</em>' attribute.
	 * @see #setFechaInicio(Date)
	 * @see volley.VolleyPackage#getEmpleado_FechaInicio()
	 * @model
	 * @generated
	 */
	Date getFechaInicio();

	/**
	 * Sets the value of the '{@link volley.Empleado#getFechaInicio <em>Fecha Inicio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fecha Inicio</em>' attribute.
	 * @see #getFechaInicio()
	 * @generated
	 */
	void setFechaInicio(Date value);

	/**
	 * Returns the value of the '<em><b>Fecha Fin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fecha Fin</em>' attribute.
	 * @see #setFechaFin(Date)
	 * @see volley.VolleyPackage#getEmpleado_FechaFin()
	 * @model
	 * @generated
	 */
	Date getFechaFin();

	/**
	 * Sets the value of the '{@link volley.Empleado#getFechaFin <em>Fecha Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fecha Fin</em>' attribute.
	 * @see #getFechaFin()
	 * @generated
	 */
	void setFechaFin(Date value);

} // Empleado
