/**
 */
package volley;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see volley.VolleyPackage
 * @generated
 */
public interface VolleyFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VolleyFactory eINSTANCE = volley.impl.VolleyFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Persona</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Persona</em>'.
	 * @generated
	 */
	Persona createPersona();

	/**
	 * Returns a new object of class '<em>Empleado</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Empleado</em>'.
	 * @generated
	 */
	Empleado createEmpleado();

	/**
	 * Returns a new object of class '<em>Membresia</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Membresia</em>'.
	 * @generated
	 */
	Membresia createMembresia();

	/**
	 * Returns a new object of class '<em>Solicitud</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Solicitud</em>'.
	 * @generated
	 */
	Solicitud createSolicitud();

	/**
	 * Returns a new object of class '<em>Factura</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Factura</em>'.
	 * @generated
	 */
	Factura createFactura();

	/**
	 * Returns a new object of class '<em>Tarifa</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tarifa</em>'.
	 * @generated
	 */
	Tarifa createTarifa();

	/**
	 * Returns a new object of class '<em>Pago</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pago</em>'.
	 * @generated
	 */
	Pago createPago();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	VolleyPackage getVolleyPackage();

} //VolleyFactory
