/*******************************************************************************
 * Copyright (c) 2012 Original authors and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Original authors and others - initial API and implementation
 ******************************************************************************/

package org.eclipse.reqcycle.traceability.table.providers;

import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.reqcycle.traceability.model.Link;
import org.eclipse.reqcycle.traceability.types.ui.IStylePredicateProvider;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;


public abstract class LinkLabelProvider extends ColumnLabelProvider {

	IStylePredicateProvider styleProvider;
	
	public LinkLabelProvider(IStylePredicateProvider styleProvider) {
		this.styleProvider = styleProvider;
	}
	
	@Override
	public Font getFont(Object element) {
		try{
			if (element instanceof Link){
				return styleProvider.getFontForRelation((Link) element);
			}
		} catch (Exception e){
			e.printStackTrace();
		}
		return super.getFont(element);
	}
	
	@Override
	public Color getForeground(Object element) {
		try{
			if (element instanceof Link){
				return styleProvider.getColorForRelation((Link) element);
			}
		} catch (Exception e){
			e.printStackTrace();
		}
		return super.getForeground(element);
	}
	
}
