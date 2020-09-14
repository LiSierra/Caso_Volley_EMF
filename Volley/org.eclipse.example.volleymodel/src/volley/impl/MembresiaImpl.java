/**
 */
package volley.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import volley.Membresia;
import volley.VolleyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Membresia</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link volley.impl.MembresiaImpl#isEsMiembro <em>Es Miembro</em>}</li>
 *   <li>{@link volley.impl.MembresiaImpl#getFechaInicio <em>Fecha Inicio</em>}</li>
 *   <li>{@link volley.impl.MembresiaImpl#getFechaFin <em>Fecha Fin</em>}</li>
 *   <li>{@link volley.impl.MembresiaImpl#getNroMiembro <em>Nro Miembro</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MembresiaImpl extends PersonaImpl implements Membresia {
	/**
	 * The default value of the '{@link #isEsMiembro() <em>Es Miembro</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEsMiembro()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ES_MIEMBRO_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEsMiembro() <em>Es Miembro</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEsMiembro()
	 * @generated
	 * @ordered
	 */
	protected boolean esMiembro = ES_MIEMBRO_EDEFAULT;

	/**
	 * The default value of the '{@link #getFechaInicio() <em>Fecha Inicio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFechaInicio()
	 * @generated
	 * @ordered
	 */
	protected static final Date FECHA_INICIO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFechaInicio() <em>Fecha Inicio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFechaInicio()
	 * @generated
	 * @ordered
	 */
	protected Date fechaInicio = FECHA_INICIO_EDEFAULT;

	/**
	 * The default value of the '{@link #getFechaFin() <em>Fecha Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFechaFin()
	 * @generated
	 * @ordered
	 */
	protected static final Date FECHA_FIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFechaFin() <em>Fecha Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFechaFin()
	 * @generated
	 * @ordered
	 */
	protected Date fechaFin = FECHA_FIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getNroMiembro() <em>Nro Miembro</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNroMiembro()
	 * @generated
	 * @ordered
	 */
	protected static final int NRO_MIEMBRO_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNroMiembro() <em>Nro Miembro</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNroMiembro()
	 * @generated
	 * @ordered
	 */
	protected int nroMiembro = NRO_MIEMBRO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MembresiaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VolleyPackage.Literals.MEMBRESIA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isEsMiembro() {
		return esMiembro;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEsMiembro(boolean newEsMiembro) {
		boolean oldEsMiembro = esMiembro;
		esMiembro = newEsMiembro;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VolleyPackage.MEMBRESIA__ES_MIEMBRO, oldEsMiembro, esMiembro));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getFechaInicio() {
		return fechaInicio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFechaInicio(Date newFechaInicio) {
		Date oldFechaInicio = fechaInicio;
		fechaInicio = newFechaInicio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VolleyPackage.MEMBRESIA__FECHA_INICIO, oldFechaInicio, fechaInicio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getFechaFin() {
		return fechaFin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFechaFin(Date newFechaFin) {
		Date oldFechaFin = fechaFin;
		fechaFin = newFechaFin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VolleyPackage.MEMBRESIA__FECHA_FIN, oldFechaFin, fechaFin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNroMiembro() {
		return nroMiembro;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNroMiembro(int newNroMiembro) {
		int oldNroMiembro = nroMiembro;
		nroMiembro = newNroMiembro;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VolleyPackage.MEMBRESIA__NRO_MIEMBRO, oldNroMiembro, nroMiembro));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VolleyPackage.MEMBRESIA__ES_MIEMBRO:
				return isEsMiembro();
			case VolleyPackage.MEMBRESIA__FECHA_INICIO:
				return getFechaInicio();
			case VolleyPackage.MEMBRESIA__FECHA_FIN:
				return getFechaFin();
			case VolleyPackage.MEMBRESIA__NRO_MIEMBRO:
				return getNroMiembro();
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
			case VolleyPackage.MEMBRESIA__ES_MIEMBRO:
				setEsMiembro((Boolean)newValue);
				return;
			case VolleyPackage.MEMBRESIA__FECHA_INICIO:
				setFechaInicio((Date)newValue);
				return;
			case VolleyPackage.MEMBRESIA__FECHA_FIN:
				setFechaFin((Date)newValue);
				return;
			case VolleyPackage.MEMBRESIA__NRO_MIEMBRO:
				setNroMiembro((Integer)newValue);
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
			case VolleyPackage.MEMBRESIA__ES_MIEMBRO:
				setEsMiembro(ES_MIEMBRO_EDEFAULT);
				return;
			case VolleyPackage.MEMBRESIA__FECHA_INICIO:
				setFechaInicio(FECHA_INICIO_EDEFAULT);
				return;
			case VolleyPackage.MEMBRESIA__FECHA_FIN:
				setFechaFin(FECHA_FIN_EDEFAULT);
				return;
			case VolleyPackage.MEMBRESIA__NRO_MIEMBRO:
				setNroMiembro(NRO_MIEMBRO_EDEFAULT);
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
			case VolleyPackage.MEMBRESIA__ES_MIEMBRO:
				return esMiembro != ES_MIEMBRO_EDEFAULT;
			case VolleyPackage.MEMBRESIA__FECHA_INICIO:
				return FECHA_INICIO_EDEFAULT == null ? fechaInicio != null : !FECHA_INICIO_EDEFAULT.equals(fechaInicio);
			case VolleyPackage.MEMBRESIA__FECHA_FIN:
				return FECHA_FIN_EDEFAULT == null ? fechaFin != null : !FECHA_FIN_EDEFAULT.equals(fechaFin);
			case VolleyPackage.MEMBRESIA__NRO_MIEMBRO:
				return nroMiembro != NRO_MIEMBRO_EDEFAULT;
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
		result.append(" (esMiembro: ");
		result.append(esMiembro);
		result.append(", fechaInicio: ");
		result.append(fechaInicio);
		result.append(", fechaFin: ");
		result.append(fechaFin);
		result.append(", nroMiembro: ");
		result.append(nroMiembro);
		result.append(')');
		return result.toString();
	}

} //MembresiaImpl
