/**
 */
package volley.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import volley.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VolleyFactoryImpl extends EFactoryImpl implements VolleyFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static VolleyFactory init() {
		try {
			VolleyFactory theVolleyFactory = (VolleyFactory)EPackage.Registry.INSTANCE.getEFactory(VolleyPackage.eNS_URI);
			if (theVolleyFactory != null) {
				return theVolleyFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new VolleyFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VolleyFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case VolleyPackage.PERSONA: return createPersona();
			case VolleyPackage.EMPLEADO: return createEmpleado();
			case VolleyPackage.MEMBRESIA: return createMembresia();
			case VolleyPackage.SOLICITUD: return createSolicitud();
			case VolleyPackage.FACTURA: return createFactura();
			case VolleyPackage.TARIFA: return createTarifa();
			case VolleyPackage.PAGO: return createPago();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Persona createPersona() {
		PersonaImpl persona = new PersonaImpl();
		return persona;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Empleado createEmpleado() {
		EmpleadoImpl empleado = new EmpleadoImpl();
		return empleado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Membresia createMembresia() {
		MembresiaImpl membresia = new MembresiaImpl();
		return membresia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Solicitud createSolicitud() {
		SolicitudImpl solicitud = new SolicitudImpl();
		return solicitud;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Factura createFactura() {
		FacturaImpl factura = new FacturaImpl();
		return factura;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tarifa createTarifa() {
		TarifaImpl tarifa = new TarifaImpl();
		return tarifa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pago createPago() {
		PagoImpl pago = new PagoImpl();
		return pago;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VolleyPackage getVolleyPackage() {
		return (VolleyPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static VolleyPackage getPackage() {
		return VolleyPackage.eINSTANCE;
	}

} //VolleyFactoryImpl
