/**
 */
package volley.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import volley.Solicitud;
import volley.VolleyFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Solicitud</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SolicitudTest extends TestCase {

	/**
	 * The fixture for this Solicitud test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Solicitud fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SolicitudTest.class);
	}

	/**
	 * Constructs a new Solicitud test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolicitudTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Solicitud test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Solicitud fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Solicitud test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Solicitud getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(VolleyFactory.eINSTANCE.createSolicitud());
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

} //SolicitudTest
