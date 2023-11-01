/**
 */
package resources;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see resources.ResourcesPackage
 * @generated
 */
public interface ResourcesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ResourcesFactory eINSTANCE = resources.impl.ResourcesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Resources</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resources</em>'.
	 * @generated
	 */
	Resources createResources();

	/**
	 * Returns a new object of class '<em>Frigate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Frigate</em>'.
	 * @generated
	 */
	Frigate createFrigate();

	/**
	 * Returns a new object of class '<em>Destroyer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Destroyer</em>'.
	 * @generated
	 */
	Destroyer createDestroyer();

	/**
	 * Returns a new object of class '<em>Aircraft Carrier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Aircraft Carrier</em>'.
	 * @generated
	 */
	AircraftCarrier createAircraftCarrier();

	/**
	 * Returns a new object of class '<em>Missile</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Missile</em>'.
	 * @generated
	 */
	Missile createMissile();

	/**
	 * Returns a new object of class '<em>Shell</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shell</em>'.
	 * @generated
	 */
	Shell createShell();

	/**
	 * Returns a new object of class '<em>Torpedo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Torpedo</em>'.
	 * @generated
	 */
	Torpedo createTorpedo();

	/**
	 * Returns a new object of class '<em>Reconnaissance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reconnaissance</em>'.
	 * @generated
	 */
	Reconnaissance createReconnaissance();

	/**
	 * Returns a new object of class '<em>Strike</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Strike</em>'.
	 * @generated
	 */
	Strike createStrike();

	/**
	 * Returns a new object of class '<em>Transport</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transport</em>'.
	 * @generated
	 */
	Transport createTransport();

	/**
	 * Returns a new object of class '<em>Fighter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fighter</em>'.
	 * @generated
	 */
	Fighter createFighter();

	/**
	 * Returns a new object of class '<em>Recon</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Recon</em>'.
	 * @generated
	 */
	Recon createRecon();

	/**
	 * Returns a new object of class '<em>Helicopter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Helicopter</em>'.
	 * @generated
	 */
	Helicopter createHelicopter();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ResourcesPackage getResourcesPackage();

} //ResourcesFactory
