/**
 */
package volley.impl;

import java.util.Collection;

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
import volley.Tarifa;
import volley.VolleyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tarifa</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link volley.impl.TarifaImpl#getCostoAnualMembresia <em>Costo Anual Membresia</em>}</li>
 *   <li>{@link volley.impl.TarifaImpl#getMembresia <em>Membresia</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TarifaImpl extends MinimalEObjectImpl.Container implements Tarifa {
	/**
	 * The default value of the '{@link #getCostoAnualMembresia() <em>Costo Anual Membresia</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostoAnualMembresia()
	 * @generated
	 * @ordered
	 */
	protected static final double COSTO_ANUAL_MEMBRESIA_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCostoAnualMembresia() <em>Costo Anual Membresia</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostoAnualMembresia()
	 * @generated
	 * @ordered
	 */
	protected double costoAnualMembresia = COSTO_ANUAL_MEMBRESIA_EDEFAULT;

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
	protected TarifaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VolleyPackage.Literals.TARIFA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getCostoAnualMembresia() {
		return costoAnualMembresia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCostoAnualMembresia(double newCostoAnualMembresia) {
		double oldCostoAnualMembresia = costoAnualMembresia;
		costoAnualMembresia = newCostoAnualMembresia;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VolleyPackage.TARIFA__COSTO_ANUAL_MEMBRESIA, oldCostoAnualMembresia, costoAnualMembresia));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Membresia> getMembresia() {
		if (membresia == null) {
			membresia = new EObjectContainmentEList<Membresia>(Membresia.class, this, VolleyPackage.TARIFA__MEMBRESIA);
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
			case VolleyPackage.TARIFA__MEMBRESIA:
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
			case VolleyPackage.TARIFA__COSTO_ANUAL_MEMBRESIA:
				return getCostoAnualMembresia();
			case VolleyPackage.TARIFA__MEMBRESIA:
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
			case VolleyPackage.TARIFA__COSTO_ANUAL_MEMBRESIA:
				setCostoAnualMembresia((Double)newValue);
				return;
			case VolleyPackage.TARIFA__MEMBRESIA:
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
			case VolleyPackage.TARIFA__COSTO_ANUAL_MEMBRESIA:
				setCostoAnualMembresia(COSTO_ANUAL_MEMBRESIA_EDEFAULT);
				return;
			case VolleyPackage.TARIFA__MEMBRESIA:
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
			case VolleyPackage.TARIFA__COSTO_ANUAL_MEMBRESIA:
				return costoAnualMembresia != COSTO_ANUAL_MEMBRESIA_EDEFAULT;
			case VolleyPackage.TARIFA__MEMBRESIA:
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
		result.append(" (costoAnualMembresia: ");
		result.append(costoAnualMembresia);
		result.append(')');
		return result.toString();
	}

} //TarifaImpl
