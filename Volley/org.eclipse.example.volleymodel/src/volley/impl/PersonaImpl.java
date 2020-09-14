/**
 */
package volley.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import volley.Persona;
import volley.VolleyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Persona</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link volley.impl.PersonaImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link volley.impl.PersonaImpl#getApellido <em>Apellido</em>}</li>
 *   <li>{@link volley.impl.PersonaImpl#getFechaNacimiento <em>Fecha Nacimiento</em>}</li>
 *   <li>{@link volley.impl.PersonaImpl#getSexo <em>Sexo</em>}</li>
 *   <li>{@link volley.impl.PersonaImpl#getTelefono <em>Telefono</em>}</li>
 *   <li>{@link volley.impl.PersonaImpl#getDireccion <em>Direccion</em>}</li>
 *   <li>{@link volley.impl.PersonaImpl#getCorreoElectronico <em>Correo Electronico</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PersonaImpl extends MinimalEObjectImpl.Container implements Persona {
	/**
	 * The default value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected String nombre = NOMBRE_EDEFAULT;

	/**
	 * The default value of the '{@link #getApellido() <em>Apellido</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApellido()
	 * @generated
	 * @ordered
	 */
	protected static final String APELLIDO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApellido() <em>Apellido</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApellido()
	 * @generated
	 * @ordered
	 */
	protected String apellido = APELLIDO_EDEFAULT;

	/**
	 * The default value of the '{@link #getFechaNacimiento() <em>Fecha Nacimiento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFechaNacimiento()
	 * @generated
	 * @ordered
	 */
	protected static final Date FECHA_NACIMIENTO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFechaNacimiento() <em>Fecha Nacimiento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFechaNacimiento()
	 * @generated
	 * @ordered
	 */
	protected Date fechaNacimiento = FECHA_NACIMIENTO_EDEFAULT;

	/**
	 * The default value of the '{@link #getSexo() <em>Sexo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSexo()
	 * @generated
	 * @ordered
	 */
	protected static final String SEXO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSexo() <em>Sexo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSexo()
	 * @generated
	 * @ordered
	 */
	protected String sexo = SEXO_EDEFAULT;

	/**
	 * The default value of the '{@link #getTelefono() <em>Telefono</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelefono()
	 * @generated
	 * @ordered
	 */
	protected static final int TELEFONO_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTelefono() <em>Telefono</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelefono()
	 * @generated
	 * @ordered
	 */
	protected int telefono = TELEFONO_EDEFAULT;

	/**
	 * The default value of the '{@link #getDireccion() <em>Direccion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDireccion()
	 * @generated
	 * @ordered
	 */
	protected static final String DIRECCION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDireccion() <em>Direccion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDireccion()
	 * @generated
	 * @ordered
	 */
	protected String direccion = DIRECCION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCorreoElectronico() <em>Correo Electronico</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorreoElectronico()
	 * @generated
	 * @ordered
	 */
	protected static final String CORREO_ELECTRONICO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCorreoElectronico() <em>Correo Electronico</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorreoElectronico()
	 * @generated
	 * @ordered
	 */
	protected String correoElectronico = CORREO_ELECTRONICO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VolleyPackage.Literals.PERSONA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNombre() {
		return nombre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNombre(String newNombre) {
		String oldNombre = nombre;
		nombre = newNombre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VolleyPackage.PERSONA__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getApellido() {
		return apellido;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApellido(String newApellido) {
		String oldApellido = apellido;
		apellido = newApellido;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VolleyPackage.PERSONA__APELLIDO, oldApellido, apellido));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFechaNacimiento(Date newFechaNacimiento) {
		Date oldFechaNacimiento = fechaNacimiento;
		fechaNacimiento = newFechaNacimiento;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VolleyPackage.PERSONA__FECHA_NACIMIENTO, oldFechaNacimiento, fechaNacimiento));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSexo() {
		return sexo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSexo(String newSexo) {
		String oldSexo = sexo;
		sexo = newSexo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VolleyPackage.PERSONA__SEXO, oldSexo, sexo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getTelefono() {
		return telefono;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTelefono(int newTelefono) {
		int oldTelefono = telefono;
		telefono = newTelefono;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VolleyPackage.PERSONA__TELEFONO, oldTelefono, telefono));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDireccion() {
		return direccion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDireccion(String newDireccion) {
		String oldDireccion = direccion;
		direccion = newDireccion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VolleyPackage.PERSONA__DIRECCION, oldDireccion, direccion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCorreoElectronico() {
		return correoElectronico;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCorreoElectronico(String newCorreoElectronico) {
		String oldCorreoElectronico = correoElectronico;
		correoElectronico = newCorreoElectronico;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VolleyPackage.PERSONA__CORREO_ELECTRONICO, oldCorreoElectronico, correoElectronico));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VolleyPackage.PERSONA__NOMBRE:
				return getNombre();
			case VolleyPackage.PERSONA__APELLIDO:
				return getApellido();
			case VolleyPackage.PERSONA__FECHA_NACIMIENTO:
				return getFechaNacimiento();
			case VolleyPackage.PERSONA__SEXO:
				return getSexo();
			case VolleyPackage.PERSONA__TELEFONO:
				return getTelefono();
			case VolleyPackage.PERSONA__DIRECCION:
				return getDireccion();
			case VolleyPackage.PERSONA__CORREO_ELECTRONICO:
				return getCorreoElectronico();
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
			case VolleyPackage.PERSONA__NOMBRE:
				setNombre((String)newValue);
				return;
			case VolleyPackage.PERSONA__APELLIDO:
				setApellido((String)newValue);
				return;
			case VolleyPackage.PERSONA__FECHA_NACIMIENTO:
				setFechaNacimiento((Date)newValue);
				return;
			case VolleyPackage.PERSONA__SEXO:
				setSexo((String)newValue);
				return;
			case VolleyPackage.PERSONA__TELEFONO:
				setTelefono((Integer)newValue);
				return;
			case VolleyPackage.PERSONA__DIRECCION:
				setDireccion((String)newValue);
				return;
			case VolleyPackage.PERSONA__CORREO_ELECTRONICO:
				setCorreoElectronico((String)newValue);
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
			case VolleyPackage.PERSONA__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case VolleyPackage.PERSONA__APELLIDO:
				setApellido(APELLIDO_EDEFAULT);
				return;
			case VolleyPackage.PERSONA__FECHA_NACIMIENTO:
				setFechaNacimiento(FECHA_NACIMIENTO_EDEFAULT);
				return;
			case VolleyPackage.PERSONA__SEXO:
				setSexo(SEXO_EDEFAULT);
				return;
			case VolleyPackage.PERSONA__TELEFONO:
				setTelefono(TELEFONO_EDEFAULT);
				return;
			case VolleyPackage.PERSONA__DIRECCION:
				setDireccion(DIRECCION_EDEFAULT);
				return;
			case VolleyPackage.PERSONA__CORREO_ELECTRONICO:
				setCorreoElectronico(CORREO_ELECTRONICO_EDEFAULT);
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
			case VolleyPackage.PERSONA__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case VolleyPackage.PERSONA__APELLIDO:
				return APELLIDO_EDEFAULT == null ? apellido != null : !APELLIDO_EDEFAULT.equals(apellido);
			case VolleyPackage.PERSONA__FECHA_NACIMIENTO:
				return FECHA_NACIMIENTO_EDEFAULT == null ? fechaNacimiento != null : !FECHA_NACIMIENTO_EDEFAULT.equals(fechaNacimiento);
			case VolleyPackage.PERSONA__SEXO:
				return SEXO_EDEFAULT == null ? sexo != null : !SEXO_EDEFAULT.equals(sexo);
			case VolleyPackage.PERSONA__TELEFONO:
				return telefono != TELEFONO_EDEFAULT;
			case VolleyPackage.PERSONA__DIRECCION:
				return DIRECCION_EDEFAULT == null ? direccion != null : !DIRECCION_EDEFAULT.equals(direccion);
			case VolleyPackage.PERSONA__CORREO_ELECTRONICO:
				return CORREO_ELECTRONICO_EDEFAULT == null ? correoElectronico != null : !CORREO_ELECTRONICO_EDEFAULT.equals(correoElectronico);
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
		result.append(" (nombre: ");
		result.append(nombre);
		result.append(", apellido: ");
		result.append(apellido);
		result.append(", fechaNacimiento: ");
		result.append(fechaNacimiento);
		result.append(", sexo: ");
		result.append(sexo);
		result.append(", telefono: ");
		result.append(telefono);
		result.append(", direccion: ");
		result.append(direccion);
		result.append(", correoElectronico: ");
		result.append(correoElectronico);
		result.append(')');
		return result.toString();
	}

} //PersonaImpl
