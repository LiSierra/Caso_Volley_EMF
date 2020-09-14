/**
 */
package volley.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import volley.Empleado;
import volley.VolleyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Empleado</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link volley.impl.EmpleadoImpl#getCargo <em>Cargo</em>}</li>
 *   <li>{@link volley.impl.EmpleadoImpl#getSueldo <em>Sueldo</em>}</li>
 *   <li>{@link volley.impl.EmpleadoImpl#getFechaInicio <em>Fecha Inicio</em>}</li>
 *   <li>{@link volley.impl.EmpleadoImpl#getFechaFin <em>Fecha Fin</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EmpleadoImpl extends PersonaImpl implements Empleado {
	/**
	 * The default value of the '{@link #getCargo() <em>Cargo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCargo()
	 * @generated
	 * @ordered
	 */
	protected static final String CARGO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCargo() <em>Cargo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCargo()
	 * @generated
	 * @ordered
	 */
	protected String cargo = CARGO_EDEFAULT;

	/**
	 * The default value of the '{@link #getSueldo() <em>Sueldo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSueldo()
	 * @generated
	 * @ordered
	 */
	protected static final double SUELDO_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSueldo() <em>Sueldo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSueldo()
	 * @generated
	 * @ordered
	 */
	protected double sueldo = SUELDO_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmpleadoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VolleyPackage.Literals.EMPLEADO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCargo() {
		return cargo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCargo(String newCargo) {
		String oldCargo = cargo;
		cargo = newCargo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VolleyPackage.EMPLEADO__CARGO, oldCargo, cargo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getSueldo() {
		return sueldo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSueldo(double newSueldo) {
		double oldSueldo = sueldo;
		sueldo = newSueldo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VolleyPackage.EMPLEADO__SUELDO, oldSueldo, sueldo));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VolleyPackage.EMPLEADO__FECHA_INICIO, oldFechaInicio, fechaInicio));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VolleyPackage.EMPLEADO__FECHA_FIN, oldFechaFin, fechaFin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VolleyPackage.EMPLEADO__CARGO:
				return getCargo();
			case VolleyPackage.EMPLEADO__SUELDO:
				return getSueldo();
			case VolleyPackage.EMPLEADO__FECHA_INICIO:
				return getFechaInicio();
			case VolleyPackage.EMPLEADO__FECHA_FIN:
				return getFechaFin();
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
			case VolleyPackage.EMPLEADO__CARGO:
				setCargo((String)newValue);
				return;
			case VolleyPackage.EMPLEADO__SUELDO:
				setSueldo((Double)newValue);
				return;
			case VolleyPackage.EMPLEADO__FECHA_INICIO:
				setFechaInicio((Date)newValue);
				return;
			case VolleyPackage.EMPLEADO__FECHA_FIN:
				setFechaFin((Date)newValue);
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
			case VolleyPackage.EMPLEADO__CARGO:
				setCargo(CARGO_EDEFAULT);
				return;
			case VolleyPackage.EMPLEADO__SUELDO:
				setSueldo(SUELDO_EDEFAULT);
				return;
			case VolleyPackage.EMPLEADO__FECHA_INICIO:
				setFechaInicio(FECHA_INICIO_EDEFAULT);
				return;
			case VolleyPackage.EMPLEADO__FECHA_FIN:
				setFechaFin(FECHA_FIN_EDEFAULT);
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
			case VolleyPackage.EMPLEADO__CARGO:
				return CARGO_EDEFAULT == null ? cargo != null : !CARGO_EDEFAULT.equals(cargo);
			case VolleyPackage.EMPLEADO__SUELDO:
				return sueldo != SUELDO_EDEFAULT;
			case VolleyPackage.EMPLEADO__FECHA_INICIO:
				return FECHA_INICIO_EDEFAULT == null ? fechaInicio != null : !FECHA_INICIO_EDEFAULT.equals(fechaInicio);
			case VolleyPackage.EMPLEADO__FECHA_FIN:
				return FECHA_FIN_EDEFAULT == null ? fechaFin != null : !FECHA_FIN_EDEFAULT.equals(fechaFin);
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
		result.append(" (cargo: ");
		result.append(cargo);
		result.append(", sueldo: ");
		result.append(sueldo);
		result.append(", fechaInicio: ");
		result.append(fechaInicio);
		result.append(", fechaFin: ");
		result.append(fechaFin);
		result.append(')');
		return result.toString();
	}

} //EmpleadoImpl
