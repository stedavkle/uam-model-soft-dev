/**
 */
package wizards;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Check Box</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wizards.CheckBox#isLabelSelected <em>Label Selected</em>}</li>
 * </ul>
 *
 * @see wizards.WizardsPackage#getCheckBox()
 * @model
 * @generated
 */
public interface CheckBox extends Field {
	/**
	 * Returns the value of the '<em><b>Label Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label Selected</em>' attribute.
	 * @see #setLabelSelected(boolean)
	 * @see wizards.WizardsPackage#getCheckBox_LabelSelected()
	 * @model required="true"
	 * @generated
	 */
	boolean isLabelSelected();

	/**
	 * Sets the value of the '{@link wizards.CheckBox#isLabelSelected <em>Label Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label Selected</em>' attribute.
	 * @see #isLabelSelected()
	 * @generated
	 */
	void setLabelSelected(boolean value);

} // CheckBox
