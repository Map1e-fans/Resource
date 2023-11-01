/**
 */
package resources.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import resources.Drone;
import resources.ResourcesPackage;
import resources.Ship;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link resources.impl.ShipImpl#getDrone <em>Drone</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ShipImpl extends VehicleImpl implements Ship {
	/**
	 * The cached value of the '{@link #getDrone() <em>Drone</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrone()
	 * @generated
	 * @ordered
	 */
	protected EList<Drone> drone;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.Literals.SHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Drone> getDrone() {
		if (drone == null) {
			drone = new EObjectResolvingEList<Drone>(Drone.class, this, ResourcesPackage.SHIP__DRONE);
		}
		return drone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ResourcesPackage.SHIP__DRONE:
			return getDrone();
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
		case ResourcesPackage.SHIP__DRONE:
			getDrone().clear();
			getDrone().addAll((Collection<? extends Drone>) newValue);
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
		case ResourcesPackage.SHIP__DRONE:
			getDrone().clear();
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
		case ResourcesPackage.SHIP__DRONE:
			return drone != null && !drone.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ShipImpl
