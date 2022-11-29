/**
 */
package wizard;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Button Return</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wizard.ButtonReturn#getPreviousPage <em>Previous Page</em>}</li>
 * </ul>
 *
 * @see wizard.WizardPackage#getButtonReturn()
 * @model
 * @generated
 */
public interface ButtonReturn extends Button {
	/**
	 * Returns the value of the '<em><b>Previous Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous Page</em>' reference.
	 * @see #setPreviousPage(Page)
	 * @see wizard.WizardPackage#getButtonReturn_PreviousPage()
	 * @model required="true"
	 * @generated
	 */
	Page getPreviousPage();

	/**
	 * Sets the value of the '{@link wizard.ButtonReturn#getPreviousPage <em>Previous Page</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous Page</em>' reference.
	 * @see #getPreviousPage()
	 * @generated
	 */
	void setPreviousPage(Page value);

} // ButtonReturn
