/**
 */
package resources;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see resources.ResourcesFactory
 * @model kind="package"
 * @generated
 */
public interface ResourcesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "resources";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/resources";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "resources";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ResourcesPackage eINSTANCE = resources.impl.ResourcesPackageImpl.init();

	/**
	 * The meta object id for the '{@link resources.impl.ResourcesImpl <em>Resources</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see resources.impl.ResourcesImpl
	 * @see resources.impl.ResourcesPackageImpl#getResources()
	 * @generated
	 */
	int RESOURCES = 0;

	/**
	 * The feature id for the '<em><b>Vehicles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCES__VEHICLES = 0;

	/**
	 * The number of structural features of the '<em>Resources</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Resources</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link resources.impl.VehicleImpl <em>Vehicle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see resources.impl.VehicleImpl
	 * @see resources.impl.ResourcesPackageImpl#getVehicle()
	 * @generated
	 */
	int VEHICLE = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Ammunition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE__AMMUNITION = 1;

	/**
	 * The number of structural features of the '<em>Vehicle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Vehicle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link resources.impl.ShipImpl <em>Ship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see resources.impl.ShipImpl
	 * @see resources.impl.ResourcesPackageImpl#getShip()
	 * @generated
	 */
	int SHIP = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIP__NAME = VEHICLE__NAME;

	/**
	 * The feature id for the '<em><b>Ammunition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIP__AMMUNITION = VEHICLE__AMMUNITION;

	/**
	 * The number of structural features of the '<em>Ship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIP_FEATURE_COUNT = VEHICLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIP_OPERATION_COUNT = VEHICLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link resources.impl.AmmunitionImpl <em>Ammunition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see resources.impl.AmmunitionImpl
	 * @see resources.impl.ResourcesPackageImpl#getAmmunition()
	 * @generated
	 */
	int AMMUNITION = 2;

	/**
	 * The number of structural features of the '<em>Ammunition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMMUNITION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Ammunition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMMUNITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link resources.impl.DroneImpl <em>Drone</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see resources.impl.DroneImpl
	 * @see resources.impl.ResourcesPackageImpl#getDrone()
	 * @generated
	 */
	int DRONE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE__NAME = VEHICLE__NAME;

	/**
	 * The feature id for the '<em><b>Ammunition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE__AMMUNITION = VEHICLE__AMMUNITION;

	/**
	 * The number of structural features of the '<em>Drone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE_FEATURE_COUNT = VEHICLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Drone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE_OPERATION_COUNT = VEHICLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link resources.impl.CarrierAircraftImpl <em>Carrier Aircraft</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see resources.impl.CarrierAircraftImpl
	 * @see resources.impl.ResourcesPackageImpl#getCarrierAircraft()
	 * @generated
	 */
	int CARRIER_AIRCRAFT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_AIRCRAFT__NAME = VEHICLE__NAME;

	/**
	 * The feature id for the '<em><b>Ammunition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_AIRCRAFT__AMMUNITION = VEHICLE__AMMUNITION;

	/**
	 * The number of structural features of the '<em>Carrier Aircraft</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_AIRCRAFT_FEATURE_COUNT = VEHICLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Carrier Aircraft</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_AIRCRAFT_OPERATION_COUNT = VEHICLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link resources.impl.FrigateImpl <em>Frigate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see resources.impl.FrigateImpl
	 * @see resources.impl.ResourcesPackageImpl#getFrigate()
	 * @generated
	 */
	int FRIGATE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRIGATE__NAME = SHIP__NAME;

	/**
	 * The feature id for the '<em><b>Ammunition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRIGATE__AMMUNITION = SHIP__AMMUNITION;

	/**
	 * The number of structural features of the '<em>Frigate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRIGATE_FEATURE_COUNT = SHIP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Frigate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRIGATE_OPERATION_COUNT = SHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link resources.impl.DestroyerImpl <em>Destroyer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see resources.impl.DestroyerImpl
	 * @see resources.impl.ResourcesPackageImpl#getDestroyer()
	 * @generated
	 */
	int DESTROYER = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROYER__NAME = SHIP__NAME;

	/**
	 * The feature id for the '<em><b>Ammunition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROYER__AMMUNITION = SHIP__AMMUNITION;

	/**
	 * The number of structural features of the '<em>Destroyer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROYER_FEATURE_COUNT = SHIP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Destroyer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROYER_OPERATION_COUNT = SHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link resources.impl.AircraftCarrierImpl <em>Aircraft Carrier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see resources.impl.AircraftCarrierImpl
	 * @see resources.impl.ResourcesPackageImpl#getAircraftCarrier()
	 * @generated
	 */
	int AIRCRAFT_CARRIER = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIRCRAFT_CARRIER__NAME = SHIP__NAME;

	/**
	 * The feature id for the '<em><b>Ammunition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIRCRAFT_CARRIER__AMMUNITION = SHIP__AMMUNITION;

	/**
	 * The feature id for the '<em><b>Carrieraircraft</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIRCRAFT_CARRIER__CARRIERAIRCRAFT = SHIP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Aircraft Carrier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIRCRAFT_CARRIER_FEATURE_COUNT = SHIP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Aircraft Carrier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIRCRAFT_CARRIER_OPERATION_COUNT = SHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link resources.impl.MissileImpl <em>Missile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see resources.impl.MissileImpl
	 * @see resources.impl.ResourcesPackageImpl#getMissile()
	 * @generated
	 */
	int MISSILE = 8;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSILE__STATUS = AMMUNITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Missile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSILE_FEATURE_COUNT = AMMUNITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Missile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSILE_OPERATION_COUNT = AMMUNITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link resources.impl.ShellImpl <em>Shell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see resources.impl.ShellImpl
	 * @see resources.impl.ResourcesPackageImpl#getShell()
	 * @generated
	 */
	int SHELL = 9;

	/**
	 * The number of structural features of the '<em>Shell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHELL_FEATURE_COUNT = AMMUNITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Shell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHELL_OPERATION_COUNT = AMMUNITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link resources.impl.TorpedoImpl <em>Torpedo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see resources.impl.TorpedoImpl
	 * @see resources.impl.ResourcesPackageImpl#getTorpedo()
	 * @generated
	 */
	int TORPEDO = 10;

	/**
	 * The number of structural features of the '<em>Torpedo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TORPEDO_FEATURE_COUNT = AMMUNITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Torpedo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TORPEDO_OPERATION_COUNT = AMMUNITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link resources.impl.ReconnaissanceImpl <em>Reconnaissance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see resources.impl.ReconnaissanceImpl
	 * @see resources.impl.ResourcesPackageImpl#getReconnaissance()
	 * @generated
	 */
	int RECONNAISSANCE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONNAISSANCE__NAME = DRONE__NAME;

	/**
	 * The feature id for the '<em><b>Ammunition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONNAISSANCE__AMMUNITION = DRONE__AMMUNITION;

	/**
	 * The number of structural features of the '<em>Reconnaissance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONNAISSANCE_FEATURE_COUNT = DRONE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Reconnaissance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONNAISSANCE_OPERATION_COUNT = DRONE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link resources.impl.StrikeImpl <em>Strike</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see resources.impl.StrikeImpl
	 * @see resources.impl.ResourcesPackageImpl#getStrike()
	 * @generated
	 */
	int STRIKE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRIKE__NAME = DRONE__NAME;

	/**
	 * The feature id for the '<em><b>Ammunition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRIKE__AMMUNITION = DRONE__AMMUNITION;

	/**
	 * The number of structural features of the '<em>Strike</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRIKE_FEATURE_COUNT = DRONE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Strike</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRIKE_OPERATION_COUNT = DRONE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link resources.impl.TransportImpl <em>Transport</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see resources.impl.TransportImpl
	 * @see resources.impl.ResourcesPackageImpl#getTransport()
	 * @generated
	 */
	int TRANSPORT = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT__NAME = DRONE__NAME;

	/**
	 * The feature id for the '<em><b>Ammunition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT__AMMUNITION = DRONE__AMMUNITION;

	/**
	 * The number of structural features of the '<em>Transport</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_FEATURE_COUNT = DRONE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Transport</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_OPERATION_COUNT = DRONE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link resources.impl.FighterImpl <em>Fighter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see resources.impl.FighterImpl
	 * @see resources.impl.ResourcesPackageImpl#getFighter()
	 * @generated
	 */
	int FIGHTER = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGHTER__NAME = CARRIER_AIRCRAFT__NAME;

	/**
	 * The feature id for the '<em><b>Ammunition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGHTER__AMMUNITION = CARRIER_AIRCRAFT__AMMUNITION;

	/**
	 * The number of structural features of the '<em>Fighter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGHTER_FEATURE_COUNT = CARRIER_AIRCRAFT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fighter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGHTER_OPERATION_COUNT = CARRIER_AIRCRAFT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link resources.impl.ReconImpl <em>Recon</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see resources.impl.ReconImpl
	 * @see resources.impl.ResourcesPackageImpl#getRecon()
	 * @generated
	 */
	int RECON = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECON__NAME = CARRIER_AIRCRAFT__NAME;

	/**
	 * The feature id for the '<em><b>Ammunition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECON__AMMUNITION = CARRIER_AIRCRAFT__AMMUNITION;

	/**
	 * The number of structural features of the '<em>Recon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECON_FEATURE_COUNT = CARRIER_AIRCRAFT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Recon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECON_OPERATION_COUNT = CARRIER_AIRCRAFT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link resources.impl.HelicopterImpl <em>Helicopter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see resources.impl.HelicopterImpl
	 * @see resources.impl.ResourcesPackageImpl#getHelicopter()
	 * @generated
	 */
	int HELICOPTER = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELICOPTER__NAME = CARRIER_AIRCRAFT__NAME;

	/**
	 * The feature id for the '<em><b>Ammunition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELICOPTER__AMMUNITION = CARRIER_AIRCRAFT__AMMUNITION;

	/**
	 * The number of structural features of the '<em>Helicopter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELICOPTER_FEATURE_COUNT = CARRIER_AIRCRAFT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Helicopter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELICOPTER_OPERATION_COUNT = CARRIER_AIRCRAFT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link resources.Status <em>Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see resources.Status
	 * @see resources.impl.ResourcesPackageImpl#getStatus()
	 * @generated
	 */
	int STATUS = 18;

	/**
	 * Returns the meta object for class '{@link resources.Resources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resources</em>'.
	 * @see resources.Resources
	 * @generated
	 */
	EClass getResources();

	/**
	 * Returns the meta object for the containment reference list '{@link resources.Resources#getVehicles <em>Vehicles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vehicles</em>'.
	 * @see resources.Resources#getVehicles()
	 * @see #getResources()
	 * @generated
	 */
	EReference getResources_Vehicles();

	/**
	 * Returns the meta object for class '{@link resources.Ship <em>Ship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ship</em>'.
	 * @see resources.Ship
	 * @generated
	 */
	EClass getShip();

	/**
	 * Returns the meta object for class '{@link resources.Ammunition <em>Ammunition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ammunition</em>'.
	 * @see resources.Ammunition
	 * @generated
	 */
	EClass getAmmunition();

	/**
	 * Returns the meta object for class '{@link resources.Drone <em>Drone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Drone</em>'.
	 * @see resources.Drone
	 * @generated
	 */
	EClass getDrone();

	/**
	 * Returns the meta object for class '{@link resources.CarrierAircraft <em>Carrier Aircraft</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Carrier Aircraft</em>'.
	 * @see resources.CarrierAircraft
	 * @generated
	 */
	EClass getCarrierAircraft();

	/**
	 * Returns the meta object for class '{@link resources.Frigate <em>Frigate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Frigate</em>'.
	 * @see resources.Frigate
	 * @generated
	 */
	EClass getFrigate();

	/**
	 * Returns the meta object for class '{@link resources.Destroyer <em>Destroyer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Destroyer</em>'.
	 * @see resources.Destroyer
	 * @generated
	 */
	EClass getDestroyer();

	/**
	 * Returns the meta object for class '{@link resources.AircraftCarrier <em>Aircraft Carrier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aircraft Carrier</em>'.
	 * @see resources.AircraftCarrier
	 * @generated
	 */
	EClass getAircraftCarrier();

	/**
	 * Returns the meta object for the containment reference list '{@link resources.AircraftCarrier#getCarrieraircraft <em>Carrieraircraft</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Carrieraircraft</em>'.
	 * @see resources.AircraftCarrier#getCarrieraircraft()
	 * @see #getAircraftCarrier()
	 * @generated
	 */
	EReference getAircraftCarrier_Carrieraircraft();

	/**
	 * Returns the meta object for class '{@link resources.Missile <em>Missile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Missile</em>'.
	 * @see resources.Missile
	 * @generated
	 */
	EClass getMissile();

	/**
	 * Returns the meta object for the attribute '{@link resources.Missile#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see resources.Missile#getStatus()
	 * @see #getMissile()
	 * @generated
	 */
	EAttribute getMissile_Status();

	/**
	 * Returns the meta object for class '{@link resources.Shell <em>Shell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shell</em>'.
	 * @see resources.Shell
	 * @generated
	 */
	EClass getShell();

	/**
	 * Returns the meta object for class '{@link resources.Torpedo <em>Torpedo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Torpedo</em>'.
	 * @see resources.Torpedo
	 * @generated
	 */
	EClass getTorpedo();

	/**
	 * Returns the meta object for class '{@link resources.Reconnaissance <em>Reconnaissance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reconnaissance</em>'.
	 * @see resources.Reconnaissance
	 * @generated
	 */
	EClass getReconnaissance();

	/**
	 * Returns the meta object for class '{@link resources.Strike <em>Strike</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Strike</em>'.
	 * @see resources.Strike
	 * @generated
	 */
	EClass getStrike();

	/**
	 * Returns the meta object for class '{@link resources.Transport <em>Transport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transport</em>'.
	 * @see resources.Transport
	 * @generated
	 */
	EClass getTransport();

	/**
	 * Returns the meta object for class '{@link resources.Fighter <em>Fighter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fighter</em>'.
	 * @see resources.Fighter
	 * @generated
	 */
	EClass getFighter();

	/**
	 * Returns the meta object for class '{@link resources.Recon <em>Recon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Recon</em>'.
	 * @see resources.Recon
	 * @generated
	 */
	EClass getRecon();

	/**
	 * Returns the meta object for class '{@link resources.Helicopter <em>Helicopter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Helicopter</em>'.
	 * @see resources.Helicopter
	 * @generated
	 */
	EClass getHelicopter();

	/**
	 * Returns the meta object for class '{@link resources.Vehicle <em>Vehicle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vehicle</em>'.
	 * @see resources.Vehicle
	 * @generated
	 */
	EClass getVehicle();

	/**
	 * Returns the meta object for the attribute '{@link resources.Vehicle#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see resources.Vehicle#getName()
	 * @see #getVehicle()
	 * @generated
	 */
	EAttribute getVehicle_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link resources.Vehicle#getAmmunition <em>Ammunition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ammunition</em>'.
	 * @see resources.Vehicle#getAmmunition()
	 * @see #getVehicle()
	 * @generated
	 */
	EReference getVehicle_Ammunition();

	/**
	 * Returns the meta object for enum '{@link resources.Status <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Status</em>'.
	 * @see resources.Status
	 * @generated
	 */
	EEnum getStatus();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ResourcesFactory getResourcesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link resources.impl.ResourcesImpl <em>Resources</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see resources.impl.ResourcesImpl
		 * @see resources.impl.ResourcesPackageImpl#getResources()
		 * @generated
		 */
		EClass RESOURCES = eINSTANCE.getResources();

		/**
		 * The meta object literal for the '<em><b>Vehicles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCES__VEHICLES = eINSTANCE.getResources_Vehicles();

		/**
		 * The meta object literal for the '{@link resources.impl.ShipImpl <em>Ship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see resources.impl.ShipImpl
		 * @see resources.impl.ResourcesPackageImpl#getShip()
		 * @generated
		 */
		EClass SHIP = eINSTANCE.getShip();

		/**
		 * The meta object literal for the '{@link resources.impl.AmmunitionImpl <em>Ammunition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see resources.impl.AmmunitionImpl
		 * @see resources.impl.ResourcesPackageImpl#getAmmunition()
		 * @generated
		 */
		EClass AMMUNITION = eINSTANCE.getAmmunition();

		/**
		 * The meta object literal for the '{@link resources.impl.DroneImpl <em>Drone</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see resources.impl.DroneImpl
		 * @see resources.impl.ResourcesPackageImpl#getDrone()
		 * @generated
		 */
		EClass DRONE = eINSTANCE.getDrone();

		/**
		 * The meta object literal for the '{@link resources.impl.CarrierAircraftImpl <em>Carrier Aircraft</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see resources.impl.CarrierAircraftImpl
		 * @see resources.impl.ResourcesPackageImpl#getCarrierAircraft()
		 * @generated
		 */
		EClass CARRIER_AIRCRAFT = eINSTANCE.getCarrierAircraft();

		/**
		 * The meta object literal for the '{@link resources.impl.FrigateImpl <em>Frigate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see resources.impl.FrigateImpl
		 * @see resources.impl.ResourcesPackageImpl#getFrigate()
		 * @generated
		 */
		EClass FRIGATE = eINSTANCE.getFrigate();

		/**
		 * The meta object literal for the '{@link resources.impl.DestroyerImpl <em>Destroyer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see resources.impl.DestroyerImpl
		 * @see resources.impl.ResourcesPackageImpl#getDestroyer()
		 * @generated
		 */
		EClass DESTROYER = eINSTANCE.getDestroyer();

		/**
		 * The meta object literal for the '{@link resources.impl.AircraftCarrierImpl <em>Aircraft Carrier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see resources.impl.AircraftCarrierImpl
		 * @see resources.impl.ResourcesPackageImpl#getAircraftCarrier()
		 * @generated
		 */
		EClass AIRCRAFT_CARRIER = eINSTANCE.getAircraftCarrier();

		/**
		 * The meta object literal for the '<em><b>Carrieraircraft</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AIRCRAFT_CARRIER__CARRIERAIRCRAFT = eINSTANCE.getAircraftCarrier_Carrieraircraft();

		/**
		 * The meta object literal for the '{@link resources.impl.MissileImpl <em>Missile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see resources.impl.MissileImpl
		 * @see resources.impl.ResourcesPackageImpl#getMissile()
		 * @generated
		 */
		EClass MISSILE = eINSTANCE.getMissile();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MISSILE__STATUS = eINSTANCE.getMissile_Status();

		/**
		 * The meta object literal for the '{@link resources.impl.ShellImpl <em>Shell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see resources.impl.ShellImpl
		 * @see resources.impl.ResourcesPackageImpl#getShell()
		 * @generated
		 */
		EClass SHELL = eINSTANCE.getShell();

		/**
		 * The meta object literal for the '{@link resources.impl.TorpedoImpl <em>Torpedo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see resources.impl.TorpedoImpl
		 * @see resources.impl.ResourcesPackageImpl#getTorpedo()
		 * @generated
		 */
		EClass TORPEDO = eINSTANCE.getTorpedo();

		/**
		 * The meta object literal for the '{@link resources.impl.ReconnaissanceImpl <em>Reconnaissance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see resources.impl.ReconnaissanceImpl
		 * @see resources.impl.ResourcesPackageImpl#getReconnaissance()
		 * @generated
		 */
		EClass RECONNAISSANCE = eINSTANCE.getReconnaissance();

		/**
		 * The meta object literal for the '{@link resources.impl.StrikeImpl <em>Strike</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see resources.impl.StrikeImpl
		 * @see resources.impl.ResourcesPackageImpl#getStrike()
		 * @generated
		 */
		EClass STRIKE = eINSTANCE.getStrike();

		/**
		 * The meta object literal for the '{@link resources.impl.TransportImpl <em>Transport</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see resources.impl.TransportImpl
		 * @see resources.impl.ResourcesPackageImpl#getTransport()
		 * @generated
		 */
		EClass TRANSPORT = eINSTANCE.getTransport();

		/**
		 * The meta object literal for the '{@link resources.impl.FighterImpl <em>Fighter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see resources.impl.FighterImpl
		 * @see resources.impl.ResourcesPackageImpl#getFighter()
		 * @generated
		 */
		EClass FIGHTER = eINSTANCE.getFighter();

		/**
		 * The meta object literal for the '{@link resources.impl.ReconImpl <em>Recon</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see resources.impl.ReconImpl
		 * @see resources.impl.ResourcesPackageImpl#getRecon()
		 * @generated
		 */
		EClass RECON = eINSTANCE.getRecon();

		/**
		 * The meta object literal for the '{@link resources.impl.HelicopterImpl <em>Helicopter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see resources.impl.HelicopterImpl
		 * @see resources.impl.ResourcesPackageImpl#getHelicopter()
		 * @generated
		 */
		EClass HELICOPTER = eINSTANCE.getHelicopter();

		/**
		 * The meta object literal for the '{@link resources.impl.VehicleImpl <em>Vehicle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see resources.impl.VehicleImpl
		 * @see resources.impl.ResourcesPackageImpl#getVehicle()
		 * @generated
		 */
		EClass VEHICLE = eINSTANCE.getVehicle();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICLE__NAME = eINSTANCE.getVehicle_Name();

		/**
		 * The meta object literal for the '<em><b>Ammunition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VEHICLE__AMMUNITION = eINSTANCE.getVehicle_Ammunition();

		/**
		 * The meta object literal for the '{@link resources.Status <em>Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see resources.Status
		 * @see resources.impl.ResourcesPackageImpl#getStatus()
		 * @generated
		 */
		EEnum STATUS = eINSTANCE.getStatus();

	}

} //ResourcesPackage
