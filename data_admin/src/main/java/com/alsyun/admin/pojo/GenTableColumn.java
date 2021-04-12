package com.alsyun.admin.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/****
 * @Author:Markburt
 * @Description:GenTableColumn构建
 * @Date 2019/6/14 19:13
 *****/
@ApiModel(description = "GenTableColumn",value = "GenTableColumn")
@Table(name="gen_table_column")
public class GenTableColumn implements Serializable{

	@ApiModelProperty(value = "编号",required = false)
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "column_id")
	private Long columnId;//编号

	@ApiModelProperty(value = "归属表编号",required = false)
    @Column(name = "table_id")
	private String tableId;//归属表编号

	@ApiModelProperty(value = "列名称",required = false)
    @Column(name = "column_name")
	private String columnName;//列名称

	@ApiModelProperty(value = "列描述",required = false)
    @Column(name = "column_comment")
	private String columnComment;//列描述

	@ApiModelProperty(value = "列类型",required = false)
    @Column(name = "column_type")
	private String columnType;//列类型

	@ApiModelProperty(value = "JAVA类型",required = false)
    @Column(name = "java_type")
	private String javaType;//JAVA类型

	@ApiModelProperty(value = "JAVA字段名",required = false)
    @Column(name = "java_field")
	private String javaField;//JAVA字段名

	@ApiModelProperty(value = "是否主键（1是）",required = false)
    @Column(name = "is_pk")
	private String isPk;//是否主键（1是）

	@ApiModelProperty(value = "是否自增（1是）",required = false)
    @Column(name = "is_increment")
	private String isIncrement;//是否自增（1是）

	@ApiModelProperty(value = "是否必填（1是）",required = false)
    @Column(name = "is_required")
	private String isRequired;//是否必填（1是）

	@ApiModelProperty(value = "是否为插入字段（1是）",required = false)
    @Column(name = "is_insert")
	private String isInsert;//是否为插入字段（1是）

	@ApiModelProperty(value = "是否编辑字段（1是）",required = false)
    @Column(name = "is_edit")
	private String isEdit;//是否编辑字段（1是）

	@ApiModelProperty(value = "是否列表字段（1是）",required = false)
    @Column(name = "is_list")
	private String isList;//是否列表字段（1是）

	@ApiModelProperty(value = "是否查询字段（1是）",required = false)
    @Column(name = "is_query")
	private String isQuery;//是否查询字段（1是）

	@ApiModelProperty(value = "查询方式（等于、不等于、大于、小于、范围）",required = false)
    @Column(name = "query_type")
	private String queryType;//查询方式（等于、不等于、大于、小于、范围）

	@ApiModelProperty(value = "显示类型（文本框、文本域、下拉框、复选框、单选框、日期控件）",required = false)
    @Column(name = "html_type")
	private String htmlType;//显示类型（文本框、文本域、下拉框、复选框、单选框、日期控件）

	@ApiModelProperty(value = "字典类型",required = false)
    @Column(name = "dict_type")
	private String dictType;//字典类型

	@ApiModelProperty(value = "排序",required = false)
    @Column(name = "sort")
	private Integer sort;//排序

	@ApiModelProperty(value = "创建者",required = false)
    @Column(name = "create_by")
	private String createBy;//创建者

	@ApiModelProperty(value = "创建时间",required = false)
    @Column(name = "create_time")
	private Date createTime;//创建时间

	@ApiModelProperty(value = "更新者",required = false)
    @Column(name = "update_by")
	private String updateBy;//更新者

	@ApiModelProperty(value = "更新时间",required = false)
    @Column(name = "update_time")
	private Date updateTime;//更新时间



	//get方法
	public Long getColumnId() {
		return columnId;
	}

	//set方法
	public void setColumnId(Long columnId) {
		this.columnId = columnId;
	}
	//get方法
	public String getTableId() {
		return tableId;
	}

	//set方法
	public void setTableId(String tableId) {
		this.tableId = tableId;
	}
	//get方法
	public String getColumnName() {
		return columnName;
	}

	//set方法
	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}
	//get方法
	public String getColumnComment() {
		return columnComment;
	}

	//set方法
	public void setColumnComment(String columnComment) {
		this.columnComment = columnComment;
	}
	//get方法
	public String getColumnType() {
		return columnType;
	}

	//set方法
	public void setColumnType(String columnType) {
		this.columnType = columnType;
	}
	//get方法
	public String getJavaType() {
		return javaType;
	}

	//set方法
	public void setJavaType(String javaType) {
		this.javaType = javaType;
	}
	//get方法
	public String getJavaField() {
		return javaField;
	}

	//set方法
	public void setJavaField(String javaField) {
		this.javaField = javaField;
	}
	//get方法
	public String getIsPk() {
		return isPk;
	}

	//set方法
	public void setIsPk(String isPk) {
		this.isPk = isPk;
	}
	//get方法
	public String getIsIncrement() {
		return isIncrement;
	}

	//set方法
	public void setIsIncrement(String isIncrement) {
		this.isIncrement = isIncrement;
	}
	//get方法
	public String getIsRequired() {
		return isRequired;
	}

	//set方法
	public void setIsRequired(String isRequired) {
		this.isRequired = isRequired;
	}
	//get方法
	public String getIsInsert() {
		return isInsert;
	}

	//set方法
	public void setIsInsert(String isInsert) {
		this.isInsert = isInsert;
	}
	//get方法
	public String getIsEdit() {
		return isEdit;
	}

	//set方法
	public void setIsEdit(String isEdit) {
		this.isEdit = isEdit;
	}
	//get方法
	public String getIsList() {
		return isList;
	}

	//set方法
	public void setIsList(String isList) {
		this.isList = isList;
	}
	//get方法
	public String getIsQuery() {
		return isQuery;
	}

	//set方法
	public void setIsQuery(String isQuery) {
		this.isQuery = isQuery;
	}
	//get方法
	public String getQueryType() {
		return queryType;
	}

	//set方法
	public void setQueryType(String queryType) {
		this.queryType = queryType;
	}
	//get方法
	public String getHtmlType() {
		return htmlType;
	}

	//set方法
	public void setHtmlType(String htmlType) {
		this.htmlType = htmlType;
	}
	//get方法
	public String getDictType() {
		return dictType;
	}

	//set方法
	public void setDictType(String dictType) {
		this.dictType = dictType;
	}
	//get方法
	public Integer getSort() {
		return sort;
	}

	//set方法
	public void setSort(Integer sort) {
		this.sort = sort;
	}
	//get方法
	public String getCreateBy() {
		return createBy;
	}

	//set方法
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
	//get方法
	public Date getCreateTime() {
		return createTime;
	}

	//set方法
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	//get方法
	public String getUpdateBy() {
		return updateBy;
	}

	//set方法
	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}
	//get方法
	public Date getUpdateTime() {
		return updateTime;
	}

	//set方法
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}


}
