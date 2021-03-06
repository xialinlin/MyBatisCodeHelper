package com.ccnode.codegenerator.pojo;

import java.util.Map;

/**
 * Created by bruce.ge on 2016/12/12.
 */
public class MethodXmlPsiInfo {

    private String methodName;

    private FieldToColumnRelation relation;


    private String tableName;

    private Map<String, String> fieldMap;

    private String psiClassName;


    public Map<String, String> getFieldMap() {
        return fieldMap;
    }

    public void setFieldMap(Map<String, String> fieldMap) {
        this.fieldMap = fieldMap;
    }

    public String getPsiClassName() {
        return psiClassName;
    }

    public void setPsiClassName(String psiClassName) {
        this.psiClassName = psiClassName;
    }

    public FieldToColumnRelation getRelation() {
        return relation;
    }

    public void setRelation(FieldToColumnRelation relation) {
        this.relation = relation;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }
}
