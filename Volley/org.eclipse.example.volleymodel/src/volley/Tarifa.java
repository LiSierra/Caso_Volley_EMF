/**
 */
package volley;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tarifa</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link volley.Tarifa#getCostoAnualMembresia <em>Costo Anual Membresia</em>}</li>
 *   <li>{@link volley.Tarifa#getMembresia <em>Membresia</em>}</li>
 * </ul>
 *
 * @see volley.VolleyPackage#getTarifa()
 * @model
 * @generated
 */
public interface Tarifa extends EObject {
	/**
	 * Returns the value of the '<em><b>Costo Anual Membresia</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Costo Anual Membresia</em>' attribute.
	 * @see #setCostoAnualMembresia(double)
	 * @see volley.VolleyPackage#getTarifa_CostoAnualMembresia()
	 * @model
	 * @generated
	 */
	double getCostoAnualMembresia();

	/**
	 * Sets the value of the '{@link volley.Tarifa#getCostoAnualMembresia <em>Costo Anual Membresia</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Costo Anual Membresia</em>' attribute.
	 * @see #getCostoAnualMembresia()
	 * @generated
	 */
	void setCostoAnualMembresia(double value);

	/**
	 * Returns the value of the '<em><b>Membresia</b></em>' containment reference list.
	 * The list contents are of type {@link volley.Membresia}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Membresia</em>' containment reference list.
	 * @see volley.VolleyPackage#getTarifa_Membresia()
	 * @model containment="true" required="true" upper="2"
	 * @generated
	 */
	EList<Membresia> getMembresia();

} // Tarifa
