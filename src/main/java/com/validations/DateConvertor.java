package com.validations;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.inject.Inject;


@FacesConverter("dateConvertor")
public class DateConvertor implements Converter {

	@Inject 
	EmployeeBean employeeBean;
	
	@Override
	public Object getAsObject(FacesContext context, UIComponent component,
			String value) {
		return employeeBean.getRetirementDate();
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component,
			Object value) {
		return employeeBean.getRetirementDate().toString();
	}

}
