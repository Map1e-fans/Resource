/**
 */
package resources.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import resources.AircraftCarrier;
import resources.CarrierAircraft;
import resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aircraft Carrier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link resources.impl.AircraftCarrierImpl#getCarrieraircraft <em>Carrieraircraft</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AircraftCarrierImpl extends ShipImpl implements AircraftCarrier {
	/**
	 * The cached value of the '{@link #getCarrieraircraft() <em>Carrieraircraft</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarrieraircraft()
	 * @generated
	 * @ordered
	 */
	protected EList<CarrierAircraft> carrieraircraft;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AircraftCarrierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.Literals.AIRCRAFT_CARRIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CarrierAircraft> getCarrieraircraft() {
		if (carrieraircraft == null) {
			carrieraircraft = new EObjectResolvingEList<CarrierAircraft>(CarrierAircraft.class, this,
					ResourcesPackage.AIRCRAFT_CARRIER__CARRIERAIRCRAFT);
		}
		return carrieraircraft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ResourcesPackage.AIRCRAFT_CARRIER__CARRIERAIRCRAFT:
			return getCarrieraircraft();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ResourcesPackage.AIRCRAFT_CARRIER__CARRIERAIRCRAFT:
			getCarrieraircraft().clear();
			getCarrieraircraft().addAll((Collection<? extends CarrierAircraft>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ResourcesPackage.AIRCRAFT_CARRIER__CARRIERAIRCRAFT:
			getCarrieraircraft().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ResourcesPackage.AIRCRAFT_CARRIER__CARRIERAIRCRAFT:
			return carrieraircraft != null && !carrieraircraft.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AircraftCarrierImpl
