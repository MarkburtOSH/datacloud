package com.alsyun.admin.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/****
 * @Author:Markburt
 * @Description:GenTable构建
 * @Date 2019/6/14 19:13
 *****/
@ApiModel(description = "GenTable",value = "GenTable")
@Table(name="gen_table")
public class GenTable implements Serializable{

	@ApiModelProperty(value = "编号",required = false)
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "table_id")
	private Long tableId;//编号

	@ApiModelProperty(value = "表名称",required = false)
    @Column(name = "table_name")
	private String tableName;//表名称

	@ApiModelProperty(value = "表描述",required = false)
    @Column(name = "table_comment")
	private String tableComment;//表描述

	@ApiModelProperty(value = "关联子表的表名",required = false)
    @Column(name = "sub_table_name")
	private String subTableName;//关联子表的表名

	@ApiModelProperty(value = "子表关联的外键名",required = false)
    @Column(name = "sub_table_fk_name")
	private String subTableFkName;//子表关联的外键名

	@ApiModelProperty(value = "实体类名称",required = false)
    @Column(name = "class_name")
	private String className;//实体类名称

	@ApiModelProperty(value = "使用的模板（crud单表操作 tree树表操作）",required = false)
    @Column(name = "tpl_category")
	private String tplCategory;//使用的模板（crud单表操作 tree树表操作）

	@ApiModelProperty(value = "生成包路径",required = false)
    @Column(name = "package_name")
	private String packageName;//生成包路径

	@ApiModelProperty(value = "生成模块名",required = false)
    @Column(name = "module_name")
	private String moduleName;//生成模块名

	@ApiModelProperty(value = "生成业务名",required = false)
    @Column(name = "business_name")
	private String businessName;//生成业务名

	@ApiModelProperty(value = "生成功能名",required = false)
    @Column(name = "function_name")
	private String functionName;//生成功能名

	@ApiModelProperty(value = "生成功能作者",required = false)
    @Column(name = "function_author")
	private String functionAuthor;//生成功能作者

	@ApiModelProperty(value = "生成代码方式（0zip压缩包 1自定义路径）",required = false)
    @Column(name = "gen_type")
	private String genType;//生成代码方式（0zip压缩包 1自定义路径）

	@ApiModelProperty(value = "生成路径（不填默认项目路径）",required = false)
    @Column(name = "gen_path")
	private String genPath;//生成路径（不填默认项目路径）

	@ApiModelProperty(value = "其它生成选项",required = false)
    @Column(name = "options")
	private String options;//其它生成选项

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

	@ApiModelProperty(value = "备注",required = false)
    @Column(name = "remark")
	private String remark;//备注



	//get方法
	public Long getTableId() {
		return tableId;
	}

	//set方法
	public void setTableId(Long tableId) {
		this.tableId = tableId;
	}
	//get方法
	public String getTableName() {
		return tableName;
	}

	//set方法
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	//get方法
	public String getTableComment() {
		return tableComment;
	}

	//set方法
	public void setTableComment(String tableComment) {
		this.tableComment = tableComment;
	}
	//get方法
	public String getSubTableName() {
		return subTableName;
	}

	//set方法
	public void setSubTableName(String subTableName) {
		this.subTableName = subTableName;
	}
	//get方法
	public String getSubTableFkName() {
		return subTableFkName;
	}

	//set方法
	public void setSubTableFkName(String subTableFkName) {
		this.subTableFkName = subTableFkName;
	}
	//get方法
	public String getClassName() {
		return className;
	}

	//set方法
	public void setClassName(String className) {
		this.className = className;
	}
	//get方法
	public String getTplCategory() {
		return tplCategory;
	}

	//set方法
	public void setTplCategory(String tplCategory) {
		this.tplCategory = tplCategory;
	}
	//get方法
	public String getPackageName() {
		return packageName;
	}

	//set方法
	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}
	//get方法
	public String getModuleName() {
		return moduleName;
	}

	//set方法
	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}
	//get方法
	public String getBusinessName() {
		return businessName;
	}

	//set方法
	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}
	//get方法
	public String getFunctionName() {
		return functionName;
	}

	//set方法
	public void setFunctionName(String functionName) {
		this.functionName = functionName;
	}
	//get方法
	public String getFunctionAuthor() {
		return functionAuthor;
	}

	//set方法
	public void setFunctionAuthor(String functionAuthor) {
		this.functionAuthor = functionAuthor;
	}
	//get方法
	public String getGenType() {
		return genType;
	}

	//set方法
	public void setGenType(String genType) {
		this.genType = genType;
	}
	//get方法
	public String getGenPath() {
		return genPath;
	}

	//set方法
	public void setGenPath(String genPath) {
		this.genPath = genPath;
	}
	//get方法
	public String getOptions() {
		return options;
	}

	//set方法
	public void setOptions(String options) {
		this.options = options;
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
	//get方法
	public String getRemark() {
		return remark;
	}

	//set方法
	public void setRemark(String remark) {
		this.remark = remark;
	}


}
