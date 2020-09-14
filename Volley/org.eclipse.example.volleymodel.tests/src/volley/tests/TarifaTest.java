/**
 */
package volley.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import volley.Tarifa;
import volley.VolleyFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Tarifa</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TarifaTest extends TestCase {

	/**
	 * The fixture for this Tarifa test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Tarifa fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TarifaTest.class);
	}

	/**
	 * Constructs a new Tarifa test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TarifaTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Tarifa test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Tarifa fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Tarifa test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Tarifa getFixture() {
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
		setFixture(VolleyFactory.eINSTANCE.createTarifa());
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

} //TarifaTest
