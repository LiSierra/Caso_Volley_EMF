/**
 */
package volley.impl;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import volley.Membresia;
import volley.Solicitud;
import volley.VolleyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Solicitud</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link volley.impl.SolicitudImpl#getFechaSolicitud <em>Fecha Solicitud</em>}</li>
 *   <li>{@link volley.impl.SolicitudImpl#getMembresia <em>Membresia</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SolicitudImpl extends MinimalEObjectImpl.Container implements Solicitud {
	/**
	 * The default value of the '{@link #getFechaSolicitud() <em>Fecha Solicitud</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFechaSolicitud()
	 * @generated
	 * @ordered
	 */
	protected static final Date FECHA_SOLICITUD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFechaSolicitud() <em>Fecha Solicitud</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFechaSolicitud()
	 * @generated
	 * @ordered
	 */
	protected Date fechaSolicitud = FECHA_SOLICITUD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMembresia() <em>Membresia</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMembresia()
	 * @generated
	 * @ordered
	 */
	protected EList<Membresia> membresia;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SolicitudImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VolleyPackage.Literals.SOLICITUD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getFechaSolicitud() {
		return fechaSolicitud;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFechaSolicitud(Date newFechaSolicitud) {
		Date oldFechaSolicitud = fechaSolicitud;
		fechaSolicitud = newFechaSolicitud;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VolleyPackage.SOLICITUD__FECHA_SOLICITUD, oldFechaSolicitud, fechaSolicitud));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Membresia> getMembresia() {
		if (membresia == null) {
			membresia = new EObjectContainmentEList<Membresia>(Membresia.class, this, VolleyPackage.SOLICITUD__MEMBRESIA);
		}
		return membresia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VolleyPackage.SOLICITUD__MEMBRESIA:
				return ((InternalEList<?>)getMembresia()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VolleyPackage.SOLICITUD__FECHA_SOLICITUD:
				return getFechaSolicitud();
			case VolleyPackage.SOLICITUD__MEMBRESIA:
				return getMembresia();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case VolleyPackage.SOLICITUD__FECHA_SOLICITUD:
				setFechaSolicitud((Date)newValue);
				return;
			case VolleyPackage.SOLICITUD__MEMBRESIA:
				getMembresia().clear();
				getMembresia().addAll((Collection<? extends Membresia>)newValue);
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
			case VolleyPackage.SOLICITUD__FECHA_SOLICITUD:
				setFechaSolicitud(FECHA_SOLICITUD_EDEFAULT);
				return;
			case VolleyPackage.SOLICITUD__MEMBRESIA:
				getMembresia().clear();
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
			case VolleyPackage.SOLICITUD__FECHA_SOLICITUD:
				return FECHA_SOLICITUD_EDEFAULT == null ? fechaSolicitud != null : !FECHA_SOLICITUD_EDEFAULT.equals(fechaSolicitud);
			case VolleyPackage.SOLICITUD__MEMBRESIA:
				return membresia != null && !membresia.isEmpty();
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
		result.append(" (fechaSolicitud: ");
		result.append(fechaSolicitud);
		result.append(')');
		return result.toString();
	}

} //SolicitudImpl
