/**
 */
package wizard.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import wizard.ButtonClose;
import wizard.Wizard;
import wizard.WizardPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Button Close</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link wizard.impl.ButtonCloseImpl#getWizard <em>Wizard</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ButtonCloseImpl extends ButtonImpl implements ButtonClose {
	/**
	 * The cached value of the '{@link #getWizard() <em>Wizard</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWizard()
	 * @generated
	 * @ordered
	 */
	protected Wizard wizard;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ButtonCloseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WizardPackage.Literals.BUTTON_CLOSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Wizard getWizard() {
		if (wizard != null && wizard.eIsProxy()) {
			InternalEObject oldWizard = (InternalEObject)wizard;
			wizard = (Wizard)eResolveProxy(oldWizard);
			if (wizard != oldWizard) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WizardPackage.BUTTON_CLOSE__WIZARD, oldWizard, wizard));
			}
		}
		return wizard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Wizard basicGetWizard() {
		return wizard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWizard(Wizard newWizard) {
		Wizard oldWizard = wizard;
		wizard = newWizard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WizardPackage.BUTTON_CLOSE__WIZARD, oldWizard, wizard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WizardPackage.BUTTON_CLOSE__WIZARD:
				if (resolve) return getWizard();
				return basicGetWizard();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WizardPackage.BUTTON_CLOSE__WIZARD:
				setWizard((Wizard)newValue);
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
			case WizardPackage.BUTTON_CLOSE__WIZARD:
				setWizard((Wizard)null);
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
			case WizardPackage.BUTTON_CLOSE__WIZARD:
				return wizard != null;
		}
		return super.eIsSet(featureID);
	}

} //ButtonCloseImpl
