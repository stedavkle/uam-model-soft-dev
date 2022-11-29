/**
 */
package wizards;

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
 *   <li>{@link wizards.Page#getCheckbox <em>Checkbox</em>}</li>
 *   <li>{@link wizards.Page#getButtons <em>Buttons</em>}</li>
 *   <li>{@link wizards.Page#getTextFields <em>Text Fields</em>}</li>
 *   <li>{@link wizards.Page#getTitle <em>Title</em>}</li>
 *   <li>{@link wizards.Page#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see wizards.WizardsPackage#getPage()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='buttonsDifferentLabel'"
 * @generated
 */
public interface Page extends EObject {
	/**
	 * Returns the value of the '<em><b>Checkbox</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Checkbox</em>' containment reference.
	 * @see #setCheckbox(CheckBox)
	 * @see wizards.WizardsPackage#getPage_Checkbox()
	 * @model containment="true"
	 * @generated
	 */
	CheckBox getCheckbox();

	/**
	 * Sets the value of the '{@link wizards.Page#getCheckbox <em>Checkbox</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Checkbox</em>' containment reference.
	 * @see #getCheckbox()
	 * @generated
	 */
	void setCheckbox(CheckBox value);

	/**
	 * Returns the value of the '<em><b>Buttons</b></em>' containment reference list.
	 * The list contents are of type {@link wizards.Button}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Buttons</em>' containment reference list.
	 * @see wizards.WizardsPackage#getPage_Buttons()
	 * @model containment="true" ordered="false"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Button> getButtons();

	/**
	 * Returns the value of the '<em><b>Text Fields</b></em>' containment reference list.
	 * The list contents are of type {@link wizards.TextField}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Fields</em>' containment reference list.
	 * @see wizards.WizardsPackage#getPage_TextFields()
	 * @model containment="true"
	 * @generated
	 */
	EList<TextField> getTextFields();

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see wizards.WizardsPackage#getPage_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link wizards.Page#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see wizards.WizardsPackage#getPage_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link wizards.Page#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tbuttons-&gt;select(b | b.oclIsTypeOf(ShowButton))-&gt;size() &lt; buttons-&gt;size()'"
	 * @generated
	 */
	boolean notOnlyShowBtns(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='buttons-&gt;select(b | \n\t\t\tb.oclIsTypeOf(NavButton))-&gt;forAll(b2 | b2.targetPage &lt;&gt; self\n\t\t)'"
	 * @generated
	 */
	boolean notSelfLoop(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='buttons-&gt;forAll(\n\t\t\tb1,b2 : Button | b1 &lt;&gt; b2 implies b1.label &lt;&gt; b2.label\n\t\t)'"
	 * @generated
	 */
	boolean buttonsDifferentLabel(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Page
