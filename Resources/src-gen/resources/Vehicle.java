/**
 */
package resources;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vehicle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link resources.Vehicle#getName <em>Name</em>}</li>
 *   <li>{@link resources.Vehicle#getAmmunition <em>Ammunition</em>}</li>
 * </ul>
 *
 * @see resources.ResourcesPackage#getVehicle()
 * @model abstract="true"
 * @generated
 */
public interface Vehicle extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see resources.ResourcesPackage#getVehicle_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link resources.Vehicle#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Ammunition</b></em>' containment reference list.
	 * The list contents are of type {@link resources.Ammunition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ammunition</em>' containment reference list.
	 * @see resources.ResourcesPackage#getVehicle_Ammunition()
	 * @model containment="true"
	 * @generated
	 */
	EList<Ammunition> getAmmunition();

} // Vehicle
