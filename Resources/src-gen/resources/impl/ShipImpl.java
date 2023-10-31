/**
 */
package resources.impl;

import org.eclipse.emf.ecore.EClass;

import resources.ResourcesPackage;
import resources.Ship;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ship</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class ShipImpl extends VehicleImpl implements Ship {
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

} //ShipImpl
