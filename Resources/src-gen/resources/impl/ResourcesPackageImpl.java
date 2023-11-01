/**
 */
package resources.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import resources.AircraftCarrier;
import resources.Ammunition;
import resources.CarrierAircraft;
import resources.Destroyer;
import resources.Drone;
import resources.Fighter;
import resources.Frigate;
import resources.Helicopter;
import resources.Missile;
import resources.Recon;
import resources.Reconnaissance;
import resources.Resources;
import resources.ResourcesFactory;
import resources.ResourcesPackage;
import resources.Shell;
import resources.Ship;
import resources.Strike;
import resources.Torpedo;
import resources.Transport;
import resources.Vehicle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResourcesPackageImpl extends EPackageImpl implements ResourcesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourcesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ammunitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass droneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass carrierAircraftEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass frigateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass destroyerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aircraftCarrierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass missileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shellEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass torpedoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reconnaissanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strikeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fighterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reconEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass helicopterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vehicleEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see resources.ResourcesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ResourcesPackageImpl() {
		super(eNS_URI, ResourcesFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ResourcesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ResourcesPackage init() {
		if (isInited)
			return (ResourcesPackage) EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredResourcesPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ResourcesPackageImpl theResourcesPackage = registeredResourcesPackage instanceof ResourcesPackageImpl
				? (ResourcesPackageImpl) registeredResourcesPackage
				: new ResourcesPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theResourcesPackage.createPackageContents();

		// Initialize created meta-data
		theResourcesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theResourcesPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ResourcesPackage.eNS_URI, theResourcesPackage);
		return theResourcesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResources() {
		return resourcesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResources_Vehicles() {
		return (EReference) resourcesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResources_Name() {
		return (EAttribute) resourcesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShip() {
		return shipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShip_Drone() {
		return (EReference) shipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAmmunition() {
		return ammunitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAmmunition_Amount() {
		return (EAttribute) ammunitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAmmunition_Name() {
		return (EAttribute) ammunitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDrone() {
		return droneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCarrierAircraft() {
		return carrierAircraftEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFrigate() {
		return frigateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFrigate_Helicopter() {
		return (EReference) frigateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDestroyer() {
		return destroyerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDestroyer_Helicopter() {
		return (EReference) destroyerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAircraftCarrier() {
		return aircraftCarrierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAircraftCarrier_Carrieraircraft() {
		return (EReference) aircraftCarrierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMissile() {
		return missileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShell() {
		return shellEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTorpedo() {
		return torpedoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReconnaissance() {
		return reconnaissanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStrike() {
		return strikeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransport() {
		return transportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFighter() {
		return fighterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRecon() {
		return reconEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHelicopter() {
		return helicopterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVehicle() {
		return vehicleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVehicle_Name() {
		return (EAttribute) vehicleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVehicle_Ammunitions() {
		return (EReference) vehicleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVehicle_Amount() {
		return (EAttribute) vehicleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourcesFactory getResourcesFactory() {
		return (ResourcesFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		resourcesEClass = createEClass(RESOURCES);
		createEReference(resourcesEClass, RESOURCES__VEHICLES);
		createEAttribute(resourcesEClass, RESOURCES__NAME);

		shipEClass = createEClass(SHIP);
		createEReference(shipEClass, SHIP__DRONE);

		ammunitionEClass = createEClass(AMMUNITION);
		createEAttribute(ammunitionEClass, AMMUNITION__AMOUNT);
		createEAttribute(ammunitionEClass, AMMUNITION__NAME);

		droneEClass = createEClass(DRONE);

		carrierAircraftEClass = createEClass(CARRIER_AIRCRAFT);

		frigateEClass = createEClass(FRIGATE);
		createEReference(frigateEClass, FRIGATE__HELICOPTER);

		destroyerEClass = createEClass(DESTROYER);
		createEReference(destroyerEClass, DESTROYER__HELICOPTER);

		aircraftCarrierEClass = createEClass(AIRCRAFT_CARRIER);
		createEReference(aircraftCarrierEClass, AIRCRAFT_CARRIER__CARRIERAIRCRAFT);

		missileEClass = createEClass(MISSILE);

		shellEClass = createEClass(SHELL);

		torpedoEClass = createEClass(TORPEDO);

		reconnaissanceEClass = createEClass(RECONNAISSANCE);

		strikeEClass = createEClass(STRIKE);

		transportEClass = createEClass(TRANSPORT);

		fighterEClass = createEClass(FIGHTER);

		reconEClass = createEClass(RECON);

		helicopterEClass = createEClass(HELICOPTER);

		vehicleEClass = createEClass(VEHICLE);
		createEAttribute(vehicleEClass, VEHICLE__NAME);
		createEReference(vehicleEClass, VEHICLE__AMMUNITIONS);
		createEAttribute(vehicleEClass, VEHICLE__AMOUNT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		shipEClass.getESuperTypes().add(this.getVehicle());
		droneEClass.getESuperTypes().add(this.getVehicle());
		carrierAircraftEClass.getESuperTypes().add(this.getVehicle());
		frigateEClass.getESuperTypes().add(this.getShip());
		destroyerEClass.getESuperTypes().add(this.getShip());
		aircraftCarrierEClass.getESuperTypes().add(this.getShip());
		missileEClass.getESuperTypes().add(this.getAmmunition());
		shellEClass.getESuperTypes().add(this.getAmmunition());
		torpedoEClass.getESuperTypes().add(this.getAmmunition());
		reconnaissanceEClass.getESuperTypes().add(this.getDrone());
		strikeEClass.getESuperTypes().add(this.getDrone());
		transportEClass.getESuperTypes().add(this.getDrone());
		fighterEClass.getESuperTypes().add(this.getCarrierAircraft());
		reconEClass.getESuperTypes().add(this.getCarrierAircraft());
		helicopterEClass.getESuperTypes().add(this.getCarrierAircraft());

		// Initialize classes, features, and operations; add parameters
		initEClass(resourcesEClass, Resources.class, "Resources", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResources_Vehicles(), this.getVehicle(), null, "vehicles", null, 0, -1, Resources.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResources_Name(), ecorePackage.getEString(), "name", null, 0, 1, Resources.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(shipEClass, Ship.class, "Ship", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getShip_Drone(), this.getDrone(), null, "drone", null, 0, -1, Ship.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(ammunitionEClass, Ammunition.class, "Ammunition", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAmmunition_Amount(), ecorePackage.getEInt(), "amount", null, 0, 1, Ammunition.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAmmunition_Name(), ecorePackage.getEString(), "name", null, 0, 1, Ammunition.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(droneEClass, Drone.class, "Drone", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(carrierAircraftEClass, CarrierAircraft.class, "CarrierAircraft", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(frigateEClass, Frigate.class, "Frigate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFrigate_Helicopter(), this.getHelicopter(), null, "helicopter", null, 0, -1, Frigate.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(destroyerEClass, Destroyer.class, "Destroyer", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDestroyer_Helicopter(), this.getHelicopter(), null, "helicopter", null, 0, -1,
				Destroyer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aircraftCarrierEClass, AircraftCarrier.class, "AircraftCarrier", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAircraftCarrier_Carrieraircraft(), this.getCarrierAircraft(), null, "carrieraircraft", null,
				0, -1, AircraftCarrier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(missileEClass, Missile.class, "Missile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(shellEClass, Shell.class, "Shell", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(torpedoEClass, Torpedo.class, "Torpedo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(reconnaissanceEClass, Reconnaissance.class, "Reconnaissance", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(strikeEClass, Strike.class, "Strike", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(transportEClass, Transport.class, "Transport", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(fighterEClass, Fighter.class, "Fighter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(reconEClass, Recon.class, "Recon", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(helicopterEClass, Helicopter.class, "Helicopter", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(vehicleEClass, Vehicle.class, "Vehicle", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVehicle_Name(), ecorePackage.getEString(), "name", null, 0, 1, Vehicle.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVehicle_Ammunitions(), this.getAmmunition(), null, "ammunitions", null, 0, -1, Vehicle.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVehicle_Amount(), ecorePackage.getEInt(), "amount", null, 0, 1, Vehicle.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ResourcesPackageImpl
