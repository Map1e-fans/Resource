/**
 */
package resources.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import resources.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see resources.ResourcesPackage
 * @generated
 */
public class ResourcesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ResourcesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourcesSwitch() {
		if (modelPackage == null) {
			modelPackage = ResourcesPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case ResourcesPackage.RESOURCES: {
			Resources resources = (Resources) theEObject;
			T result = caseResources(resources);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ResourcesPackage.SHIP: {
			Ship ship = (Ship) theEObject;
			T result = caseShip(ship);
			if (result == null)
				result = caseVehicle(ship);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ResourcesPackage.AMMUNITION: {
			Ammunition ammunition = (Ammunition) theEObject;
			T result = caseAmmunition(ammunition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ResourcesPackage.DRONE: {
			Drone drone = (Drone) theEObject;
			T result = caseDrone(drone);
			if (result == null)
				result = caseVehicle(drone);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ResourcesPackage.CARRIER_AIRCRAFT: {
			CarrierAircraft carrierAircraft = (CarrierAircraft) theEObject;
			T result = caseCarrierAircraft(carrierAircraft);
			if (result == null)
				result = caseVehicle(carrierAircraft);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ResourcesPackage.FRIGATE: {
			Frigate frigate = (Frigate) theEObject;
			T result = caseFrigate(frigate);
			if (result == null)
				result = caseShip(frigate);
			if (result == null)
				result = caseVehicle(frigate);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ResourcesPackage.DESTROYER: {
			Destroyer destroyer = (Destroyer) theEObject;
			T result = caseDestroyer(destroyer);
			if (result == null)
				result = caseShip(destroyer);
			if (result == null)
				result = caseVehicle(destroyer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ResourcesPackage.AIRCRAFT_CARRIER: {
			AircraftCarrier aircraftCarrier = (AircraftCarrier) theEObject;
			T result = caseAircraftCarrier(aircraftCarrier);
			if (result == null)
				result = caseShip(aircraftCarrier);
			if (result == null)
				result = caseVehicle(aircraftCarrier);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ResourcesPackage.MISSILE: {
			Missile missile = (Missile) theEObject;
			T result = caseMissile(missile);
			if (result == null)
				result = caseAmmunition(missile);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ResourcesPackage.SHELL: {
			Shell shell = (Shell) theEObject;
			T result = caseShell(shell);
			if (result == null)
				result = caseAmmunition(shell);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ResourcesPackage.TORPEDO: {
			Torpedo torpedo = (Torpedo) theEObject;
			T result = caseTorpedo(torpedo);
			if (result == null)
				result = caseAmmunition(torpedo);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ResourcesPackage.RECONNAISSANCE: {
			Reconnaissance reconnaissance = (Reconnaissance) theEObject;
			T result = caseReconnaissance(reconnaissance);
			if (result == null)
				result = caseDrone(reconnaissance);
			if (result == null)
				result = caseVehicle(reconnaissance);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ResourcesPackage.STRIKE: {
			Strike strike = (Strike) theEObject;
			T result = caseStrike(strike);
			if (result == null)
				result = caseDrone(strike);
			if (result == null)
				result = caseVehicle(strike);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ResourcesPackage.TRANSPORT: {
			Transport transport = (Transport) theEObject;
			T result = caseTransport(transport);
			if (result == null)
				result = caseDrone(transport);
			if (result == null)
				result = caseVehicle(transport);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ResourcesPackage.FIGHTER: {
			Fighter fighter = (Fighter) theEObject;
			T result = caseFighter(fighter);
			if (result == null)
				result = caseCarrierAircraft(fighter);
			if (result == null)
				result = caseVehicle(fighter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ResourcesPackage.RECON: {
			Recon recon = (Recon) theEObject;
			T result = caseRecon(recon);
			if (result == null)
				result = caseCarrierAircraft(recon);
			if (result == null)
				result = caseVehicle(recon);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ResourcesPackage.HELICOPTER: {
			Helicopter helicopter = (Helicopter) theEObject;
			T result = caseHelicopter(helicopter);
			if (result == null)
				result = caseCarrierAircraft(helicopter);
			if (result == null)
				result = caseVehicle(helicopter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ResourcesPackage.VEHICLE: {
			Vehicle vehicle = (Vehicle) theEObject;
			T result = caseVehicle(vehicle);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resources</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resources</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResources(Resources object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShip(Ship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ammunition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ammunition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAmmunition(Ammunition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Drone</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Drone</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDrone(Drone object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Carrier Aircraft</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Carrier Aircraft</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCarrierAircraft(CarrierAircraft object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Frigate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Frigate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFrigate(Frigate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Destroyer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Destroyer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDestroyer(Destroyer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aircraft Carrier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aircraft Carrier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAircraftCarrier(AircraftCarrier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Missile</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Missile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMissile(Missile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shell</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shell</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShell(Shell object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Torpedo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Torpedo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTorpedo(Torpedo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reconnaissance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reconnaissance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReconnaissance(Reconnaissance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Strike</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Strike</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStrike(Strike object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transport</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transport</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransport(Transport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fighter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fighter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFighter(Fighter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Recon</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Recon</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRecon(Recon object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Helicopter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Helicopter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHelicopter(Helicopter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vehicle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vehicle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVehicle(Vehicle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ResourcesSwitch
