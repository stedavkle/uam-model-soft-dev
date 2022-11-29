/**
 */
package wizards;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wizards.TextField#getMinLength <em>Min Length</em>}</li>
 *   <li>{@link wizards.TextField#getMaxLength <em>Max Length</em>}</li>
 * </ul>
 *
 * @see wizards.WizardsPackage#getTextField()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='labelSize'"
 * @generated
 */
public interface TextField extends Field {
	/**
	 * Returns the value of the '<em><b>Min Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Length</em>' attribute.
	 * @see #setMinLength(int)
	 * @see wizards.WizardsPackage#getTextField_MinLength()
	 * @model
	 * @generated
	 */
	int getMinLength();

	/**
	 * Sets the value of the '{@link wizards.TextField#getMinLength <em>Min Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Length</em>' attribute.
	 * @see #getMinLength()
	 * @generated
	 */
	void setMinLength(int value);

	/**
	 * Returns the value of the '<em><b>Max Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Length</em>' attribute.
	 * @see #setMaxLength(int)
	 * @see wizards.WizardsPackage#getTextField_MaxLength()
	 * @model
	 * @generated
	 */
	int getMaxLength();

	/**
	 * Sets the value of the '{@link wizards.TextField#getMaxLength <em>Max Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Length</em>' attribute.
	 * @see #getMaxLength()
	 * @generated
	 */
	void setMaxLength(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='(minLength &lt;&gt; null and maxLength &lt;&gt; null) implies\n\t\t(label.size() &lt;= maxLength and label.size() &gt;= minLength)'"
	 * @generated
	 */
	boolean labelSize(DiagnosticChain diagnostics, Map<Object, Object> context);

} // TextField
