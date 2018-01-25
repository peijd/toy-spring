package toys.beans;

import java.util.ArrayList;
import java.util.List;


public class PropertyValues {

	private List<PropertyValue> propertyValueList = new ArrayList<>();
	
	
	public void addPropertyValue(PropertyValue propertyValue) {
		this.propertyValueList.add(propertyValue);
	}


	public List<PropertyValue> getPropertyValues() {
		return propertyValueList;
	}
}
