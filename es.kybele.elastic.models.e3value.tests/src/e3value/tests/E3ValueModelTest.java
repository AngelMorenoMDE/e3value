/**
 */
package e3value.tests;

import e3value.E3ValueModel;
import e3value.E3valueFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>E3 Value Model</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class E3ValueModelTest extends TestCase {

	/**
	 * The fixture for this E3 Value Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected E3ValueModel fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(E3ValueModelTest.class);
	}

	/**
	 * Constructs a new E3 Value Model test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public E3ValueModelTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this E3 Value Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(E3ValueModel fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this E3 Value Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected E3ValueModel getFixture() {
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
		setFixture(E3valueFactory.eINSTANCE.createE3ValueModel());
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

} //E3ValueModelTest
