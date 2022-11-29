/**
 */
package wizards.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import wizards.CheckBox;
import wizards.WizardsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Check Box</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link wizards.impl.CheckBoxImpl#isLabelSelected <em>Label Selected</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CheckBoxImpl extends FieldImpl implements CheckBox {
	/**
	 * The default value of the '{@link #isLabelSelected() <em>Label Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLabelSelected()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LABEL_SELECTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLabelSelected() <em>Label Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLabelSelected()
	 * @generated
	 * @ordered
	 */
	protected boolean labelSelected = LABEL_SELECTED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CheckBoxImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WizardsPackage.Literals.CHECK_BOX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isLabelSelected() {
		return labelSelected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLabelSelected(boolean newLabelSelected) {
		boolean oldLabelSelected = labelSelected;
		labelSelected = newLabelSelected;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WizardsPackage.CHECK_BOX__LABEL_SELECTED, oldLabelSelected, labelSelected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WizardsPackage.CHECK_BOX__LABEL_SELECTED:
				return isLabelSelected();
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
			case WizardsPackage.CHECK_BOX__LABEL_SELECTED:
				setLabelSelected((Boolean)newValue);
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
			case WizardsPackage.CHECK_BOX__LABEL_SELECTED:
				setLabelSelected(LABEL_SELECTED_EDEFAULT);
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
			case WizardsPackage.CHECK_BOX__LABEL_SELECTED:
				return labelSelected != LABEL_SELECTED_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (labelSelected: ");
		result.append(labelSelected);
		result.append(')');
		return result.toString();
	}

} //CheckBoxImpl
