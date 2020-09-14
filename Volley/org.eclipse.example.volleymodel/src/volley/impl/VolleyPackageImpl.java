/**
 */
package volley.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import volley.Empleado;
import volley.Factura;
import volley.Membresia;
import volley.Pago;
import volley.Persona;
import volley.Solicitud;
import volley.Tarifa;
import volley.VolleyFactory;
import volley.VolleyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VolleyPackageImpl extends EPackageImpl implements VolleyPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass empleadoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass membresiaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass solicitudEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass facturaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tarifaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pagoEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see volley.VolleyPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private VolleyPackageImpl() {
		super(eNS_URI, VolleyFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link VolleyPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static VolleyPackage init() {
		if (isInited) return (VolleyPackage)EPackage.Registry.INSTANCE.getEPackage(VolleyPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredVolleyPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		VolleyPackageImpl theVolleyPackage = registeredVolleyPackage instanceof VolleyPackageImpl ? (VolleyPackageImpl)registeredVolleyPackage : new VolleyPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theVolleyPackage.createPackageContents();

		// Initialize created meta-data
		theVolleyPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theVolleyPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(VolleyPackage.eNS_URI, theVolleyPackage);
		return theVolleyPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPersona() {
		return personaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPersona_Nombre() {
		return (EAttribute)personaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPersona_Apellido() {
		return (EAttribute)personaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPersona_FechaNacimiento() {
		return (EAttribute)personaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPersona_Sexo() {
		return (EAttribute)personaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPersona_Telefono() {
		return (EAttribute)personaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPersona_Direccion() {
		return (EAttribute)personaEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPersona_CorreoElectronico() {
		return (EAttribute)personaEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEmpleado() {
		return empleadoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEmpleado_Cargo() {
		return (EAttribute)empleadoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEmpleado_Sueldo() {
		return (EAttribute)empleadoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEmpleado_FechaInicio() {
		return (EAttribute)empleadoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEmpleado_FechaFin() {
		return (EAttribute)empleadoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMembresia() {
		return membresiaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMembresia_EsMiembro() {
		return (EAttribute)membresiaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMembresia_FechaInicio() {
		return (EAttribute)membresiaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMembresia_FechaFin() {
		return (EAttribute)membresiaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMembresia_NroMiembro() {
		return (EAttribute)membresiaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSolicitud() {
		return solicitudEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSolicitud_FechaSolicitud() {
		return (EAttribute)solicitudEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSolicitud_Membresia() {
		return (EReference)solicitudEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFactura() {
		return facturaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFactura_NroFactura() {
		return (EAttribute)facturaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFactura_FechaPagoOportuno() {
		return (EAttribute)facturaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFactura_Valor() {
		return (EAttribute)facturaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFactura_Detalle() {
		return (EAttribute)facturaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFactura_Membresias() {
		return (EReference)facturaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTarifa() {
		return tarifaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTarifa_CostoAnualMembresia() {
		return (EAttribute)tarifaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTarifa_Membresia() {
		return (EReference)tarifaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPago() {
		return pagoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPago_NroTransferencia() {
		return (EAttribute)pagoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPago_NombreEntidadFinanciera() {
		return (EAttribute)pagoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPago_FechaPago() {
		return (EAttribute)pagoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VolleyFactory getVolleyFactory() {
		return (VolleyFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		personaEClass = createEClass(PERSONA);
		createEAttribute(personaEClass, PERSONA__NOMBRE);
		createEAttribute(personaEClass, PERSONA__APELLIDO);
		createEAttribute(personaEClass, PERSONA__FECHA_NACIMIENTO);
		createEAttribute(personaEClass, PERSONA__SEXO);
		createEAttribute(personaEClass, PERSONA__TELEFONO);
		createEAttribute(personaEClass, PERSONA__DIRECCION);
		createEAttribute(personaEClass, PERSONA__CORREO_ELECTRONICO);

		empleadoEClass = createEClass(EMPLEADO);
		createEAttribute(empleadoEClass, EMPLEADO__CARGO);
		createEAttribute(empleadoEClass, EMPLEADO__SUELDO);
		createEAttribute(empleadoEClass, EMPLEADO__FECHA_INICIO);
		createEAttribute(empleadoEClass, EMPLEADO__FECHA_FIN);

		membresiaEClass = createEClass(MEMBRESIA);
		createEAttribute(membresiaEClass, MEMBRESIA__ES_MIEMBRO);
		createEAttribute(membresiaEClass, MEMBRESIA__FECHA_INICIO);
		createEAttribute(membresiaEClass, MEMBRESIA__FECHA_FIN);
		createEAttribute(membresiaEClass, MEMBRESIA__NRO_MIEMBRO);

		solicitudEClass = createEClass(SOLICITUD);
		createEAttribute(solicitudEClass, SOLICITUD__FECHA_SOLICITUD);
		createEReference(solicitudEClass, SOLICITUD__MEMBRESIA);

		facturaEClass = createEClass(FACTURA);
		createEAttribute(facturaEClass, FACTURA__NRO_FACTURA);
		createEAttribute(facturaEClass, FACTURA__FECHA_PAGO_OPORTUNO);
		createEAttribute(facturaEClass, FACTURA__VALOR);
		createEAttribute(facturaEClass, FACTURA__DETALLE);
		createEReference(facturaEClass, FACTURA__MEMBRESIAS);

		tarifaEClass = createEClass(TARIFA);
		createEAttribute(tarifaEClass, TARIFA__COSTO_ANUAL_MEMBRESIA);
		createEReference(tarifaEClass, TARIFA__MEMBRESIA);

		pagoEClass = createEClass(PAGO);
		createEAttribute(pagoEClass, PAGO__NRO_TRANSFERENCIA);
		createEAttribute(pagoEClass, PAGO__NOMBRE_ENTIDAD_FINANCIERA);
		createEAttribute(pagoEClass, PAGO__FECHA_PAGO);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		empleadoEClass.getESuperTypes().add(this.getPersona());
		membresiaEClass.getESuperTypes().add(this.getPersona());
		pagoEClass.getESuperTypes().add(this.getFactura());

		// Initialize classes, features, and operations; add parameters
		initEClass(personaEClass, Persona.class, "Persona", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPersona_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Persona.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersona_Apellido(), ecorePackage.getEString(), "apellido", null, 0, 1, Persona.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersona_FechaNacimiento(), ecorePackage.getEDate(), "fechaNacimiento", null, 0, 1, Persona.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersona_Sexo(), ecorePackage.getEString(), "sexo", null, 0, 1, Persona.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersona_Telefono(), ecorePackage.getEInt(), "telefono", null, 0, 1, Persona.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersona_Direccion(), ecorePackage.getEString(), "direccion", null, 0, 1, Persona.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersona_CorreoElectronico(), ecorePackage.getEString(), "correoElectronico", null, 0, 1, Persona.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(empleadoEClass, Empleado.class, "Empleado", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEmpleado_Cargo(), ecorePackage.getEString(), "cargo", null, 0, 1, Empleado.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmpleado_Sueldo(), ecorePackage.getEDouble(), "sueldo", null, 0, 1, Empleado.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmpleado_FechaInicio(), ecorePackage.getEDate(), "fechaInicio", null, 0, 1, Empleado.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmpleado_FechaFin(), ecorePackage.getEDate(), "fechaFin", null, 0, 1, Empleado.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(membresiaEClass, Membresia.class, "Membresia", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMembresia_EsMiembro(), ecorePackage.getEBoolean(), "esMiembro", null, 0, 1, Membresia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMembresia_FechaInicio(), ecorePackage.getEDate(), "fechaInicio", null, 0, 1, Membresia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMembresia_FechaFin(), ecorePackage.getEDate(), "fechaFin", null, 0, 1, Membresia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMembresia_NroMiembro(), ecorePackage.getEInt(), "nroMiembro", null, 0, 1, Membresia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(solicitudEClass, Solicitud.class, "Solicitud", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSolicitud_FechaSolicitud(), ecorePackage.getEDate(), "fechaSolicitud", null, 0, 1, Solicitud.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSolicitud_Membresia(), this.getMembresia(), null, "membresia", null, 0, 2, Solicitud.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(facturaEClass, Factura.class, "Factura", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFactura_NroFactura(), ecorePackage.getEInt(), "nroFactura", null, 0, 1, Factura.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFactura_FechaPagoOportuno(), ecorePackage.getEDate(), "fechaPagoOportuno", null, 0, 1, Factura.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFactura_Valor(), ecorePackage.getEDouble(), "valor", null, 0, 1, Factura.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFactura_Detalle(), ecorePackage.getEString(), "detalle", null, 0, 1, Factura.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFactura_Membresias(), this.getMembresia(), null, "membresias", null, 1, 2, Factura.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tarifaEClass, Tarifa.class, "Tarifa", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTarifa_CostoAnualMembresia(), ecorePackage.getEDouble(), "costoAnualMembresia", null, 0, 1, Tarifa.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTarifa_Membresia(), this.getMembresia(), null, "membresia", null, 1, 2, Tarifa.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pagoEClass, Pago.class, "Pago", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPago_NroTransferencia(), ecorePackage.getEInt(), "nroTransferencia", null, 0, 1, Pago.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPago_NombreEntidadFinanciera(), ecorePackage.getEString(), "nombreEntidadFinanciera", null, 0, 1, Pago.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPago_FechaPago(), ecorePackage.getEDate(), "fechaPago", null, 0, 1, Pago.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //VolleyPackageImpl
