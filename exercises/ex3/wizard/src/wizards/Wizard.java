/**
 */
package wizards;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wizard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wizards.Wizard#getTitle <em>Title</em>}</li>
 *   <li>{@link wizards.Wizard#getInitialPage <em>Initial Page</em>}</li>
 *   <li>{@link wizards.Wizard#getPages <em>Pages</em>}</li>
 * </ul>
 *
 * @see wizards.WizardsPackage#getWizard()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='atLeastCloseBtn'"
 * @generated
 */
public interface Wizard extends EObject {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see wizards.WizardsPackage#getWizard_Title()
	 * @model required="true"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link wizards.Wizard#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Initial Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Page</em>' reference.
	 * @see #setInitialPage(Page)
	 * @see wizards.WizardsPackage#getWizard_InitialPage()
	 * @model required="true"
	 * @generated
	 */
	Page getInitialPage();

	/**
	 * Sets the value of the '{@link wizards.Wizard#getInitialPage <em>Initial Page</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Page</em>' reference.
	 * @see #getInitialPage()
	 * @generated
	 */
	void setInitialPage(Page value);

	/**
	 * Returns the value of the '<em><b>Pages</b></em>' containment reference list.
	 * The list contents are of type {@link wizards.Page}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pages</em>' containment reference list.
	 * @see wizards.WizardsPackage#getWizard_Pages()
	 * @model containment="true" ordered="false"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Page> getPages();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\tpages-&gt;forAll(p : Page |\n\t\t\tp &lt;&gt; self.initialPage implies p.buttons-&gt;one(b | b.oclIsTypeOf(ReturnButton))\n\t\t)'"
	 * @generated
	 */
	boolean pagesReturnButtons(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tself.initialPage.buttons-&gt;forAll(b | not b.oclIsTypeOf(ReturnButton))'"
	 * @generated
	 */
	boolean initialPageReturnButtons(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='pages-&gt;forAll(p | \n\t\t\t(p.buttons-&gt;select(b | b.oclIsTypeOf(NavButton))-&gt;size()=0 \n\t\t\tand p.buttons-&gt;select(b | b.oclIsTypeOf(ReturnButton))-&gt;size()=0)\n\t\t\timplies p.buttons-&gt;select(b | b.oclIsTypeOf(CloseButton))-&gt;size()&gt;0\n\t\t)'"
	 * @generated
	 */
	boolean atLeastCloseBtn(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Wizard
