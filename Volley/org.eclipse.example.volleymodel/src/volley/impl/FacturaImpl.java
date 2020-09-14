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

import volley.Factura;
import volley.Membresia;
import volley.VolleyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Factura</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link volley.impl.FacturaImpl#getNroFactura <em>Nro Factura</em>}</li>
 *   <li>{@link volley.impl.FacturaImpl#getFechaPagoOportuno <em>Fecha Pago Oportuno</em>}</li>
 *   <li>{@link volley.impl.FacturaImpl#getValor <em>Valor</em>}</li>
 *   <li>{@link volley.impl.FacturaImpl#getDetalle <em>Detalle</em>}</li>
 *   <li>{@link volley.impl.FacturaImpl#getMembresias <em>Membresias</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FacturaImpl extends MinimalEObjectImpl.Container implements Factura {
	/**
	 * The default value of the '{@link #getNroFactura() <em>Nro Factura</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNroFactura()
	 * @generated
	 * @ordered
	 */
	protected static final int NRO_FACTURA_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNroFactura() <em>Nro Factura</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNroFactura()
	 * @generated
	 * @ordered
	 */
	protected int nroFactura = NRO_FACTURA_EDEFAULT;

	/**
	 * The default value of the '{@link #getFechaPagoOportuno() <em>Fecha Pago Oportuno</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFechaPagoOportuno()
	 * @generated
	 * @ordered
	 */
	protected static final Date FECHA_PAGO_OPORTUNO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFechaPagoOportuno() <em>Fecha Pago Oportuno</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFechaPagoOportuno()
	 * @generated
	 * @ordered
	 */
	protected Date fechaPagoOportuno = FECHA_PAGO_OPORTUNO_EDEFAULT;

	/**
	 * The default value of the '{@link #getValor() <em>Valor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValor()
	 * @generated
	 * @ordered
	 */
	protected static final double VALOR_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getValor() <em>Valor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValor()
	 * @generated
	 * @ordered
	 */
	protected double valor = VALOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getDetalle() <em>Detalle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetalle()
	 * @generated
	 * @ordered
	 */
	protected static final String DETALLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDetalle() <em>Detalle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetalle()
	 * @generated
	 * @ordered
	 */
	protected String detalle = DETALLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMembresias() <em>Membresias</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMembresias()
	 * @generated
	 * @ordered
	 */
	protected EList<Membresia> membresias;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FacturaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VolleyPackage.Literals.FACTURA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNroFactura() {
		return nroFactura;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNroFactura(int newNroFactura) {
		int oldNroFactura = nroFactura;
		nroFactura = newNroFactura;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VolleyPackage.FACTURA__NRO_FACTURA, oldNroFactura, nroFactura));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getFechaPagoOportuno() {
		return fechaPagoOportuno;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFechaPagoOportuno(Date newFechaPagoOportuno) {
		Date oldFechaPagoOportuno = fechaPagoOportuno;
		fechaPagoOportuno = newFechaPagoOportuno;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VolleyPackage.FACTURA__FECHA_PAGO_OPORTUNO, oldFechaPagoOportuno, fechaPagoOportuno));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getValor() {
		return valor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValor(double newValor) {
		double oldValor = valor;
		valor = newValor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VolleyPackage.FACTURA__VALOR, oldValor, valor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDetalle() {
		return detalle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDetalle(String newDetalle) {
		String oldDetalle = detalle;
		detalle = newDetalle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VolleyPackage.FACTURA__DETALLE, oldDetalle, detalle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Membresia> getMembresias() {
		if (membresias == null) {
			membresias = new EObjectContainmentEList<Membresia>(Membresia.class, this, VolleyPackage.FACTURA__MEMBRESIAS);
		}
		return membresias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VolleyPackage.FACTURA__MEMBRESIAS:
				return ((InternalEList<?>)getMembresias()).basicRemove(otherEnd, msgs);
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
			case VolleyPackage.FACTURA__NRO_FACTURA:
				return getNroFactura();
			case VolleyPackage.FACTURA__FECHA_PAGO_OPORTUNO:
				return getFechaPagoOportuno();
			case VolleyPackage.FACTURA__VALOR:
				return getValor();
			case VolleyPackage.FACTURA__DETALLE:
				return getDetalle();
			case VolleyPackage.FACTURA__MEMBRESIAS:
				return getMembresias();
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
			case VolleyPackage.FACTURA__NRO_FACTURA:
				setNroFactura((Integer)newValue);
				return;
			case VolleyPackage.FACTURA__FECHA_PAGO_OPORTUNO:
				setFechaPagoOportuno((Date)newValue);
				return;
			case VolleyPackage.FACTURA__VALOR:
				setValor((Double)newValue);
				return;
			case VolleyPackage.FACTURA__DETALLE:
				setDetalle((String)newValue);
				return;
			case VolleyPackage.FACTURA__MEMBRESIAS:
				getMembresias().clear();
				getMembresias().addAll((Collection<? extends Membresia>)newValue);
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
			case VolleyPackage.FACTURA__NRO_FACTURA:
				setNroFactura(NRO_FACTURA_EDEFAULT);
				return;
			case VolleyPackage.FACTURA__FECHA_PAGO_OPORTUNO:
				setFechaPagoOportuno(FECHA_PAGO_OPORTUNO_EDEFAULT);
				return;
			case VolleyPackage.FACTURA__VALOR:
				setValor(VALOR_EDEFAULT);
				return;
			case VolleyPackage.FACTURA__DETALLE:
				setDetalle(DETALLE_EDEFAULT);
				return;
			case VolleyPackage.FACTURA__MEMBRESIAS:
				getMembresias().clear();
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
			case VolleyPackage.FACTURA__NRO_FACTURA:
				return nroFactura != NRO_FACTURA_EDEFAULT;
			case VolleyPackage.FACTURA__FECHA_PAGO_OPORTUNO:
				return FECHA_PAGO_OPORTUNO_EDEFAULT == null ? fechaPagoOportuno != null : !FECHA_PAGO_OPORTUNO_EDEFAULT.equals(fechaPagoOportuno);
			case VolleyPackage.FACTURA__VALOR:
				return valor != VALOR_EDEFAULT;
			case VolleyPackage.FACTURA__DETALLE:
				return DETALLE_EDEFAULT == null ? detalle != null : !DETALLE_EDEFAULT.equals(detalle);
			case VolleyPackage.FACTURA__MEMBRESIAS:
				return membresias != null && !membresias.isEmpty();
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
		result.append(" (nroFactura: ");
		result.append(nroFactura);
		result.append(", fechaPagoOportuno: ");
		result.append(fechaPagoOportuno);
		result.append(", valor: ");
		result.append(valor);
		result.append(", detalle: ");
		result.append(detalle);
		result.append(')');
		return result.toString();
	}

} //FacturaImpl
