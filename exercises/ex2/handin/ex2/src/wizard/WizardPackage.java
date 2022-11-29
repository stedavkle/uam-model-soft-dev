/**
 */
package wizard;

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
 * @see wizard.WizardFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore"
 * @generated
 */
public interface WizardPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "wizard";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "/ex2/ex2.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "wizard";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WizardPackage eINSTANCE = wizard.impl.WizardPackageImpl.init();

	/**
	 * The meta object id for the '{@link wizard.impl.WizardImpl <em>Wizard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wizard.impl.WizardImpl
	 * @see wizard.impl.WizardPackageImpl#getWizard()
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
	 * The feature id for the '<em><b>Pages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD__PAGES = 1;

	/**
	 * The number of structural features of the '<em>Wizard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Wizard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link wizard.impl.PageImpl <em>Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wizard.impl.PageImpl
	 * @see wizard.impl.WizardPackageImpl#getPage()
	 * @generated
	 */
	int PAGE = 1;

	/**
	 * The feature id for the '<em><b>Init</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__INIT = 0;

	/**
	 * The feature id for the '<em><b>Textfields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__TEXTFIELDS = 1;

	/**
	 * The feature id for the '<em><b>Checkbox</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__CHECKBOX = 2;

	/**
	 * The feature id for the '<em><b>Buttons</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__BUTTONS = 3;

	/**
	 * The number of structural features of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Not Only Message Button</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE___NOT_ONLY_MESSAGE_BUTTON__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>One Init Page</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE___ONE_INIT_PAGE__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The operation id for the '<em>No Ret Nav Then Close</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE___NO_RET_NAV_THEN_CLOSE__DIAGNOSTICCHAIN_MAP = 2;

	/**
	 * The operation id for the '<em>No Similar Buttons</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE___NO_SIMILAR_BUTTONS__DIAGNOSTICCHAIN_MAP = 3;

	/**
	 * The operation id for the '<em>Return Buttons Inv</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE___RETURN_BUTTONS_INV__DIAGNOSTICCHAIN_MAP = 4;

	/**
	 * The number of operations of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '{@link wizard.impl.TextFieldImpl <em>Text Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wizard.impl.TextFieldImpl
	 * @see wizard.impl.WizardPackageImpl#getTextField()
	 * @generated
	 */
	int TEXT_FIELD = 2;

	/**
	 * The feature id for the '<em><b>Min Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__MIN_LENGTH = 0;

	/**
	 * The feature id for the '<em><b>Max Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__MAX_LENGTH = 1;

	/**
	 * The feature id for the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__INPUT = 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__LABEL = 3;

	/**
	 * The number of structural features of the '<em>Text Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Min Max Length</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD___MIN_MAX_LENGTH__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Text Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link wizard.impl.CheckboxImpl <em>Checkbox</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wizard.impl.CheckboxImpl
	 * @see wizard.impl.WizardPackageImpl#getCheckbox()
	 * @generated
	 */
	int CHECKBOX = 3;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKBOX__SELECTED = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKBOX__LABEL = 1;

	/**
	 * The number of structural features of the '<em>Checkbox</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKBOX_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Checkbox</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKBOX_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link wizard.impl.LabelImpl <em>Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wizard.impl.LabelImpl
	 * @see wizard.impl.WizardPackageImpl#getLabel()
	 * @generated
	 */
	int LABEL = 4;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__TEXT = 0;

	/**
	 * The number of structural features of the '<em>Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link wizard.impl.ButtonImpl <em>Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wizard.impl.ButtonImpl
	 * @see wizard.impl.WizardPackageImpl#getButton()
	 * @generated
	 */
	int BUTTON = 5;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__LABEL = 0;

	/**
	 * The feature id for the '<em><b>My Page</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__MY_PAGE = 1;

	/**
	 * The number of structural features of the '<em>Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Max Label Length</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON___MAX_LABEL_LENGTH__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link wizard.impl.ButtonNavigateImpl <em>Button Navigate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wizard.impl.ButtonNavigateImpl
	 * @see wizard.impl.WizardPackageImpl#getButtonNavigate()
	 * @generated
	 */
	int BUTTON_NAVIGATE = 6;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_NAVIGATE__LABEL = BUTTON__LABEL;

	/**
	 * The feature id for the '<em><b>My Page</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_NAVIGATE__MY_PAGE = BUTTON__MY_PAGE;

	/**
	 * The feature id for the '<em><b>Next Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_NAVIGATE__NEXT_PAGE = BUTTON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Next Page Alt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_NAVIGATE__NEXT_PAGE_ALT = BUTTON_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Button Navigate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_NAVIGATE_FEATURE_COUNT = BUTTON_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Max Label Length</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_NAVIGATE___MAX_LABEL_LENGTH__DIAGNOSTICCHAIN_MAP = BUTTON___MAX_LABEL_LENGTH__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>My Page Differ Next Page</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_NAVIGATE___MY_PAGE_DIFFER_NEXT_PAGE__DIAGNOSTICCHAIN_MAP = BUTTON_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Button Navigate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_NAVIGATE_OPERATION_COUNT = BUTTON_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link wizard.impl.ButtonReturnImpl <em>Button Return</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wizard.impl.ButtonReturnImpl
	 * @see wizard.impl.WizardPackageImpl#getButtonReturn()
	 * @generated
	 */
	int BUTTON_RETURN = 7;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_RETURN__LABEL = BUTTON__LABEL;

	/**
	 * The feature id for the '<em><b>My Page</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_RETURN__MY_PAGE = BUTTON__MY_PAGE;

	/**
	 * The feature id for the '<em><b>Previous Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_RETURN__PREVIOUS_PAGE = BUTTON_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Button Return</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_RETURN_FEATURE_COUNT = BUTTON_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Max Label Length</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_RETURN___MAX_LABEL_LENGTH__DIAGNOSTICCHAIN_MAP = BUTTON___MAX_LABEL_LENGTH__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Button Return</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_RETURN_OPERATION_COUNT = BUTTON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wizard.impl.ButtonShowImpl <em>Button Show</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wizard.impl.ButtonShowImpl
	 * @see wizard.impl.WizardPackageImpl#getButtonShow()
	 * @generated
	 */
	int BUTTON_SHOW = 8;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_SHOW__LABEL = BUTTON__LABEL;

	/**
	 * The feature id for the '<em><b>My Page</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_SHOW__MY_PAGE = BUTTON__MY_PAGE;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_SHOW__MESSAGE = BUTTON_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Button Show</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_SHOW_FEATURE_COUNT = BUTTON_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Max Label Length</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_SHOW___MAX_LABEL_LENGTH__DIAGNOSTICCHAIN_MAP = BUTTON___MAX_LABEL_LENGTH__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Button Show</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_SHOW_OPERATION_COUNT = BUTTON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wizard.impl.ButtonCloseImpl <em>Button Close</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wizard.impl.ButtonCloseImpl
	 * @see wizard.impl.WizardPackageImpl#getButtonClose()
	 * @generated
	 */
	int BUTTON_CLOSE = 9;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_CLOSE__LABEL = BUTTON__LABEL;

	/**
	 * The feature id for the '<em><b>My Page</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_CLOSE__MY_PAGE = BUTTON__MY_PAGE;

	/**
	 * The feature id for the '<em><b>Wizard</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_CLOSE__WIZARD = BUTTON_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Button Close</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_CLOSE_FEATURE_COUNT = BUTTON_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Max Label Length</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_CLOSE___MAX_LABEL_LENGTH__DIAGNOSTICCHAIN_MAP = BUTTON___MAX_LABEL_LENGTH__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Button Close</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_CLOSE_OPERATION_COUNT = BUTTON_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link wizard.Wizard <em>Wizard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wizard</em>'.
	 * @see wizard.Wizard
	 * @generated
	 */
	EClass getWizard();

	/**
	 * Returns the meta object for the attribute '{@link wizard.Wizard#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see wizard.Wizard#getTitle()
	 * @see #getWizard()
	 * @generated
	 */
	EAttribute getWizard_Title();

	/**
	 * Returns the meta object for the containment reference list '{@link wizard.Wizard#getPages <em>Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pages</em>'.
	 * @see wizard.Wizard#getPages()
	 * @see #getWizard()
	 * @generated
	 */
	EReference getWizard_Pages();

	/**
	 * Returns the meta object for class '{@link wizard.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page</em>'.
	 * @see wizard.Page
	 * @generated
	 */
	EClass getPage();

	/**
	 * Returns the meta object for the attribute '{@link wizard.Page#isInit <em>Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Init</em>'.
	 * @see wizard.Page#isInit()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_Init();

	/**
	 * Returns the meta object for the containment reference list '{@link wizard.Page#getTextfields <em>Textfields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Textfields</em>'.
	 * @see wizard.Page#getTextfields()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_Textfields();

	/**
	 * Returns the meta object for the containment reference '{@link wizard.Page#getCheckbox <em>Checkbox</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Checkbox</em>'.
	 * @see wizard.Page#getCheckbox()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_Checkbox();

	/**
	 * Returns the meta object for the containment reference list '{@link wizard.Page#getButtons <em>Buttons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Buttons</em>'.
	 * @see wizard.Page#getButtons()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_Buttons();

	/**
	 * Returns the meta object for the '{@link wizard.Page#notOnlyMessageButton(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Not Only Message Button</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Not Only Message Button</em>' operation.
	 * @see wizard.Page#notOnlyMessageButton(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPage__NotOnlyMessageButton__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link wizard.Page#oneInitPage(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>One Init Page</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>One Init Page</em>' operation.
	 * @see wizard.Page#oneInitPage(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPage__OneInitPage__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link wizard.Page#noRetNavThenClose(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>No Ret Nav Then Close</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>No Ret Nav Then Close</em>' operation.
	 * @see wizard.Page#noRetNavThenClose(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPage__NoRetNavThenClose__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link wizard.Page#noSimilarButtons(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>No Similar Buttons</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>No Similar Buttons</em>' operation.
	 * @see wizard.Page#noSimilarButtons(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPage__NoSimilarButtons__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link wizard.Page#returnButtonsInv(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Return Buttons Inv</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Return Buttons Inv</em>' operation.
	 * @see wizard.Page#returnButtonsInv(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPage__ReturnButtonsInv__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link wizard.TextField <em>Text Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Field</em>'.
	 * @see wizard.TextField
	 * @generated
	 */
	EClass getTextField();

	/**
	 * Returns the meta object for the attribute '{@link wizard.TextField#getMinLength <em>Min Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Length</em>'.
	 * @see wizard.TextField#getMinLength()
	 * @see #getTextField()
	 * @generated
	 */
	EAttribute getTextField_MinLength();

	/**
	 * Returns the meta object for the attribute '{@link wizard.TextField#getMaxLength <em>Max Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Length</em>'.
	 * @see wizard.TextField#getMaxLength()
	 * @see #getTextField()
	 * @generated
	 */
	EAttribute getTextField_MaxLength();

	/**
	 * Returns the meta object for the attribute '{@link wizard.TextField#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input</em>'.
	 * @see wizard.TextField#getInput()
	 * @see #getTextField()
	 * @generated
	 */
	EAttribute getTextField_Input();

	/**
	 * Returns the meta object for the containment reference '{@link wizard.TextField#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Label</em>'.
	 * @see wizard.TextField#getLabel()
	 * @see #getTextField()
	 * @generated
	 */
	EReference getTextField_Label();

	/**
	 * Returns the meta object for the '{@link wizard.TextField#minMaxLength(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Min Max Length</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Min Max Length</em>' operation.
	 * @see wizard.TextField#minMaxLength(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getTextField__MinMaxLength__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link wizard.Checkbox <em>Checkbox</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Checkbox</em>'.
	 * @see wizard.Checkbox
	 * @generated
	 */
	EClass getCheckbox();

	/**
	 * Returns the meta object for the attribute '{@link wizard.Checkbox#isSelected <em>Selected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selected</em>'.
	 * @see wizard.Checkbox#isSelected()
	 * @see #getCheckbox()
	 * @generated
	 */
	EAttribute getCheckbox_Selected();

	/**
	 * Returns the meta object for the containment reference '{@link wizard.Checkbox#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Label</em>'.
	 * @see wizard.Checkbox#getLabel()
	 * @see #getCheckbox()
	 * @generated
	 */
	EReference getCheckbox_Label();

	/**
	 * Returns the meta object for class '{@link wizard.Label <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label</em>'.
	 * @see wizard.Label
	 * @generated
	 */
	EClass getLabel();

	/**
	 * Returns the meta object for the attribute '{@link wizard.Label#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see wizard.Label#getText()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_Text();

	/**
	 * Returns the meta object for class '{@link wizard.Button <em>Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button</em>'.
	 * @see wizard.Button
	 * @generated
	 */
	EClass getButton();

	/**
	 * Returns the meta object for the containment reference '{@link wizard.Button#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Label</em>'.
	 * @see wizard.Button#getLabel()
	 * @see #getButton()
	 * @generated
	 */
	EReference getButton_Label();

	/**
	 * Returns the meta object for the container reference '{@link wizard.Button#getMyPage <em>My Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>My Page</em>'.
	 * @see wizard.Button#getMyPage()
	 * @see #getButton()
	 * @generated
	 */
	EReference getButton_MyPage();

	/**
	 * Returns the meta object for the '{@link wizard.Button#maxLabelLength(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Max Label Length</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Max Label Length</em>' operation.
	 * @see wizard.Button#maxLabelLength(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getButton__MaxLabelLength__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link wizard.ButtonNavigate <em>Button Navigate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button Navigate</em>'.
	 * @see wizard.ButtonNavigate
	 * @generated
	 */
	EClass getButtonNavigate();

	/**
	 * Returns the meta object for the reference '{@link wizard.ButtonNavigate#getNextPage <em>Next Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next Page</em>'.
	 * @see wizard.ButtonNavigate#getNextPage()
	 * @see #getButtonNavigate()
	 * @generated
	 */
	EReference getButtonNavigate_NextPage();

	/**
	 * Returns the meta object for the reference '{@link wizard.ButtonNavigate#getNextPageAlt <em>Next Page Alt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next Page Alt</em>'.
	 * @see wizard.ButtonNavigate#getNextPageAlt()
	 * @see #getButtonNavigate()
	 * @generated
	 */
	EReference getButtonNavigate_NextPageAlt();

	/**
	 * Returns the meta object for the '{@link wizard.ButtonNavigate#myPageDifferNextPage(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>My Page Differ Next Page</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>My Page Differ Next Page</em>' operation.
	 * @see wizard.ButtonNavigate#myPageDifferNextPage(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getButtonNavigate__MyPageDifferNextPage__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link wizard.ButtonReturn <em>Button Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button Return</em>'.
	 * @see wizard.ButtonReturn
	 * @generated
	 */
	EClass getButtonReturn();

	/**
	 * Returns the meta object for the reference '{@link wizard.ButtonReturn#getPreviousPage <em>Previous Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Previous Page</em>'.
	 * @see wizard.ButtonReturn#getPreviousPage()
	 * @see #getButtonReturn()
	 * @generated
	 */
	EReference getButtonReturn_PreviousPage();

	/**
	 * Returns the meta object for class '{@link wizard.ButtonShow <em>Button Show</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button Show</em>'.
	 * @see wizard.ButtonShow
	 * @generated
	 */
	EClass getButtonShow();

	/**
	 * Returns the meta object for the attribute '{@link wizard.ButtonShow#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see wizard.ButtonShow#getMessage()
	 * @see #getButtonShow()
	 * @generated
	 */
	EAttribute getButtonShow_Message();

	/**
	 * Returns the meta object for class '{@link wizard.ButtonClose <em>Button Close</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button Close</em>'.
	 * @see wizard.ButtonClose
	 * @generated
	 */
	EClass getButtonClose();

	/**
	 * Returns the meta object for the reference '{@link wizard.ButtonClose#getWizard <em>Wizard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Wizard</em>'.
	 * @see wizard.ButtonClose#getWizard()
	 * @see #getButtonClose()
	 * @generated
	 */
	EReference getButtonClose_Wizard();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WizardFactory getWizardFactory();

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
		 * The meta object literal for the '{@link wizard.impl.WizardImpl <em>Wizard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wizard.impl.WizardImpl
		 * @see wizard.impl.WizardPackageImpl#getWizard()
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
		 * The meta object literal for the '<em><b>Pages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIZARD__PAGES = eINSTANCE.getWizard_Pages();

		/**
		 * The meta object literal for the '{@link wizard.impl.PageImpl <em>Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wizard.impl.PageImpl
		 * @see wizard.impl.WizardPackageImpl#getPage()
		 * @generated
		 */
		EClass PAGE = eINSTANCE.getPage();

		/**
		 * The meta object literal for the '<em><b>Init</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__INIT = eINSTANCE.getPage_Init();

		/**
		 * The meta object literal for the '<em><b>Textfields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__TEXTFIELDS = eINSTANCE.getPage_Textfields();

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
		 * The meta object literal for the '<em><b>Not Only Message Button</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PAGE___NOT_ONLY_MESSAGE_BUTTON__DIAGNOSTICCHAIN_MAP = eINSTANCE.getPage__NotOnlyMessageButton__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>One Init Page</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PAGE___ONE_INIT_PAGE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getPage__OneInitPage__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>No Ret Nav Then Close</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PAGE___NO_RET_NAV_THEN_CLOSE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getPage__NoRetNavThenClose__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>No Similar Buttons</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PAGE___NO_SIMILAR_BUTTONS__DIAGNOSTICCHAIN_MAP = eINSTANCE.getPage__NoSimilarButtons__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Return Buttons Inv</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PAGE___RETURN_BUTTONS_INV__DIAGNOSTICCHAIN_MAP = eINSTANCE.getPage__ReturnButtonsInv__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link wizard.impl.TextFieldImpl <em>Text Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wizard.impl.TextFieldImpl
		 * @see wizard.impl.WizardPackageImpl#getTextField()
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
		 * The meta object literal for the '<em><b>Input</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_FIELD__INPUT = eINSTANCE.getTextField_Input();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_FIELD__LABEL = eINSTANCE.getTextField_Label();

		/**
		 * The meta object literal for the '<em><b>Min Max Length</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TEXT_FIELD___MIN_MAX_LENGTH__DIAGNOSTICCHAIN_MAP = eINSTANCE.getTextField__MinMaxLength__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link wizard.impl.CheckboxImpl <em>Checkbox</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wizard.impl.CheckboxImpl
		 * @see wizard.impl.WizardPackageImpl#getCheckbox()
		 * @generated
		 */
		EClass CHECKBOX = eINSTANCE.getCheckbox();

		/**
		 * The meta object literal for the '<em><b>Selected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHECKBOX__SELECTED = eINSTANCE.getCheckbox_Selected();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHECKBOX__LABEL = eINSTANCE.getCheckbox_Label();

		/**
		 * The meta object literal for the '{@link wizard.impl.LabelImpl <em>Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wizard.impl.LabelImpl
		 * @see wizard.impl.WizardPackageImpl#getLabel()
		 * @generated
		 */
		EClass LABEL = eINSTANCE.getLabel();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__TEXT = eINSTANCE.getLabel_Text();

		/**
		 * The meta object literal for the '{@link wizard.impl.ButtonImpl <em>Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wizard.impl.ButtonImpl
		 * @see wizard.impl.WizardPackageImpl#getButton()
		 * @generated
		 */
		EClass BUTTON = eINSTANCE.getButton();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUTTON__LABEL = eINSTANCE.getButton_Label();

		/**
		 * The meta object literal for the '<em><b>My Page</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUTTON__MY_PAGE = eINSTANCE.getButton_MyPage();

		/**
		 * The meta object literal for the '<em><b>Max Label Length</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BUTTON___MAX_LABEL_LENGTH__DIAGNOSTICCHAIN_MAP = eINSTANCE.getButton__MaxLabelLength__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link wizard.impl.ButtonNavigateImpl <em>Button Navigate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wizard.impl.ButtonNavigateImpl
		 * @see wizard.impl.WizardPackageImpl#getButtonNavigate()
		 * @generated
		 */
		EClass BUTTON_NAVIGATE = eINSTANCE.getButtonNavigate();

		/**
		 * The meta object literal for the '<em><b>Next Page</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUTTON_NAVIGATE__NEXT_PAGE = eINSTANCE.getButtonNavigate_NextPage();

		/**
		 * The meta object literal for the '<em><b>Next Page Alt</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUTTON_NAVIGATE__NEXT_PAGE_ALT = eINSTANCE.getButtonNavigate_NextPageAlt();

		/**
		 * The meta object literal for the '<em><b>My Page Differ Next Page</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BUTTON_NAVIGATE___MY_PAGE_DIFFER_NEXT_PAGE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getButtonNavigate__MyPageDifferNextPage__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link wizard.impl.ButtonReturnImpl <em>Button Return</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wizard.impl.ButtonReturnImpl
		 * @see wizard.impl.WizardPackageImpl#getButtonReturn()
		 * @generated
		 */
		EClass BUTTON_RETURN = eINSTANCE.getButtonReturn();

		/**
		 * The meta object literal for the '<em><b>Previous Page</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUTTON_RETURN__PREVIOUS_PAGE = eINSTANCE.getButtonReturn_PreviousPage();

		/**
		 * The meta object literal for the '{@link wizard.impl.ButtonShowImpl <em>Button Show</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wizard.impl.ButtonShowImpl
		 * @see wizard.impl.WizardPackageImpl#getButtonShow()
		 * @generated
		 */
		EClass BUTTON_SHOW = eINSTANCE.getButtonShow();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUTTON_SHOW__MESSAGE = eINSTANCE.getButtonShow_Message();

		/**
		 * The meta object literal for the '{@link wizard.impl.ButtonCloseImpl <em>Button Close</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wizard.impl.ButtonCloseImpl
		 * @see wizard.impl.WizardPackageImpl#getButtonClose()
		 * @generated
		 */
		EClass BUTTON_CLOSE = eINSTANCE.getButtonClose();

		/**
		 * The meta object literal for the '<em><b>Wizard</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUTTON_CLOSE__WIZARD = eINSTANCE.getButtonClose_Wizard();

	}

} //WizardPackage
