/**
 */
package e3value.tests;

import e3value.E3valueFactory;
import e3value.ValuePortOut;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Value Port Out</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ValuePortOutTest extends ValuePortTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ValuePortOutTest.class);
	}

	/**
	 * Constructs a new Value Port Out test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValuePortOutTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Value Port Out test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ValuePortOut getFixture() {
		return (ValuePortOut)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(E3valueFactory.eINSTANCE.createValuePortOut());
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

} //ValuePortOutTest
