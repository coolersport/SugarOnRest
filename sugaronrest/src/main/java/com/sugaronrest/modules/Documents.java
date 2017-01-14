/**
* <auto-generated />
* This file was generated by a StringTemplate 4 template.
* Don't change it directly as your change would get overwritten.  Instead, make changes
* to the .stg file (i.e. the StringTemplate 4 template) and save it to regenerate this file.
*
* For more infor on StringTemplate 4 template please go to -
* https://github.com/antlr/antlrcs
*
* @author  Kola Oyewumi
* @version 1.0
* @since   2017-01-03
*
* A class which represents the documents table.
*/

package com.sugaronrest.modules;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.sugaronrest.restapicalls.Module;
import com.sugaronrest.restapicalls.CustomDateDeserializer;
import com.sugaronrest.restapicalls.CustomDateSerializer;

import java.util.Date;

@Module(name = "Documents", tablename = "documents")
@JsonRootName(value = "documents")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Documents {
    public String getId() {
        return id;
    }

    public void setId(String value) {
        id = value;
    }
    public Date getDateEntered() {
        return dateEntered;
    }

    public void setDateEntered(Date value) {
        dateEntered = value;
    }
    public Date getDateModified() {
        return dateModified;
    }

    public void setDateModified(Date value) {
        dateModified = value;
    }
    public String getModifiedUserId() {
        return modifiedUserId;
    }

    public void setModifiedUserId(String value) {
        modifiedUserId = value;
    }
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String value) {
        createdBy = value;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String value) {
        description = value;
    }
    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer value) {
        deleted = value;
    }
    public String getAssignedUserId() {
        return assignedUserId;
    }

    public void setAssignedUserId(String value) {
        assignedUserId = value;
    }
    public String getDocumentName() {
        return documentName;
    }

    public void setDocumentName(String value) {
        documentName = value;
    }
    public String getDocId() {
        return docId;
    }

    public void setDocId(String value) {
        docId = value;
    }
    public String getDocType() {
        return docType;
    }

    public void setDocType(String value) {
        docType = value;
    }
    public String getDocUrl() {
        return docUrl;
    }

    public void setDocUrl(String value) {
        docUrl = value;
    }
    public Date getActiveDate() {
        return activeDate;
    }

    public void setActiveDate(Date value) {
        activeDate = value;
    }
    public Date getExpDate() {
        return expDate;
    }

    public void setExpDate(Date value) {
        expDate = value;
    }
    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String value) {
        categoryId = value;
    }
    public String getSubcategoryId() {
        return subcategoryId;
    }

    public void setSubcategoryId(String value) {
        subcategoryId = value;
    }
    public String getStatusId() {
        return statusId;
    }

    public void setStatusId(String value) {
        statusId = value;
    }
    public String getDocumentRevisionId() {
        return documentRevisionId;
    }

    public void setDocumentRevisionId(String value) {
        documentRevisionId = value;
    }
    public String getRelatedDocId() {
        return relatedDocId;
    }

    public void setRelatedDocId(String value) {
        relatedDocId = value;
    }
    public String getRelatedDocRevId() {
        return relatedDocRevId;
    }

    public void setRelatedDocRevId(String value) {
        relatedDocRevId = value;
    }
    public Integer getIsTemplate() {
        return isTemplate;
    }

    public void setIsTemplate(Integer value) {
        isTemplate = value;
    }
    public String getTemplateType() {
        return templateType;
    }

    public void setTemplateType(String value) {
        templateType = value;
    }

    @JsonProperty("id")
    private String id;
  
    @JsonProperty("date_entered")
    @JsonDeserialize(using = CustomDateDeserializer.class)
    @JsonSerialize(using = CustomDateSerializer.class)
    private Date dateEntered;
  
    @JsonProperty("date_modified")
    @JsonDeserialize(using = CustomDateDeserializer.class)
    @JsonSerialize(using = CustomDateSerializer.class)
    private Date dateModified;
  
    @JsonProperty("modified_user_id")
    private String modifiedUserId;
  
    @JsonProperty("created_by")
    private String createdBy;
  
    @JsonProperty("description")
    private String description;
  
    @JsonProperty("deleted")
    private Integer deleted;
  
    @JsonProperty("assigned_user_id")
    private String assignedUserId;
  
    @JsonProperty("document_name")
    private String documentName;
  
    @JsonProperty("doc_id")
    private String docId;
  
    @JsonProperty("doc_type")
    private String docType;
  
    @JsonProperty("doc_url")
    private String docUrl;
  
    @JsonProperty("active_date")
    @JsonDeserialize(using = CustomDateDeserializer.class)
    @JsonSerialize(using = CustomDateSerializer.class)
    private Date activeDate;
  
    @JsonProperty("exp_date")
    @JsonDeserialize(using = CustomDateDeserializer.class)
    @JsonSerialize(using = CustomDateSerializer.class)
    private Date expDate;
  
    @JsonProperty("category_id")
    private String categoryId;
  
    @JsonProperty("subcategory_id")
    private String subcategoryId;
  
    @JsonProperty("status_id")
    private String statusId;
  
    @JsonProperty("document_revision_id")
    private String documentRevisionId;
  
    @JsonProperty("related_doc_id")
    private String relatedDocId;
  
    @JsonProperty("related_doc_rev_id")
    private String relatedDocRevId;
  
    @JsonProperty("is_template")
    private Integer isTemplate;
  
    @JsonProperty("template_type")
    private String templateType;
  
}