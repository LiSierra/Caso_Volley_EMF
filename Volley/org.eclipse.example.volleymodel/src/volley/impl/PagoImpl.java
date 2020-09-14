/**
 */
package volley.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import volley.Pago;
import volley.VolleyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pago</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link volley.impl.PagoImpl#getNroTransferencia <em>Nro Transferencia</em>}</li>
 *   <li>{@link volley.impl.PagoImpl#getNombreEntidadFinanciera <em>Nombre Entidad Financiera</em>}</li>
 *   <li>{@link volley.impl.PagoImpl#getFechaPago <em>Fecha Pago</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PagoImpl extends FacturaImpl implements Pago {
	/**
	 * The default value of the '{@link #getNroTransferencia() <em>Nro Transferencia</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNroTransferencia()
	 * @generated
	 * @ordered
	 */
	protected static final int NRO_TRANSFERENCIA_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNroTransferencia() <em>Nro Transferencia</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNroTransferencia()
	 * @generated
	 * @ordered
	 */
	protected int nroTransferencia = NRO_TRANSFERENCIA_EDEFAULT;

	/**
	 * The default value of the '{@link #getNombreEntidadFinanciera() <em>Nombre Entidad Financiera</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreEntidadFinanciera()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_ENTIDAD_FINANCIERA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombreEntidadFinanciera() <em>Nombre Entidad Financiera</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreEntidadFinanciera()
	 * @generated
	 * @ordered
	 */
	protected String nombreEntidadFinanciera = NOMBRE_ENTIDAD_FINANCIERA_EDEFAULT;

	/**
	 * The default value of the '{@link #getFechaPago() <em>Fecha Pago</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFechaPago()
	 * @generated
	 * @ordered
	 */
	protected static final Date FECHA_PAGO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFechaPago() <em>Fecha Pago</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFechaPago()
	 * @generated
	 * @ordered
	 */
	protected Date fechaPago = FECHA_PAGO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PagoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VolleyPackage.Literals.PAGO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNroTransferencia() {
		return nroTransferencia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNroTransferencia(int newNroTransferencia) {
		int oldNroTransferencia = nroTransferencia;
		nroTransferencia = newNroTransferencia;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VolleyPackage.PAGO__NRO_TRANSFERENCIA, oldNroTransferencia, nroTransferencia));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNombreEntidadFinanciera() {
		return nombreEntidadFinanciera;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNombreEntidadFinanciera(String newNombreEntidadFinanciera) {
		String oldNombreEntidadFinanciera = nombreEntidadFinanciera;
		nombreEntidadFinanciera = newNombreEntidadFinanciera;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VolleyPackage.PAGO__NOMBRE_ENTIDAD_FINANCIERA, oldNombreEntidadFinanciera, nombreEntidadFinanciera));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getFechaPago() {
		return fechaPago;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFechaPago(Date newFechaPago) {
		Date oldFechaPago = fechaPago;
		fechaPago = newFechaPago;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VolleyPackage.PAGO__FECHA_PAGO, oldFechaPago, fechaPago));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VolleyPackage.PAGO__NRO_TRANSFERENCIA:
				return getNroTransferencia();
			case VolleyPackage.PAGO__NOMBRE_ENTIDAD_FINANCIERA:
				return getNombreEntidadFinanciera();
			case VolleyPackage.PAGO__FECHA_PAGO:
				return getFechaPago();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case VolleyPackage.PAGO__NRO_TRANSFERENCIA:
				setNroTransferencia((Integer)newValue);
				return;
			case VolleyPackage.PAGO__NOMBRE_ENTIDAD_FINANCIERA:
				setNombreEntidadFinanciera((String)newValue);
				return;
			case VolleyPackage.PAGO__FECHA_PAGO:
				setFechaPago((Date)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case VolleyPackage.PAGO__NRO_TRANSFERENCIA:
				setNroTransferencia(NRO_TRANSFERENCIA_EDEFAULT);
				return;
			case VolleyPackage.PAGO__NOMBRE_ENTIDAD_FINANCIERA:
				setNombreEntidadFinanciera(NOMBRE_ENTIDAD_FINANCIERA_EDEFAULT);
				return;
			case VolleyPackage.PAGO__FECHA_PAGO:
				setFechaPago(FECHA_PAGO_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case VolleyPackage.PAGO__NRO_TRANSFERENCIA:
				return nroTransferencia != NRO_TRANSFERENCIA_EDEFAULT;
			case VolleyPackage.PAGO__NOMBRE_ENTIDAD_FINANCIERA:
				return NOMBRE_ENTIDAD_FINANCIERA_EDEFAULT == null ? nombreEntidadFinanciera != null : !NOMBRE_ENTIDAD_FINANCIERA_EDEFAULT.equals(nombreEntidadFinanciera);
			case VolleyPackage.PAGO__FECHA_PAGO:
				return FECHA_PAGO_EDEFAULT == null ? fechaPago != null : !FECHA_PAGO_EDEFAULT.equals(fechaPago);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (nroTransferencia: ");
		result.append(nroTransferencia);
		result.append(", nombreEntidadFinanciera: ");
		result.append(nombreEntidadFinanciera);
		result.append(", fechaPago: ");
		result.append(fechaPago);
		result.append(')');
		return result.toString();
	}

} //PagoImpl
