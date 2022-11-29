/**
 */
package wizard.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import wizard.Button;
import wizard.ButtonClose;
import wizard.ButtonNavigate;
import wizard.ButtonReturn;
import wizard.ButtonShow;
import wizard.Checkbox;
import wizard.Label;
import wizard.Page;
import wizard.TextField;
import wizard.Wizard;
import wizard.WizardFactory;
import wizard.WizardPackage;

import wizard.util.WizardValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WizardPackageImpl extends EPackageImpl implements WizardPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wizardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass checkboxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buttonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buttonNavigateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buttonReturnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buttonShowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buttonCloseEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see wizard.WizardPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private WizardPackageImpl() {
		super(eNS_URI, WizardFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link WizardPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static WizardPackage init() {
		if (isInited) return (WizardPackage)EPackage.Registry.INSTANCE.getEPackage(WizardPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredWizardPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		WizardPackageImpl theWizardPackage = registeredWizardPackage instanceof WizardPackageImpl ? (WizardPackageImpl)registeredWizardPackage : new WizardPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theWizardPackage.createPackageContents();

		// Initialize created meta-data
		theWizardPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theWizardPackage,
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return WizardValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theWizardPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(WizardPackage.eNS_URI, theWizardPackage);
		return theWizardPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWizard() {
		return wizardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWizard_Title() {
		return (EAttribute)wizardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWizard_Pages() {
		return (EReference)wizardEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPage() {
		return pageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPage_Init() {
		return (EAttribute)pageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPage_Textfields() {
		return (EReference)pageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPage_Checkbox() {
		return (EReference)pageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPage_Buttons() {
		return (EReference)pageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPage__NotOnlyMessageButton__DiagnosticChain_Map() {
		return pageEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPage__OneInitPage__DiagnosticChain_Map() {
		return pageEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPage__NoRetNavThenClose__DiagnosticChain_Map() {
		return pageEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPage__NoSimilarButtons__DiagnosticChain_Map() {
		return pageEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPage__ReturnButtonsInv__DiagnosticChain_Map() {
		return pageEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextField() {
		return textFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextField_MinLength() {
		return (EAttribute)textFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextField_MaxLength() {
		return (EAttribute)textFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextField_Input() {
		return (EAttribute)textFieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextField_Label() {
		return (EReference)textFieldEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTextField__MinMaxLength__DiagnosticChain_Map() {
		return textFieldEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCheckbox() {
		return checkboxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCheckbox_Selected() {
		return (EAttribute)checkboxEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCheckbox_Label() {
		return (EReference)checkboxEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLabel() {
		return labelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLabel_Text() {
		return (EAttribute)labelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getButton() {
		return buttonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getButton_Label() {
		return (EReference)buttonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getButton_MyPage() {
		return (EReference)buttonEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getButton__MaxLabelLength__DiagnosticChain_Map() {
		return buttonEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getButtonNavigate() {
		return buttonNavigateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getButtonNavigate_NextPage() {
		return (EReference)buttonNavigateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getButtonNavigate_NextPageAlt() {
		return (EReference)buttonNavigateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getButtonNavigate__MyPageDifferNextPage__DiagnosticChain_Map() {
		return buttonNavigateEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getButtonReturn() {
		return buttonReturnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getButtonReturn_PreviousPage() {
		return (EReference)buttonReturnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getButtonShow() {
		return buttonShowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getButtonShow_Message() {
		return (EAttribute)buttonShowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getButtonClose() {
		return buttonCloseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getButtonClose_Wizard() {
		return (EReference)buttonCloseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WizardFactory getWizardFactory() {
		return (WizardFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		wizardEClass = createEClass(WIZARD);
		createEAttribute(wizardEClass, WIZARD__TITLE);
		createEReference(wizardEClass, WIZARD__PAGES);

		pageEClass = createEClass(PAGE);
		createEAttribute(pageEClass, PAGE__INIT);
		createEReference(pageEClass, PAGE__TEXTFIELDS);
		createEReference(pageEClass, PAGE__CHECKBOX);
		createEReference(pageEClass, PAGE__BUTTONS);
		createEOperation(pageEClass, PAGE___NOT_ONLY_MESSAGE_BUTTON__DIAGNOSTICCHAIN_MAP);
		createEOperation(pageEClass, PAGE___ONE_INIT_PAGE__DIAGNOSTICCHAIN_MAP);
		createEOperation(pageEClass, PAGE___NO_RET_NAV_THEN_CLOSE__DIAGNOSTICCHAIN_MAP);
		createEOperation(pageEClass, PAGE___NO_SIMILAR_BUTTONS__DIAGNOSTICCHAIN_MAP);
		createEOperation(pageEClass, PAGE___RETURN_BUTTONS_INV__DIAGNOSTICCHAIN_MAP);

		textFieldEClass = createEClass(TEXT_FIELD);
		createEAttribute(textFieldEClass, TEXT_FIELD__MIN_LENGTH);
		createEAttribute(textFieldEClass, TEXT_FIELD__MAX_LENGTH);
		createEAttribute(textFieldEClass, TEXT_FIELD__INPUT);
		createEReference(textFieldEClass, TEXT_FIELD__LABEL);
		createEOperation(textFieldEClass, TEXT_FIELD___MIN_MAX_LENGTH__DIAGNOSTICCHAIN_MAP);

		checkboxEClass = createEClass(CHECKBOX);
		createEAttribute(checkboxEClass, CHECKBOX__SELECTED);
		createEReference(checkboxEClass, CHECKBOX__LABEL);

		labelEClass = createEClass(LABEL);
		createEAttribute(labelEClass, LABEL__TEXT);

		buttonEClass = createEClass(BUTTON);
		createEReference(buttonEClass, BUTTON__LABEL);
		createEReference(buttonEClass, BUTTON__MY_PAGE);
		createEOperation(buttonEClass, BUTTON___MAX_LABEL_LENGTH__DIAGNOSTICCHAIN_MAP);

		buttonNavigateEClass = createEClass(BUTTON_NAVIGATE);
		createEReference(buttonNavigateEClass, BUTTON_NAVIGATE__NEXT_PAGE);
		createEReference(buttonNavigateEClass, BUTTON_NAVIGATE__NEXT_PAGE_ALT);
		createEOperation(buttonNavigateEClass, BUTTON_NAVIGATE___MY_PAGE_DIFFER_NEXT_PAGE__DIAGNOSTICCHAIN_MAP);

		buttonReturnEClass = createEClass(BUTTON_RETURN);
		createEReference(buttonReturnEClass, BUTTON_RETURN__PREVIOUS_PAGE);

		buttonShowEClass = createEClass(BUTTON_SHOW);
		createEAttribute(buttonShowEClass, BUTTON_SHOW__MESSAGE);

		buttonCloseEClass = createEClass(BUTTON_CLOSE);
		createEReference(buttonCloseEClass, BUTTON_CLOSE__WIZARD);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		buttonNavigateEClass.getESuperTypes().add(this.getButton());
		buttonReturnEClass.getESuperTypes().add(this.getButton());
		buttonShowEClass.getESuperTypes().add(this.getButton());
		buttonCloseEClass.getESuperTypes().add(this.getButton());

		// Initialize classes, features, and operations; add parameters
		initEClass(wizardEClass, Wizard.class, "Wizard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWizard_Title(), ecorePackage.getEString(), "title", null, 1, 1, Wizard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWizard_Pages(), this.getPage(), null, "pages", null, 1, -1, Wizard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(pageEClass, Page.class, "Page", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPage_Init(), ecorePackage.getEBoolean(), "init", null, 1, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPage_Textfields(), this.getTextField(), null, "textfields", null, 0, -1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPage_Checkbox(), this.getCheckbox(), null, "checkbox", null, 0, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPage_Buttons(), this.getButton(), this.getButton_MyPage(), "buttons", null, 1, -1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		EOperation op = initEOperation(getPage__NotOnlyMessageButton__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "notOnlyMessageButton", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPage__OneInitPage__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "oneInitPage", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPage__NoRetNavThenClose__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "noRetNavThenClose", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPage__NoSimilarButtons__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "noSimilarButtons", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPage__ReturnButtonsInv__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "returnButtonsInv", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(textFieldEClass, TextField.class, "TextField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextField_MinLength(), ecorePackage.getEInt(), "minLength", null, 1, 1, TextField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextField_MaxLength(), ecorePackage.getEInt(), "maxLength", null, 1, 1, TextField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextField_Input(), ecorePackage.getEString(), "input", null, 0, 1, TextField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTextField_Label(), this.getLabel(), null, "label", null, 1, 1, TextField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getTextField__MinMaxLength__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "minMaxLength", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(checkboxEClass, Checkbox.class, "Checkbox", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCheckbox_Selected(), ecorePackage.getEBoolean(), "selected", null, 1, 1, Checkbox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCheckbox_Label(), this.getLabel(), null, "label", null, 1, 1, Checkbox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(labelEClass, Label.class, "Label", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLabel_Text(), ecorePackage.getEString(), "text", null, 1, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(buttonEClass, Button.class, "Button", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getButton_Label(), this.getLabel(), null, "label", null, 1, 1, Button.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getButton_MyPage(), this.getPage(), this.getPage_Buttons(), "myPage", null, 1, 1, Button.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getButton__MaxLabelLength__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "maxLabelLength", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(buttonNavigateEClass, ButtonNavigate.class, "ButtonNavigate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getButtonNavigate_NextPage(), this.getPage(), null, "nextPage", null, 1, 1, ButtonNavigate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getButtonNavigate_NextPageAlt(), this.getPage(), null, "nextPageAlt", null, 0, 1, ButtonNavigate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getButtonNavigate__MyPageDifferNextPage__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "myPageDifferNextPage", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(buttonReturnEClass, ButtonReturn.class, "ButtonReturn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getButtonReturn_PreviousPage(), this.getPage(), null, "previousPage", null, 1, 1, ButtonReturn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(buttonShowEClass, ButtonShow.class, "ButtonShow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getButtonShow_Message(), ecorePackage.getEString(), "message", null, 1, 1, ButtonShow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(buttonCloseEClass, ButtonClose.class, "ButtonClose", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getButtonClose_Wizard(), this.getWizard(), null, "wizard", null, 1, 1, ButtonClose.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (pageEClass,
		   source,
		   new String[] {
			   "constraints", "returnButtonsInv"
		   });
		addAnnotation
		  (textFieldEClass,
		   source,
		   new String[] {
			   "constraints", "minMaxLength"
		   });
		addAnnotation
		  (buttonEClass,
		   source,
		   new String[] {
			   "constraints", "maxLabelLength"
		   });
		addAnnotation
		  (buttonNavigateEClass,
		   source,
		   new String[] {
			   "constraints", "myPageDifferNextPage"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
		addAnnotation
		  (getPage__NotOnlyMessageButton__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "buttons->select(b | b.oclIsTypeOf(ButtonShow))->size() < buttons->size()"
		   });
		addAnnotation
		  (getPage__OneInitPage__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "Page.allInstances()->one(init)"
		   });
		addAnnotation
		  (getPage__NoRetNavThenClose__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "(buttons->select(b | b.oclIsTypeOf(ButtonReturn) or b.oclIsTypeOf(ButtonNavigate))->size() = 0)\n\t\t\t\t\t\t\t\t\t\timplies buttons->one(b | b.oclIsTypeOf(ButtonClose))"
		   });
		addAnnotation
		  (getPage__NoSimilarButtons__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "buttons->isUnique(b | b.label.text)"
		   });
		addAnnotation
		  (getPage__ReturnButtonsInv__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "not init and buttons->select(b | b.oclIsTypeOf(ButtonReturn))->size() <= 1 or buttons->select(b | b.oclIsTypeOf(ButtonReturn))->size() < 1"
		   });
		addAnnotation
		  (getTextField__MinMaxLength__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "(input.size() >= minLength) and (input.size() <= maxLength) or (minLength = 0 and maxLength = 0)"
		   });
		addAnnotation
		  (getButton__MaxLabelLength__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "label.text.size() <= 10"
		   });
		addAnnotation
		  (getButtonNavigate__MyPageDifferNextPage__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "self.myPage <> self.nextPage and self.myPage <> self.nextPageAlt"
		   });
	}

} //WizardPackageImpl
