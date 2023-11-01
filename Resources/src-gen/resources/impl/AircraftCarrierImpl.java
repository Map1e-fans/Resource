/**
 */
package resources.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

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
 *   <li>{@link resources.impl.AircraftCarrierImpl#getCarrieraircrafts <em>Carrieraircrafts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AircraftCarrierImpl extends ShipImpl implements AircraftCarrier {
	/**
	 * The cached value of the '{@link #getCarrieraircrafts() <em>Carrieraircrafts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarrieraircrafts()
	 * @generated
	 * @ordered
	 */
	protected EList<CarrierAircraft> carrieraircrafts;

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
	public EList<CarrierAircraft> getCarrieraircrafts() {
		if (carrieraircrafts == null) {
			carrieraircrafts = new EObjectContainmentEList<CarrierAircraft>(CarrierAircraft.class, this,
					ResourcesPackage.AIRCRAFT_CARRIER__CARRIERAIRCRAFTS);
		}
		return carrieraircrafts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ResourcesPackage.AIRCRAFT_CARRIER__CARRIERAIRCRAFTS:
			return ((InternalEList<?>) getCarrieraircrafts()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ResourcesPackage.AIRCRAFT_CARRIER__CARRIERAIRCRAFTS:
			return getCarrieraircrafts();
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
		case ResourcesPackage.AIRCRAFT_CARRIER__CARRIERAIRCRAFTS:
			getCarrieraircrafts().clear();
			getCarrieraircrafts().addAll((Collection<? extends CarrierAircraft>) newValue);
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
		case ResourcesPackage.AIRCRAFT_CARRIER__CARRIERAIRCRAFTS:
			getCarrieraircrafts().clear();
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
		case ResourcesPackage.AIRCRAFT_CARRIER__CARRIERAIRCRAFTS:
			return carrieraircrafts != null && !carrieraircrafts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AircraftCarrierImpl
