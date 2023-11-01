/**
 */
package resources;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resources</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link resources.Resources#getVehicles <em>Vehicles</em>}</li>
 *   <li>{@link resources.Resources#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see resources.ResourcesPackage#getResources()
 * @model
 * @generated
 */
public interface Resources extends EObject {
	/**
	 * Returns the value of the '<em><b>Vehicles</b></em>' containment reference list.
	 * The list contents are of type {@link resources.Vehicle}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vehicles</em>' containment reference list.
	 * @see resources.ResourcesPackage#getResources_Vehicles()
	 * @model containment="true"
	 * @generated
	 */
	EList<Vehicle> getVehicles();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see resources.ResourcesPackage#getResources_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link resources.Resources#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Resources
