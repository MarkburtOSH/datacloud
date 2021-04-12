package com.alsyun.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DstMemberUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DstMemberUserExample() {
        oredCriteria = new ArrayList<>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPhonenumberIsNull() {
            addCriterion("phonenumber is null");
            return (Criteria) this;
        }

        public Criteria andPhonenumberIsNotNull() {
            addCriterion("phonenumber is not null");
            return (Criteria) this;
        }

        public Criteria andPhonenumberEqualTo(String value) {
            addCriterion("phonenumber =", value, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberNotEqualTo(String value) {
            addCriterion("phonenumber <>", value, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberGreaterThan(String value) {
            addCriterion("phonenumber >", value, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberGreaterThanOrEqualTo(String value) {
            addCriterion("phonenumber >=", value, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberLessThan(String value) {
            addCriterion("phonenumber <", value, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberLessThanOrEqualTo(String value) {
            addCriterion("phonenumber <=", value, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberLike(String value) {
            addCriterion("phonenumber like", value, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberNotLike(String value) {
            addCriterion("phonenumber not like", value, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberIn(List<String> values) {
            addCriterion("phonenumber in", values, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberNotIn(List<String> values) {
            addCriterion("phonenumber not in", values, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberBetween(String value1, String value2) {
            addCriterion("phonenumber between", value1, value2, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberNotBetween(String value1, String value2) {
            addCriterion("phonenumber not between", value1, value2, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andAuthenticateIsNull() {
            addCriterion("authenticate is null");
            return (Criteria) this;
        }

        public Criteria andAuthenticateIsNotNull() {
            addCriterion("authenticate is not null");
            return (Criteria) this;
        }

        public Criteria andAuthenticateEqualTo(String value) {
            addCriterion("authenticate =", value, "authenticate");
            return (Criteria) this;
        }

        public Criteria andAuthenticateNotEqualTo(String value) {
            addCriterion("authenticate <>", value, "authenticate");
            return (Criteria) this;
        }

        public Criteria andAuthenticateGreaterThan(String value) {
            addCriterion("authenticate >", value, "authenticate");
            return (Criteria) this;
        }

        public Criteria andAuthenticateGreaterThanOrEqualTo(String value) {
            addCriterion("authenticate >=", value, "authenticate");
            return (Criteria) this;
        }

        public Criteria andAuthenticateLessThan(String value) {
            addCriterion("authenticate <", value, "authenticate");
            return (Criteria) this;
        }

        public Criteria andAuthenticateLessThanOrEqualTo(String value) {
            addCriterion("authenticate <=", value, "authenticate");
            return (Criteria) this;
        }

        public Criteria andAuthenticateLike(String value) {
            addCriterion("authenticate like", value, "authenticate");
            return (Criteria) this;
        }

        public Criteria andAuthenticateNotLike(String value) {
            addCriterion("authenticate not like", value, "authenticate");
            return (Criteria) this;
        }

        public Criteria andAuthenticateIn(List<String> values) {
            addCriterion("authenticate in", values, "authenticate");
            return (Criteria) this;
        }

        public Criteria andAuthenticateNotIn(List<String> values) {
            addCriterion("authenticate not in", values, "authenticate");
            return (Criteria) this;
        }

        public Criteria andAuthenticateBetween(String value1, String value2) {
            addCriterion("authenticate between", value1, value2, "authenticate");
            return (Criteria) this;
        }

        public Criteria andAuthenticateNotBetween(String value1, String value2) {
            addCriterion("authenticate not between", value1, value2, "authenticate");
            return (Criteria) this;
        }

        public Criteria andCorporImgOneIsNull() {
            addCriterion("corpor_img_one is null");
            return (Criteria) this;
        }

        public Criteria andCorporImgOneIsNotNull() {
            addCriterion("corpor_img_one is not null");
            return (Criteria) this;
        }

        public Criteria andCorporImgOneEqualTo(String value) {
            addCriterion("corpor_img_one =", value, "corporImgOne");
            return (Criteria) this;
        }

        public Criteria andCorporImgOneNotEqualTo(String value) {
            addCriterion("corpor_img_one <>", value, "corporImgOne");
            return (Criteria) this;
        }

        public Criteria andCorporImgOneGreaterThan(String value) {
            addCriterion("corpor_img_one >", value, "corporImgOne");
            return (Criteria) this;
        }

        public Criteria andCorporImgOneGreaterThanOrEqualTo(String value) {
            addCriterion("corpor_img_one >=", value, "corporImgOne");
            return (Criteria) this;
        }

        public Criteria andCorporImgOneLessThan(String value) {
            addCriterion("corpor_img_one <", value, "corporImgOne");
            return (Criteria) this;
        }

        public Criteria andCorporImgOneLessThanOrEqualTo(String value) {
            addCriterion("corpor_img_one <=", value, "corporImgOne");
            return (Criteria) this;
        }

        public Criteria andCorporImgOneLike(String value) {
            addCriterion("corpor_img_one like", value, "corporImgOne");
            return (Criteria) this;
        }

        public Criteria andCorporImgOneNotLike(String value) {
            addCriterion("corpor_img_one not like", value, "corporImgOne");
            return (Criteria) this;
        }

        public Criteria andCorporImgOneIn(List<String> values) {
            addCriterion("corpor_img_one in", values, "corporImgOne");
            return (Criteria) this;
        }

        public Criteria andCorporImgOneNotIn(List<String> values) {
            addCriterion("corpor_img_one not in", values, "corporImgOne");
            return (Criteria) this;
        }

        public Criteria andCorporImgOneBetween(String value1, String value2) {
            addCriterion("corpor_img_one between", value1, value2, "corporImgOne");
            return (Criteria) this;
        }

        public Criteria andCorporImgOneNotBetween(String value1, String value2) {
            addCriterion("corpor_img_one not between", value1, value2, "corporImgOne");
            return (Criteria) this;
        }

        public Criteria andCorporImgTwoIsNull() {
            addCriterion("corpor_img_two is null");
            return (Criteria) this;
        }

        public Criteria andCorporImgTwoIsNotNull() {
            addCriterion("corpor_img_two is not null");
            return (Criteria) this;
        }

        public Criteria andCorporImgTwoEqualTo(String value) {
            addCriterion("corpor_img_two =", value, "corporImgTwo");
            return (Criteria) this;
        }

        public Criteria andCorporImgTwoNotEqualTo(String value) {
            addCriterion("corpor_img_two <>", value, "corporImgTwo");
            return (Criteria) this;
        }

        public Criteria andCorporImgTwoGreaterThan(String value) {
            addCriterion("corpor_img_two >", value, "corporImgTwo");
            return (Criteria) this;
        }

        public Criteria andCorporImgTwoGreaterThanOrEqualTo(String value) {
            addCriterion("corpor_img_two >=", value, "corporImgTwo");
            return (Criteria) this;
        }

        public Criteria andCorporImgTwoLessThan(String value) {
            addCriterion("corpor_img_two <", value, "corporImgTwo");
            return (Criteria) this;
        }

        public Criteria andCorporImgTwoLessThanOrEqualTo(String value) {
            addCriterion("corpor_img_two <=", value, "corporImgTwo");
            return (Criteria) this;
        }

        public Criteria andCorporImgTwoLike(String value) {
            addCriterion("corpor_img_two like", value, "corporImgTwo");
            return (Criteria) this;
        }

        public Criteria andCorporImgTwoNotLike(String value) {
            addCriterion("corpor_img_two not like", value, "corporImgTwo");
            return (Criteria) this;
        }

        public Criteria andCorporImgTwoIn(List<String> values) {
            addCriterion("corpor_img_two in", values, "corporImgTwo");
            return (Criteria) this;
        }

        public Criteria andCorporImgTwoNotIn(List<String> values) {
            addCriterion("corpor_img_two not in", values, "corporImgTwo");
            return (Criteria) this;
        }

        public Criteria andCorporImgTwoBetween(String value1, String value2) {
            addCriterion("corpor_img_two between", value1, value2, "corporImgTwo");
            return (Criteria) this;
        }

        public Criteria andCorporImgTwoNotBetween(String value1, String value2) {
            addCriterion("corpor_img_two not between", value1, value2, "corporImgTwo");
            return (Criteria) this;
        }

        public Criteria andCreditImgIsNull() {
            addCriterion("credit_img is null");
            return (Criteria) this;
        }

        public Criteria andCreditImgIsNotNull() {
            addCriterion("credit_img is not null");
            return (Criteria) this;
        }

        public Criteria andCreditImgEqualTo(String value) {
            addCriterion("credit_img =", value, "creditImg");
            return (Criteria) this;
        }

        public Criteria andCreditImgNotEqualTo(String value) {
            addCriterion("credit_img <>", value, "creditImg");
            return (Criteria) this;
        }

        public Criteria andCreditImgGreaterThan(String value) {
            addCriterion("credit_img >", value, "creditImg");
            return (Criteria) this;
        }

        public Criteria andCreditImgGreaterThanOrEqualTo(String value) {
            addCriterion("credit_img >=", value, "creditImg");
            return (Criteria) this;
        }

        public Criteria andCreditImgLessThan(String value) {
            addCriterion("credit_img <", value, "creditImg");
            return (Criteria) this;
        }

        public Criteria andCreditImgLessThanOrEqualTo(String value) {
            addCriterion("credit_img <=", value, "creditImg");
            return (Criteria) this;
        }

        public Criteria andCreditImgLike(String value) {
            addCriterion("credit_img like", value, "creditImg");
            return (Criteria) this;
        }

        public Criteria andCreditImgNotLike(String value) {
            addCriterion("credit_img not like", value, "creditImg");
            return (Criteria) this;
        }

        public Criteria andCreditImgIn(List<String> values) {
            addCriterion("credit_img in", values, "creditImg");
            return (Criteria) this;
        }

        public Criteria andCreditImgNotIn(List<String> values) {
            addCriterion("credit_img not in", values, "creditImg");
            return (Criteria) this;
        }

        public Criteria andCreditImgBetween(String value1, String value2) {
            addCriterion("credit_img between", value1, value2, "creditImg");
            return (Criteria) this;
        }

        public Criteria andCreditImgNotBetween(String value1, String value2) {
            addCriterion("credit_img not between", value1, value2, "creditImg");
            return (Criteria) this;
        }

        public Criteria andCommissionIsNull() {
            addCriterion("commission is null");
            return (Criteria) this;
        }

        public Criteria andCommissionIsNotNull() {
            addCriterion("commission is not null");
            return (Criteria) this;
        }

        public Criteria andCommissionEqualTo(String value) {
            addCriterion("commission =", value, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionNotEqualTo(String value) {
            addCriterion("commission <>", value, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionGreaterThan(String value) {
            addCriterion("commission >", value, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionGreaterThanOrEqualTo(String value) {
            addCriterion("commission >=", value, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionLessThan(String value) {
            addCriterion("commission <", value, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionLessThanOrEqualTo(String value) {
            addCriterion("commission <=", value, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionLike(String value) {
            addCriterion("commission like", value, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionNotLike(String value) {
            addCriterion("commission not like", value, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionIn(List<String> values) {
            addCriterion("commission in", values, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionNotIn(List<String> values) {
            addCriterion("commission not in", values, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionBetween(String value1, String value2) {
            addCriterion("commission between", value1, value2, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionNotBetween(String value1, String value2) {
            addCriterion("commission not between", value1, value2, "commission");
            return (Criteria) this;
        }

        public Criteria andRemainderIsNull() {
            addCriterion("remainder is null");
            return (Criteria) this;
        }

        public Criteria andRemainderIsNotNull() {
            addCriterion("remainder is not null");
            return (Criteria) this;
        }

        public Criteria andRemainderEqualTo(String value) {
            addCriterion("remainder =", value, "remainder");
            return (Criteria) this;
        }

        public Criteria andRemainderNotEqualTo(String value) {
            addCriterion("remainder <>", value, "remainder");
            return (Criteria) this;
        }

        public Criteria andRemainderGreaterThan(String value) {
            addCriterion("remainder >", value, "remainder");
            return (Criteria) this;
        }

        public Criteria andRemainderGreaterThanOrEqualTo(String value) {
            addCriterion("remainder >=", value, "remainder");
            return (Criteria) this;
        }

        public Criteria andRemainderLessThan(String value) {
            addCriterion("remainder <", value, "remainder");
            return (Criteria) this;
        }

        public Criteria andRemainderLessThanOrEqualTo(String value) {
            addCriterion("remainder <=", value, "remainder");
            return (Criteria) this;
        }

        public Criteria andRemainderLike(String value) {
            addCriterion("remainder like", value, "remainder");
            return (Criteria) this;
        }

        public Criteria andRemainderNotLike(String value) {
            addCriterion("remainder not like", value, "remainder");
            return (Criteria) this;
        }

        public Criteria andRemainderIn(List<String> values) {
            addCriterion("remainder in", values, "remainder");
            return (Criteria) this;
        }

        public Criteria andRemainderNotIn(List<String> values) {
            addCriterion("remainder not in", values, "remainder");
            return (Criteria) this;
        }

        public Criteria andRemainderBetween(String value1, String value2) {
            addCriterion("remainder between", value1, value2, "remainder");
            return (Criteria) this;
        }

        public Criteria andRemainderNotBetween(String value1, String value2) {
            addCriterion("remainder not between", value1, value2, "remainder");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNull() {
            addCriterion("user_type is null");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNotNull() {
            addCriterion("user_type is not null");
            return (Criteria) this;
        }

        public Criteria andUserTypeEqualTo(String value) {
            addCriterion("user_type =", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotEqualTo(String value) {
            addCriterion("user_type <>", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThan(String value) {
            addCriterion("user_type >", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThanOrEqualTo(String value) {
            addCriterion("user_type >=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThan(String value) {
            addCriterion("user_type <", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThanOrEqualTo(String value) {
            addCriterion("user_type <=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLike(String value) {
            addCriterion("user_type like", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotLike(String value) {
            addCriterion("user_type not like", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeIn(List<String> values) {
            addCriterion("user_type in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotIn(List<String> values) {
            addCriterion("user_type not in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeBetween(String value1, String value2) {
            addCriterion("user_type between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotBetween(String value1, String value2) {
            addCriterion("user_type not between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNull() {
            addCriterion("del_flag is null");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNotNull() {
            addCriterion("del_flag is not null");
            return (Criteria) this;
        }

        public Criteria andDelFlagEqualTo(String value) {
            addCriterion("del_flag =", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotEqualTo(String value) {
            addCriterion("del_flag <>", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThan(String value) {
            addCriterion("del_flag >", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThanOrEqualTo(String value) {
            addCriterion("del_flag >=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThan(String value) {
            addCriterion("del_flag <", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThanOrEqualTo(String value) {
            addCriterion("del_flag <=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLike(String value) {
            addCriterion("del_flag like", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotLike(String value) {
            addCriterion("del_flag not like", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagIn(List<String> values) {
            addCriterion("del_flag in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotIn(List<String> values) {
            addCriterion("del_flag not in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagBetween(String value1, String value2) {
            addCriterion("del_flag between", value1, value2, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotBetween(String value1, String value2) {
            addCriterion("del_flag not between", value1, value2, "delFlag");
            return (Criteria) this;
        }

        public Criteria andExamineIsNull() {
            addCriterion("examine is null");
            return (Criteria) this;
        }

        public Criteria andExamineIsNotNull() {
            addCriterion("examine is not null");
            return (Criteria) this;
        }

        public Criteria andExamineEqualTo(String value) {
            addCriterion("examine =", value, "examine");
            return (Criteria) this;
        }

        public Criteria andExamineNotEqualTo(String value) {
            addCriterion("examine <>", value, "examine");
            return (Criteria) this;
        }

        public Criteria andExamineGreaterThan(String value) {
            addCriterion("examine >", value, "examine");
            return (Criteria) this;
        }

        public Criteria andExamineGreaterThanOrEqualTo(String value) {
            addCriterion("examine >=", value, "examine");
            return (Criteria) this;
        }

        public Criteria andExamineLessThan(String value) {
            addCriterion("examine <", value, "examine");
            return (Criteria) this;
        }

        public Criteria andExamineLessThanOrEqualTo(String value) {
            addCriterion("examine <=", value, "examine");
            return (Criteria) this;
        }

        public Criteria andExamineLike(String value) {
            addCriterion("examine like", value, "examine");
            return (Criteria) this;
        }

        public Criteria andExamineNotLike(String value) {
            addCriterion("examine not like", value, "examine");
            return (Criteria) this;
        }

        public Criteria andExamineIn(List<String> values) {
            addCriterion("examine in", values, "examine");
            return (Criteria) this;
        }

        public Criteria andExamineNotIn(List<String> values) {
            addCriterion("examine not in", values, "examine");
            return (Criteria) this;
        }

        public Criteria andExamineBetween(String value1, String value2) {
            addCriterion("examine between", value1, value2, "examine");
            return (Criteria) this;
        }

        public Criteria andExamineNotBetween(String value1, String value2) {
            addCriterion("examine not between", value1, value2, "examine");
            return (Criteria) this;
        }

        public Criteria andRosterTypeIsNull() {
            addCriterion("roster_type is null");
            return (Criteria) this;
        }

        public Criteria andRosterTypeIsNotNull() {
            addCriterion("roster_type is not null");
            return (Criteria) this;
        }

        public Criteria andRosterTypeEqualTo(String value) {
            addCriterion("roster_type =", value, "rosterType");
            return (Criteria) this;
        }

        public Criteria andRosterTypeNotEqualTo(String value) {
            addCriterion("roster_type <>", value, "rosterType");
            return (Criteria) this;
        }

        public Criteria andRosterTypeGreaterThan(String value) {
            addCriterion("roster_type >", value, "rosterType");
            return (Criteria) this;
        }

        public Criteria andRosterTypeGreaterThanOrEqualTo(String value) {
            addCriterion("roster_type >=", value, "rosterType");
            return (Criteria) this;
        }

        public Criteria andRosterTypeLessThan(String value) {
            addCriterion("roster_type <", value, "rosterType");
            return (Criteria) this;
        }

        public Criteria andRosterTypeLessThanOrEqualTo(String value) {
            addCriterion("roster_type <=", value, "rosterType");
            return (Criteria) this;
        }

        public Criteria andRosterTypeLike(String value) {
            addCriterion("roster_type like", value, "rosterType");
            return (Criteria) this;
        }

        public Criteria andRosterTypeNotLike(String value) {
            addCriterion("roster_type not like", value, "rosterType");
            return (Criteria) this;
        }

        public Criteria andRosterTypeIn(List<String> values) {
            addCriterion("roster_type in", values, "rosterType");
            return (Criteria) this;
        }

        public Criteria andRosterTypeNotIn(List<String> values) {
            addCriterion("roster_type not in", values, "rosterType");
            return (Criteria) this;
        }

        public Criteria andRosterTypeBetween(String value1, String value2) {
            addCriterion("roster_type between", value1, value2, "rosterType");
            return (Criteria) this;
        }

        public Criteria andRosterTypeNotBetween(String value1, String value2) {
            addCriterion("roster_type not between", value1, value2, "rosterType");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNull() {
            addCriterion("create_by is null");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNotNull() {
            addCriterion("create_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByEqualTo(String value) {
            addCriterion("create_by =", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotEqualTo(String value) {
            addCriterion("create_by <>", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThan(String value) {
            addCriterion("create_by >", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("create_by >=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThan(String value) {
            addCriterion("create_by <", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanOrEqualTo(String value) {
            addCriterion("create_by <=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLike(String value) {
            addCriterion("create_by like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotLike(String value) {
            addCriterion("create_by not like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByIn(List<String> values) {
            addCriterion("create_by in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotIn(List<String> values) {
            addCriterion("create_by not in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByBetween(String value1, String value2) {
            addCriterion("create_by between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotBetween(String value1, String value2) {
            addCriterion("create_by not between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNull() {
            addCriterion("update_by is null");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNotNull() {
            addCriterion("update_by is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateByEqualTo(String value) {
            addCriterion("update_by =", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotEqualTo(String value) {
            addCriterion("update_by <>", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThan(String value) {
            addCriterion("update_by >", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThanOrEqualTo(String value) {
            addCriterion("update_by >=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThan(String value) {
            addCriterion("update_by <", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThanOrEqualTo(String value) {
            addCriterion("update_by <=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLike(String value) {
            addCriterion("update_by like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotLike(String value) {
            addCriterion("update_by not like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByIn(List<String> values) {
            addCriterion("update_by in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotIn(List<String> values) {
            addCriterion("update_by not in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByBetween(String value1, String value2) {
            addCriterion("update_by between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotBetween(String value1, String value2) {
            addCriterion("update_by not between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}