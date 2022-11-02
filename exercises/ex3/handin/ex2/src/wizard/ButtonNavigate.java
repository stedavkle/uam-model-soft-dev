/**
 */
package wizard;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Button Navigate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wizard.ButtonNavigate#getNextPage <em>Next Page</em>}</li>
 *   <li>{@link wizard.ButtonNavigate#getNextPageAlt <em>Next Page Alt</em>}</li>
 * </ul>
 *
 * @see wizard.WizardPackage#getButtonNavigate()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='myPageDifferNextPage'"
 * @generated
 */
public interface ButtonNavigate extends Button {
	/**
	 * Returns the value of the '<em><b>Next Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Page</em>' reference.
	 * @see #setNextPage(Page)
	 * @see wizard.WizardPackage#getButtonNavigate_NextPage()
	 * @model required="true"
	 * @generated
	 */
	Page getNextPage();

	/**
	 * Sets the value of the '{@link wizard.ButtonNavigate#getNextPage <em>Next Page</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Page</em>' reference.
	 * @see #getNextPage()
	 * @generated
	 */
	void setNextPage(Page value);

	/**
	 * Returns the value of the '<em><b>Next Page Alt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Page Alt</em>' reference.
	 * @see #setNextPageAlt(Page)
	 * @see wizard.WizardPackage#getButtonNavigate_NextPageAlt()
	 * @model
	 * @generated
	 */
	Page getNextPageAlt();

	/**
	 * Sets the value of the '{@link wizard.ButtonNavigate#getNextPageAlt <em>Next Page Alt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Page Alt</em>' reference.
	 * @see #getNextPageAlt()
	 * @generated
	 */
	void setNextPageAlt(Page value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.myPage &lt;&gt; self.nextPage and self.myPage &lt;&gt; self.nextPageAlt'"
	 * @generated
	 */
	boolean myPageDifferNextPage(DiagnosticChain diagnostics, Map<Object, Object> context);

} // ButtonNavigate
