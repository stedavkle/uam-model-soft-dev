/**
 */
package wizards.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;

import wizards.CloseButton;
import wizards.WizardsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Close Button</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CloseButtonImpl extends ButtonImpl implements CloseButton {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CloseButtonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WizardsPackage.Literals.CLOSE_BUTTON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation close() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented /ejemplo/metamodel/wizards.ecore!CloseButton!close()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case WizardsPackage.CLOSE_BUTTON___CLOSE:
				return close();
		}
		return super.eInvoke(operationID, arguments);
	}

} //CloseButtonImpl
