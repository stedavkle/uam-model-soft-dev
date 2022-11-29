/**
 */
package wizards.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;

import wizards.NavButton;
import wizards.WizardsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nav Button</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class NavButtonImpl extends ButtonImpl implements NavButton {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NavButtonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WizardsPackage.Literals.NAV_BUTTON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation navigate() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented /ejemplo/metamodel/wizards.ecore!NavButton!navigate()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case WizardsPackage.NAV_BUTTON___NAVIGATE:
				return navigate();
		}
		return super.eInvoke(operationID, arguments);
	}

} //NavButtonImpl
