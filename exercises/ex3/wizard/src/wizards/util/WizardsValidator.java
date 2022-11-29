/**
 */
package wizards.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import wizards.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see wizards.WizardsPackage
 * @generated
 */
public class WizardsValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final WizardsValidator INSTANCE = new WizardsValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "wizards";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Pages Return Buttons' of 'Wizard'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int WIZARD__PAGES_RETURN_BUTTONS = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Initial Page Return Buttons' of 'Wizard'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int WIZARD__INITIAL_PAGE_RETURN_BUTTONS = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'At Least Close Btn' of 'Wizard'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int WIZARD__AT_LEAST_CLOSE_BTN = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Not Only Show Btns' of 'Page'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PAGE__NOT_ONLY_SHOW_BTNS = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Not Self Loop' of 'Page'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PAGE__NOT_SELF_LOOP = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Buttons Different Label' of 'Page'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PAGE__BUTTONS_DIFFERENT_LABEL = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Label Size' of 'Text Field'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TEXT_FIELD__LABEL_SIZE = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Label Max Size' of 'Button'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BUTTON__LABEL_MAX_SIZE = 8;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 8;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WizardsValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return WizardsPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case WizardsPackage.WIZARD:
				return validateWizard((Wizard)value, diagnostics, context);
			case WizardsPackage.PAGE:
				return validatePage((Page)value, diagnostics, context);
			case WizardsPackage.TEXT_FIELD:
				return validateTextField((TextField)value, diagnostics, context);
			case WizardsPackage.CHECK_BOX:
				return validateCheckBox((CheckBox)value, diagnostics, context);
			case WizardsPackage.BUTTON:
				return validateButton((Button)value, diagnostics, context);
			case WizardsPackage.NAV_BUTTON:
				return validateNavButton((NavButton)value, diagnostics, context);
			case WizardsPackage.RETURN_BUTTON:
				return validateReturnButton((ReturnButton)value, diagnostics, context);
			case WizardsPackage.SHOW_BUTTON:
				return validateShowButton((ShowButton)value, diagnostics, context);
			case WizardsPackage.CLOSE_BUTTON:
				return validateCloseButton((CloseButton)value, diagnostics, context);
			case WizardsPackage.FIELD:
				return validateField((Field)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWizard(Wizard wizard, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(wizard, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(wizard, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(wizard, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(wizard, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(wizard, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(wizard, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(wizard, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(wizard, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(wizard, diagnostics, context);
		if (result || diagnostics != null) result &= validateWizard_atLeastCloseBtn(wizard, diagnostics, context);
		if (result || diagnostics != null) result &= validateWizard_pagesReturnButtons(wizard, diagnostics, context);
		if (result || diagnostics != null) result &= validateWizard_initialPageReturnButtons(wizard, diagnostics, context);
		return result;
	}

	/**
	 * Validates the atLeastCloseBtn constraint of '<em>Wizard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWizard_atLeastCloseBtn(Wizard wizard, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return wizard.atLeastCloseBtn(diagnostics, context);
	}

	/**
	 * Validates the pagesReturnButtons constraint of '<em>Wizard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWizard_pagesReturnButtons(Wizard wizard, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return wizard.pagesReturnButtons(diagnostics, context);
	}

	/**
	 * Validates the initialPageReturnButtons constraint of '<em>Wizard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWizard_initialPageReturnButtons(Wizard wizard, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return wizard.initialPageReturnButtons(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePage(Page page, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(page, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(page, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(page, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(page, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(page, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(page, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(page, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(page, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(page, diagnostics, context);
		if (result || diagnostics != null) result &= validatePage_buttonsDifferentLabel(page, diagnostics, context);
		if (result || diagnostics != null) result &= validatePage_notOnlyShowBtns(page, diagnostics, context);
		if (result || diagnostics != null) result &= validatePage_notSelfLoop(page, diagnostics, context);
		return result;
	}

	/**
	 * Validates the buttonsDifferentLabel constraint of '<em>Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePage_buttonsDifferentLabel(Page page, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return page.buttonsDifferentLabel(diagnostics, context);
	}

	/**
	 * Validates the notOnlyShowBtns constraint of '<em>Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePage_notOnlyShowBtns(Page page, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return page.notOnlyShowBtns(diagnostics, context);
	}

	/**
	 * Validates the notSelfLoop constraint of '<em>Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePage_notSelfLoop(Page page, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return page.notSelfLoop(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextField(TextField textField, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(textField, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(textField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(textField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(textField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(textField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(textField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(textField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(textField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(textField, diagnostics, context);
		if (result || diagnostics != null) result &= validateTextField_labelSize(textField, diagnostics, context);
		return result;
	}

	/**
	 * Validates the labelSize constraint of '<em>Text Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextField_labelSize(TextField textField, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return textField.labelSize(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCheckBox(CheckBox checkBox, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(checkBox, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateButton(Button button, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(button, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(button, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(button, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(button, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(button, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(button, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(button, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(button, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(button, diagnostics, context);
		if (result || diagnostics != null) result &= validateButton_labelMaxSize(button, diagnostics, context);
		return result;
	}

	/**
	 * Validates the labelMaxSize constraint of '<em>Button</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateButton_labelMaxSize(Button button, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return button.labelMaxSize(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNavButton(NavButton navButton, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(navButton, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(navButton, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(navButton, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(navButton, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(navButton, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(navButton, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(navButton, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(navButton, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(navButton, diagnostics, context);
		if (result || diagnostics != null) result &= validateButton_labelMaxSize(navButton, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReturnButton(ReturnButton returnButton, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(returnButton, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(returnButton, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(returnButton, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(returnButton, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(returnButton, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(returnButton, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(returnButton, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(returnButton, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(returnButton, diagnostics, context);
		if (result || diagnostics != null) result &= validateButton_labelMaxSize(returnButton, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateShowButton(ShowButton showButton, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(showButton, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(showButton, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(showButton, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(showButton, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(showButton, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(showButton, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(showButton, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(showButton, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(showButton, diagnostics, context);
		if (result || diagnostics != null) result &= validateButton_labelMaxSize(showButton, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCloseButton(CloseButton closeButton, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(closeButton, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(closeButton, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(closeButton, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(closeButton, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(closeButton, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(closeButton, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(closeButton, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(closeButton, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(closeButton, diagnostics, context);
		if (result || diagnostics != null) result &= validateButton_labelMaxSize(closeButton, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateField(Field field, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(field, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //WizardsValidator
