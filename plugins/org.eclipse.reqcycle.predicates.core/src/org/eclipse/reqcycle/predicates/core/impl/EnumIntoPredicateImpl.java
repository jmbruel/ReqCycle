/**
 */
package org.eclipse.reqcycle.predicates.core.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.reqcycle.predicates.core.PredicatesPackage;
import org.eclipse.reqcycle.predicates.core.api.EnumIntoPredicate;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enum Into Predicate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 * 
 * @generated
 */
public class EnumIntoPredicateImpl extends IntoPredicateImpl<String> implements EnumIntoPredicate {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EnumIntoPredicateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PredicatesPackage.Literals.ENUM_INTO_PREDICATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * 
	 * @generated
	 */
	@Override
	public void setInput(String newInput) {
		super.setInput(newInput);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific element type known in this context.
	 * 
	 * @generated
	 */
	@Override
	public EList<String> getAllowedEntries() {
		if(allowedEntries == null) {
			allowedEntries = new EDataTypeUniqueEList<String>(String.class, this, PredicatesPackage.ENUM_INTO_PREDICATE__ALLOWED_ENTRIES);
		}
		return allowedEntries;
	}

	@Override
	public boolean match(Object input) {
		Object inputValue = this.getInputValueFromEObject(input);
		if(inputValue instanceof EEnumLiteral) {
			return getAllowedEntries().contains(((EEnumLiteral)inputValue).getLiteral());
		}
		return false;
	}

} //EnumIntoPredicateImpl
