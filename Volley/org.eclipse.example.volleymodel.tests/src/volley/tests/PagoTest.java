/**
 */
package volley.tests;

import junit.textui.TestRunner;

import volley.Pago;
import volley.VolleyFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Pago</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PagoTest extends FacturaTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PagoTest.class);
	}

	/**
	 * Constructs a new Pago test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PagoTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Pago test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Pago getFixture() {
		return (Pago)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(VolleyFactory.eINSTANCE.createPago());
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

} //PagoTest
