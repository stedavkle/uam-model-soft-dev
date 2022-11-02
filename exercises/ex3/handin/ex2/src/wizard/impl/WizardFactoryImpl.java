/**
 */
package wizard.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import wizard.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WizardFactoryImpl extends EFactoryImpl implements WizardFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WizardFactory init() {
		try {
			WizardFactory theWizardFactory = (WizardFactory)EPackage.Registry.INSTANCE.getEFactory(WizardPackage.eNS_URI);
			if (theWizardFactory != null) {
				return theWizardFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new WizardFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WizardFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case WizardPackage.WIZARD: return createWizard();
			case WizardPackage.PAGE: return createPage();
			case WizardPackage.TEXT_FIELD: return createTextField();
			case WizardPackage.CHECKBOX: return createCheckbox();
			case WizardPackage.LABEL: return createLabel();
			case WizardPackage.BUTTON_NAVIGATE: return createButtonNavigate();
			case WizardPackage.BUTTON_RETURN: return createButtonReturn();
			case WizardPackage.BUTTON_SHOW: return createButtonShow();
			case WizardPackage.BUTTON_CLOSE: return createButtonClose();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Wizard createWizard() {
		WizardImpl wizard = new WizardImpl();
		return wizard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page createPage() {
		PageImpl page = new PageImpl();
		return page;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextField createTextField() {
		TextFieldImpl textField = new TextFieldImpl();
		return textField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Checkbox createCheckbox() {
		CheckboxImpl checkbox = new CheckboxImpl();
		return checkbox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Label createLabel() {
		LabelImpl label = new LabelImpl();
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ButtonNavigate createButtonNavigate() {
		ButtonNavigateImpl buttonNavigate = new ButtonNavigateImpl();
		return buttonNavigate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ButtonReturn createButtonReturn() {
		ButtonReturnImpl buttonReturn = new ButtonReturnImpl();
		return buttonReturn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ButtonShow createButtonShow() {
		ButtonShowImpl buttonShow = new ButtonShowImpl();
		return buttonShow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ButtonClose createButtonClose() {
		ButtonCloseImpl buttonClose = new ButtonCloseImpl();
		return buttonClose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WizardPackage getWizardPackage() {
		return (WizardPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static WizardPackage getPackage() {
		return WizardPackage.eINSTANCE;
	}

} //WizardFactoryImpl
