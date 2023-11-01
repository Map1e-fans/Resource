/**
 */
package resources;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Frigate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link resources.Frigate#getHelicopter <em>Helicopter</em>}</li>
 * </ul>
 *
 * @see resources.ResourcesPackage#getFrigate()
 * @model
 * @generated
 */
public interface Frigate extends Ship {
	/**
	 * Returns the value of the '<em><b>Helicopter</b></em>' reference list.
	 * The list contents are of type {@link resources.Helicopter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Helicopter</em>' reference list.
	 * @see resources.ResourcesPackage#getFrigate_Helicopter()
	 * @model
	 * @generated
	 */
	EList<Helicopter> getHelicopter();

} // Frigate
