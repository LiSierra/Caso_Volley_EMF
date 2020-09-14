/**
 */
package volley;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see volley.VolleyFactory
 * @model kind="package"
 * @generated
 */
public interface VolleyPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "volley";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://org/eclipse/example/volley";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.eclipse.example.volley";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VolleyPackage eINSTANCE = volley.impl.VolleyPackageImpl.init();

	/**
	 * The meta object id for the '{@link volley.impl.PersonaImpl <em>Persona</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see volley.impl.PersonaImpl
	 * @see volley.impl.VolleyPackageImpl#getPersona()
	 * @generated
	 */
	int PERSONA = 0;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Apellido</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__APELLIDO = 1;

	/**
	 * The feature id for the '<em><b>Fecha Nacimiento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__FECHA_NACIMIENTO = 2;

	/**
	 * The feature id for the '<em><b>Sexo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__SEXO = 3;

	/**
	 * The feature id for the '<em><b>Telefono</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__TELEFONO = 4;

	/**
	 * The feature id for the '<em><b>Direccion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__DIRECCION = 5;

	/**
	 * The feature id for the '<em><b>Correo Electronico</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__CORREO_ELECTRONICO = 6;

	/**
	 * The number of structural features of the '<em>Persona</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Persona</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link volley.impl.EmpleadoImpl <em>Empleado</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see volley.impl.EmpleadoImpl
	 * @see volley.impl.VolleyPackageImpl#getEmpleado()
	 * @generated
	 */
	int EMPLEADO = 1;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLEADO__NOMBRE = PERSONA__NOMBRE;

	/**
	 * The feature id for the '<em><b>Apellido</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLEADO__APELLIDO = PERSONA__APELLIDO;

	/**
	 * The feature id for the '<em><b>Fecha Nacimiento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLEADO__FECHA_NACIMIENTO = PERSONA__FECHA_NACIMIENTO;

	/**
	 * The feature id for the '<em><b>Sexo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLEADO__SEXO = PERSONA__SEXO;

	/**
	 * The feature id for the '<em><b>Telefono</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLEADO__TELEFONO = PERSONA__TELEFONO;

	/**
	 * The feature id for the '<em><b>Direccion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLEADO__DIRECCION = PERSONA__DIRECCION;

	/**
	 * The feature id for the '<em><b>Correo Electronico</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLEADO__CORREO_ELECTRONICO = PERSONA__CORREO_ELECTRONICO;

	/**
	 * The feature id for the '<em><b>Cargo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLEADO__CARGO = PERSONA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sueldo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLEADO__SUELDO = PERSONA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fecha Inicio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLEADO__FECHA_INICIO = PERSONA_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Fecha Fin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLEADO__FECHA_FIN = PERSONA_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Empleado</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLEADO_FEATURE_COUNT = PERSONA_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Empleado</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLEADO_OPERATION_COUNT = PERSONA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link volley.impl.MembresiaImpl <em>Membresia</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see volley.impl.MembresiaImpl
	 * @see volley.impl.VolleyPackageImpl#getMembresia()
	 * @generated
	 */
	int MEMBRESIA = 2;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBRESIA__NOMBRE = PERSONA__NOMBRE;

	/**
	 * The feature id for the '<em><b>Apellido</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBRESIA__APELLIDO = PERSONA__APELLIDO;

	/**
	 * The feature id for the '<em><b>Fecha Nacimiento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBRESIA__FECHA_NACIMIENTO = PERSONA__FECHA_NACIMIENTO;

	/**
	 * The feature id for the '<em><b>Sexo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBRESIA__SEXO = PERSONA__SEXO;

	/**
	 * The feature id for the '<em><b>Telefono</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBRESIA__TELEFONO = PERSONA__TELEFONO;

	/**
	 * The feature id for the '<em><b>Direccion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBRESIA__DIRECCION = PERSONA__DIRECCION;

	/**
	 * The feature id for the '<em><b>Correo Electronico</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBRESIA__CORREO_ELECTRONICO = PERSONA__CORREO_ELECTRONICO;

	/**
	 * The feature id for the '<em><b>Es Miembro</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBRESIA__ES_MIEMBRO = PERSONA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fecha Inicio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBRESIA__FECHA_INICIO = PERSONA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fecha Fin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBRESIA__FECHA_FIN = PERSONA_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Nro Miembro</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBRESIA__NRO_MIEMBRO = PERSONA_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Membresia</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBRESIA_FEATURE_COUNT = PERSONA_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Membresia</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBRESIA_OPERATION_COUNT = PERSONA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link volley.impl.SolicitudImpl <em>Solicitud</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see volley.impl.SolicitudImpl
	 * @see volley.impl.VolleyPackageImpl#getSolicitud()
	 * @generated
	 */
	int SOLICITUD = 3;

	/**
	 * The feature id for the '<em><b>Fecha Solicitud</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLICITUD__FECHA_SOLICITUD = 0;

	/**
	 * The feature id for the '<em><b>Membresia</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLICITUD__MEMBRESIA = 1;

	/**
	 * The number of structural features of the '<em>Solicitud</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLICITUD_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Solicitud</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLICITUD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link volley.impl.FacturaImpl <em>Factura</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see volley.impl.FacturaImpl
	 * @see volley.impl.VolleyPackageImpl#getFactura()
	 * @generated
	 */
	int FACTURA = 4;

	/**
	 * The feature id for the '<em><b>Nro Factura</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTURA__NRO_FACTURA = 0;

	/**
	 * The feature id for the '<em><b>Fecha Pago Oportuno</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTURA__FECHA_PAGO_OPORTUNO = 1;

	/**
	 * The feature id for the '<em><b>Valor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTURA__VALOR = 2;

	/**
	 * The feature id for the '<em><b>Detalle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTURA__DETALLE = 3;

	/**
	 * The feature id for the '<em><b>Membresias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTURA__MEMBRESIAS = 4;

	/**
	 * The number of structural features of the '<em>Factura</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTURA_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Factura</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTURA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link volley.impl.TarifaImpl <em>Tarifa</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see volley.impl.TarifaImpl
	 * @see volley.impl.VolleyPackageImpl#getTarifa()
	 * @generated
	 */
	int TARIFA = 5;

	/**
	 * The feature id for the '<em><b>Costo Anual Membresia</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARIFA__COSTO_ANUAL_MEMBRESIA = 0;

	/**
	 * The feature id for the '<em><b>Membresia</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARIFA__MEMBRESIA = 1;

	/**
	 * The number of structural features of the '<em>Tarifa</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARIFA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Tarifa</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARIFA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link volley.impl.PagoImpl <em>Pago</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see volley.impl.PagoImpl
	 * @see volley.impl.VolleyPackageImpl#getPago()
	 * @generated
	 */
	int PAGO = 6;

	/**
	 * The feature id for the '<em><b>Nro Factura</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGO__NRO_FACTURA = FACTURA__NRO_FACTURA;

	/**
	 * The feature id for the '<em><b>Fecha Pago Oportuno</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGO__FECHA_PAGO_OPORTUNO = FACTURA__FECHA_PAGO_OPORTUNO;

	/**
	 * The feature id for the '<em><b>Valor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGO__VALOR = FACTURA__VALOR;

	/**
	 * The feature id for the '<em><b>Detalle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGO__DETALLE = FACTURA__DETALLE;

	/**
	 * The feature id for the '<em><b>Membresias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGO__MEMBRESIAS = FACTURA__MEMBRESIAS;

	/**
	 * The feature id for the '<em><b>Nro Transferencia</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGO__NRO_TRANSFERENCIA = FACTURA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nombre Entidad Financiera</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGO__NOMBRE_ENTIDAD_FINANCIERA = FACTURA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fecha Pago</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGO__FECHA_PAGO = FACTURA_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pago</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGO_FEATURE_COUNT = FACTURA_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Pago</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGO_OPERATION_COUNT = FACTURA_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link volley.Persona <em>Persona</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Persona</em>'.
	 * @see volley.Persona
	 * @generated
	 */
	EClass getPersona();

	/**
	 * Returns the meta object for the attribute '{@link volley.Persona#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see volley.Persona#getNombre()
	 * @see #getPersona()
	 * @generated
	 */
	EAttribute getPersona_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link volley.Persona#getApellido <em>Apellido</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Apellido</em>'.
	 * @see volley.Persona#getApellido()
	 * @see #getPersona()
	 * @generated
	 */
	EAttribute getPersona_Apellido();

	/**
	 * Returns the meta object for the attribute '{@link volley.Persona#getFechaNacimiento <em>Fecha Nacimiento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fecha Nacimiento</em>'.
	 * @see volley.Persona#getFechaNacimiento()
	 * @see #getPersona()
	 * @generated
	 */
	EAttribute getPersona_FechaNacimiento();

	/**
	 * Returns the meta object for the attribute '{@link volley.Persona#getSexo <em>Sexo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sexo</em>'.
	 * @see volley.Persona#getSexo()
	 * @see #getPersona()
	 * @generated
	 */
	EAttribute getPersona_Sexo();

	/**
	 * Returns the meta object for the attribute '{@link volley.Persona#getTelefono <em>Telefono</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Telefono</em>'.
	 * @see volley.Persona#getTelefono()
	 * @see #getPersona()
	 * @generated
	 */
	EAttribute getPersona_Telefono();

	/**
	 * Returns the meta object for the attribute '{@link volley.Persona#getDireccion <em>Direccion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direccion</em>'.
	 * @see volley.Persona#getDireccion()
	 * @see #getPersona()
	 * @generated
	 */
	EAttribute getPersona_Direccion();

	/**
	 * Returns the meta object for the attribute '{@link volley.Persona#getCorreoElectronico <em>Correo Electronico</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Correo Electronico</em>'.
	 * @see volley.Persona#getCorreoElectronico()
	 * @see #getPersona()
	 * @generated
	 */
	EAttribute getPersona_CorreoElectronico();

	/**
	 * Returns the meta object for class '{@link volley.Empleado <em>Empleado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Empleado</em>'.
	 * @see volley.Empleado
	 * @generated
	 */
	EClass getEmpleado();

	/**
	 * Returns the meta object for the attribute '{@link volley.Empleado#getCargo <em>Cargo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cargo</em>'.
	 * @see volley.Empleado#getCargo()
	 * @see #getEmpleado()
	 * @generated
	 */
	EAttribute getEmpleado_Cargo();

	/**
	 * Returns the meta object for the attribute '{@link volley.Empleado#getSueldo <em>Sueldo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sueldo</em>'.
	 * @see volley.Empleado#getSueldo()
	 * @see #getEmpleado()
	 * @generated
	 */
	EAttribute getEmpleado_Sueldo();

	/**
	 * Returns the meta object for the attribute '{@link volley.Empleado#getFechaInicio <em>Fecha Inicio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fecha Inicio</em>'.
	 * @see volley.Empleado#getFechaInicio()
	 * @see #getEmpleado()
	 * @generated
	 */
	EAttribute getEmpleado_FechaInicio();

	/**
	 * Returns the meta object for the attribute '{@link volley.Empleado#getFechaFin <em>Fecha Fin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fecha Fin</em>'.
	 * @see volley.Empleado#getFechaFin()
	 * @see #getEmpleado()
	 * @generated
	 */
	EAttribute getEmpleado_FechaFin();

	/**
	 * Returns the meta object for class '{@link volley.Membresia <em>Membresia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Membresia</em>'.
	 * @see volley.Membresia
	 * @generated
	 */
	EClass getMembresia();

	/**
	 * Returns the meta object for the attribute '{@link volley.Membresia#isEsMiembro <em>Es Miembro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Es Miembro</em>'.
	 * @see volley.Membresia#isEsMiembro()
	 * @see #getMembresia()
	 * @generated
	 */
	EAttribute getMembresia_EsMiembro();

	/**
	 * Returns the meta object for the attribute '{@link volley.Membresia#getFechaInicio <em>Fecha Inicio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fecha Inicio</em>'.
	 * @see volley.Membresia#getFechaInicio()
	 * @see #getMembresia()
	 * @generated
	 */
	EAttribute getMembresia_FechaInicio();

	/**
	 * Returns the meta object for the attribute '{@link volley.Membresia#getFechaFin <em>Fecha Fin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fecha Fin</em>'.
	 * @see volley.Membresia#getFechaFin()
	 * @see #getMembresia()
	 * @generated
	 */
	EAttribute getMembresia_FechaFin();

	/**
	 * Returns the meta object for the attribute '{@link volley.Membresia#getNroMiembro <em>Nro Miembro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nro Miembro</em>'.
	 * @see volley.Membresia#getNroMiembro()
	 * @see #getMembresia()
	 * @generated
	 */
	EAttribute getMembresia_NroMiembro();

	/**
	 * Returns the meta object for class '{@link volley.Solicitud <em>Solicitud</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Solicitud</em>'.
	 * @see volley.Solicitud
	 * @generated
	 */
	EClass getSolicitud();

	/**
	 * Returns the meta object for the attribute '{@link volley.Solicitud#getFechaSolicitud <em>Fecha Solicitud</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fecha Solicitud</em>'.
	 * @see volley.Solicitud#getFechaSolicitud()
	 * @see #getSolicitud()
	 * @generated
	 */
	EAttribute getSolicitud_FechaSolicitud();

	/**
	 * Returns the meta object for the containment reference list '{@link volley.Solicitud#getMembresia <em>Membresia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Membresia</em>'.
	 * @see volley.Solicitud#getMembresia()
	 * @see #getSolicitud()
	 * @generated
	 */
	EReference getSolicitud_Membresia();

	/**
	 * Returns the meta object for class '{@link volley.Factura <em>Factura</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Factura</em>'.
	 * @see volley.Factura
	 * @generated
	 */
	EClass getFactura();

	/**
	 * Returns the meta object for the attribute '{@link volley.Factura#getNroFactura <em>Nro Factura</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nro Factura</em>'.
	 * @see volley.Factura#getNroFactura()
	 * @see #getFactura()
	 * @generated
	 */
	EAttribute getFactura_NroFactura();

	/**
	 * Returns the meta object for the attribute '{@link volley.Factura#getFechaPagoOportuno <em>Fecha Pago Oportuno</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fecha Pago Oportuno</em>'.
	 * @see volley.Factura#getFechaPagoOportuno()
	 * @see #getFactura()
	 * @generated
	 */
	EAttribute getFactura_FechaPagoOportuno();

	/**
	 * Returns the meta object for the attribute '{@link volley.Factura#getValor <em>Valor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valor</em>'.
	 * @see volley.Factura#getValor()
	 * @see #getFactura()
	 * @generated
	 */
	EAttribute getFactura_Valor();

	/**
	 * Returns the meta object for the attribute '{@link volley.Factura#getDetalle <em>Detalle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Detalle</em>'.
	 * @see volley.Factura#getDetalle()
	 * @see #getFactura()
	 * @generated
	 */
	EAttribute getFactura_Detalle();

	/**
	 * Returns the meta object for the containment reference list '{@link volley.Factura#getMembresias <em>Membresias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Membresias</em>'.
	 * @see volley.Factura#getMembresias()
	 * @see #getFactura()
	 * @generated
	 */
	EReference getFactura_Membresias();

	/**
	 * Returns the meta object for class '{@link volley.Tarifa <em>Tarifa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tarifa</em>'.
	 * @see volley.Tarifa
	 * @generated
	 */
	EClass getTarifa();

	/**
	 * Returns the meta object for the attribute '{@link volley.Tarifa#getCostoAnualMembresia <em>Costo Anual Membresia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Costo Anual Membresia</em>'.
	 * @see volley.Tarifa#getCostoAnualMembresia()
	 * @see #getTarifa()
	 * @generated
	 */
	EAttribute getTarifa_CostoAnualMembresia();

	/**
	 * Returns the meta object for the containment reference list '{@link volley.Tarifa#getMembresia <em>Membresia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Membresia</em>'.
	 * @see volley.Tarifa#getMembresia()
	 * @see #getTarifa()
	 * @generated
	 */
	EReference getTarifa_Membresia();

	/**
	 * Returns the meta object for class '{@link volley.Pago <em>Pago</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pago</em>'.
	 * @see volley.Pago
	 * @generated
	 */
	EClass getPago();

	/**
	 * Returns the meta object for the attribute '{@link volley.Pago#getNroTransferencia <em>Nro Transferencia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nro Transferencia</em>'.
	 * @see volley.Pago#getNroTransferencia()
	 * @see #getPago()
	 * @generated
	 */
	EAttribute getPago_NroTransferencia();

	/**
	 * Returns the meta object for the attribute '{@link volley.Pago#getNombreEntidadFinanciera <em>Nombre Entidad Financiera</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre Entidad Financiera</em>'.
	 * @see volley.Pago#getNombreEntidadFinanciera()
	 * @see #getPago()
	 * @generated
	 */
	EAttribute getPago_NombreEntidadFinanciera();

	/**
	 * Returns the meta object for the attribute '{@link volley.Pago#getFechaPago <em>Fecha Pago</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fecha Pago</em>'.
	 * @see volley.Pago#getFechaPago()
	 * @see #getPago()
	 * @generated
	 */
	EAttribute getPago_FechaPago();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	VolleyFactory getVolleyFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link volley.impl.PersonaImpl <em>Persona</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see volley.impl.PersonaImpl
		 * @see volley.impl.VolleyPackageImpl#getPersona()
		 * @generated
		 */
		EClass PERSONA = eINSTANCE.getPersona();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONA__NOMBRE = eINSTANCE.getPersona_Nombre();

		/**
		 * The meta object literal for the '<em><b>Apellido</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONA__APELLIDO = eINSTANCE.getPersona_Apellido();

		/**
		 * The meta object literal for the '<em><b>Fecha Nacimiento</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONA__FECHA_NACIMIENTO = eINSTANCE.getPersona_FechaNacimiento();

		/**
		 * The meta object literal for the '<em><b>Sexo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONA__SEXO = eINSTANCE.getPersona_Sexo();

		/**
		 * The meta object literal for the '<em><b>Telefono</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONA__TELEFONO = eINSTANCE.getPersona_Telefono();

		/**
		 * The meta object literal for the '<em><b>Direccion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONA__DIRECCION = eINSTANCE.getPersona_Direccion();

		/**
		 * The meta object literal for the '<em><b>Correo Electronico</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONA__CORREO_ELECTRONICO = eINSTANCE.getPersona_CorreoElectronico();

		/**
		 * The meta object literal for the '{@link volley.impl.EmpleadoImpl <em>Empleado</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see volley.impl.EmpleadoImpl
		 * @see volley.impl.VolleyPackageImpl#getEmpleado()
		 * @generated
		 */
		EClass EMPLEADO = eINSTANCE.getEmpleado();

		/**
		 * The meta object literal for the '<em><b>Cargo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLEADO__CARGO = eINSTANCE.getEmpleado_Cargo();

		/**
		 * The meta object literal for the '<em><b>Sueldo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLEADO__SUELDO = eINSTANCE.getEmpleado_Sueldo();

		/**
		 * The meta object literal for the '<em><b>Fecha Inicio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLEADO__FECHA_INICIO = eINSTANCE.getEmpleado_FechaInicio();

		/**
		 * The meta object literal for the '<em><b>Fecha Fin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLEADO__FECHA_FIN = eINSTANCE.getEmpleado_FechaFin();

		/**
		 * The meta object literal for the '{@link volley.impl.MembresiaImpl <em>Membresia</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see volley.impl.MembresiaImpl
		 * @see volley.impl.VolleyPackageImpl#getMembresia()
		 * @generated
		 */
		EClass MEMBRESIA = eINSTANCE.getMembresia();

		/**
		 * The meta object literal for the '<em><b>Es Miembro</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMBRESIA__ES_MIEMBRO = eINSTANCE.getMembresia_EsMiembro();

		/**
		 * The meta object literal for the '<em><b>Fecha Inicio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMBRESIA__FECHA_INICIO = eINSTANCE.getMembresia_FechaInicio();

		/**
		 * The meta object literal for the '<em><b>Fecha Fin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMBRESIA__FECHA_FIN = eINSTANCE.getMembresia_FechaFin();

		/**
		 * The meta object literal for the '<em><b>Nro Miembro</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMBRESIA__NRO_MIEMBRO = eINSTANCE.getMembresia_NroMiembro();

		/**
		 * The meta object literal for the '{@link volley.impl.SolicitudImpl <em>Solicitud</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see volley.impl.SolicitudImpl
		 * @see volley.impl.VolleyPackageImpl#getSolicitud()
		 * @generated
		 */
		EClass SOLICITUD = eINSTANCE.getSolicitud();

		/**
		 * The meta object literal for the '<em><b>Fecha Solicitud</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLICITUD__FECHA_SOLICITUD = eINSTANCE.getSolicitud_FechaSolicitud();

		/**
		 * The meta object literal for the '<em><b>Membresia</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLICITUD__MEMBRESIA = eINSTANCE.getSolicitud_Membresia();

		/**
		 * The meta object literal for the '{@link volley.impl.FacturaImpl <em>Factura</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see volley.impl.FacturaImpl
		 * @see volley.impl.VolleyPackageImpl#getFactura()
		 * @generated
		 */
		EClass FACTURA = eINSTANCE.getFactura();

		/**
		 * The meta object literal for the '<em><b>Nro Factura</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACTURA__NRO_FACTURA = eINSTANCE.getFactura_NroFactura();

		/**
		 * The meta object literal for the '<em><b>Fecha Pago Oportuno</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACTURA__FECHA_PAGO_OPORTUNO = eINSTANCE.getFactura_FechaPagoOportuno();

		/**
		 * The meta object literal for the '<em><b>Valor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACTURA__VALOR = eINSTANCE.getFactura_Valor();

		/**
		 * The meta object literal for the '<em><b>Detalle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACTURA__DETALLE = eINSTANCE.getFactura_Detalle();

		/**
		 * The meta object literal for the '<em><b>Membresias</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACTURA__MEMBRESIAS = eINSTANCE.getFactura_Membresias();

		/**
		 * The meta object literal for the '{@link volley.impl.TarifaImpl <em>Tarifa</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see volley.impl.TarifaImpl
		 * @see volley.impl.VolleyPackageImpl#getTarifa()
		 * @generated
		 */
		EClass TARIFA = eINSTANCE.getTarifa();

		/**
		 * The meta object literal for the '<em><b>Costo Anual Membresia</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARIFA__COSTO_ANUAL_MEMBRESIA = eINSTANCE.getTarifa_CostoAnualMembresia();

		/**
		 * The meta object literal for the '<em><b>Membresia</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARIFA__MEMBRESIA = eINSTANCE.getTarifa_Membresia();

		/**
		 * The meta object literal for the '{@link volley.impl.PagoImpl <em>Pago</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see volley.impl.PagoImpl
		 * @see volley.impl.VolleyPackageImpl#getPago()
		 * @generated
		 */
		EClass PAGO = eINSTANCE.getPago();

		/**
		 * The meta object literal for the '<em><b>Nro Transferencia</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGO__NRO_TRANSFERENCIA = eINSTANCE.getPago_NroTransferencia();

		/**
		 * The meta object literal for the '<em><b>Nombre Entidad Financiera</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGO__NOMBRE_ENTIDAD_FINANCIERA = eINSTANCE.getPago_NombreEntidadFinanciera();

		/**
		 * The meta object literal for the '<em><b>Fecha Pago</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGO__FECHA_PAGO = eINSTANCE.getPago_FechaPago();

	}

} //VolleyPackage
