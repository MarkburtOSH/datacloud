package com.alsyun.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ImsYzOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ImsYzOrderExample() {
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

        public Criteria andUniacidIsNull() {
            addCriterion("uniacid is null");
            return (Criteria) this;
        }

        public Criteria andUniacidIsNotNull() {
            addCriterion("uniacid is not null");
            return (Criteria) this;
        }

        public Criteria andUniacidEqualTo(Integer value) {
            addCriterion("uniacid =", value, "uniacid");
            return (Criteria) this;
        }

        public Criteria andUniacidNotEqualTo(Integer value) {
            addCriterion("uniacid <>", value, "uniacid");
            return (Criteria) this;
        }

        public Criteria andUniacidGreaterThan(Integer value) {
            addCriterion("uniacid >", value, "uniacid");
            return (Criteria) this;
        }

        public Criteria andUniacidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uniacid >=", value, "uniacid");
            return (Criteria) this;
        }

        public Criteria andUniacidLessThan(Integer value) {
            addCriterion("uniacid <", value, "uniacid");
            return (Criteria) this;
        }

        public Criteria andUniacidLessThanOrEqualTo(Integer value) {
            addCriterion("uniacid <=", value, "uniacid");
            return (Criteria) this;
        }

        public Criteria andUniacidIn(List<Integer> values) {
            addCriterion("uniacid in", values, "uniacid");
            return (Criteria) this;
        }

        public Criteria andUniacidNotIn(List<Integer> values) {
            addCriterion("uniacid not in", values, "uniacid");
            return (Criteria) this;
        }

        public Criteria andUniacidBetween(Integer value1, Integer value2) {
            addCriterion("uniacid between", value1, value2, "uniacid");
            return (Criteria) this;
        }

        public Criteria andUniacidNotBetween(Integer value1, Integer value2) {
            addCriterion("uniacid not between", value1, value2, "uniacid");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andOrderSnIsNull() {
            addCriterion("order_sn is null");
            return (Criteria) this;
        }

        public Criteria andOrderSnIsNotNull() {
            addCriterion("order_sn is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSnEqualTo(String value) {
            addCriterion("order_sn =", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnNotEqualTo(String value) {
            addCriterion("order_sn <>", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnGreaterThan(String value) {
            addCriterion("order_sn >", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnGreaterThanOrEqualTo(String value) {
            addCriterion("order_sn >=", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnLessThan(String value) {
            addCriterion("order_sn <", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnLessThanOrEqualTo(String value) {
            addCriterion("order_sn <=", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnLike(String value) {
            addCriterion("order_sn like", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnNotLike(String value) {
            addCriterion("order_sn not like", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnIn(List<String> values) {
            addCriterion("order_sn in", values, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnNotIn(List<String> values) {
            addCriterion("order_sn not in", values, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnBetween(String value1, String value2) {
            addCriterion("order_sn between", value1, value2, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnNotBetween(String value1, String value2) {
            addCriterion("order_sn not between", value1, value2, "orderSn");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIsNull() {
            addCriterion("goods_price is null");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIsNotNull() {
            addCriterion("goods_price is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceEqualTo(BigDecimal value) {
            addCriterion("goods_price =", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotEqualTo(BigDecimal value) {
            addCriterion("goods_price <>", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceGreaterThan(BigDecimal value) {
            addCriterion("goods_price >", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_price >=", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceLessThan(BigDecimal value) {
            addCriterion("goods_price <", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_price <=", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIn(List<BigDecimal> values) {
            addCriterion("goods_price in", values, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotIn(List<BigDecimal> values) {
            addCriterion("goods_price not in", values, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_price between", value1, value2, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_price not between", value1, value2, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalIsNull() {
            addCriterion("goods_total is null");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalIsNotNull() {
            addCriterion("goods_total is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalEqualTo(Integer value) {
            addCriterion("goods_total =", value, "goodsTotal");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalNotEqualTo(Integer value) {
            addCriterion("goods_total <>", value, "goodsTotal");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalGreaterThan(Integer value) {
            addCriterion("goods_total >", value, "goodsTotal");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_total >=", value, "goodsTotal");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalLessThan(Integer value) {
            addCriterion("goods_total <", value, "goodsTotal");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalLessThanOrEqualTo(Integer value) {
            addCriterion("goods_total <=", value, "goodsTotal");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalIn(List<Integer> values) {
            addCriterion("goods_total in", values, "goodsTotal");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalNotIn(List<Integer> values) {
            addCriterion("goods_total not in", values, "goodsTotal");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalBetween(Integer value1, Integer value2) {
            addCriterion("goods_total between", value1, value2, "goodsTotal");
            return (Criteria) this;
        }

        public Criteria andGoodsTotalNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_total not between", value1, value2, "goodsTotal");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("status not between", value1, value2, "status");
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

        public Criteria andCreateTimeEqualTo(Integer value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Integer value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Integer value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Integer value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Integer value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Integer> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Integer> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Integer value1, Integer value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNull() {
            addCriterion("is_deleted is null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNotNull() {
            addCriterion("is_deleted is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedEqualTo(Byte value) {
            addCriterion("is_deleted =", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotEqualTo(Byte value) {
            addCriterion("is_deleted <>", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThan(Byte value) {
            addCriterion("is_deleted >", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_deleted >=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThan(Byte value) {
            addCriterion("is_deleted <", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThanOrEqualTo(Byte value) {
            addCriterion("is_deleted <=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIn(List<Byte> values) {
            addCriterion("is_deleted in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotIn(List<Byte> values) {
            addCriterion("is_deleted not in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedBetween(Byte value1, Byte value2) {
            addCriterion("is_deleted between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotBetween(Byte value1, Byte value2) {
            addCriterion("is_deleted not between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsMemberDeletedIsNull() {
            addCriterion("is_member_deleted is null");
            return (Criteria) this;
        }

        public Criteria andIsMemberDeletedIsNotNull() {
            addCriterion("is_member_deleted is not null");
            return (Criteria) this;
        }

        public Criteria andIsMemberDeletedEqualTo(Byte value) {
            addCriterion("is_member_deleted =", value, "isMemberDeleted");
            return (Criteria) this;
        }

        public Criteria andIsMemberDeletedNotEqualTo(Byte value) {
            addCriterion("is_member_deleted <>", value, "isMemberDeleted");
            return (Criteria) this;
        }

        public Criteria andIsMemberDeletedGreaterThan(Byte value) {
            addCriterion("is_member_deleted >", value, "isMemberDeleted");
            return (Criteria) this;
        }

        public Criteria andIsMemberDeletedGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_member_deleted >=", value, "isMemberDeleted");
            return (Criteria) this;
        }

        public Criteria andIsMemberDeletedLessThan(Byte value) {
            addCriterion("is_member_deleted <", value, "isMemberDeleted");
            return (Criteria) this;
        }

        public Criteria andIsMemberDeletedLessThanOrEqualTo(Byte value) {
            addCriterion("is_member_deleted <=", value, "isMemberDeleted");
            return (Criteria) this;
        }

        public Criteria andIsMemberDeletedIn(List<Byte> values) {
            addCriterion("is_member_deleted in", values, "isMemberDeleted");
            return (Criteria) this;
        }

        public Criteria andIsMemberDeletedNotIn(List<Byte> values) {
            addCriterion("is_member_deleted not in", values, "isMemberDeleted");
            return (Criteria) this;
        }

        public Criteria andIsMemberDeletedBetween(Byte value1, Byte value2) {
            addCriterion("is_member_deleted between", value1, value2, "isMemberDeleted");
            return (Criteria) this;
        }

        public Criteria andIsMemberDeletedNotBetween(Byte value1, Byte value2) {
            addCriterion("is_member_deleted not between", value1, value2, "isMemberDeleted");
            return (Criteria) this;
        }

        public Criteria andFinishTimeIsNull() {
            addCriterion("finish_time is null");
            return (Criteria) this;
        }

        public Criteria andFinishTimeIsNotNull() {
            addCriterion("finish_time is not null");
            return (Criteria) this;
        }

        public Criteria andFinishTimeEqualTo(Integer value) {
            addCriterion("finish_time =", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeNotEqualTo(Integer value) {
            addCriterion("finish_time <>", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeGreaterThan(Integer value) {
            addCriterion("finish_time >", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("finish_time >=", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeLessThan(Integer value) {
            addCriterion("finish_time <", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeLessThanOrEqualTo(Integer value) {
            addCriterion("finish_time <=", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeIn(List<Integer> values) {
            addCriterion("finish_time in", values, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeNotIn(List<Integer> values) {
            addCriterion("finish_time not in", values, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeBetween(Integer value1, Integer value2) {
            addCriterion("finish_time between", value1, value2, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("finish_time not between", value1, value2, "finishTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeIsNull() {
            addCriterion("pay_time is null");
            return (Criteria) this;
        }

        public Criteria andPayTimeIsNotNull() {
            addCriterion("pay_time is not null");
            return (Criteria) this;
        }

        public Criteria andPayTimeEqualTo(Integer value) {
            addCriterion("pay_time =", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotEqualTo(Integer value) {
            addCriterion("pay_time <>", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThan(Integer value) {
            addCriterion("pay_time >", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_time >=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThan(Integer value) {
            addCriterion("pay_time <", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThanOrEqualTo(Integer value) {
            addCriterion("pay_time <=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeIn(List<Integer> values) {
            addCriterion("pay_time in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotIn(List<Integer> values) {
            addCriterion("pay_time not in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeBetween(Integer value1, Integer value2) {
            addCriterion("pay_time between", value1, value2, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_time not between", value1, value2, "payTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeIsNull() {
            addCriterion("send_time is null");
            return (Criteria) this;
        }

        public Criteria andSendTimeIsNotNull() {
            addCriterion("send_time is not null");
            return (Criteria) this;
        }

        public Criteria andSendTimeEqualTo(Integer value) {
            addCriterion("send_time =", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotEqualTo(Integer value) {
            addCriterion("send_time <>", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeGreaterThan(Integer value) {
            addCriterion("send_time >", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("send_time >=", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeLessThan(Integer value) {
            addCriterion("send_time <", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeLessThanOrEqualTo(Integer value) {
            addCriterion("send_time <=", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeIn(List<Integer> values) {
            addCriterion("send_time in", values, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotIn(List<Integer> values) {
            addCriterion("send_time not in", values, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeBetween(Integer value1, Integer value2) {
            addCriterion("send_time between", value1, value2, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("send_time not between", value1, value2, "sendTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeIsNull() {
            addCriterion("cancel_time is null");
            return (Criteria) this;
        }

        public Criteria andCancelTimeIsNotNull() {
            addCriterion("cancel_time is not null");
            return (Criteria) this;
        }

        public Criteria andCancelTimeEqualTo(Integer value) {
            addCriterion("cancel_time =", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeNotEqualTo(Integer value) {
            addCriterion("cancel_time <>", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeGreaterThan(Integer value) {
            addCriterion("cancel_time >", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("cancel_time >=", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeLessThan(Integer value) {
            addCriterion("cancel_time <", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeLessThanOrEqualTo(Integer value) {
            addCriterion("cancel_time <=", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeIn(List<Integer> values) {
            addCriterion("cancel_time in", values, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeNotIn(List<Integer> values) {
            addCriterion("cancel_time not in", values, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeBetween(Integer value1, Integer value2) {
            addCriterion("cancel_time between", value1, value2, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("cancel_time not between", value1, value2, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNull() {
            addCriterion("created_at is null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNotNull() {
            addCriterion("created_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtEqualTo(Integer value) {
            addCriterion("created_at =", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotEqualTo(Integer value) {
            addCriterion("created_at <>", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThan(Integer value) {
            addCriterion("created_at >", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThanOrEqualTo(Integer value) {
            addCriterion("created_at >=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThan(Integer value) {
            addCriterion("created_at <", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThanOrEqualTo(Integer value) {
            addCriterion("created_at <=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIn(List<Integer> values) {
            addCriterion("created_at in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotIn(List<Integer> values) {
            addCriterion("created_at not in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtBetween(Integer value1, Integer value2) {
            addCriterion("created_at between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotBetween(Integer value1, Integer value2) {
            addCriterion("created_at not between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNull() {
            addCriterion("updated_at is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNotNull() {
            addCriterion("updated_at is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtEqualTo(Integer value) {
            addCriterion("updated_at =", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotEqualTo(Integer value) {
            addCriterion("updated_at <>", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThan(Integer value) {
            addCriterion("updated_at >", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThanOrEqualTo(Integer value) {
            addCriterion("updated_at >=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThan(Integer value) {
            addCriterion("updated_at <", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThanOrEqualTo(Integer value) {
            addCriterion("updated_at <=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIn(List<Integer> values) {
            addCriterion("updated_at in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotIn(List<Integer> values) {
            addCriterion("updated_at not in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtBetween(Integer value1, Integer value2) {
            addCriterion("updated_at between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotBetween(Integer value1, Integer value2) {
            addCriterion("updated_at not between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andDeletedAtIsNull() {
            addCriterion("deleted_at is null");
            return (Criteria) this;
        }

        public Criteria andDeletedAtIsNotNull() {
            addCriterion("deleted_at is not null");
            return (Criteria) this;
        }

        public Criteria andDeletedAtEqualTo(Integer value) {
            addCriterion("deleted_at =", value, "deletedAt");
            return (Criteria) this;
        }

        public Criteria andDeletedAtNotEqualTo(Integer value) {
            addCriterion("deleted_at <>", value, "deletedAt");
            return (Criteria) this;
        }

        public Criteria andDeletedAtGreaterThan(Integer value) {
            addCriterion("deleted_at >", value, "deletedAt");
            return (Criteria) this;
        }

        public Criteria andDeletedAtGreaterThanOrEqualTo(Integer value) {
            addCriterion("deleted_at >=", value, "deletedAt");
            return (Criteria) this;
        }

        public Criteria andDeletedAtLessThan(Integer value) {
            addCriterion("deleted_at <", value, "deletedAt");
            return (Criteria) this;
        }

        public Criteria andDeletedAtLessThanOrEqualTo(Integer value) {
            addCriterion("deleted_at <=", value, "deletedAt");
            return (Criteria) this;
        }

        public Criteria andDeletedAtIn(List<Integer> values) {
            addCriterion("deleted_at in", values, "deletedAt");
            return (Criteria) this;
        }

        public Criteria andDeletedAtNotIn(List<Integer> values) {
            addCriterion("deleted_at not in", values, "deletedAt");
            return (Criteria) this;
        }

        public Criteria andDeletedAtBetween(Integer value1, Integer value2) {
            addCriterion("deleted_at between", value1, value2, "deletedAt");
            return (Criteria) this;
        }

        public Criteria andDeletedAtNotBetween(Integer value1, Integer value2) {
            addCriterion("deleted_at not between", value1, value2, "deletedAt");
            return (Criteria) this;
        }

        public Criteria andCancelPayTimeIsNull() {
            addCriterion("cancel_pay_time is null");
            return (Criteria) this;
        }

        public Criteria andCancelPayTimeIsNotNull() {
            addCriterion("cancel_pay_time is not null");
            return (Criteria) this;
        }

        public Criteria andCancelPayTimeEqualTo(Integer value) {
            addCriterion("cancel_pay_time =", value, "cancelPayTime");
            return (Criteria) this;
        }

        public Criteria andCancelPayTimeNotEqualTo(Integer value) {
            addCriterion("cancel_pay_time <>", value, "cancelPayTime");
            return (Criteria) this;
        }

        public Criteria andCancelPayTimeGreaterThan(Integer value) {
            addCriterion("cancel_pay_time >", value, "cancelPayTime");
            return (Criteria) this;
        }

        public Criteria andCancelPayTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("cancel_pay_time >=", value, "cancelPayTime");
            return (Criteria) this;
        }

        public Criteria andCancelPayTimeLessThan(Integer value) {
            addCriterion("cancel_pay_time <", value, "cancelPayTime");
            return (Criteria) this;
        }

        public Criteria andCancelPayTimeLessThanOrEqualTo(Integer value) {
            addCriterion("cancel_pay_time <=", value, "cancelPayTime");
            return (Criteria) this;
        }

        public Criteria andCancelPayTimeIn(List<Integer> values) {
            addCriterion("cancel_pay_time in", values, "cancelPayTime");
            return (Criteria) this;
        }

        public Criteria andCancelPayTimeNotIn(List<Integer> values) {
            addCriterion("cancel_pay_time not in", values, "cancelPayTime");
            return (Criteria) this;
        }

        public Criteria andCancelPayTimeBetween(Integer value1, Integer value2) {
            addCriterion("cancel_pay_time between", value1, value2, "cancelPayTime");
            return (Criteria) this;
        }

        public Criteria andCancelPayTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("cancel_pay_time not between", value1, value2, "cancelPayTime");
            return (Criteria) this;
        }

        public Criteria andCancelSendTimeIsNull() {
            addCriterion("cancel_send_time is null");
            return (Criteria) this;
        }

        public Criteria andCancelSendTimeIsNotNull() {
            addCriterion("cancel_send_time is not null");
            return (Criteria) this;
        }

        public Criteria andCancelSendTimeEqualTo(Integer value) {
            addCriterion("cancel_send_time =", value, "cancelSendTime");
            return (Criteria) this;
        }

        public Criteria andCancelSendTimeNotEqualTo(Integer value) {
            addCriterion("cancel_send_time <>", value, "cancelSendTime");
            return (Criteria) this;
        }

        public Criteria andCancelSendTimeGreaterThan(Integer value) {
            addCriterion("cancel_send_time >", value, "cancelSendTime");
            return (Criteria) this;
        }

        public Criteria andCancelSendTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("cancel_send_time >=", value, "cancelSendTime");
            return (Criteria) this;
        }

        public Criteria andCancelSendTimeLessThan(Integer value) {
            addCriterion("cancel_send_time <", value, "cancelSendTime");
            return (Criteria) this;
        }

        public Criteria andCancelSendTimeLessThanOrEqualTo(Integer value) {
            addCriterion("cancel_send_time <=", value, "cancelSendTime");
            return (Criteria) this;
        }

        public Criteria andCancelSendTimeIn(List<Integer> values) {
            addCriterion("cancel_send_time in", values, "cancelSendTime");
            return (Criteria) this;
        }

        public Criteria andCancelSendTimeNotIn(List<Integer> values) {
            addCriterion("cancel_send_time not in", values, "cancelSendTime");
            return (Criteria) this;
        }

        public Criteria andCancelSendTimeBetween(Integer value1, Integer value2) {
            addCriterion("cancel_send_time between", value1, value2, "cancelSendTime");
            return (Criteria) this;
        }

        public Criteria andCancelSendTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("cancel_send_time not between", value1, value2, "cancelSendTime");
            return (Criteria) this;
        }

        public Criteria andDispatchTypeIdIsNull() {
            addCriterion("dispatch_type_id is null");
            return (Criteria) this;
        }

        public Criteria andDispatchTypeIdIsNotNull() {
            addCriterion("dispatch_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andDispatchTypeIdEqualTo(Byte value) {
            addCriterion("dispatch_type_id =", value, "dispatchTypeId");
            return (Criteria) this;
        }

        public Criteria andDispatchTypeIdNotEqualTo(Byte value) {
            addCriterion("dispatch_type_id <>", value, "dispatchTypeId");
            return (Criteria) this;
        }

        public Criteria andDispatchTypeIdGreaterThan(Byte value) {
            addCriterion("dispatch_type_id >", value, "dispatchTypeId");
            return (Criteria) this;
        }

        public Criteria andDispatchTypeIdGreaterThanOrEqualTo(Byte value) {
            addCriterion("dispatch_type_id >=", value, "dispatchTypeId");
            return (Criteria) this;
        }

        public Criteria andDispatchTypeIdLessThan(Byte value) {
            addCriterion("dispatch_type_id <", value, "dispatchTypeId");
            return (Criteria) this;
        }

        public Criteria andDispatchTypeIdLessThanOrEqualTo(Byte value) {
            addCriterion("dispatch_type_id <=", value, "dispatchTypeId");
            return (Criteria) this;
        }

        public Criteria andDispatchTypeIdIn(List<Byte> values) {
            addCriterion("dispatch_type_id in", values, "dispatchTypeId");
            return (Criteria) this;
        }

        public Criteria andDispatchTypeIdNotIn(List<Byte> values) {
            addCriterion("dispatch_type_id not in", values, "dispatchTypeId");
            return (Criteria) this;
        }

        public Criteria andDispatchTypeIdBetween(Byte value1, Byte value2) {
            addCriterion("dispatch_type_id between", value1, value2, "dispatchTypeId");
            return (Criteria) this;
        }

        public Criteria andDispatchTypeIdNotBetween(Byte value1, Byte value2) {
            addCriterion("dispatch_type_id not between", value1, value2, "dispatchTypeId");
            return (Criteria) this;
        }

        public Criteria andDispatchPriceIsNull() {
            addCriterion("dispatch_price is null");
            return (Criteria) this;
        }

        public Criteria andDispatchPriceIsNotNull() {
            addCriterion("dispatch_price is not null");
            return (Criteria) this;
        }

        public Criteria andDispatchPriceEqualTo(BigDecimal value) {
            addCriterion("dispatch_price =", value, "dispatchPrice");
            return (Criteria) this;
        }

        public Criteria andDispatchPriceNotEqualTo(BigDecimal value) {
            addCriterion("dispatch_price <>", value, "dispatchPrice");
            return (Criteria) this;
        }

        public Criteria andDispatchPriceGreaterThan(BigDecimal value) {
            addCriterion("dispatch_price >", value, "dispatchPrice");
            return (Criteria) this;
        }

        public Criteria andDispatchPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("dispatch_price >=", value, "dispatchPrice");
            return (Criteria) this;
        }

        public Criteria andDispatchPriceLessThan(BigDecimal value) {
            addCriterion("dispatch_price <", value, "dispatchPrice");
            return (Criteria) this;
        }

        public Criteria andDispatchPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("dispatch_price <=", value, "dispatchPrice");
            return (Criteria) this;
        }

        public Criteria andDispatchPriceIn(List<BigDecimal> values) {
            addCriterion("dispatch_price in", values, "dispatchPrice");
            return (Criteria) this;
        }

        public Criteria andDispatchPriceNotIn(List<BigDecimal> values) {
            addCriterion("dispatch_price not in", values, "dispatchPrice");
            return (Criteria) this;
        }

        public Criteria andDispatchPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dispatch_price between", value1, value2, "dispatchPrice");
            return (Criteria) this;
        }

        public Criteria andDispatchPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dispatch_price not between", value1, value2, "dispatchPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceIsNull() {
            addCriterion("discount_price is null");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceIsNotNull() {
            addCriterion("discount_price is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceEqualTo(BigDecimal value) {
            addCriterion("discount_price =", value, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceNotEqualTo(BigDecimal value) {
            addCriterion("discount_price <>", value, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceGreaterThan(BigDecimal value) {
            addCriterion("discount_price >", value, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("discount_price >=", value, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceLessThan(BigDecimal value) {
            addCriterion("discount_price <", value, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("discount_price <=", value, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceIn(List<BigDecimal> values) {
            addCriterion("discount_price in", values, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceNotIn(List<BigDecimal> values) {
            addCriterion("discount_price not in", values, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount_price between", value1, value2, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount_price not between", value1, value2, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andPayTypeIdIsNull() {
            addCriterion("pay_type_id is null");
            return (Criteria) this;
        }

        public Criteria andPayTypeIdIsNotNull() {
            addCriterion("pay_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andPayTypeIdEqualTo(Byte value) {
            addCriterion("pay_type_id =", value, "payTypeId");
            return (Criteria) this;
        }

        public Criteria andPayTypeIdNotEqualTo(Byte value) {
            addCriterion("pay_type_id <>", value, "payTypeId");
            return (Criteria) this;
        }

        public Criteria andPayTypeIdGreaterThan(Byte value) {
            addCriterion("pay_type_id >", value, "payTypeId");
            return (Criteria) this;
        }

        public Criteria andPayTypeIdGreaterThanOrEqualTo(Byte value) {
            addCriterion("pay_type_id >=", value, "payTypeId");
            return (Criteria) this;
        }

        public Criteria andPayTypeIdLessThan(Byte value) {
            addCriterion("pay_type_id <", value, "payTypeId");
            return (Criteria) this;
        }

        public Criteria andPayTypeIdLessThanOrEqualTo(Byte value) {
            addCriterion("pay_type_id <=", value, "payTypeId");
            return (Criteria) this;
        }

        public Criteria andPayTypeIdIn(List<Byte> values) {
            addCriterion("pay_type_id in", values, "payTypeId");
            return (Criteria) this;
        }

        public Criteria andPayTypeIdNotIn(List<Byte> values) {
            addCriterion("pay_type_id not in", values, "payTypeId");
            return (Criteria) this;
        }

        public Criteria andPayTypeIdBetween(Byte value1, Byte value2) {
            addCriterion("pay_type_id between", value1, value2, "payTypeId");
            return (Criteria) this;
        }

        public Criteria andPayTypeIdNotBetween(Byte value1, Byte value2) {
            addCriterion("pay_type_id not between", value1, value2, "payTypeId");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsPriceIsNull() {
            addCriterion("order_goods_price is null");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsPriceIsNotNull() {
            addCriterion("order_goods_price is not null");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsPriceEqualTo(BigDecimal value) {
            addCriterion("order_goods_price =", value, "orderGoodsPrice");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsPriceNotEqualTo(BigDecimal value) {
            addCriterion("order_goods_price <>", value, "orderGoodsPrice");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsPriceGreaterThan(BigDecimal value) {
            addCriterion("order_goods_price >", value, "orderGoodsPrice");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("order_goods_price >=", value, "orderGoodsPrice");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsPriceLessThan(BigDecimal value) {
            addCriterion("order_goods_price <", value, "orderGoodsPrice");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("order_goods_price <=", value, "orderGoodsPrice");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsPriceIn(List<BigDecimal> values) {
            addCriterion("order_goods_price in", values, "orderGoodsPrice");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsPriceNotIn(List<BigDecimal> values) {
            addCriterion("order_goods_price not in", values, "orderGoodsPrice");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_goods_price between", value1, value2, "orderGoodsPrice");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_goods_price not between", value1, value2, "orderGoodsPrice");
            return (Criteria) this;
        }

        public Criteria andDeductionPriceIsNull() {
            addCriterion("deduction_price is null");
            return (Criteria) this;
        }

        public Criteria andDeductionPriceIsNotNull() {
            addCriterion("deduction_price is not null");
            return (Criteria) this;
        }

        public Criteria andDeductionPriceEqualTo(BigDecimal value) {
            addCriterion("deduction_price =", value, "deductionPrice");
            return (Criteria) this;
        }

        public Criteria andDeductionPriceNotEqualTo(BigDecimal value) {
            addCriterion("deduction_price <>", value, "deductionPrice");
            return (Criteria) this;
        }

        public Criteria andDeductionPriceGreaterThan(BigDecimal value) {
            addCriterion("deduction_price >", value, "deductionPrice");
            return (Criteria) this;
        }

        public Criteria andDeductionPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("deduction_price >=", value, "deductionPrice");
            return (Criteria) this;
        }

        public Criteria andDeductionPriceLessThan(BigDecimal value) {
            addCriterion("deduction_price <", value, "deductionPrice");
            return (Criteria) this;
        }

        public Criteria andDeductionPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("deduction_price <=", value, "deductionPrice");
            return (Criteria) this;
        }

        public Criteria andDeductionPriceIn(List<BigDecimal> values) {
            addCriterion("deduction_price in", values, "deductionPrice");
            return (Criteria) this;
        }

        public Criteria andDeductionPriceNotIn(List<BigDecimal> values) {
            addCriterion("deduction_price not in", values, "deductionPrice");
            return (Criteria) this;
        }

        public Criteria andDeductionPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("deduction_price between", value1, value2, "deductionPrice");
            return (Criteria) this;
        }

        public Criteria andDeductionPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("deduction_price not between", value1, value2, "deductionPrice");
            return (Criteria) this;
        }

        public Criteria andRefundIdIsNull() {
            addCriterion("refund_id is null");
            return (Criteria) this;
        }

        public Criteria andRefundIdIsNotNull() {
            addCriterion("refund_id is not null");
            return (Criteria) this;
        }

        public Criteria andRefundIdEqualTo(Integer value) {
            addCriterion("refund_id =", value, "refundId");
            return (Criteria) this;
        }

        public Criteria andRefundIdNotEqualTo(Integer value) {
            addCriterion("refund_id <>", value, "refundId");
            return (Criteria) this;
        }

        public Criteria andRefundIdGreaterThan(Integer value) {
            addCriterion("refund_id >", value, "refundId");
            return (Criteria) this;
        }

        public Criteria andRefundIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("refund_id >=", value, "refundId");
            return (Criteria) this;
        }

        public Criteria andRefundIdLessThan(Integer value) {
            addCriterion("refund_id <", value, "refundId");
            return (Criteria) this;
        }

        public Criteria andRefundIdLessThanOrEqualTo(Integer value) {
            addCriterion("refund_id <=", value, "refundId");
            return (Criteria) this;
        }

        public Criteria andRefundIdIn(List<Integer> values) {
            addCriterion("refund_id in", values, "refundId");
            return (Criteria) this;
        }

        public Criteria andRefundIdNotIn(List<Integer> values) {
            addCriterion("refund_id not in", values, "refundId");
            return (Criteria) this;
        }

        public Criteria andRefundIdBetween(Integer value1, Integer value2) {
            addCriterion("refund_id between", value1, value2, "refundId");
            return (Criteria) this;
        }

        public Criteria andRefundIdNotBetween(Integer value1, Integer value2) {
            addCriterion("refund_id not between", value1, value2, "refundId");
            return (Criteria) this;
        }

        public Criteria andIsPluginIsNull() {
            addCriterion("is_plugin is null");
            return (Criteria) this;
        }

        public Criteria andIsPluginIsNotNull() {
            addCriterion("is_plugin is not null");
            return (Criteria) this;
        }

        public Criteria andIsPluginEqualTo(Integer value) {
            addCriterion("is_plugin =", value, "isPlugin");
            return (Criteria) this;
        }

        public Criteria andIsPluginNotEqualTo(Integer value) {
            addCriterion("is_plugin <>", value, "isPlugin");
            return (Criteria) this;
        }

        public Criteria andIsPluginGreaterThan(Integer value) {
            addCriterion("is_plugin >", value, "isPlugin");
            return (Criteria) this;
        }

        public Criteria andIsPluginGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_plugin >=", value, "isPlugin");
            return (Criteria) this;
        }

        public Criteria andIsPluginLessThan(Integer value) {
            addCriterion("is_plugin <", value, "isPlugin");
            return (Criteria) this;
        }

        public Criteria andIsPluginLessThanOrEqualTo(Integer value) {
            addCriterion("is_plugin <=", value, "isPlugin");
            return (Criteria) this;
        }

        public Criteria andIsPluginIn(List<Integer> values) {
            addCriterion("is_plugin in", values, "isPlugin");
            return (Criteria) this;
        }

        public Criteria andIsPluginNotIn(List<Integer> values) {
            addCriterion("is_plugin not in", values, "isPlugin");
            return (Criteria) this;
        }

        public Criteria andIsPluginBetween(Integer value1, Integer value2) {
            addCriterion("is_plugin between", value1, value2, "isPlugin");
            return (Criteria) this;
        }

        public Criteria andIsPluginNotBetween(Integer value1, Integer value2) {
            addCriterion("is_plugin not between", value1, value2, "isPlugin");
            return (Criteria) this;
        }

        public Criteria andChangePriceIsNull() {
            addCriterion("change_price is null");
            return (Criteria) this;
        }

        public Criteria andChangePriceIsNotNull() {
            addCriterion("change_price is not null");
            return (Criteria) this;
        }

        public Criteria andChangePriceEqualTo(BigDecimal value) {
            addCriterion("change_price =", value, "changePrice");
            return (Criteria) this;
        }

        public Criteria andChangePriceNotEqualTo(BigDecimal value) {
            addCriterion("change_price <>", value, "changePrice");
            return (Criteria) this;
        }

        public Criteria andChangePriceGreaterThan(BigDecimal value) {
            addCriterion("change_price >", value, "changePrice");
            return (Criteria) this;
        }

        public Criteria andChangePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("change_price >=", value, "changePrice");
            return (Criteria) this;
        }

        public Criteria andChangePriceLessThan(BigDecimal value) {
            addCriterion("change_price <", value, "changePrice");
            return (Criteria) this;
        }

        public Criteria andChangePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("change_price <=", value, "changePrice");
            return (Criteria) this;
        }

        public Criteria andChangePriceIn(List<BigDecimal> values) {
            addCriterion("change_price in", values, "changePrice");
            return (Criteria) this;
        }

        public Criteria andChangePriceNotIn(List<BigDecimal> values) {
            addCriterion("change_price not in", values, "changePrice");
            return (Criteria) this;
        }

        public Criteria andChangePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("change_price between", value1, value2, "changePrice");
            return (Criteria) this;
        }

        public Criteria andChangePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("change_price not between", value1, value2, "changePrice");
            return (Criteria) this;
        }

        public Criteria andChangeDispatchPriceIsNull() {
            addCriterion("change_dispatch_price is null");
            return (Criteria) this;
        }

        public Criteria andChangeDispatchPriceIsNotNull() {
            addCriterion("change_dispatch_price is not null");
            return (Criteria) this;
        }

        public Criteria andChangeDispatchPriceEqualTo(BigDecimal value) {
            addCriterion("change_dispatch_price =", value, "changeDispatchPrice");
            return (Criteria) this;
        }

        public Criteria andChangeDispatchPriceNotEqualTo(BigDecimal value) {
            addCriterion("change_dispatch_price <>", value, "changeDispatchPrice");
            return (Criteria) this;
        }

        public Criteria andChangeDispatchPriceGreaterThan(BigDecimal value) {
            addCriterion("change_dispatch_price >", value, "changeDispatchPrice");
            return (Criteria) this;
        }

        public Criteria andChangeDispatchPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("change_dispatch_price >=", value, "changeDispatchPrice");
            return (Criteria) this;
        }

        public Criteria andChangeDispatchPriceLessThan(BigDecimal value) {
            addCriterion("change_dispatch_price <", value, "changeDispatchPrice");
            return (Criteria) this;
        }

        public Criteria andChangeDispatchPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("change_dispatch_price <=", value, "changeDispatchPrice");
            return (Criteria) this;
        }

        public Criteria andChangeDispatchPriceIn(List<BigDecimal> values) {
            addCriterion("change_dispatch_price in", values, "changeDispatchPrice");
            return (Criteria) this;
        }

        public Criteria andChangeDispatchPriceNotIn(List<BigDecimal> values) {
            addCriterion("change_dispatch_price not in", values, "changeDispatchPrice");
            return (Criteria) this;
        }

        public Criteria andChangeDispatchPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("change_dispatch_price between", value1, value2, "changeDispatchPrice");
            return (Criteria) this;
        }

        public Criteria andChangeDispatchPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("change_dispatch_price not between", value1, value2, "changeDispatchPrice");
            return (Criteria) this;
        }

        public Criteria andCommentStatusIsNull() {
            addCriterion("comment_status is null");
            return (Criteria) this;
        }

        public Criteria andCommentStatusIsNotNull() {
            addCriterion("comment_status is not null");
            return (Criteria) this;
        }

        public Criteria andCommentStatusEqualTo(Byte value) {
            addCriterion("comment_status =", value, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusNotEqualTo(Byte value) {
            addCriterion("comment_status <>", value, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusGreaterThan(Byte value) {
            addCriterion("comment_status >", value, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("comment_status >=", value, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusLessThan(Byte value) {
            addCriterion("comment_status <", value, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusLessThanOrEqualTo(Byte value) {
            addCriterion("comment_status <=", value, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusIn(List<Byte> values) {
            addCriterion("comment_status in", values, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusNotIn(List<Byte> values) {
            addCriterion("comment_status not in", values, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusBetween(Byte value1, Byte value2) {
            addCriterion("comment_status between", value1, value2, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("comment_status not between", value1, value2, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andOrderPayIdIsNull() {
            addCriterion("order_pay_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderPayIdIsNotNull() {
            addCriterion("order_pay_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderPayIdEqualTo(String value) {
            addCriterion("order_pay_id =", value, "orderPayId");
            return (Criteria) this;
        }

        public Criteria andOrderPayIdNotEqualTo(String value) {
            addCriterion("order_pay_id <>", value, "orderPayId");
            return (Criteria) this;
        }

        public Criteria andOrderPayIdGreaterThan(String value) {
            addCriterion("order_pay_id >", value, "orderPayId");
            return (Criteria) this;
        }

        public Criteria andOrderPayIdGreaterThanOrEqualTo(String value) {
            addCriterion("order_pay_id >=", value, "orderPayId");
            return (Criteria) this;
        }

        public Criteria andOrderPayIdLessThan(String value) {
            addCriterion("order_pay_id <", value, "orderPayId");
            return (Criteria) this;
        }

        public Criteria andOrderPayIdLessThanOrEqualTo(String value) {
            addCriterion("order_pay_id <=", value, "orderPayId");
            return (Criteria) this;
        }

        public Criteria andOrderPayIdLike(String value) {
            addCriterion("order_pay_id like", value, "orderPayId");
            return (Criteria) this;
        }

        public Criteria andOrderPayIdNotLike(String value) {
            addCriterion("order_pay_id not like", value, "orderPayId");
            return (Criteria) this;
        }

        public Criteria andOrderPayIdIn(List<String> values) {
            addCriterion("order_pay_id in", values, "orderPayId");
            return (Criteria) this;
        }

        public Criteria andOrderPayIdNotIn(List<String> values) {
            addCriterion("order_pay_id not in", values, "orderPayId");
            return (Criteria) this;
        }

        public Criteria andOrderPayIdBetween(String value1, String value2) {
            addCriterion("order_pay_id between", value1, value2, "orderPayId");
            return (Criteria) this;
        }

        public Criteria andOrderPayIdNotBetween(String value1, String value2) {
            addCriterion("order_pay_id not between", value1, value2, "orderPayId");
            return (Criteria) this;
        }

        public Criteria andIsVirtualIsNull() {
            addCriterion("is_virtual is null");
            return (Criteria) this;
        }

        public Criteria andIsVirtualIsNotNull() {
            addCriterion("is_virtual is not null");
            return (Criteria) this;
        }

        public Criteria andIsVirtualEqualTo(Byte value) {
            addCriterion("is_virtual =", value, "isVirtual");
            return (Criteria) this;
        }

        public Criteria andIsVirtualNotEqualTo(Byte value) {
            addCriterion("is_virtual <>", value, "isVirtual");
            return (Criteria) this;
        }

        public Criteria andIsVirtualGreaterThan(Byte value) {
            addCriterion("is_virtual >", value, "isVirtual");
            return (Criteria) this;
        }

        public Criteria andIsVirtualGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_virtual >=", value, "isVirtual");
            return (Criteria) this;
        }

        public Criteria andIsVirtualLessThan(Byte value) {
            addCriterion("is_virtual <", value, "isVirtual");
            return (Criteria) this;
        }

        public Criteria andIsVirtualLessThanOrEqualTo(Byte value) {
            addCriterion("is_virtual <=", value, "isVirtual");
            return (Criteria) this;
        }

        public Criteria andIsVirtualIn(List<Byte> values) {
            addCriterion("is_virtual in", values, "isVirtual");
            return (Criteria) this;
        }

        public Criteria andIsVirtualNotIn(List<Byte> values) {
            addCriterion("is_virtual not in", values, "isVirtual");
            return (Criteria) this;
        }

        public Criteria andIsVirtualBetween(Byte value1, Byte value2) {
            addCriterion("is_virtual between", value1, value2, "isVirtual");
            return (Criteria) this;
        }

        public Criteria andIsVirtualNotBetween(Byte value1, Byte value2) {
            addCriterion("is_virtual not between", value1, value2, "isVirtual");
            return (Criteria) this;
        }

        public Criteria andPluginIdIsNull() {
            addCriterion("plugin_id is null");
            return (Criteria) this;
        }

        public Criteria andPluginIdIsNotNull() {
            addCriterion("plugin_id is not null");
            return (Criteria) this;
        }

        public Criteria andPluginIdEqualTo(Integer value) {
            addCriterion("plugin_id =", value, "pluginId");
            return (Criteria) this;
        }

        public Criteria andPluginIdNotEqualTo(Integer value) {
            addCriterion("plugin_id <>", value, "pluginId");
            return (Criteria) this;
        }

        public Criteria andPluginIdGreaterThan(Integer value) {
            addCriterion("plugin_id >", value, "pluginId");
            return (Criteria) this;
        }

        public Criteria andPluginIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("plugin_id >=", value, "pluginId");
            return (Criteria) this;
        }

        public Criteria andPluginIdLessThan(Integer value) {
            addCriterion("plugin_id <", value, "pluginId");
            return (Criteria) this;
        }

        public Criteria andPluginIdLessThanOrEqualTo(Integer value) {
            addCriterion("plugin_id <=", value, "pluginId");
            return (Criteria) this;
        }

        public Criteria andPluginIdIn(List<Integer> values) {
            addCriterion("plugin_id in", values, "pluginId");
            return (Criteria) this;
        }

        public Criteria andPluginIdNotIn(List<Integer> values) {
            addCriterion("plugin_id not in", values, "pluginId");
            return (Criteria) this;
        }

        public Criteria andPluginIdBetween(Integer value1, Integer value2) {
            addCriterion("plugin_id between", value1, value2, "pluginId");
            return (Criteria) this;
        }

        public Criteria andPluginIdNotBetween(Integer value1, Integer value2) {
            addCriterion("plugin_id not between", value1, value2, "pluginId");
            return (Criteria) this;
        }

        public Criteria andMarkIsNull() {
            addCriterion("mark is null");
            return (Criteria) this;
        }

        public Criteria andMarkIsNotNull() {
            addCriterion("mark is not null");
            return (Criteria) this;
        }

        public Criteria andMarkEqualTo(String value) {
            addCriterion("mark =", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotEqualTo(String value) {
            addCriterion("mark <>", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkGreaterThan(String value) {
            addCriterion("mark >", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkGreaterThanOrEqualTo(String value) {
            addCriterion("mark >=", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkLessThan(String value) {
            addCriterion("mark <", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkLessThanOrEqualTo(String value) {
            addCriterion("mark <=", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkLike(String value) {
            addCriterion("mark like", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotLike(String value) {
            addCriterion("mark not like", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkIn(List<String> values) {
            addCriterion("mark in", values, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotIn(List<String> values) {
            addCriterion("mark not in", values, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkBetween(String value1, String value2) {
            addCriterion("mark between", value1, value2, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotBetween(String value1, String value2) {
            addCriterion("mark not between", value1, value2, "mark");
            return (Criteria) this;
        }

        public Criteria andIsPendingIsNull() {
            addCriterion("is_pending is null");
            return (Criteria) this;
        }

        public Criteria andIsPendingIsNotNull() {
            addCriterion("is_pending is not null");
            return (Criteria) this;
        }

        public Criteria andIsPendingEqualTo(Byte value) {
            addCriterion("is_pending =", value, "isPending");
            return (Criteria) this;
        }

        public Criteria andIsPendingNotEqualTo(Byte value) {
            addCriterion("is_pending <>", value, "isPending");
            return (Criteria) this;
        }

        public Criteria andIsPendingGreaterThan(Byte value) {
            addCriterion("is_pending >", value, "isPending");
            return (Criteria) this;
        }

        public Criteria andIsPendingGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_pending >=", value, "isPending");
            return (Criteria) this;
        }

        public Criteria andIsPendingLessThan(Byte value) {
            addCriterion("is_pending <", value, "isPending");
            return (Criteria) this;
        }

        public Criteria andIsPendingLessThanOrEqualTo(Byte value) {
            addCriterion("is_pending <=", value, "isPending");
            return (Criteria) this;
        }

        public Criteria andIsPendingIn(List<Byte> values) {
            addCriterion("is_pending in", values, "isPending");
            return (Criteria) this;
        }

        public Criteria andIsPendingNotIn(List<Byte> values) {
            addCriterion("is_pending not in", values, "isPending");
            return (Criteria) this;
        }

        public Criteria andIsPendingBetween(Byte value1, Byte value2) {
            addCriterion("is_pending between", value1, value2, "isPending");
            return (Criteria) this;
        }

        public Criteria andIsPendingNotBetween(Byte value1, Byte value2) {
            addCriterion("is_pending not between", value1, value2, "isPending");
            return (Criteria) this;
        }

        public Criteria andCostAmountIsNull() {
            addCriterion("cost_amount is null");
            return (Criteria) this;
        }

        public Criteria andCostAmountIsNotNull() {
            addCriterion("cost_amount is not null");
            return (Criteria) this;
        }

        public Criteria andCostAmountEqualTo(BigDecimal value) {
            addCriterion("cost_amount =", value, "costAmount");
            return (Criteria) this;
        }

        public Criteria andCostAmountNotEqualTo(BigDecimal value) {
            addCriterion("cost_amount <>", value, "costAmount");
            return (Criteria) this;
        }

        public Criteria andCostAmountGreaterThan(BigDecimal value) {
            addCriterion("cost_amount >", value, "costAmount");
            return (Criteria) this;
        }

        public Criteria andCostAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cost_amount >=", value, "costAmount");
            return (Criteria) this;
        }

        public Criteria andCostAmountLessThan(BigDecimal value) {
            addCriterion("cost_amount <", value, "costAmount");
            return (Criteria) this;
        }

        public Criteria andCostAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cost_amount <=", value, "costAmount");
            return (Criteria) this;
        }

        public Criteria andCostAmountIn(List<BigDecimal> values) {
            addCriterion("cost_amount in", values, "costAmount");
            return (Criteria) this;
        }

        public Criteria andCostAmountNotIn(List<BigDecimal> values) {
            addCriterion("cost_amount not in", values, "costAmount");
            return (Criteria) this;
        }

        public Criteria andCostAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cost_amount between", value1, value2, "costAmount");
            return (Criteria) this;
        }

        public Criteria andCostAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cost_amount not between", value1, value2, "costAmount");
            return (Criteria) this;
        }

        public Criteria andShopNameIsNull() {
            addCriterion("shop_name is null");
            return (Criteria) this;
        }

        public Criteria andShopNameIsNotNull() {
            addCriterion("shop_name is not null");
            return (Criteria) this;
        }

        public Criteria andShopNameEqualTo(String value) {
            addCriterion("shop_name =", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotEqualTo(String value) {
            addCriterion("shop_name <>", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameGreaterThan(String value) {
            addCriterion("shop_name >", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameGreaterThanOrEqualTo(String value) {
            addCriterion("shop_name >=", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLessThan(String value) {
            addCriterion("shop_name <", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLessThanOrEqualTo(String value) {
            addCriterion("shop_name <=", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLike(String value) {
            addCriterion("shop_name like", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotLike(String value) {
            addCriterion("shop_name not like", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameIn(List<String> values) {
            addCriterion("shop_name in", values, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotIn(List<String> values) {
            addCriterion("shop_name not in", values, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameBetween(String value1, String value2) {
            addCriterion("shop_name between", value1, value2, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotBetween(String value1, String value2) {
            addCriterion("shop_name not between", value1, value2, "shopName");
            return (Criteria) this;
        }

        public Criteria andNoRefundIsNull() {
            addCriterion("no_refund is null");
            return (Criteria) this;
        }

        public Criteria andNoRefundIsNotNull() {
            addCriterion("no_refund is not null");
            return (Criteria) this;
        }

        public Criteria andNoRefundEqualTo(Byte value) {
            addCriterion("no_refund =", value, "noRefund");
            return (Criteria) this;
        }

        public Criteria andNoRefundNotEqualTo(Byte value) {
            addCriterion("no_refund <>", value, "noRefund");
            return (Criteria) this;
        }

        public Criteria andNoRefundGreaterThan(Byte value) {
            addCriterion("no_refund >", value, "noRefund");
            return (Criteria) this;
        }

        public Criteria andNoRefundGreaterThanOrEqualTo(Byte value) {
            addCriterion("no_refund >=", value, "noRefund");
            return (Criteria) this;
        }

        public Criteria andNoRefundLessThan(Byte value) {
            addCriterion("no_refund <", value, "noRefund");
            return (Criteria) this;
        }

        public Criteria andNoRefundLessThanOrEqualTo(Byte value) {
            addCriterion("no_refund <=", value, "noRefund");
            return (Criteria) this;
        }

        public Criteria andNoRefundIn(List<Byte> values) {
            addCriterion("no_refund in", values, "noRefund");
            return (Criteria) this;
        }

        public Criteria andNoRefundNotIn(List<Byte> values) {
            addCriterion("no_refund not in", values, "noRefund");
            return (Criteria) this;
        }

        public Criteria andNoRefundBetween(Byte value1, Byte value2) {
            addCriterion("no_refund between", value1, value2, "noRefund");
            return (Criteria) this;
        }

        public Criteria andNoRefundNotBetween(Byte value1, Byte value2) {
            addCriterion("no_refund not between", value1, value2, "noRefund");
            return (Criteria) this;
        }

        public Criteria andNeedAddressIsNull() {
            addCriterion("need_address is null");
            return (Criteria) this;
        }

        public Criteria andNeedAddressIsNotNull() {
            addCriterion("need_address is not null");
            return (Criteria) this;
        }

        public Criteria andNeedAddressEqualTo(Byte value) {
            addCriterion("need_address =", value, "needAddress");
            return (Criteria) this;
        }

        public Criteria andNeedAddressNotEqualTo(Byte value) {
            addCriterion("need_address <>", value, "needAddress");
            return (Criteria) this;
        }

        public Criteria andNeedAddressGreaterThan(Byte value) {
            addCriterion("need_address >", value, "needAddress");
            return (Criteria) this;
        }

        public Criteria andNeedAddressGreaterThanOrEqualTo(Byte value) {
            addCriterion("need_address >=", value, "needAddress");
            return (Criteria) this;
        }

        public Criteria andNeedAddressLessThan(Byte value) {
            addCriterion("need_address <", value, "needAddress");
            return (Criteria) this;
        }

        public Criteria andNeedAddressLessThanOrEqualTo(Byte value) {
            addCriterion("need_address <=", value, "needAddress");
            return (Criteria) this;
        }

        public Criteria andNeedAddressIn(List<Byte> values) {
            addCriterion("need_address in", values, "needAddress");
            return (Criteria) this;
        }

        public Criteria andNeedAddressNotIn(List<Byte> values) {
            addCriterion("need_address not in", values, "needAddress");
            return (Criteria) this;
        }

        public Criteria andNeedAddressBetween(Byte value1, Byte value2) {
            addCriterion("need_address between", value1, value2, "needAddress");
            return (Criteria) this;
        }

        public Criteria andNeedAddressNotBetween(Byte value1, Byte value2) {
            addCriterion("need_address not between", value1, value2, "needAddress");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeIsNull() {
            addCriterion("invoice_type is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeIsNotNull() {
            addCriterion("invoice_type is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeEqualTo(Integer value) {
            addCriterion("invoice_type =", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeNotEqualTo(Integer value) {
            addCriterion("invoice_type <>", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeGreaterThan(Integer value) {
            addCriterion("invoice_type >", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("invoice_type >=", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeLessThan(Integer value) {
            addCriterion("invoice_type <", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeLessThanOrEqualTo(Integer value) {
            addCriterion("invoice_type <=", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeIn(List<Integer> values) {
            addCriterion("invoice_type in", values, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeNotIn(List<Integer> values) {
            addCriterion("invoice_type not in", values, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeBetween(Integer value1, Integer value2) {
            addCriterion("invoice_type between", value1, value2, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("invoice_type not between", value1, value2, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andRiseTypeIsNull() {
            addCriterion("rise_type is null");
            return (Criteria) this;
        }

        public Criteria andRiseTypeIsNotNull() {
            addCriterion("rise_type is not null");
            return (Criteria) this;
        }

        public Criteria andRiseTypeEqualTo(Integer value) {
            addCriterion("rise_type =", value, "riseType");
            return (Criteria) this;
        }

        public Criteria andRiseTypeNotEqualTo(Integer value) {
            addCriterion("rise_type <>", value, "riseType");
            return (Criteria) this;
        }

        public Criteria andRiseTypeGreaterThan(Integer value) {
            addCriterion("rise_type >", value, "riseType");
            return (Criteria) this;
        }

        public Criteria andRiseTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("rise_type >=", value, "riseType");
            return (Criteria) this;
        }

        public Criteria andRiseTypeLessThan(Integer value) {
            addCriterion("rise_type <", value, "riseType");
            return (Criteria) this;
        }

        public Criteria andRiseTypeLessThanOrEqualTo(Integer value) {
            addCriterion("rise_type <=", value, "riseType");
            return (Criteria) this;
        }

        public Criteria andRiseTypeIn(List<Integer> values) {
            addCriterion("rise_type in", values, "riseType");
            return (Criteria) this;
        }

        public Criteria andRiseTypeNotIn(List<Integer> values) {
            addCriterion("rise_type not in", values, "riseType");
            return (Criteria) this;
        }

        public Criteria andRiseTypeBetween(Integer value1, Integer value2) {
            addCriterion("rise_type between", value1, value2, "riseType");
            return (Criteria) this;
        }

        public Criteria andRiseTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("rise_type not between", value1, value2, "riseType");
            return (Criteria) this;
        }

        public Criteria andCollectNameIsNull() {
            addCriterion("collect_name is null");
            return (Criteria) this;
        }

        public Criteria andCollectNameIsNotNull() {
            addCriterion("collect_name is not null");
            return (Criteria) this;
        }

        public Criteria andCollectNameEqualTo(String value) {
            addCriterion("collect_name =", value, "collectName");
            return (Criteria) this;
        }

        public Criteria andCollectNameNotEqualTo(String value) {
            addCriterion("collect_name <>", value, "collectName");
            return (Criteria) this;
        }

        public Criteria andCollectNameGreaterThan(String value) {
            addCriterion("collect_name >", value, "collectName");
            return (Criteria) this;
        }

        public Criteria andCollectNameGreaterThanOrEqualTo(String value) {
            addCriterion("collect_name >=", value, "collectName");
            return (Criteria) this;
        }

        public Criteria andCollectNameLessThan(String value) {
            addCriterion("collect_name <", value, "collectName");
            return (Criteria) this;
        }

        public Criteria andCollectNameLessThanOrEqualTo(String value) {
            addCriterion("collect_name <=", value, "collectName");
            return (Criteria) this;
        }

        public Criteria andCollectNameLike(String value) {
            addCriterion("collect_name like", value, "collectName");
            return (Criteria) this;
        }

        public Criteria andCollectNameNotLike(String value) {
            addCriterion("collect_name not like", value, "collectName");
            return (Criteria) this;
        }

        public Criteria andCollectNameIn(List<String> values) {
            addCriterion("collect_name in", values, "collectName");
            return (Criteria) this;
        }

        public Criteria andCollectNameNotIn(List<String> values) {
            addCriterion("collect_name not in", values, "collectName");
            return (Criteria) this;
        }

        public Criteria andCollectNameBetween(String value1, String value2) {
            addCriterion("collect_name between", value1, value2, "collectName");
            return (Criteria) this;
        }

        public Criteria andCollectNameNotBetween(String value1, String value2) {
            addCriterion("collect_name not between", value1, value2, "collectName");
            return (Criteria) this;
        }

        public Criteria andCompanyNumberIsNull() {
            addCriterion("company_number is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNumberIsNotNull() {
            addCriterion("company_number is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNumberEqualTo(String value) {
            addCriterion("company_number =", value, "companyNumber");
            return (Criteria) this;
        }

        public Criteria andCompanyNumberNotEqualTo(String value) {
            addCriterion("company_number <>", value, "companyNumber");
            return (Criteria) this;
        }

        public Criteria andCompanyNumberGreaterThan(String value) {
            addCriterion("company_number >", value, "companyNumber");
            return (Criteria) this;
        }

        public Criteria andCompanyNumberGreaterThanOrEqualTo(String value) {
            addCriterion("company_number >=", value, "companyNumber");
            return (Criteria) this;
        }

        public Criteria andCompanyNumberLessThan(String value) {
            addCriterion("company_number <", value, "companyNumber");
            return (Criteria) this;
        }

        public Criteria andCompanyNumberLessThanOrEqualTo(String value) {
            addCriterion("company_number <=", value, "companyNumber");
            return (Criteria) this;
        }

        public Criteria andCompanyNumberLike(String value) {
            addCriterion("company_number like", value, "companyNumber");
            return (Criteria) this;
        }

        public Criteria andCompanyNumberNotLike(String value) {
            addCriterion("company_number not like", value, "companyNumber");
            return (Criteria) this;
        }

        public Criteria andCompanyNumberIn(List<String> values) {
            addCriterion("company_number in", values, "companyNumber");
            return (Criteria) this;
        }

        public Criteria andCompanyNumberNotIn(List<String> values) {
            addCriterion("company_number not in", values, "companyNumber");
            return (Criteria) this;
        }

        public Criteria andCompanyNumberBetween(String value1, String value2) {
            addCriterion("company_number between", value1, value2, "companyNumber");
            return (Criteria) this;
        }

        public Criteria andCompanyNumberNotBetween(String value1, String value2) {
            addCriterion("company_number not between", value1, value2, "companyNumber");
            return (Criteria) this;
        }

        public Criteria andInvoiceIsNull() {
            addCriterion("invoice is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceIsNotNull() {
            addCriterion("invoice is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceEqualTo(String value) {
            addCriterion("invoice =", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceNotEqualTo(String value) {
            addCriterion("invoice <>", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceGreaterThan(String value) {
            addCriterion("invoice >", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceGreaterThanOrEqualTo(String value) {
            addCriterion("invoice >=", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceLessThan(String value) {
            addCriterion("invoice <", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceLessThanOrEqualTo(String value) {
            addCriterion("invoice <=", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceLike(String value) {
            addCriterion("invoice like", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceNotLike(String value) {
            addCriterion("invoice not like", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceIn(List<String> values) {
            addCriterion("invoice in", values, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceNotIn(List<String> values) {
            addCriterion("invoice not in", values, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceBetween(String value1, String value2) {
            addCriterion("invoice between", value1, value2, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceNotBetween(String value1, String value2) {
            addCriterion("invoice not between", value1, value2, "invoice");
            return (Criteria) this;
        }

        public Criteria andAutoReceiptIsNull() {
            addCriterion("auto_receipt is null");
            return (Criteria) this;
        }

        public Criteria andAutoReceiptIsNotNull() {
            addCriterion("auto_receipt is not null");
            return (Criteria) this;
        }

        public Criteria andAutoReceiptEqualTo(Byte value) {
            addCriterion("auto_receipt =", value, "autoReceipt");
            return (Criteria) this;
        }

        public Criteria andAutoReceiptNotEqualTo(Byte value) {
            addCriterion("auto_receipt <>", value, "autoReceipt");
            return (Criteria) this;
        }

        public Criteria andAutoReceiptGreaterThan(Byte value) {
            addCriterion("auto_receipt >", value, "autoReceipt");
            return (Criteria) this;
        }

        public Criteria andAutoReceiptGreaterThanOrEqualTo(Byte value) {
            addCriterion("auto_receipt >=", value, "autoReceipt");
            return (Criteria) this;
        }

        public Criteria andAutoReceiptLessThan(Byte value) {
            addCriterion("auto_receipt <", value, "autoReceipt");
            return (Criteria) this;
        }

        public Criteria andAutoReceiptLessThanOrEqualTo(Byte value) {
            addCriterion("auto_receipt <=", value, "autoReceipt");
            return (Criteria) this;
        }

        public Criteria andAutoReceiptIn(List<Byte> values) {
            addCriterion("auto_receipt in", values, "autoReceipt");
            return (Criteria) this;
        }

        public Criteria andAutoReceiptNotIn(List<Byte> values) {
            addCriterion("auto_receipt not in", values, "autoReceipt");
            return (Criteria) this;
        }

        public Criteria andAutoReceiptBetween(Byte value1, Byte value2) {
            addCriterion("auto_receipt between", value1, value2, "autoReceipt");
            return (Criteria) this;
        }

        public Criteria andAutoReceiptNotBetween(Byte value1, Byte value2) {
            addCriterion("auto_receipt not between", value1, value2, "autoReceipt");
            return (Criteria) this;
        }

        public Criteria andFeeAmountIsNull() {
            addCriterion("fee_amount is null");
            return (Criteria) this;
        }

        public Criteria andFeeAmountIsNotNull() {
            addCriterion("fee_amount is not null");
            return (Criteria) this;
        }

        public Criteria andFeeAmountEqualTo(BigDecimal value) {
            addCriterion("fee_amount =", value, "feeAmount");
            return (Criteria) this;
        }

        public Criteria andFeeAmountNotEqualTo(BigDecimal value) {
            addCriterion("fee_amount <>", value, "feeAmount");
            return (Criteria) this;
        }

        public Criteria andFeeAmountGreaterThan(BigDecimal value) {
            addCriterion("fee_amount >", value, "feeAmount");
            return (Criteria) this;
        }

        public Criteria andFeeAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fee_amount >=", value, "feeAmount");
            return (Criteria) this;
        }

        public Criteria andFeeAmountLessThan(BigDecimal value) {
            addCriterion("fee_amount <", value, "feeAmount");
            return (Criteria) this;
        }

        public Criteria andFeeAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fee_amount <=", value, "feeAmount");
            return (Criteria) this;
        }

        public Criteria andFeeAmountIn(List<BigDecimal> values) {
            addCriterion("fee_amount in", values, "feeAmount");
            return (Criteria) this;
        }

        public Criteria andFeeAmountNotIn(List<BigDecimal> values) {
            addCriterion("fee_amount not in", values, "feeAmount");
            return (Criteria) this;
        }

        public Criteria andFeeAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fee_amount between", value1, value2, "feeAmount");
            return (Criteria) this;
        }

        public Criteria andFeeAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fee_amount not between", value1, value2, "feeAmount");
            return (Criteria) this;
        }

        public Criteria andIsImportIsNull() {
            addCriterion("is_import is null");
            return (Criteria) this;
        }

        public Criteria andIsImportIsNotNull() {
            addCriterion("is_import is not null");
            return (Criteria) this;
        }

        public Criteria andIsImportEqualTo(Integer value) {
            addCriterion("is_import =", value, "isImport");
            return (Criteria) this;
        }

        public Criteria andIsImportNotEqualTo(Integer value) {
            addCriterion("is_import <>", value, "isImport");
            return (Criteria) this;
        }

        public Criteria andIsImportGreaterThan(Integer value) {
            addCriterion("is_import >", value, "isImport");
            return (Criteria) this;
        }

        public Criteria andIsImportGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_import >=", value, "isImport");
            return (Criteria) this;
        }

        public Criteria andIsImportLessThan(Integer value) {
            addCriterion("is_import <", value, "isImport");
            return (Criteria) this;
        }

        public Criteria andIsImportLessThanOrEqualTo(Integer value) {
            addCriterion("is_import <=", value, "isImport");
            return (Criteria) this;
        }

        public Criteria andIsImportIn(List<Integer> values) {
            addCriterion("is_import in", values, "isImport");
            return (Criteria) this;
        }

        public Criteria andIsImportNotIn(List<Integer> values) {
            addCriterion("is_import not in", values, "isImport");
            return (Criteria) this;
        }

        public Criteria andIsImportBetween(Integer value1, Integer value2) {
            addCriterion("is_import between", value1, value2, "isImport");
            return (Criteria) this;
        }

        public Criteria andIsImportNotBetween(Integer value1, Integer value2) {
            addCriterion("is_import not between", value1, value2, "isImport");
            return (Criteria) this;
        }

        public Criteria andServiceFeeAmountIsNull() {
            addCriterion("service_fee_amount is null");
            return (Criteria) this;
        }

        public Criteria andServiceFeeAmountIsNotNull() {
            addCriterion("service_fee_amount is not null");
            return (Criteria) this;
        }

        public Criteria andServiceFeeAmountEqualTo(BigDecimal value) {
            addCriterion("service_fee_amount =", value, "serviceFeeAmount");
            return (Criteria) this;
        }

        public Criteria andServiceFeeAmountNotEqualTo(BigDecimal value) {
            addCriterion("service_fee_amount <>", value, "serviceFeeAmount");
            return (Criteria) this;
        }

        public Criteria andServiceFeeAmountGreaterThan(BigDecimal value) {
            addCriterion("service_fee_amount >", value, "serviceFeeAmount");
            return (Criteria) this;
        }

        public Criteria andServiceFeeAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("service_fee_amount >=", value, "serviceFeeAmount");
            return (Criteria) this;
        }

        public Criteria andServiceFeeAmountLessThan(BigDecimal value) {
            addCriterion("service_fee_amount <", value, "serviceFeeAmount");
            return (Criteria) this;
        }

        public Criteria andServiceFeeAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("service_fee_amount <=", value, "serviceFeeAmount");
            return (Criteria) this;
        }

        public Criteria andServiceFeeAmountIn(List<BigDecimal> values) {
            addCriterion("service_fee_amount in", values, "serviceFeeAmount");
            return (Criteria) this;
        }

        public Criteria andServiceFeeAmountNotIn(List<BigDecimal> values) {
            addCriterion("service_fee_amount not in", values, "serviceFeeAmount");
            return (Criteria) this;
        }

        public Criteria andServiceFeeAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("service_fee_amount between", value1, value2, "serviceFeeAmount");
            return (Criteria) this;
        }

        public Criteria andServiceFeeAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("service_fee_amount not between", value1, value2, "serviceFeeAmount");
            return (Criteria) this;
        }

        public Criteria andIsAllSendGoodsIsNull() {
            addCriterion("is_all_send_goods is null");
            return (Criteria) this;
        }

        public Criteria andIsAllSendGoodsIsNotNull() {
            addCriterion("is_all_send_goods is not null");
            return (Criteria) this;
        }

        public Criteria andIsAllSendGoodsEqualTo(Integer value) {
            addCriterion("is_all_send_goods =", value, "isAllSendGoods");
            return (Criteria) this;
        }

        public Criteria andIsAllSendGoodsNotEqualTo(Integer value) {
            addCriterion("is_all_send_goods <>", value, "isAllSendGoods");
            return (Criteria) this;
        }

        public Criteria andIsAllSendGoodsGreaterThan(Integer value) {
            addCriterion("is_all_send_goods >", value, "isAllSendGoods");
            return (Criteria) this;
        }

        public Criteria andIsAllSendGoodsGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_all_send_goods >=", value, "isAllSendGoods");
            return (Criteria) this;
        }

        public Criteria andIsAllSendGoodsLessThan(Integer value) {
            addCriterion("is_all_send_goods <", value, "isAllSendGoods");
            return (Criteria) this;
        }

        public Criteria andIsAllSendGoodsLessThanOrEqualTo(Integer value) {
            addCriterion("is_all_send_goods <=", value, "isAllSendGoods");
            return (Criteria) this;
        }

        public Criteria andIsAllSendGoodsIn(List<Integer> values) {
            addCriterion("is_all_send_goods in", values, "isAllSendGoods");
            return (Criteria) this;
        }

        public Criteria andIsAllSendGoodsNotIn(List<Integer> values) {
            addCriterion("is_all_send_goods not in", values, "isAllSendGoods");
            return (Criteria) this;
        }

        public Criteria andIsAllSendGoodsBetween(Integer value1, Integer value2) {
            addCriterion("is_all_send_goods between", value1, value2, "isAllSendGoods");
            return (Criteria) this;
        }

        public Criteria andIsAllSendGoodsNotBetween(Integer value1, Integer value2) {
            addCriterion("is_all_send_goods not between", value1, value2, "isAllSendGoods");
            return (Criteria) this;
        }

        public Criteria andAppointmentTimeIsNull() {
            addCriterion("appointment_time is null");
            return (Criteria) this;
        }

        public Criteria andAppointmentTimeIsNotNull() {
            addCriterion("appointment_time is not null");
            return (Criteria) this;
        }

        public Criteria andAppointmentTimeEqualTo(String value) {
            addCriterion("appointment_time =", value, "appointmentTime");
            return (Criteria) this;
        }

        public Criteria andAppointmentTimeNotEqualTo(String value) {
            addCriterion("appointment_time <>", value, "appointmentTime");
            return (Criteria) this;
        }

        public Criteria andAppointmentTimeGreaterThan(String value) {
            addCriterion("appointment_time >", value, "appointmentTime");
            return (Criteria) this;
        }

        public Criteria andAppointmentTimeGreaterThanOrEqualTo(String value) {
            addCriterion("appointment_time >=", value, "appointmentTime");
            return (Criteria) this;
        }

        public Criteria andAppointmentTimeLessThan(String value) {
            addCriterion("appointment_time <", value, "appointmentTime");
            return (Criteria) this;
        }

        public Criteria andAppointmentTimeLessThanOrEqualTo(String value) {
            addCriterion("appointment_time <=", value, "appointmentTime");
            return (Criteria) this;
        }

        public Criteria andAppointmentTimeLike(String value) {
            addCriterion("appointment_time like", value, "appointmentTime");
            return (Criteria) this;
        }

        public Criteria andAppointmentTimeNotLike(String value) {
            addCriterion("appointment_time not like", value, "appointmentTime");
            return (Criteria) this;
        }

        public Criteria andAppointmentTimeIn(List<String> values) {
            addCriterion("appointment_time in", values, "appointmentTime");
            return (Criteria) this;
        }

        public Criteria andAppointmentTimeNotIn(List<String> values) {
            addCriterion("appointment_time not in", values, "appointmentTime");
            return (Criteria) this;
        }

        public Criteria andAppointmentTimeBetween(String value1, String value2) {
            addCriterion("appointment_time between", value1, value2, "appointmentTime");
            return (Criteria) this;
        }

        public Criteria andAppointmentTimeNotBetween(String value1, String value2) {
            addCriterion("appointment_time not between", value1, value2, "appointmentTime");
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