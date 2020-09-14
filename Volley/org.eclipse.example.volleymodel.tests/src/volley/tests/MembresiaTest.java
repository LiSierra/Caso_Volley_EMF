/**
 */
package volley.tests;

import junit.textui.TestRunner;

import volley.Membresia;
import volley.VolleyFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Membresia</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MembresiaTest extends PersonaTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MembresiaTest.class);
	}

	/**
	 * Constructs a new Membresia test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MembresiaTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Membresia test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Membresia getFixture() {
		return (Membresia)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(VolleyFactory.eINSTANCE.createMembresia());
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

} //MembresiaTest
