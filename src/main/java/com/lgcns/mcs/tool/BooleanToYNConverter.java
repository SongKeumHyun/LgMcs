/**
*
* @FileName
* s.java
* @Project
* LgMcs
* @Date
* 2022. 10. 16.
* @Writter
* kumh2
* @EditHistory
*
* @Discript
*
*/
package com.lgcns.mcs.tool;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

/**
*
* @Package_name
* com.lgcns.mcs.interfaces
* @file_name
* s.java
* @Date
* 2022. 10. 16.
* @EditHistory
*
* @Discript
*
*/
@Converter
public class BooleanToYNConverter implements AttributeConverter<Boolean, String>{
    @Override
    public String convertToDatabaseColumn(Boolean attribute){
        return (attribute != null && attribute) ? "Y" : "N";
    }

    @Override
    public Boolean convertToEntityAttribute(String dbData){
        return "Y".equals(dbData);
    }
}