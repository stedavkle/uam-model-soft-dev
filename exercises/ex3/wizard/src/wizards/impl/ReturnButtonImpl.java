/**
 */
package wizards.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;

import wizards.ReturnButton;
import wizards.WizardsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Return Button</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ReturnButtonImpl extends ButtonImpl implements ReturnButton {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReturnButtonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WizardsPackage.Literals.RETURN_BUTTON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation return_() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented /ejemplo/metamodel/wizards.ecore!ReturnButton!return()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case WizardsPackage.RETURN_BUTTON___RETURN_:
				return return_();
		}
		return super.eInvoke(operationID, arguments);
	}

} //ReturnButtonImpl
