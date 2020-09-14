/**
 */
package volley.tests;

import junit.textui.TestRunner;

import volley.Empleado;
import volley.VolleyFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Empleado</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EmpleadoTest extends PersonaTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EmpleadoTest.class);
	}

	/**
	 * Constructs a new Empleado test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmpleadoTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Empleado test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Empleado getFixture() {
		return (Empleado)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(VolleyFactory.eINSTANCE.createEmpleado());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //EmpleadoTest
