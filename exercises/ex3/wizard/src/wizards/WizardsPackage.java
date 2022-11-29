/**
 */
package wizards;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
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
 * @see wizards.WizardsFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore"
 * @generated
 */
public interface WizardsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "wizards";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "/ejemplo/metamodel/wizards.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "wizards";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WizardsPackage eINSTANCE = wizards.impl.WizardsPackageImpl.init();

	/**
	 * The meta object id for the '{@link wizards.impl.WizardImpl <em>Wizard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wizards.impl.WizardImpl
	 * @see wizards.impl.WizardsPackageImpl#getWizard()
	 * @generated
	 */
	int WIZARD = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Initial Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD__INITIAL_PAGE = 1;

	/**
	 * The feature id for the '<em><b>Pages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD__PAGES = 2;

	/**
	 * The number of structural features of the '<em>Wizard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Pages Return Buttons</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD___PAGES_RETURN_BUTTONS__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Initial Page Return Buttons</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD___INITIAL_PAGE_RETURN_BUTTONS__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The operation id for the '<em>At Least Close Btn</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD___AT_LEAST_CLOSE_BTN__DIAGNOSTICCHAIN_MAP = 2;

	/**
	 * The number of operations of the '<em>Wizard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link wizards.impl.PageImpl <em>Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wizards.impl.PageImpl
	 * @see wizards.impl.WizardsPackageImpl#getPage()
	 * @generated
	 */
	int PAGE = 1;

	/**
	 * The feature id for the '<em><b>Checkbox</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__CHECKBOX = 0;

	/**
	 * The feature id for the '<em><b>Buttons</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__BUTTONS = 1;

	/**
	 * The feature id for the '<em><b>Text Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__TEXT_FIELDS = 2;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__TITLE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__NAME = 4;

	/**
	 * The number of structural features of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Not Only Show Btns</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE___NOT_ONLY_SHOW_BTNS__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Not Self Loop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE___NOT_SELF_LOOP__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The operation id for the '<em>Buttons Different Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE___BUTTONS_DIFFERENT_LABEL__DIAGNOSTICCHAIN_MAP = 2;

	/**
	 * The number of operations of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link wizards.impl.FieldImpl <em>Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wizards.impl.FieldImpl
	 * @see wizards.impl.WizardsPackageImpl#getField()
	 * @generated
	 */
	int FIELD = 9;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__LABEL = 0;

	/**
	 * The number of structural features of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link wizards.impl.TextFieldImpl <em>Text Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wizards.impl.TextFieldImpl
	 * @see wizards.impl.WizardsPackageImpl#getTextField()
	 * @generated
	 */
	int TEXT_FIELD = 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__LABEL = FIELD__LABEL;

	/**
	 * The feature id for the '<em><b>Min Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__MIN_LENGTH = FIELD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__MAX_LENGTH = FIELD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Text Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD_FEATURE_COUNT = FIELD_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Label Size</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD___LABEL_SIZE__DIAGNOSTICCHAIN_MAP = FIELD_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Text Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD_OPERATION_COUNT = FIELD_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link wizards.impl.CheckBoxImpl <em>Check Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wizards.impl.CheckBoxImpl
	 * @see wizards.impl.WizardsPackageImpl#getCheckBox()
	 * @generated
	 */
	int CHECK_BOX = 3;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__LABEL = FIELD__LABEL;

	/**
	 * The feature id for the '<em><b>Label Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__LABEL_SELECTED = FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Check Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX_FEATURE_COUNT = FIELD_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Check Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX_OPERATION_COUNT = FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wizards.impl.ButtonImpl <em>Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wizards.impl.ButtonImpl
	 * @see wizards.impl.WizardsPackageImpl#getButton()
	 * @generated
	 */
	int BUTTON = 4;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__LABEL = FIELD__LABEL;

	/**
	 * The feature id for the '<em><b>Target Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__TARGET_PAGE = FIELD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Other Target Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__OTHER_TARGET_PAGE = FIELD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_FEATURE_COUNT = FIELD_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Label Max Size</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON___LABEL_MAX_SIZE__DIAGNOSTICCHAIN_MAP = FIELD_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_OPERATION_COUNT = FIELD_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link wizards.impl.NavButtonImpl <em>Nav Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wizards.impl.NavButtonImpl
	 * @see wizards.impl.WizardsPackageImpl#getNavButton()
	 * @generated
	 */
	int NAV_BUTTON = 5;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV_BUTTON__LABEL = BUTTON__LABEL;

	/**
	 * The feature id for the '<em><b>Target Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV_BUTTON__TARGET_PAGE = BUTTON__TARGET_PAGE;

	/**
	 * The feature id for the '<em><b>Other Target Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV_BUTTON__OTHER_TARGET_PAGE = BUTTON__OTHER_TARGET_PAGE;

	/**
	 * The number of structural features of the '<em>Nav Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV_BUTTON_FEATURE_COUNT = BUTTON_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Label Max Size</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV_BUTTON___LABEL_MAX_SIZE__DIAGNOSTICCHAIN_MAP = BUTTON___LABEL_MAX_SIZE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Navigate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV_BUTTON___NAVIGATE = BUTTON_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Nav Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV_BUTTON_OPERATION_COUNT = BUTTON_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link wizards.impl.ReturnButtonImpl <em>Return Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wizards.impl.ReturnButtonImpl
	 * @see wizards.impl.WizardsPackageImpl#getReturnButton()
	 * @generated
	 */
	int RETURN_BUTTON = 6;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_BUTTON__LABEL = BUTTON__LABEL;

	/**
	 * The feature id for the '<em><b>Target Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_BUTTON__TARGET_PAGE = BUTTON__TARGET_PAGE;

	/**
	 * The feature id for the '<em><b>Other Target Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_BUTTON__OTHER_TARGET_PAGE = BUTTON__OTHER_TARGET_PAGE;

	/**
	 * The number of structural features of the '<em>Return Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_BUTTON_FEATURE_COUNT = BUTTON_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Label Max Size</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_BUTTON___LABEL_MAX_SIZE__DIAGNOSTICCHAIN_MAP = BUTTON___LABEL_MAX_SIZE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Return </em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_BUTTON___RETURN_ = BUTTON_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Return Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_BUTTON_OPERATION_COUNT = BUTTON_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link wizards.impl.ShowButtonImpl <em>Show Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wizards.impl.ShowButtonImpl
	 * @see wizards.impl.WizardsPackageImpl#getShowButton()
	 * @generated
	 */
	int SHOW_BUTTON = 7;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW_BUTTON__LABEL = BUTTON__LABEL;

	/**
	 * The feature id for the '<em><b>Target Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW_BUTTON__TARGET_PAGE = BUTTON__TARGET_PAGE;

	/**
	 * The feature id for the '<em><b>Other Target Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW_BUTTON__OTHER_TARGET_PAGE = BUTTON__OTHER_TARGET_PAGE;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW_BUTTON__MESSAGE = BUTTON_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Show Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW_BUTTON_FEATURE_COUNT = BUTTON_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Label Max Size</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW_BUTTON___LABEL_MAX_SIZE__DIAGNOSTICCHAIN_MAP = BUTTON___LABEL_MAX_SIZE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Show</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW_BUTTON___SHOW = BUTTON_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Show Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW_BUTTON_OPERATION_COUNT = BUTTON_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link wizards.impl.CloseButtonImpl <em>Close Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wizards.impl.CloseButtonImpl
	 * @see wizards.impl.WizardsPackageImpl#getCloseButton()
	 * @generated
	 */
	int CLOSE_BUTTON = 8;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSE_BUTTON__LABEL = BUTTON__LABEL;

	/**
	 * The feature id for the '<em><b>Target Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSE_BUTTON__TARGET_PAGE = BUTTON__TARGET_PAGE;

	/**
	 * The feature id for the '<em><b>Other Target Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSE_BUTTON__OTHER_TARGET_PAGE = BUTTON__OTHER_TARGET_PAGE;

	/**
	 * The number of structural features of the '<em>Close Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSE_BUTTON_FEATURE_COUNT = BUTTON_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Label Max Size</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSE_BUTTON___LABEL_MAX_SIZE__DIAGNOSTICCHAIN_MAP = BUTTON___LABEL_MAX_SIZE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Close</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSE_BUTTON___CLOSE = BUTTON_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Close Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSE_BUTTON_OPERATION_COUNT = BUTTON_OPERATION_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link wizards.Wizard <em>Wizard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wizard</em>'.
	 * @see wizards.Wizard
	 * @generated
	 */
	EClass getWizard();

	/**
	 * Returns the meta object for the attribute '{@link wizards.Wizard#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see wizards.Wizard#getTitle()
	 * @see #getWizard()
	 * @generated
	 */
	EAttribute getWizard_Title();

	/**
	 * Returns the meta object for the reference '{@link wizards.Wizard#getInitialPage <em>Initial Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Initial Page</em>'.
	 * @see wizards.Wizard#getInitialPage()
	 * @see #getWizard()
	 * @generated
	 */
	EReference getWizard_InitialPage();

	/**
	 * Returns the meta object for the containment reference list '{@link wizards.Wizard#getPages <em>Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pages</em>'.
	 * @see wizards.Wizard#getPages()
	 * @see #getWizard()
	 * @generated
	 */
	EReference getWizard_Pages();

	/**
	 * Returns the meta object for the '{@link wizards.Wizard#pagesReturnButtons(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Pages Return Buttons</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pages Return Buttons</em>' operation.
	 * @see wizards.Wizard#pagesReturnButtons(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getWizard__PagesReturnButtons__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link wizards.Wizard#initialPageReturnButtons(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Initial Page Return Buttons</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Initial Page Return Buttons</em>' operation.
	 * @see wizards.Wizard#initialPageReturnButtons(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getWizard__InitialPageReturnButtons__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link wizards.Wizard#atLeastCloseBtn(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>At Least Close Btn</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>At Least Close Btn</em>' operation.
	 * @see wizards.Wizard#atLeastCloseBtn(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getWizard__AtLeastCloseBtn__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link wizards.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page</em>'.
	 * @see wizards.Page
	 * @generated
	 */
	EClass getPage();

	/**
	 * Returns the meta object for the containment reference '{@link wizards.Page#getCheckbox <em>Checkbox</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Checkbox</em>'.
	 * @see wizards.Page#getCheckbox()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_Checkbox();

	/**
	 * Returns the meta object for the containment reference list '{@link wizards.Page#getButtons <em>Buttons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Buttons</em>'.
	 * @see wizards.Page#getButtons()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_Buttons();

	/**
	 * Returns the meta object for the containment reference list '{@link wizards.Page#getTextFields <em>Text Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Text Fields</em>'.
	 * @see wizards.Page#getTextFields()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_TextFields();

	/**
	 * Returns the meta object for the attribute '{@link wizards.Page#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see wizards.Page#getTitle()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_Title();

	/**
	 * Returns the meta object for the attribute '{@link wizards.Page#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see wizards.Page#getName()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_Name();

	/**
	 * Returns the meta object for the '{@link wizards.Page#notOnlyShowBtns(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Not Only Show Btns</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Not Only Show Btns</em>' operation.
	 * @see wizards.Page#notOnlyShowBtns(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPage__NotOnlyShowBtns__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link wizards.Page#notSelfLoop(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Not Self Loop</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Not Self Loop</em>' operation.
	 * @see wizards.Page#notSelfLoop(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPage__NotSelfLoop__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link wizards.Page#buttonsDifferentLabel(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Buttons Different Label</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Buttons Different Label</em>' operation.
	 * @see wizards.Page#buttonsDifferentLabel(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPage__ButtonsDifferentLabel__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link wizards.TextField <em>Text Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Field</em>'.
	 * @see wizards.TextField
	 * @generated
	 */
	EClass getTextField();

	/**
	 * Returns the meta object for the attribute '{@link wizards.TextField#getMinLength <em>Min Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Length</em>'.
	 * @see wizards.TextField#getMinLength()
	 * @see #getTextField()
	 * @generated
	 */
	EAttribute getTextField_MinLength();

	/**
	 * Returns the meta object for the attribute '{@link wizards.TextField#getMaxLength <em>Max Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Length</em>'.
	 * @see wizards.TextField#getMaxLength()
	 * @see #getTextField()
	 * @generated
	 */
	EAttribute getTextField_MaxLength();

	/**
	 * Returns the meta object for the '{@link wizards.TextField#labelSize(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Label Size</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Label Size</em>' operation.
	 * @see wizards.TextField#labelSize(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getTextField__LabelSize__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link wizards.CheckBox <em>Check Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Check Box</em>'.
	 * @see wizards.CheckBox
	 * @generated
	 */
	EClass getCheckBox();

	/**
	 * Returns the meta object for the attribute '{@link wizards.CheckBox#isLabelSelected <em>Label Selected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label Selected</em>'.
	 * @see wizards.CheckBox#isLabelSelected()
	 * @see #getCheckBox()
	 * @generated
	 */
	EAttribute getCheckBox_LabelSelected();

	/**
	 * Returns the meta object for class '{@link wizards.Button <em>Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button</em>'.
	 * @see wizards.Button
	 * @generated
	 */
	EClass getButton();

	/**
	 * Returns the meta object for the reference '{@link wizards.Button#getTargetPage <em>Target Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Page</em>'.
	 * @see wizards.Button#getTargetPage()
	 * @see #getButton()
	 * @generated
	 */
	EReference getButton_TargetPage();

	/**
	 * Returns the meta object for the reference '{@link wizards.Button#getOtherTargetPage <em>Other Target Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Other Target Page</em>'.
	 * @see wizards.Button#getOtherTargetPage()
	 * @see #getButton()
	 * @generated
	 */
	EReference getButton_OtherTargetPage();

	/**
	 * Returns the meta object for the '{@link wizards.Button#labelMaxSize(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Label Max Size</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Label Max Size</em>' operation.
	 * @see wizards.Button#labelMaxSize(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getButton__LabelMaxSize__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link wizards.NavButton <em>Nav Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nav Button</em>'.
	 * @see wizards.NavButton
	 * @generated
	 */
	EClass getNavButton();

	/**
	 * Returns the meta object for the '{@link wizards.NavButton#navigate() <em>Navigate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Navigate</em>' operation.
	 * @see wizards.NavButton#navigate()
	 * @generated
	 */
	EOperation getNavButton__Navigate();

	/**
	 * Returns the meta object for class '{@link wizards.ReturnButton <em>Return Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return Button</em>'.
	 * @see wizards.ReturnButton
	 * @generated
	 */
	EClass getReturnButton();

	/**
	 * Returns the meta object for the '{@link wizards.ReturnButton#return_() <em>Return </em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Return </em>' operation.
	 * @see wizards.ReturnButton#return_()
	 * @generated
	 */
	EOperation getReturnButton__Return_();

	/**
	 * Returns the meta object for class '{@link wizards.ShowButton <em>Show Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Show Button</em>'.
	 * @see wizards.ShowButton
	 * @generated
	 */
	EClass getShowButton();

	/**
	 * Returns the meta object for the attribute '{@link wizards.ShowButton#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see wizards.ShowButton#getMessage()
	 * @see #getShowButton()
	 * @generated
	 */
	EAttribute getShowButton_Message();

	/**
	 * Returns the meta object for the '{@link wizards.ShowButton#show() <em>Show</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Show</em>' operation.
	 * @see wizards.ShowButton#show()
	 * @generated
	 */
	EOperation getShowButton__Show();

	/**
	 * Returns the meta object for class '{@link wizards.CloseButton <em>Close Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Close Button</em>'.
	 * @see wizards.CloseButton
	 * @generated
	 */
	EClass getCloseButton();

	/**
	 * Returns the meta object for the '{@link wizards.CloseButton#close() <em>Close</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Close</em>' operation.
	 * @see wizards.CloseButton#close()
	 * @generated
	 */
	EOperation getCloseButton__Close();

	/**
	 * Returns the meta object for class '{@link wizards.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field</em>'.
	 * @see wizards.Field
	 * @generated
	 */
	EClass getField();

	/**
	 * Returns the meta object for the attribute '{@link wizards.Field#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see wizards.Field#getLabel()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Label();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WizardsFactory getWizardsFactory();

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
		 * The meta object literal for the '{@link wizards.impl.WizardImpl <em>Wizard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wizards.impl.WizardImpl
		 * @see wizards.impl.WizardsPackageImpl#getWizard()
		 * @generated
		 */
		EClass WIZARD = eINSTANCE.getWizard();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIZARD__TITLE = eINSTANCE.getWizard_Title();

		/**
		 * The meta object literal for the '<em><b>Initial Page</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIZARD__INITIAL_PAGE = eINSTANCE.getWizard_InitialPage();

		/**
		 * The meta object literal for the '<em><b>Pages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIZARD__PAGES = eINSTANCE.getWizard_Pages();

		/**
		 * The meta object literal for the '<em><b>Pages Return Buttons</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation WIZARD___PAGES_RETURN_BUTTONS__DIAGNOSTICCHAIN_MAP = eINSTANCE.getWizard__PagesReturnButtons__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Initial Page Return Buttons</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation WIZARD___INITIAL_PAGE_RETURN_BUTTONS__DIAGNOSTICCHAIN_MAP = eINSTANCE.getWizard__InitialPageReturnButtons__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>At Least Close Btn</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation WIZARD___AT_LEAST_CLOSE_BTN__DIAGNOSTICCHAIN_MAP = eINSTANCE.getWizard__AtLeastCloseBtn__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link wizards.impl.PageImpl <em>Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wizards.impl.PageImpl
		 * @see wizards.impl.WizardsPackageImpl#getPage()
		 * @generated
		 */
		EClass PAGE = eINSTANCE.getPage();

		/**
		 * The meta object literal for the '<em><b>Checkbox</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__CHECKBOX = eINSTANCE.getPage_Checkbox();

		/**
		 * The meta object literal for the '<em><b>Buttons</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__BUTTONS = eINSTANCE.getPage_Buttons();

		/**
		 * The meta object literal for the '<em><b>Text Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__TEXT_FIELDS = eINSTANCE.getPage_TextFields();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__TITLE = eINSTANCE.getPage_Title();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__NAME = eINSTANCE.getPage_Name();

		/**
		 * The meta object literal for the '<em><b>Not Only Show Btns</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PAGE___NOT_ONLY_SHOW_BTNS__DIAGNOSTICCHAIN_MAP = eINSTANCE.getPage__NotOnlyShowBtns__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Not Self Loop</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PAGE___NOT_SELF_LOOP__DIAGNOSTICCHAIN_MAP = eINSTANCE.getPage__NotSelfLoop__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Buttons Different Label</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PAGE___BUTTONS_DIFFERENT_LABEL__DIAGNOSTICCHAIN_MAP = eINSTANCE.getPage__ButtonsDifferentLabel__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link wizards.impl.TextFieldImpl <em>Text Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wizards.impl.TextFieldImpl
		 * @see wizards.impl.WizardsPackageImpl#getTextField()
		 * @generated
		 */
		EClass TEXT_FIELD = eINSTANCE.getTextField();

		/**
		 * The meta object literal for the '<em><b>Min Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_FIELD__MIN_LENGTH = eINSTANCE.getTextField_MinLength();

		/**
		 * The meta object literal for the '<em><b>Max Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_FIELD__MAX_LENGTH = eINSTANCE.getTextField_MaxLength();

		/**
		 * The meta object literal for the '<em><b>Label Size</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TEXT_FIELD___LABEL_SIZE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getTextField__LabelSize__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link wizards.impl.CheckBoxImpl <em>Check Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wizards.impl.CheckBoxImpl
		 * @see wizards.impl.WizardsPackageImpl#getCheckBox()
		 * @generated
		 */
		EClass CHECK_BOX = eINSTANCE.getCheckBox();

		/**
		 * The meta object literal for the '<em><b>Label Selected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHECK_BOX__LABEL_SELECTED = eINSTANCE.getCheckBox_LabelSelected();

		/**
		 * The meta object literal for the '{@link wizards.impl.ButtonImpl <em>Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wizards.impl.ButtonImpl
		 * @see wizards.impl.WizardsPackageImpl#getButton()
		 * @generated
		 */
		EClass BUTTON = eINSTANCE.getButton();

		/**
		 * The meta object literal for the '<em><b>Target Page</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUTTON__TARGET_PAGE = eINSTANCE.getButton_TargetPage();

		/**
		 * The meta object literal for the '<em><b>Other Target Page</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUTTON__OTHER_TARGET_PAGE = eINSTANCE.getButton_OtherTargetPage();

		/**
		 * The meta object literal for the '<em><b>Label Max Size</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BUTTON___LABEL_MAX_SIZE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getButton__LabelMaxSize__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link wizards.impl.NavButtonImpl <em>Nav Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wizards.impl.NavButtonImpl
		 * @see wizards.impl.WizardsPackageImpl#getNavButton()
		 * @generated
		 */
		EClass NAV_BUTTON = eINSTANCE.getNavButton();

		/**
		 * The meta object literal for the '<em><b>Navigate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NAV_BUTTON___NAVIGATE = eINSTANCE.getNavButton__Navigate();

		/**
		 * The meta object literal for the '{@link wizards.impl.ReturnButtonImpl <em>Return Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wizards.impl.ReturnButtonImpl
		 * @see wizards.impl.WizardsPackageImpl#getReturnButton()
		 * @generated
		 */
		EClass RETURN_BUTTON = eINSTANCE.getReturnButton();

		/**
		 * The meta object literal for the '<em><b>Return </b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RETURN_BUTTON___RETURN_ = eINSTANCE.getReturnButton__Return_();

		/**
		 * The meta object literal for the '{@link wizards.impl.ShowButtonImpl <em>Show Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wizards.impl.ShowButtonImpl
		 * @see wizards.impl.WizardsPackageImpl#getShowButton()
		 * @generated
		 */
		EClass SHOW_BUTTON = eINSTANCE.getShowButton();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHOW_BUTTON__MESSAGE = eINSTANCE.getShowButton_Message();

		/**
		 * The meta object literal for the '<em><b>Show</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SHOW_BUTTON___SHOW = eINSTANCE.getShowButton__Show();

		/**
		 * The meta object literal for the '{@link wizards.impl.CloseButtonImpl <em>Close Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wizards.impl.CloseButtonImpl
		 * @see wizards.impl.WizardsPackageImpl#getCloseButton()
		 * @generated
		 */
		EClass CLOSE_BUTTON = eINSTANCE.getCloseButton();

		/**
		 * The meta object literal for the '<em><b>Close</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLOSE_BUTTON___CLOSE = eINSTANCE.getCloseButton__Close();

		/**
		 * The meta object literal for the '{@link wizards.impl.FieldImpl <em>Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wizards.impl.FieldImpl
		 * @see wizards.impl.WizardsPackageImpl#getField()
		 * @generated
		 */
		EClass FIELD = eINSTANCE.getField();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__LABEL = eINSTANCE.getField_Label();

	}

} //WizardsPackage
