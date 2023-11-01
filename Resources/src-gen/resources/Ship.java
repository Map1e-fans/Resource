/**
 */
package resources;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link resources.Ship#getDrone <em>Drone</em>}</li>
 * </ul>
 *
 * @see resources.ResourcesPackage#getShip()
 * @model abstract="true"
 * @generated
 */
public interface Ship extends Vehicle {
	/**
	 * Returns the value of the '<em><b>Drone</b></em>' reference list.
	 * The list contents are of type {@link resources.Drone}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Drone</em>' reference list.
	 * @see resources.ResourcesPackage#getShip_Drone()
	 * @model
	 * @generated
	 */
	EList<Drone> getDrone();

} // Ship
