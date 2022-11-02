/**
 */
package wizard.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import wizard.ButtonReturn;
import wizard.Page;
import wizard.WizardPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Button Return</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link wizard.impl.ButtonReturnImpl#getPreviousPage <em>Previous Page</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ButtonReturnImpl extends ButtonImpl implements ButtonReturn {
	/**
	 * The cached value of the '{@link #getPreviousPage() <em>Previous Page</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreviousPage()
	 * @generated
	 * @ordered
	 */
	protected Page previousPage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ButtonReturnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WizardPackage.Literals.BUTTON_RETURN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page getPreviousPage() {
		if (previousPage != null && previousPage.eIsProxy()) {
			InternalEObject oldPreviousPage = (InternalEObject)previousPage;
			previousPage = (Page)eResolveProxy(oldPreviousPage);
			if (previousPage != oldPreviousPage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WizardPackage.BUTTON_RETURN__PREVIOUS_PAGE, oldPreviousPage, previousPage));
			}
		}
		return previousPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page basicGetPreviousPage() {
		return previousPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreviousPage(Page newPreviousPage) {
		Page oldPreviousPage = previousPage;
		previousPage = newPreviousPage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WizardPackage.BUTTON_RETURN__PREVIOUS_PAGE, oldPreviousPage, previousPage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WizardPackage.BUTTON_RETURN__PREVIOUS_PAGE:
				if (resolve) return getPreviousPage();
				return basicGetPreviousPage();
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
			case WizardPackage.BUTTON_RETURN__PREVIOUS_PAGE:
				setPreviousPage((Page)newValue);
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
			case WizardPackage.BUTTON_RETURN__PREVIOUS_PAGE:
				setPreviousPage((Page)null);
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
			case WizardPackage.BUTTON_RETURN__PREVIOUS_PAGE:
				return previousPage != null;
		}
		return super.eIsSet(featureID);
	}

} //ButtonReturnImpl
