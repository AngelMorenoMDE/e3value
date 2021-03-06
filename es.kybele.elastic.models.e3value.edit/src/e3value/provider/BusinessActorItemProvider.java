/**
 */
package e3value.provider;


import e3value.BusinessActor;
import e3value.E3valueFactory;
import e3value.E3valuePackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link e3value.BusinessActor} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BusinessActorItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessActorItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BusinessActor_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BusinessActor_name_feature", "_UI_BusinessActor_type"),
				 E3valuePackage.Literals.BUSINESS_ACTOR__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(E3valuePackage.Literals.BUSINESS_ACTOR__HAS_VALUE_INTERFACES);
			childrenFeatures.add(E3valuePackage.Literals.BUSINESS_ACTOR__HAS_VALUE_ACTIVITIES);
			childrenFeatures.add(E3valuePackage.Literals.BUSINESS_ACTOR__HAS_STIMULUS_ELEMENTS);
			childrenFeatures.add(E3valuePackage.Literals.BUSINESS_ACTOR__HAS_DEPENDENCE_ELEMENTS);
			childrenFeatures.add(E3valuePackage.Literals.BUSINESS_ACTOR__HAS_VALUE_OBJECTS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((BusinessActor)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_BusinessActor_type") :
			getString("_UI_BusinessActor_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(BusinessActor.class)) {
			case E3valuePackage.BUSINESS_ACTOR__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case E3valuePackage.BUSINESS_ACTOR__HAS_VALUE_INTERFACES:
			case E3valuePackage.BUSINESS_ACTOR__HAS_VALUE_ACTIVITIES:
			case E3valuePackage.BUSINESS_ACTOR__HAS_STIMULUS_ELEMENTS:
			case E3valuePackage.BUSINESS_ACTOR__HAS_DEPENDENCE_ELEMENTS:
			case E3valuePackage.BUSINESS_ACTOR__HAS_VALUE_OBJECTS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(E3valuePackage.Literals.BUSINESS_ACTOR__HAS_VALUE_INTERFACES,
				 E3valueFactory.eINSTANCE.createValueInterface()));

		newChildDescriptors.add
			(createChildParameter
				(E3valuePackage.Literals.BUSINESS_ACTOR__HAS_VALUE_ACTIVITIES,
				 E3valueFactory.eINSTANCE.createValueActivity()));

		newChildDescriptors.add
			(createChildParameter
				(E3valuePackage.Literals.BUSINESS_ACTOR__HAS_STIMULUS_ELEMENTS,
				 E3valueFactory.eINSTANCE.createStartStimulus()));

		newChildDescriptors.add
			(createChildParameter
				(E3valuePackage.Literals.BUSINESS_ACTOR__HAS_STIMULUS_ELEMENTS,
				 E3valueFactory.eINSTANCE.createEndStimulus()));

		newChildDescriptors.add
			(createChildParameter
				(E3valuePackage.Literals.BUSINESS_ACTOR__HAS_DEPENDENCE_ELEMENTS,
				 E3valueFactory.eINSTANCE.createResponsabilityElement()));

		newChildDescriptors.add
			(createChildParameter
				(E3valuePackage.Literals.BUSINESS_ACTOR__HAS_DEPENDENCE_ELEMENTS,
				 E3valueFactory.eINSTANCE.createAndFork()));

		newChildDescriptors.add
			(createChildParameter
				(E3valuePackage.Literals.BUSINESS_ACTOR__HAS_DEPENDENCE_ELEMENTS,
				 E3valueFactory.eINSTANCE.createAndJoin()));

		newChildDescriptors.add
			(createChildParameter
				(E3valuePackage.Literals.BUSINESS_ACTOR__HAS_DEPENDENCE_ELEMENTS,
				 E3valueFactory.eINSTANCE.createOrFork()));

		newChildDescriptors.add
			(createChildParameter
				(E3valuePackage.Literals.BUSINESS_ACTOR__HAS_DEPENDENCE_ELEMENTS,
				 E3valueFactory.eINSTANCE.createOrJoin()));

		newChildDescriptors.add
			(createChildParameter
				(E3valuePackage.Literals.BUSINESS_ACTOR__HAS_DEPENDENCE_ELEMENTS,
				 E3valueFactory.eINSTANCE.createStartStimulus()));

		newChildDescriptors.add
			(createChildParameter
				(E3valuePackage.Literals.BUSINESS_ACTOR__HAS_DEPENDENCE_ELEMENTS,
				 E3valueFactory.eINSTANCE.createEndStimulus()));

		newChildDescriptors.add
			(createChildParameter
				(E3valuePackage.Literals.BUSINESS_ACTOR__HAS_DEPENDENCE_ELEMENTS,
				 E3valueFactory.eINSTANCE.createConnectionElement()));

		newChildDescriptors.add
			(createChildParameter
				(E3valuePackage.Literals.BUSINESS_ACTOR__HAS_DEPENDENCE_ELEMENTS,
				 E3valueFactory.eINSTANCE.createInputPort()));

		newChildDescriptors.add
			(createChildParameter
				(E3valuePackage.Literals.BUSINESS_ACTOR__HAS_DEPENDENCE_ELEMENTS,
				 E3valueFactory.eINSTANCE.createOutputPort()));

		newChildDescriptors.add
			(createChildParameter
				(E3valuePackage.Literals.BUSINESS_ACTOR__HAS_VALUE_OBJECTS,
				 E3valueFactory.eINSTANCE.createValueObject()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == E3valuePackage.Literals.BUSINESS_ACTOR__HAS_STIMULUS_ELEMENTS ||
			childFeature == E3valuePackage.Literals.BUSINESS_ACTOR__HAS_DEPENDENCE_ELEMENTS;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return E3valueEditPlugin.INSTANCE;
	}

}
