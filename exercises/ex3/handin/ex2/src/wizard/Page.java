/**
 */
package wizard;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wizard.Page#isInit <em>Init</em>}</li>
 *   <li>{@link wizard.Page#getTextfields <em>Textfields</em>}</li>
 *   <li>{@link wizard.Page#getCheckbox <em>Checkbox</em>}</li>
 *   <li>{@link wizard.Page#getButtons <em>Buttons</em>}</li>
 * </ul>
 *
 * @see wizard.WizardPackage#getPage()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='returnButtonsInv'"
 * @generated
 */
public interface Page extends EObject {
	/**
	 * Returns the value of the '<em><b>Init</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init</em>' attribute.
	 * @see #setInit(boolean)
	 * @see wizard.WizardPackage#getPage_Init()
	 * @model required="true"
	 * @generated
	 */
	boolean isInit();

	/**
	 * Sets the value of the '{@link wizard.Page#isInit <em>Init</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init</em>' attribute.
	 * @see #isInit()
	 * @generated
	 */
	void setInit(boolean value);

	/**
	 * Returns the value of the '<em><b>Textfields</b></em>' containment reference list.
	 * The list contents are of type {@link wizard.TextField}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Textfields</em>' containment reference list.
	 * @see wizard.WizardPackage#getPage_Textfields()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TextField> getTextfields();

	/**
	 * Returns the value of the '<em><b>Checkbox</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Checkbox</em>' containment reference.
	 * @see #setCheckbox(Checkbox)
	 * @see wizard.WizardPackage#getPage_Checkbox()
	 * @model containment="true"
	 * @generated
	 */
	Checkbox getCheckbox();

	/**
	 * Sets the value of the '{@link wizard.Page#getCheckbox <em>Checkbox</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Checkbox</em>' containment reference.
	 * @see #getCheckbox()
	 * @generated
	 */
	void setCheckbox(Checkbox value);

	/**
	 * Returns the value of the '<em><b>Buttons</b></em>' containment reference list.
	 * The list contents are of type {@link wizard.Button}.
	 * It is bidirectional and its opposite is '{@link wizard.Button#getMyPage <em>My Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Buttons</em>' containment reference list.
	 * @see wizard.WizardPackage#getPage_Buttons()
	 * @see wizard.Button#getMyPage
	 * @model opposite="myPage" containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<Button> getButtons();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='buttons-&gt;select(b | b.oclIsTypeOf(ButtonShow))-&gt;size() &lt; buttons-&gt;size()'"
	 * @generated
	 */
	boolean notOnlyMessageButton(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Page.allInstances()-&gt;one(init)'"
	 * @generated
	 */
	boolean oneInitPage(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='(buttons-&gt;select(b | b.oclIsTypeOf(ButtonReturn) or b.oclIsTypeOf(ButtonNavigate))-&gt;size() = 0)\n\t\t\t\t\t\t\t\t\t\timplies buttons-&gt;one(b | b.oclIsTypeOf(ButtonClose))'"
	 * @generated
	 */
	boolean noRetNavThenClose(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='buttons-&gt;isUnique(b | b.label.text)'"
	 * @generated
	 */
	boolean noSimilarButtons(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='not init and buttons-&gt;select(b | b.oclIsTypeOf(ButtonReturn))-&gt;size() &lt;= 1 or buttons-&gt;select(b | b.oclIsTypeOf(ButtonReturn))-&gt;size() &lt; 1'"
	 * @generated
	 */
	boolean returnButtonsInv(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Page
