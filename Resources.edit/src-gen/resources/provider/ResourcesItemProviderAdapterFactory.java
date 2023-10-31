/**
 */
package resources.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import resources.util.ResourcesAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ResourcesItemProviderAdapterFactory extends ResourcesAdapterFactory
		implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourcesItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link resources.Resources} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourcesItemProvider resourcesItemProvider;

	/**
	 * This creates an adapter for a {@link resources.Resources}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createResourcesAdapter() {
		if (resourcesItemProvider == null) {
			resourcesItemProvider = new ResourcesItemProvider(this);
		}

		return resourcesItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link resources.Frigate} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FrigateItemProvider frigateItemProvider;

	/**
	 * This creates an adapter for a {@link resources.Frigate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFrigateAdapter() {
		if (frigateItemProvider == null) {
			frigateItemProvider = new FrigateItemProvider(this);
		}

		return frigateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link resources.Destroyer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DestroyerItemProvider destroyerItemProvider;

	/**
	 * This creates an adapter for a {@link resources.Destroyer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDestroyerAdapter() {
		if (destroyerItemProvider == null) {
			destroyerItemProvider = new DestroyerItemProvider(this);
		}

		return destroyerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link resources.AircraftCarrier} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AircraftCarrierItemProvider aircraftCarrierItemProvider;

	/**
	 * This creates an adapter for a {@link resources.AircraftCarrier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAircraftCarrierAdapter() {
		if (aircraftCarrierItemProvider == null) {
			aircraftCarrierItemProvider = new AircraftCarrierItemProvider(this);
		}

		return aircraftCarrierItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link resources.Missile} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MissileItemProvider missileItemProvider;

	/**
	 * This creates an adapter for a {@link resources.Missile}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMissileAdapter() {
		if (missileItemProvider == null) {
			missileItemProvider = new MissileItemProvider(this);
		}

		return missileItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link resources.Shell} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShellItemProvider shellItemProvider;

	/**
	 * This creates an adapter for a {@link resources.Shell}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createShellAdapter() {
		if (shellItemProvider == null) {
			shellItemProvider = new ShellItemProvider(this);
		}

		return shellItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link resources.Torpedo} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TorpedoItemProvider torpedoItemProvider;

	/**
	 * This creates an adapter for a {@link resources.Torpedo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTorpedoAdapter() {
		if (torpedoItemProvider == null) {
			torpedoItemProvider = new TorpedoItemProvider(this);
		}

		return torpedoItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link resources.Reconnaissance} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReconnaissanceItemProvider reconnaissanceItemProvider;

	/**
	 * This creates an adapter for a {@link resources.Reconnaissance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createReconnaissanceAdapter() {
		if (reconnaissanceItemProvider == null) {
			reconnaissanceItemProvider = new ReconnaissanceItemProvider(this);
		}

		return reconnaissanceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link resources.Strike} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StrikeItemProvider strikeItemProvider;

	/**
	 * This creates an adapter for a {@link resources.Strike}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStrikeAdapter() {
		if (strikeItemProvider == null) {
			strikeItemProvider = new StrikeItemProvider(this);
		}

		return strikeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link resources.Transport} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransportItemProvider transportItemProvider;

	/**
	 * This creates an adapter for a {@link resources.Transport}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTransportAdapter() {
		if (transportItemProvider == null) {
			transportItemProvider = new TransportItemProvider(this);
		}

		return transportItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link resources.Fighter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FighterItemProvider fighterItemProvider;

	/**
	 * This creates an adapter for a {@link resources.Fighter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFighterAdapter() {
		if (fighterItemProvider == null) {
			fighterItemProvider = new FighterItemProvider(this);
		}

		return fighterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link resources.Recon} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReconItemProvider reconItemProvider;

	/**
	 * This creates an adapter for a {@link resources.Recon}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createReconAdapter() {
		if (reconItemProvider == null) {
			reconItemProvider = new ReconItemProvider(this);
		}

		return reconItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link resources.Helicopter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HelicopterItemProvider helicopterItemProvider;

	/**
	 * This creates an adapter for a {@link resources.Helicopter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createHelicopterAdapter() {
		if (helicopterItemProvider == null) {
			helicopterItemProvider = new HelicopterItemProvider(this);
		}

		return helicopterItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (resourcesItemProvider != null)
			resourcesItemProvider.dispose();
		if (frigateItemProvider != null)
			frigateItemProvider.dispose();
		if (destroyerItemProvider != null)
			destroyerItemProvider.dispose();
		if (aircraftCarrierItemProvider != null)
			aircraftCarrierItemProvider.dispose();
		if (missileItemProvider != null)
			missileItemProvider.dispose();
		if (shellItemProvider != null)
			shellItemProvider.dispose();
		if (torpedoItemProvider != null)
			torpedoItemProvider.dispose();
		if (reconnaissanceItemProvider != null)
			reconnaissanceItemProvider.dispose();
		if (strikeItemProvider != null)
			strikeItemProvider.dispose();
		if (transportItemProvider != null)
			transportItemProvider.dispose();
		if (fighterItemProvider != null)
			fighterItemProvider.dispose();
		if (reconItemProvider != null)
			reconItemProvider.dispose();
		if (helicopterItemProvider != null)
			helicopterItemProvider.dispose();
	}

}