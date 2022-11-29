/**
 */
package wizard.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import wizard.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see wizard.WizardPackage
 * @generated
 */
public class WizardValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final WizardValidator INSTANCE = new WizardValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "wizard";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Not Only Message Button' of 'Page'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PAGE__NOT_ONLY_MESSAGE_BUTTON = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'One Init Page' of 'Page'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PAGE__ONE_INIT_PAGE = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'No Ret Nav Then Close' of 'Page'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PAGE__NO_RET_NAV_THEN_CLOSE = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'No Similar Buttons' of 'Page'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PAGE__NO_SIMILAR_BUTTONS = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Return Buttons Inv' of 'Page'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PAGE__RETURN_BUTTONS_INV = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Min Max Length' of 'Text Field'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TEXT_FIELD__MIN_MAX_LENGTH = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Max Label Length' of 'Button'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BUTTON__MAX_LABEL_LENGTH = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'My Page Differ Next Page' of 'Button Navigate'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BUTTON_NAVIGATE__MY_PAGE_DIFFER_NEXT_PAGE = 8;

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
	public WizardValidator() {
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
	  return WizardPackage.eINSTANCE;
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
			case WizardPackage.WIZARD:
				return validateWizard((Wizard)value, diagnostics, context);
			case WizardPackage.PAGE:
				return validatePage((Page)value, diagnostics, context);
			case WizardPackage.TEXT_FIELD:
				return validateTextField((TextField)value, diagnostics, context);
			case WizardPackage.CHECKBOX:
				return validateCheckbox((Checkbox)value, diagnostics, context);
			case WizardPackage.LABEL:
				return validateLabel((Label)value, diagnostics, context);
			case WizardPackage.BUTTON:
				return validateButton((Button)value, diagnostics, context);
			case WizardPackage.BUTTON_NAVIGATE:
				return validateButtonNavigate((ButtonNavigate)value, diagnostics, context);
			case WizardPackage.BUTTON_RETURN:
				return validateButtonReturn((ButtonReturn)value, diagnostics, context);
			case WizardPackage.BUTTON_SHOW:
				return validateButtonShow((ButtonShow)value, diagnostics, context);
			case WizardPackage.BUTTON_CLOSE:
				return validateButtonClose((ButtonClose)value, diagnostics, context);
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
		return validate_EveryDefaultConstraint(wizard, diagnostics, context);
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
		if (result || diagnostics != null) result &= validatePage_returnButtonsInv(page, diagnostics, context);
		if (result || diagnostics != null) result &= validatePage_notOnlyMessageButton(page, diagnostics, context);
		if (result || diagnostics != null) result &= validatePage_oneInitPage(page, diagnostics, context);
		if (result || diagnostics != null) result &= validatePage_noRetNavThenClose(page, diagnostics, context);
		if (result || diagnostics != null) result &= validatePage_noSimilarButtons(page, diagnostics, context);
		return result;
	}

	/**
	 * Validates the returnButtonsInv constraint of '<em>Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePage_returnButtonsInv(Page page, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return page.returnButtonsInv(diagnostics, context);
	}

	/**
	 * Validates the notOnlyMessageButton constraint of '<em>Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePage_notOnlyMessageButton(Page page, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return page.notOnlyMessageButton(diagnostics, context);
	}

	/**
	 * Validates the oneInitPage constraint of '<em>Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePage_oneInitPage(Page page, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return page.oneInitPage(diagnostics, context);
	}

	/**
	 * Validates the noRetNavThenClose constraint of '<em>Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePage_noRetNavThenClose(Page page, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return page.noRetNavThenClose(diagnostics, context);
	}

	/**
	 * Validates the noSimilarButtons constraint of '<em>Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePage_noSimilarButtons(Page page, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return page.noSimilarButtons(diagnostics, context);
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
		if (result || diagnostics != null) result &= validateTextField_minMaxLength(textField, diagnostics, context);
		return result;
	}

	/**
	 * Validates the minMaxLength constraint of '<em>Text Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextField_minMaxLength(TextField textField, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return textField.minMaxLength(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCheckbox(Checkbox checkbox, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(checkbox, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLabel(Label label, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(label, diagnostics, context);
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
		if (result || diagnostics != null) result &= validateButton_maxLabelLength(button, diagnostics, context);
		return result;
	}

	/**
	 * Validates the maxLabelLength constraint of '<em>Button</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateButton_maxLabelLength(Button button, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return button.maxLabelLength(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateButtonNavigate(ButtonNavigate buttonNavigate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(buttonNavigate, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(buttonNavigate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(buttonNavigate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(buttonNavigate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(buttonNavigate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(buttonNavigate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(buttonNavigate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(buttonNavigate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(buttonNavigate, diagnostics, context);
		if (result || diagnostics != null) result &= validateButton_maxLabelLength(buttonNavigate, diagnostics, context);
		if (result || diagnostics != null) result &= validateButtonNavigate_myPageDifferNextPage(buttonNavigate, diagnostics, context);
		return result;
	}

	/**
	 * Validates the myPageDifferNextPage constraint of '<em>Button Navigate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateButtonNavigate_myPageDifferNextPage(ButtonNavigate buttonNavigate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return buttonNavigate.myPageDifferNextPage(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateButtonReturn(ButtonReturn buttonReturn, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(buttonReturn, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(buttonReturn, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(buttonReturn, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(buttonReturn, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(buttonReturn, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(buttonReturn, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(buttonReturn, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(buttonReturn, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(buttonReturn, diagnostics, context);
		if (result || diagnostics != null) result &= validateButton_maxLabelLength(buttonReturn, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateButtonShow(ButtonShow buttonShow, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(buttonShow, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(buttonShow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(buttonShow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(buttonShow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(buttonShow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(buttonShow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(buttonShow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(buttonShow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(buttonShow, diagnostics, context);
		if (result || diagnostics != null) result &= validateButton_maxLabelLength(buttonShow, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateButtonClose(ButtonClose buttonClose, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(buttonClose, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(buttonClose, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(buttonClose, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(buttonClose, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(buttonClose, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(buttonClose, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(buttonClose, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(buttonClose, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(buttonClose, diagnostics, context);
		if (result || diagnostics != null) result &= validateButton_maxLabelLength(buttonClose, diagnostics, context);
		return result;
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

} //WizardValidator
