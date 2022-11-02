/**
 */
package wizard;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Button Close</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wizard.ButtonClose#getWizard <em>Wizard</em>}</li>
 * </ul>
 *
 * @see wizard.WizardPackage#getButtonClose()
 * @model
 * @generated
 */
public interface ButtonClose extends Button {
	/**
	 * Returns the value of the '<em><b>Wizard</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wizard</em>' reference.
	 * @see #setWizard(Wizard)
	 * @see wizard.WizardPackage#getButtonClose_Wizard()
	 * @model required="true"
	 * @generated
	 */
	Wizard getWizard();

	/**
	 * Sets the value of the '{@link wizard.ButtonClose#getWizard <em>Wizard</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wizard</em>' reference.
	 * @see #getWizard()
	 * @generated
	 */
	void setWizard(Wizard value);

} // ButtonClose
