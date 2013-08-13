package com.dll.util;

import java.beans.PropertyEditorSupport;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;



public class MyProperEditor extends PropertyEditorSupport {
   
	private final SimpleDateFormat sdf;
	private final boolean allowEmpty;
	private final int extractLength;
	
	
	public MyProperEditor(SimpleDateFormat sdf, boolean allowEmpty) {
		super();
		this.sdf = sdf;
		this.allowEmpty = allowEmpty;
		this.extractLength=-1;
	}
	

	public MyProperEditor(SimpleDateFormat sdf, boolean allowEmpty,
			int extractLength) {
		super();
		this.sdf = sdf;
		this.allowEmpty = allowEmpty;
		this.extractLength = extractLength;
	}


	@Override
	public String getAsText() {
	Date date=(Date)getValue();
	return date!=null?sdf.format(date):"";
	}

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
             if(allowEmpty&&isTextEmpty(text)){
            	 setValue(null);
             }else if(text != null && this.extractLength >= 0 && text.length() != this.extractLength){
            	 throw new IllegalArgumentException(
     					"Could not parse date: it is not exactly" + this.extractLength + "characters long");
             }else{
            	 try {
					Date date=sdf.parse(text);
					setValue(date);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
             }
		
	}


	private boolean isTextEmpty(String text) {
		// TODO Auto-generated method stub
		if(text==null||"".equals(text.trim())||text.replaceAll(" ", "").length()==0){
			return true;
		}
		return false;
	}

	

}
