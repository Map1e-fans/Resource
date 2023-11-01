/**
 */
package resources.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import resources.Frigate;
import resources.Helicopter;
import resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Frigate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link resources.impl.FrigateImpl#getHelicopter <em>Helicopter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FrigateImpl extends ShipImpl implements Frigate {
	/**
	 * The cached value of the '{@link #getHelicopter() <em>Helicopter</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHelicopter()
	 * @generated
	 * @ordered
	 */
	protected EList<Helicopter> helicopter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FrigateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.Literals.FRIGATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Helicopter> getHelicopter() {
		if (helicopter == null) {
			helicopter = new EObjectResolvingEList<Helicopter>(Helicopter.class, this,
					ResourcesPackage.FRIGATE__HELICOPTER);
		}
		return helicopter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ResourcesPackage.FRIGATE__HELICOPTER:
			return getHelicopter();
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
		case ResourcesPackage.FRIGATE__HELICOPTER:
			getHelicopter().clear();
			getHelicopter().addAll((Collection<? extends Helicopter>) newValue);
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
		case ResourcesPackage.FRIGATE__HELICOPTER:
			getHelicopter().clear();
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
		case ResourcesPackage.FRIGATE__HELICOPTER:
			return helicopter != null && !helicopter.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FrigateImpl
