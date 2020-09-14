/**
 */
package volley;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pago</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link volley.Pago#getNroTransferencia <em>Nro Transferencia</em>}</li>
 *   <li>{@link volley.Pago#getNombreEntidadFinanciera <em>Nombre Entidad Financiera</em>}</li>
 *   <li>{@link volley.Pago#getFechaPago <em>Fecha Pago</em>}</li>
 * </ul>
 *
 * @see volley.VolleyPackage#getPago()
 * @model
 * @generated
 */
public interface Pago extends Factura {
	/**
	 * Returns the value of the '<em><b>Nro Transferencia</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nro Transferencia</em>' attribute.
	 * @see #setNroTransferencia(int)
	 * @see volley.VolleyPackage#getPago_NroTransferencia()
	 * @model
	 * @generated
	 */
	int getNroTransferencia();

	/**
	 * Sets the value of the '{@link volley.Pago#getNroTransferencia <em>Nro Transferencia</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nro Transferencia</em>' attribute.
	 * @see #getNroTransferencia()
	 * @generated
	 */
	void setNroTransferencia(int value);

	/**
	 * Returns the value of the '<em><b>Nombre Entidad Financiera</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Entidad Financiera</em>' attribute.
	 * @see #setNombreEntidadFinanciera(String)
	 * @see volley.VolleyPackage#getPago_NombreEntidadFinanciera()
	 * @model
	 * @generated
	 */
	String getNombreEntidadFinanciera();

	/**
	 * Sets the value of the '{@link volley.Pago#getNombreEntidadFinanciera <em>Nombre Entidad Financiera</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Entidad Financiera</em>' attribute.
	 * @see #getNombreEntidadFinanciera()
	 * @generated
	 */
	void setNombreEntidadFinanciera(String value);

	/**
	 * Returns the value of the '<em><b>Fecha Pago</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fecha Pago</em>' attribute.
	 * @see #setFechaPago(Date)
	 * @see volley.VolleyPackage#getPago_FechaPago()
	 * @model
	 * @generated
	 */
	Date getFechaPago();

	/**
	 * Sets the value of the '{@link volley.Pago#getFechaPago <em>Fecha Pago</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fecha Pago</em>' attribute.
	 * @see #getFechaPago()
	 * @generated
	 */
	void setFechaPago(Date value);

} // Pago
