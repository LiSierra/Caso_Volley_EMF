/**
 */
package volley;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Membresia</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link volley.Membresia#isEsMiembro <em>Es Miembro</em>}</li>
 *   <li>{@link volley.Membresia#getFechaInicio <em>Fecha Inicio</em>}</li>
 *   <li>{@link volley.Membresia#getFechaFin <em>Fecha Fin</em>}</li>
 *   <li>{@link volley.Membresia#getNroMiembro <em>Nro Miembro</em>}</li>
 * </ul>
 *
 * @see volley.VolleyPackage#getMembresia()
 * @model
 * @generated
 */
public interface Membresia extends Persona {
	/**
	 * Returns the value of the '<em><b>Es Miembro</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Es Miembro</em>' attribute.
	 * @see #setEsMiembro(boolean)
	 * @see volley.VolleyPackage#getMembresia_EsMiembro()
	 * @model
	 * @generated
	 */
	boolean isEsMiembro();

	/**
	 * Sets the value of the '{@link volley.Membresia#isEsMiembro <em>Es Miembro</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Es Miembro</em>' attribute.
	 * @see #isEsMiembro()
	 * @generated
	 */
	void setEsMiembro(boolean value);

	/**
	 * Returns the value of the '<em><b>Fecha Inicio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fecha Inicio</em>' attribute.
	 * @see #setFechaInicio(Date)
	 * @see volley.VolleyPackage#getMembresia_FechaInicio()
	 * @model
	 * @generated
	 */
	Date getFechaInicio();

	/**
	 * Sets the value of the '{@link volley.Membresia#getFechaInicio <em>Fecha Inicio</em>}' attribute.
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
	 * @see volley.VolleyPackage#getMembresia_FechaFin()
	 * @model
	 * @generated
	 */
	Date getFechaFin();

	/**
	 * Sets the value of the '{@link volley.Membresia#getFechaFin <em>Fecha Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fecha Fin</em>' attribute.
	 * @see #getFechaFin()
	 * @generated
	 */
	void setFechaFin(Date value);

	/**
	 * Returns the value of the '<em><b>Nro Miembro</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nro Miembro</em>' attribute.
	 * @see #setNroMiembro(int)
	 * @see volley.VolleyPackage#getMembresia_NroMiembro()
	 * @model
	 * @generated
	 */
	int getNroMiembro();

	/**
	 * Sets the value of the '{@link volley.Membresia#getNroMiembro <em>Nro Miembro</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nro Miembro</em>' attribute.
	 * @see #getNroMiembro()
	 * @generated
	 */
	void setNroMiembro(int value);

} // Membresia
