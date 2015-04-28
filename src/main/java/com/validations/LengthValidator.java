package com.validations;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;


@FacesValidator(value="lengthValidator")
public class LengthValidator implements Validator{

	@Override
	public void validate(FacesContext context, UIComponent component,
			Object value) throws ValidatorException {
			int age = (int) value;
			if(age <= 30 && age >=18 ){
			}else{
				FacesMessage message 
				= new FacesMessage(/*"Not a valid age - must be between 18-30"*/);
				//throw new ValidatorException(message);
			}
	}

	
}
