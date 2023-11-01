/**
 */
package resources;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aircraft Carrier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link resources.AircraftCarrier#getCarrieraircraft <em>Carrieraircraft</em>}</li>
 * </ul>
 *
 * @see resources.ResourcesPackage#getAircraftCarrier()
 * @model
 * @generated
 */
public interface AircraftCarrier extends Ship {
	/**
	 * Returns the value of the '<em><b>Carrieraircraft</b></em>' reference list.
	 * The list contents are of type {@link resources.CarrierAircraft}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Carrieraircraft</em>' reference list.
	 * @see resources.ResourcesPackage#getAircraftCarrier_Carrieraircraft()
	 * @model
	 * @generated
	 */
	EList<CarrierAircraft> getCarrieraircraft();

} // AircraftCarrier
