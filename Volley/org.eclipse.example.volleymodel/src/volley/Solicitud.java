/**
 */
package volley;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Solicitud</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link volley.Solicitud#getFechaSolicitud <em>Fecha Solicitud</em>}</li>
 *   <li>{@link volley.Solicitud#getMembresia <em>Membresia</em>}</li>
 * </ul>
 *
 * @see volley.VolleyPackage#getSolicitud()
 * @model
 * @generated
 */
public interface Solicitud extends EObject {
	/**
	 * Returns the value of the '<em><b>Fecha Solicitud</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fecha Solicitud</em>' attribute.
	 * @see #setFechaSolicitud(Date)
	 * @see volley.VolleyPackage#getSolicitud_FechaSolicitud()
	 * @model
	 * @generated
	 */
	Date getFechaSolicitud();

	/**
	 * Sets the value of the '{@link volley.Solicitud#getFechaSolicitud <em>Fecha Solicitud</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fecha Solicitud</em>' attribute.
	 * @see #getFechaSolicitud()
	 * @generated
	 */
	void setFechaSolicitud(Date value);

	/**
	 * Returns the value of the '<em><b>Membresia</b></em>' containment reference list.
	 * The list contents are of type {@link volley.Membresia}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Membresia</em>' containment reference list.
	 * @see volley.VolleyPackage#getSolicitud_Membresia()
	 * @model containment="true" upper="2"
	 * @generated
	 */
	EList<Membresia> getMembresia();

} // Solicitud
