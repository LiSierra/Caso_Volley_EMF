/**
 */
package volley;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Factura</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link volley.Factura#getNroFactura <em>Nro Factura</em>}</li>
 *   <li>{@link volley.Factura#getFechaPagoOportuno <em>Fecha Pago Oportuno</em>}</li>
 *   <li>{@link volley.Factura#getValor <em>Valor</em>}</li>
 *   <li>{@link volley.Factura#getDetalle <em>Detalle</em>}</li>
 *   <li>{@link volley.Factura#getMembresias <em>Membresias</em>}</li>
 * </ul>
 *
 * @see volley.VolleyPackage#getFactura()
 * @model
 * @generated
 */
public interface Factura extends EObject {
	/**
	 * Returns the value of the '<em><b>Nro Factura</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nro Factura</em>' attribute.
	 * @see #setNroFactura(int)
	 * @see volley.VolleyPackage#getFactura_NroFactura()
	 * @model
	 * @generated
	 */
	int getNroFactura();

	/**
	 * Sets the value of the '{@link volley.Factura#getNroFactura <em>Nro Factura</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nro Factura</em>' attribute.
	 * @see #getNroFactura()
	 * @generated
	 */
	void setNroFactura(int value);

	/**
	 * Returns the value of the '<em><b>Fecha Pago Oportuno</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fecha Pago Oportuno</em>' attribute.
	 * @see #setFechaPagoOportuno(Date)
	 * @see volley.VolleyPackage#getFactura_FechaPagoOportuno()
	 * @model
	 * @generated
	 */
	Date getFechaPagoOportuno();

	/**
	 * Sets the value of the '{@link volley.Factura#getFechaPagoOportuno <em>Fecha Pago Oportuno</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fecha Pago Oportuno</em>' attribute.
	 * @see #getFechaPagoOportuno()
	 * @generated
	 */
	void setFechaPagoOportuno(Date value);

	/**
	 * Returns the value of the '<em><b>Valor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valor</em>' attribute.
	 * @see #setValor(double)
	 * @see volley.VolleyPackage#getFactura_Valor()
	 * @model
	 * @generated
	 */
	double getValor();

	/**
	 * Sets the value of the '{@link volley.Factura#getValor <em>Valor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valor</em>' attribute.
	 * @see #getValor()
	 * @generated
	 */
	void setValor(double value);

	/**
	 * Returns the value of the '<em><b>Detalle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Detalle</em>' attribute.
	 * @see #setDetalle(String)
	 * @see volley.VolleyPackage#getFactura_Detalle()
	 * @model
	 * @generated
	 */
	String getDetalle();

	/**
	 * Sets the value of the '{@link volley.Factura#getDetalle <em>Detalle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Detalle</em>' attribute.
	 * @see #getDetalle()
	 * @generated
	 */
	void setDetalle(String value);

	/**
	 * Returns the value of the '<em><b>Membresias</b></em>' containment reference list.
	 * The list contents are of type {@link volley.Membresia}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Membresias</em>' containment reference list.
	 * @see volley.VolleyPackage#getFactura_Membresias()
	 * @model containment="true" required="true" upper="2"
	 * @generated
	 */
	EList<Membresia> getMembresias();

} // Factura
