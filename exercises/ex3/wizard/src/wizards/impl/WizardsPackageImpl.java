/**
 */
package wizards.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import wizards.Button;
import wizards.CheckBox;
import wizards.CloseButton;
import wizards.Field;
import wizards.NavButton;
import wizards.Page;
import wizards.ReturnButton;
import wizards.ShowButton;
import wizards.TextField;
import wizards.Wizard;
import wizards.WizardsFactory;
import wizards.WizardsPackage;

import wizards.util.WizardsValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WizardsPackageImpl extends EPackageImpl implements WizardsPackage {
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
	private EClass checkBoxEClass = null;

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
	private EClass navButtonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass returnButtonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass showButtonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass closeButtonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldEClass = null;

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
	 * @see wizards.WizardsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private WizardsPackageImpl() {
		super(eNS_URI, WizardsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link WizardsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static WizardsPackage init() {
		if (isInited) return (WizardsPackage)EPackage.Registry.INSTANCE.getEPackage(WizardsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredWizardsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		WizardsPackageImpl theWizardsPackage = registeredWizardsPackage instanceof WizardsPackageImpl ? (WizardsPackageImpl)registeredWizardsPackage : new WizardsPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theWizardsPackage.createPackageContents();

		// Initialize created meta-data
		theWizardsPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theWizardsPackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return WizardsValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theWizardsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(WizardsPackage.eNS_URI, theWizardsPackage);
		return theWizardsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWizard() {
		return wizardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWizard_Title() {
		return (EAttribute)wizardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWizard_InitialPage() {
		return (EReference)wizardEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWizard_Pages() {
		return (EReference)wizardEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWizard__PagesReturnButtons__DiagnosticChain_Map() {
		return wizardEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWizard__InitialPageReturnButtons__DiagnosticChain_Map() {
		return wizardEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWizard__AtLeastCloseBtn__DiagnosticChain_Map() {
		return wizardEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPage() {
		return pageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPage_Checkbox() {
		return (EReference)pageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPage_Buttons() {
		return (EReference)pageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPage_TextFields() {
		return (EReference)pageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPage_Title() {
		return (EAttribute)pageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPage_Name() {
		return (EAttribute)pageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPage__NotOnlyShowBtns__DiagnosticChain_Map() {
		return pageEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPage__NotSelfLoop__DiagnosticChain_Map() {
		return pageEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPage__ButtonsDifferentLabel__DiagnosticChain_Map() {
		return pageEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTextField() {
		return textFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextField_MinLength() {
		return (EAttribute)textFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextField_MaxLength() {
		return (EAttribute)textFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTextField__LabelSize__DiagnosticChain_Map() {
		return textFieldEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCheckBox() {
		return checkBoxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCheckBox_LabelSelected() {
		return (EAttribute)checkBoxEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getButton() {
		return buttonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getButton_TargetPage() {
		return (EReference)buttonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getButton_OtherTargetPage() {
		return (EReference)buttonEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getButton__LabelMaxSize__DiagnosticChain_Map() {
		return buttonEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNavButton() {
		return navButtonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNavButton__Navigate() {
		return navButtonEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReturnButton() {
		return returnButtonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getReturnButton__Return_() {
		return returnButtonEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getShowButton() {
		return showButtonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShowButton_Message() {
		return (EAttribute)showButtonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getShowButton__Show() {
		return showButtonEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCloseButton() {
		return closeButtonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCloseButton__Close() {
		return closeButtonEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getField() {
		return fieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getField_Label() {
		return (EAttribute)fieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WizardsFactory getWizardsFactory() {
		return (WizardsFactory)getEFactoryInstance();
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
		createEReference(wizardEClass, WIZARD__INITIAL_PAGE);
		createEReference(wizardEClass, WIZARD__PAGES);
		createEOperation(wizardEClass, WIZARD___PAGES_RETURN_BUTTONS__DIAGNOSTICCHAIN_MAP);
		createEOperation(wizardEClass, WIZARD___INITIAL_PAGE_RETURN_BUTTONS__DIAGNOSTICCHAIN_MAP);
		createEOperation(wizardEClass, WIZARD___AT_LEAST_CLOSE_BTN__DIAGNOSTICCHAIN_MAP);

		pageEClass = createEClass(PAGE);
		createEReference(pageEClass, PAGE__CHECKBOX);
		createEReference(pageEClass, PAGE__BUTTONS);
		createEReference(pageEClass, PAGE__TEXT_FIELDS);
		createEAttribute(pageEClass, PAGE__TITLE);
		createEAttribute(pageEClass, PAGE__NAME);
		createEOperation(pageEClass, PAGE___NOT_ONLY_SHOW_BTNS__DIAGNOSTICCHAIN_MAP);
		createEOperation(pageEClass, PAGE___NOT_SELF_LOOP__DIAGNOSTICCHAIN_MAP);
		createEOperation(pageEClass, PAGE___BUTTONS_DIFFERENT_LABEL__DIAGNOSTICCHAIN_MAP);

		textFieldEClass = createEClass(TEXT_FIELD);
		createEAttribute(textFieldEClass, TEXT_FIELD__MIN_LENGTH);
		createEAttribute(textFieldEClass, TEXT_FIELD__MAX_LENGTH);
		createEOperation(textFieldEClass, TEXT_FIELD___LABEL_SIZE__DIAGNOSTICCHAIN_MAP);

		checkBoxEClass = createEClass(CHECK_BOX);
		createEAttribute(checkBoxEClass, CHECK_BOX__LABEL_SELECTED);

		buttonEClass = createEClass(BUTTON);
		createEReference(buttonEClass, BUTTON__TARGET_PAGE);
		createEReference(buttonEClass, BUTTON__OTHER_TARGET_PAGE);
		createEOperation(buttonEClass, BUTTON___LABEL_MAX_SIZE__DIAGNOSTICCHAIN_MAP);

		navButtonEClass = createEClass(NAV_BUTTON);
		createEOperation(navButtonEClass, NAV_BUTTON___NAVIGATE);

		returnButtonEClass = createEClass(RETURN_BUTTON);
		createEOperation(returnButtonEClass, RETURN_BUTTON___RETURN_);

		showButtonEClass = createEClass(SHOW_BUTTON);
		createEAttribute(showButtonEClass, SHOW_BUTTON__MESSAGE);
		createEOperation(showButtonEClass, SHOW_BUTTON___SHOW);

		closeButtonEClass = createEClass(CLOSE_BUTTON);
		createEOperation(closeButtonEClass, CLOSE_BUTTON___CLOSE);

		fieldEClass = createEClass(FIELD);
		createEAttribute(fieldEClass, FIELD__LABEL);
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
		textFieldEClass.getESuperTypes().add(this.getField());
		checkBoxEClass.getESuperTypes().add(this.getField());
		buttonEClass.getESuperTypes().add(this.getField());
		navButtonEClass.getESuperTypes().add(this.getButton());
		returnButtonEClass.getESuperTypes().add(this.getButton());
		showButtonEClass.getESuperTypes().add(this.getButton());
		closeButtonEClass.getESuperTypes().add(this.getButton());

		// Initialize classes, features, and operations; add parameters
		initEClass(wizardEClass, Wizard.class, "Wizard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWizard_Title(), ecorePackage.getEString(), "title", null, 1, 1, Wizard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWizard_InitialPage(), this.getPage(), null, "initialPage", null, 1, 1, Wizard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWizard_Pages(), this.getPage(), null, "pages", null, 0, -1, Wizard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		EOperation op = initEOperation(getWizard__PagesReturnButtons__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "pagesReturnButtons", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getWizard__InitialPageReturnButtons__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "initialPageReturnButtons", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getWizard__AtLeastCloseBtn__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "atLeastCloseBtn", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(pageEClass, Page.class, "Page", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPage_Checkbox(), this.getCheckBox(), null, "checkbox", null, 0, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPage_Buttons(), this.getButton(), null, "buttons", null, 0, -1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPage_TextFields(), this.getTextField(), null, "textFields", null, 0, -1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPage_Title(), ecorePackage.getEString(), "title", null, 0, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPage_Name(), ecorePackage.getEString(), "name", null, 0, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getPage__NotOnlyShowBtns__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "notOnlyShowBtns", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPage__NotSelfLoop__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "notSelfLoop", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPage__ButtonsDifferentLabel__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "buttonsDifferentLabel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(textFieldEClass, TextField.class, "TextField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextField_MinLength(), ecorePackage.getEInt(), "minLength", null, 0, 1, TextField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextField_MaxLength(), ecorePackage.getEInt(), "maxLength", null, 0, 1, TextField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getTextField__LabelSize__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "labelSize", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(checkBoxEClass, CheckBox.class, "CheckBox", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCheckBox_LabelSelected(), ecorePackage.getEBoolean(), "labelSelected", null, 1, 1, CheckBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(buttonEClass, Button.class, "Button", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getButton_TargetPage(), this.getPage(), null, "targetPage", null, 0, 1, Button.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getButton_OtherTargetPage(), this.getPage(), null, "otherTargetPage", null, 0, 1, Button.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getButton__LabelMaxSize__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "labelMaxSize", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(navButtonEClass, NavButton.class, "NavButton", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getNavButton__Navigate(), ecorePackage.getEOperation(), "navigate", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(returnButtonEClass, ReturnButton.class, "ReturnButton", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getReturnButton__Return_(), ecorePackage.getEOperation(), "return_", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(showButtonEClass, ShowButton.class, "ShowButton", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getShowButton_Message(), ecorePackage.getEString(), "message", null, 0, 1, ShowButton.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getShowButton__Show(), ecorePackage.getEOperation(), "show", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(closeButtonEClass, CloseButton.class, "CloseButton", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getCloseButton__Close(), ecorePackage.getEOperation(), "close", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(fieldEClass, Field.class, "Field", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getField_Label(), ecorePackage.getEString(), "label", null, 1, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
		// http://www.eclipse.org/OCL/Collection
		createCollectionAnnotations();
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
		  (wizardEClass,
		   source,
		   new String[] {
			   "constraints", "atLeastCloseBtn"
		   });
		addAnnotation
		  (pageEClass,
		   source,
		   new String[] {
			   "constraints", "buttonsDifferentLabel"
		   });
		addAnnotation
		  (textFieldEClass,
		   source,
		   new String[] {
			   "constraints", "labelSize"
		   });
		addAnnotation
		  (buttonEClass,
		   source,
		   new String[] {
			   "constraints", "labelMaxSize"
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
		  (getWizard__PagesReturnButtons__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t\tpages->forAll(p : Page |\n\t\t\tp <> self.initialPage implies p.buttons->one(b | b.oclIsTypeOf(ReturnButton))\n\t\t)"
		   });
		addAnnotation
		  (getWizard__InitialPageReturnButtons__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t\t\tself.initialPage.buttons->forAll(b | not b.oclIsTypeOf(ReturnButton))"
		   });
		addAnnotation
		  (getWizard__AtLeastCloseBtn__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "pages->forAll(p | \n\t\t\t(p.buttons->select(b | b.oclIsTypeOf(NavButton))->size()=0 \n\t\t\tand p.buttons->select(b | b.oclIsTypeOf(ReturnButton))->size()=0)\n\t\t\timplies p.buttons->select(b | b.oclIsTypeOf(CloseButton))->size()>0\n\t\t)"
		   });
		addAnnotation
		  (getPage__NotOnlyShowBtns__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t\t\tbuttons->select(b | b.oclIsTypeOf(ShowButton))->size() < buttons->size()"
		   });
		addAnnotation
		  (getPage__NotSelfLoop__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "buttons->select(b | \n\t\t\tb.oclIsTypeOf(NavButton))->forAll(b2 | b2.targetPage <> self\n\t\t)"
		   });
		addAnnotation
		  (getPage__ButtonsDifferentLabel__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "buttons->forAll(\n\t\t\tb1,b2 : Button | b1 <> b2 implies b1.label <> b2.label\n\t\t)"
		   });
		addAnnotation
		  (getTextField__LabelSize__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "(minLength <> null and maxLength <> null) implies\n\t\t(label.size() <= maxLength and label.size() >= minLength)"
		   });
		addAnnotation
		  (getButton__LabelMaxSize__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "label.size() <= 10"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Collection</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createCollectionAnnotations() {
		String source = "http://www.eclipse.org/OCL/Collection";
		addAnnotation
		  (getWizard_Pages(),
		   source,
		   new String[] {
			   "nullFree", "false"
		   });
		addAnnotation
		  (getPage_Buttons(),
		   source,
		   new String[] {
			   "nullFree", "false"
		   });
	}

} //WizardsPackageImpl
