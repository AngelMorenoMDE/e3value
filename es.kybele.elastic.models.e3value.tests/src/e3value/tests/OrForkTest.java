/**
 */
package e3value.tests;

import e3value.E3valueFactory;
import e3value.OrFork;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Or Fork</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OrForkTest extends ForkElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OrForkTest.class);
	}

	/**
	 * Constructs a new Or Fork test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrForkTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Or Fork test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected OrFork getFixture() {
		return (OrFork)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(E3valueFactory.eINSTANCE.createOrFork());
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

} //OrForkTest
