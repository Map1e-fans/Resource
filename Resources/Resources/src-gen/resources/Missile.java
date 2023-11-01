/**
 */
package resources;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Missile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link resources.Missile#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @see resources.ResourcesPackage#getMissile()
 * @model
 * @generated
 */
public interface Missile extends Ammunition {
	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link resources.Status}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see resources.Status
	 * @see #setStatus(Status)
	 * @see resources.ResourcesPackage#getMissile_Status()
	 * @model
	 * @generated
	 */
	Status getStatus();

	/**
	 * Sets the value of the '{@link resources.Missile#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see resources.Status
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Status value);

} // Missile
