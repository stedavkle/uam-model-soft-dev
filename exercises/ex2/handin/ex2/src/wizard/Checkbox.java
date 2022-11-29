/**
 */
package wizard;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Checkbox</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wizard.Checkbox#isSelected <em>Selected</em>}</li>
 *   <li>{@link wizard.Checkbox#getLabel <em>Label</em>}</li>
 * </ul>
 *
 * @see wizard.WizardPackage#getCheckbox()
 * @model
 * @generated
 */
public interface Checkbox extends EObject {
	/**
	 * Returns the value of the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selected</em>' attribute.
	 * @see #setSelected(boolean)
	 * @see wizard.WizardPackage#getCheckbox_Selected()
	 * @model required="true"
	 * @generated
	 */
	boolean isSelected();

	/**
	 * Sets the value of the '{@link wizard.Checkbox#isSelected <em>Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selected</em>' attribute.
	 * @see #isSelected()
	 * @generated
	 */
	void setSelected(boolean value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' containment reference.
	 * @see #setLabel(Label)
	 * @see wizard.WizardPackage#getCheckbox_Label()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Label getLabel();

	/**
	 * Sets the value of the '{@link wizard.Checkbox#getLabel <em>Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' containment reference.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(Label value);

} // Checkbox
