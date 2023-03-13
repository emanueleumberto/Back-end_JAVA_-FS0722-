package com.springSecretCode.configuration;

import org.springframework.context.annotation.Configuration;

import jakarta.persistence.AttributeConverter;

@Configuration
public class SecretCodeConverter implements AttributeConverter<String, String> {

	Character[] arr = {'C', 'M', 'P', 'Q', 'L', 'R', 'O', 'E', 'X', 'U'};
	
	@Override
	public String convertToDatabaseColumn(String attribute) {
		//"123"
		String result = "";
		if(attribute == null) {
			return result;
		}
		
		for (char c : attribute.toCharArray()) { // ['1','2','3']
			String sc = c+""; // "1" / "2" / "3"
			int num = Integer.parseInt(sc); // 1 - 2 - 3
			//result += (num+3);
			result += arr[num];
		}
		
		return result; // "456" // "MPQ"
	}

	@Override
	public String convertToEntityAttribute(String dbData) {
		
		// "MPQ"
		String result = "";
		if(dbData == null) {
			return result;
		}
				
		for (char c : dbData.toCharArray()) { // ['M', 'P', 'Q']
			//String sc = c+"";
			//int num = Integer.parseInt(sc); 
			//result += (num-3);
			for (int i = 0; i < arr.length; i++) {
				if(arr[i].equals(c)) {
					result += i;
				}
			}
			
		}
				
		return result; 
	}

}
