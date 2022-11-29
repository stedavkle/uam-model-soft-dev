/**
 */
package wizards;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Button</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wizards.Button#getTargetPage <em>Target Page</em>}</li>
 *   <li>{@link wizards.Button#getOtherTargetPage <em>Other Target Page</em>}</li>
 * </ul>
 *
 * @see wizards.WizardsPackage#getButton()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='labelMaxSize'"
 * @generated
 */
public interface Button extends Field {
	/**
	 * Returns the value of the '<em><b>Target Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Page</em>' reference.
	 * @see #setTargetPage(Page)
	 * @see wizards.WizardsPackage#getButton_TargetPage()
	 * @model
	 * @generated
	 */
	Page getTargetPage();

	/**
	 * Sets the value of the '{@link wizards.Button#getTargetPage <em>Target Page</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Page</em>' reference.
	 * @see #getTargetPage()
	 * @generated
	 */
	void setTargetPage(Page value);

	/**
	 * Returns the value of the '<em><b>Other Target Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Target Page</em>' reference.
	 * @see #setOtherTargetPage(Page)
	 * @see wizards.WizardsPackage#getButton_OtherTargetPage()
	 * @model
	 * @generated
	 */
	Page getOtherTargetPage();

	/**
	 * Sets the value of the '{@link wizards.Button#getOtherTargetPage <em>Other Target Page</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Target Page</em>' reference.
	 * @see #getOtherTargetPage()
	 * @generated
	 */
	void setOtherTargetPage(Page value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='label.size() &lt;= 10'"
	 * @generated
	 */
	boolean labelMaxSize(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Button
