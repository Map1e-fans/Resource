/**
 */
package resources.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import resources.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResourcesFactoryImpl extends EFactoryImpl implements ResourcesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ResourcesFactory init() {
		try {
			ResourcesFactory theResourcesFactory = (ResourcesFactory) EPackage.Registry.INSTANCE
					.getEFactory(ResourcesPackage.eNS_URI);
			if (theResourcesFactory != null) {
				return theResourcesFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ResourcesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourcesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case ResourcesPackage.RESOURCES:
			return createResources();
		case ResourcesPackage.FRIGATE:
			return createFrigate();
		case ResourcesPackage.DESTROYER:
			return createDestroyer();
		case ResourcesPackage.AIRCRAFT_CARRIER:
			return createAircraftCarrier();
		case ResourcesPackage.MISSILE:
			return createMissile();
		case ResourcesPackage.SHELL:
			return createShell();
		case ResourcesPackage.TORPEDO:
			return createTorpedo();
		case ResourcesPackage.RECONNAISSANCE:
			return createReconnaissance();
		case ResourcesPackage.STRIKE:
			return createStrike();
		case ResourcesPackage.TRANSPORT:
			return createTransport();
		case ResourcesPackage.FIGHTER:
			return createFighter();
		case ResourcesPackage.RECON:
			return createRecon();
		case ResourcesPackage.HELICOPTER:
			return createHelicopter();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resources createResources() {
		ResourcesImpl resources = new ResourcesImpl();
		return resources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Frigate createFrigate() {
		FrigateImpl frigate = new FrigateImpl();
		return frigate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Destroyer createDestroyer() {
		DestroyerImpl destroyer = new DestroyerImpl();
		return destroyer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AircraftCarrier createAircraftCarrier() {
		AircraftCarrierImpl aircraftCarrier = new AircraftCarrierImpl();
		return aircraftCarrier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Missile createMissile() {
		MissileImpl missile = new MissileImpl();
		return missile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Shell createShell() {
		ShellImpl shell = new ShellImpl();
		return shell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Torpedo createTorpedo() {
		TorpedoImpl torpedo = new TorpedoImpl();
		return torpedo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reconnaissance createReconnaissance() {
		ReconnaissanceImpl reconnaissance = new ReconnaissanceImpl();
		return reconnaissance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Strike createStrike() {
		StrikeImpl strike = new StrikeImpl();
		return strike;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transport createTransport() {
		TransportImpl transport = new TransportImpl();
		return transport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fighter createFighter() {
		FighterImpl fighter = new FighterImpl();
		return fighter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Recon createRecon() {
		ReconImpl recon = new ReconImpl();
		return recon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Helicopter createHelicopter() {
		HelicopterImpl helicopter = new HelicopterImpl();
		return helicopter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourcesPackage getResourcesPackage() {
		return (ResourcesPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ResourcesPackage getPackage() {
		return ResourcesPackage.eINSTANCE;
	}

} //ResourcesFactoryImpl
