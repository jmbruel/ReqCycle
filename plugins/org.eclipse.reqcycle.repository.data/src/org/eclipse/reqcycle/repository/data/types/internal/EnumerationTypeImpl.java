package org.eclipse.reqcycle.repository.data.types.internal;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.reqcycle.repository.data.types.EnumerationType;
import org.eclipse.reqcycle.repository.data.types.EnumeratorType;


public class EnumerationTypeImpl implements EnumerationType {

	protected EEnum eEnum;
	
	protected Collection<EnumeratorType> enumerators = new ArrayList<EnumeratorType>();
	
	public EnumerationTypeImpl(String name) {
		eEnum = EcoreFactory.eINSTANCE.createEEnum();
		eEnum.setName(name);
	}
	
	protected EnumerationTypeImpl(EEnum eEnum) {
		this.eEnum = eEnum;
		for(EEnumLiteral eLiteral : eEnum.getELiterals()) {
			enumerators.add(new EnumeratorTypeImpl(eLiteral));
		}
	}
	
	@Override
	public void addEnumeratorType(EnumeratorType enumerator) {
		eEnum.getELiterals().add(((EnumeratorTypeImpl)enumerator).getEEnumLiteral());
		enumerators.add(enumerator);
	}

	@Override
	public String getName() {
		return eEnum.getName();
	}

	@Override
	public Collection<EnumeratorType> getAttributes() {
		return enumerators;
	}
	
	public String getModelNsURI() {
		return eEnum.getEPackage()!=null?eEnum.getEPackage().getNsURI():null;	
	}

	@Override
	public EDataType getEDataType() {
		return eEnum;
	}
}