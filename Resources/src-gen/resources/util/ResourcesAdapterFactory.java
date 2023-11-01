/**
 */
package resources.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import resources.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see resources.ResourcesPackage
 * @generated
 */
public class ResourcesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ResourcesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourcesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ResourcesPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourcesSwitch<Adapter> modelSwitch = new ResourcesSwitch<Adapter>() {
		@Override
		public Adapter caseResources(Resources object) {
			return createResourcesAdapter();
		}

		@Override
		public Adapter caseShip(Ship object) {
			return createShipAdapter();
		}

		@Override
		public Adapter caseAmmunition(Ammunition object) {
			return createAmmunitionAdapter();
		}

		@Override
		public Adapter caseDrone(Drone object) {
			return createDroneAdapter();
		}

		@Override
		public Adapter caseCarrierAircraft(CarrierAircraft object) {
			return createCarrierAircraftAdapter();
		}

		@Override
		public Adapter caseFrigate(Frigate object) {
			return createFrigateAdapter();
		}

		@Override
		public Adapter caseDestroyer(Destroyer object) {
			return createDestroyerAdapter();
		}

		@Override
		public Adapter caseAircraftCarrier(AircraftCarrier object) {
			return createAircraftCarrierAdapter();
		}

		@Override
		public Adapter caseMissile(Missile object) {
			return createMissileAdapter();
		}

		@Override
		public Adapter caseShell(Shell object) {
			return createShellAdapter();
		}

		@Override
		public Adapter caseTorpedo(Torpedo object) {
			return createTorpedoAdapter();
		}

		@Override
		public Adapter caseReconnaissance(Reconnaissance object) {
			return createReconnaissanceAdapter();
		}

		@Override
		public Adapter caseStrike(Strike object) {
			return createStrikeAdapter();
		}

		@Override
		public Adapter caseTransport(Transport object) {
			return createTransportAdapter();
		}

		@Override
		public Adapter caseFighter(Fighter object) {
			return createFighterAdapter();
		}

		@Override
		public Adapter caseRecon(Recon object) {
			return createReconAdapter();
		}

		@Override
		public Adapter caseHelicopter(Helicopter object) {
			return createHelicopterAdapter();
		}

		@Override
		public Adapter caseVehicle(Vehicle object) {
			return createVehicleAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link resources.Resources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see resources.Resources
	 * @generated
	 */
	public Adapter createResourcesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link resources.Ship <em>Ship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see resources.Ship
	 * @generated
	 */
	public Adapter createShipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link resources.Ammunition <em>Ammunition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see resources.Ammunition
	 * @generated
	 */
	public Adapter createAmmunitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link resources.Drone <em>Drone</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see resources.Drone
	 * @generated
	 */
	public Adapter createDroneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link resources.CarrierAircraft <em>Carrier Aircraft</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see resources.CarrierAircraft
	 * @generated
	 */
	public Adapter createCarrierAircraftAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link resources.Frigate <em>Frigate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see resources.Frigate
	 * @generated
	 */
	public Adapter createFrigateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link resources.Destroyer <em>Destroyer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see resources.Destroyer
	 * @generated
	 */
	public Adapter createDestroyerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link resources.AircraftCarrier <em>Aircraft Carrier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see resources.AircraftCarrier
	 * @generated
	 */
	public Adapter createAircraftCarrierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link resources.Missile <em>Missile</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see resources.Missile
	 * @generated
	 */
	public Adapter createMissileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link resources.Shell <em>Shell</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see resources.Shell
	 * @generated
	 */
	public Adapter createShellAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link resources.Torpedo <em>Torpedo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see resources.Torpedo
	 * @generated
	 */
	public Adapter createTorpedoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link resources.Reconnaissance <em>Reconnaissance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see resources.Reconnaissance
	 * @generated
	 */
	public Adapter createReconnaissanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link resources.Strike <em>Strike</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see resources.Strike
	 * @generated
	 */
	public Adapter createStrikeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link resources.Transport <em>Transport</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see resources.Transport
	 * @generated
	 */
	public Adapter createTransportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link resources.Fighter <em>Fighter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see resources.Fighter
	 * @generated
	 */
	public Adapter createFighterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link resources.Recon <em>Recon</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see resources.Recon
	 * @generated
	 */
	public Adapter createReconAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link resources.Helicopter <em>Helicopter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see resources.Helicopter
	 * @generated
	 */
	public Adapter createHelicopterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link resources.Vehicle <em>Vehicle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see resources.Vehicle
	 * @generated
	 */
	public Adapter createVehicleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ResourcesAdapterFactory
