/**
 */
package wizard;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Button</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wizard.Button#getLabel <em>Label</em>}</li>
 *   <li>{@link wizard.Button#getMyPage <em>My Page</em>}</li>
 * </ul>
 *
 * @see wizard.WizardPackage#getButton()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='maxLabelLength'"
 * @generated
 */
public interface Button extends EObject {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' containment reference.
	 * @see #setLabel(Label)
	 * @see wizard.WizardPackage#getButton_Label()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Label getLabel();

	/**
	 * Sets the value of the '{@link wizard.Button#getLabel <em>Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' containment reference.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(Label value);

	/**
	 * Returns the value of the '<em><b>My Page</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link wizard.Page#getButtons <em>Buttons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>My Page</em>' container reference.
	 * @see #setMyPage(Page)
	 * @see wizard.WizardPackage#getButton_MyPage()
	 * @see wizard.Page#getButtons
	 * @model opposite="buttons" required="true" transient="false"
	 * @generated
	 */
	Page getMyPage();

	/**
	 * Sets the value of the '{@link wizard.Button#getMyPage <em>My Page</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>My Page</em>' container reference.
	 * @see #getMyPage()
	 * @generated
	 */
	void setMyPage(Page value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='label.text.size() &lt;= 10'"
	 * @generated
	 */
	boolean maxLabelLength(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Button
