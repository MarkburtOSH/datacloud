package com.alsyun.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ImsYzGoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ImsYzGoodsExample() {
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

        public Criteria andBrandIdIsNull() {
            addCriterion("brand_id is null");
            return (Criteria) this;
        }

        public Criteria andBrandIdIsNotNull() {
            addCriterion("brand_id is not null");
            return (Criteria) this;
        }

        public Criteria andBrandIdEqualTo(Integer value) {
            addCriterion("brand_id =", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotEqualTo(Integer value) {
            addCriterion("brand_id <>", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdGreaterThan(Integer value) {
            addCriterion("brand_id >", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("brand_id >=", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdLessThan(Integer value) {
            addCriterion("brand_id <", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdLessThanOrEqualTo(Integer value) {
            addCriterion("brand_id <=", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdIn(List<Integer> values) {
            addCriterion("brand_id in", values, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotIn(List<Integer> values) {
            addCriterion("brand_id not in", values, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdBetween(Integer value1, Integer value2) {
            addCriterion("brand_id between", value1, value2, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotBetween(Integer value1, Integer value2) {
            addCriterion("brand_id not between", value1, value2, "brandId");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Boolean value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Boolean value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Boolean value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Boolean value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Boolean value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Boolean> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Boolean> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Boolean value1, Boolean value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("type not between", value1, value2, "type");
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

        public Criteria andStatusEqualTo(Boolean value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Boolean value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Boolean value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Boolean value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Boolean> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Boolean> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andDisplayOrderIsNull() {
            addCriterion("display_order is null");
            return (Criteria) this;
        }

        public Criteria andDisplayOrderIsNotNull() {
            addCriterion("display_order is not null");
            return (Criteria) this;
        }

        public Criteria andDisplayOrderEqualTo(Integer value) {
            addCriterion("display_order =", value, "displayOrder");
            return (Criteria) this;
        }

        public Criteria andDisplayOrderNotEqualTo(Integer value) {
            addCriterion("display_order <>", value, "displayOrder");
            return (Criteria) this;
        }

        public Criteria andDisplayOrderGreaterThan(Integer value) {
            addCriterion("display_order >", value, "displayOrder");
            return (Criteria) this;
        }

        public Criteria andDisplayOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("display_order >=", value, "displayOrder");
            return (Criteria) this;
        }

        public Criteria andDisplayOrderLessThan(Integer value) {
            addCriterion("display_order <", value, "displayOrder");
            return (Criteria) this;
        }

        public Criteria andDisplayOrderLessThanOrEqualTo(Integer value) {
            addCriterion("display_order <=", value, "displayOrder");
            return (Criteria) this;
        }

        public Criteria andDisplayOrderIn(List<Integer> values) {
            addCriterion("display_order in", values, "displayOrder");
            return (Criteria) this;
        }

        public Criteria andDisplayOrderNotIn(List<Integer> values) {
            addCriterion("display_order not in", values, "displayOrder");
            return (Criteria) this;
        }

        public Criteria andDisplayOrderBetween(Integer value1, Integer value2) {
            addCriterion("display_order between", value1, value2, "displayOrder");
            return (Criteria) this;
        }

        public Criteria andDisplayOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("display_order not between", value1, value2, "displayOrder");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andThumbIsNull() {
            addCriterion("thumb is null");
            return (Criteria) this;
        }

        public Criteria andThumbIsNotNull() {
            addCriterion("thumb is not null");
            return (Criteria) this;
        }

        public Criteria andThumbEqualTo(String value) {
            addCriterion("thumb =", value, "thumb");
            return (Criteria) this;
        }

        public Criteria andThumbNotEqualTo(String value) {
            addCriterion("thumb <>", value, "thumb");
            return (Criteria) this;
        }

        public Criteria andThumbGreaterThan(String value) {
            addCriterion("thumb >", value, "thumb");
            return (Criteria) this;
        }

        public Criteria andThumbGreaterThanOrEqualTo(String value) {
            addCriterion("thumb >=", value, "thumb");
            return (Criteria) this;
        }

        public Criteria andThumbLessThan(String value) {
            addCriterion("thumb <", value, "thumb");
            return (Criteria) this;
        }

        public Criteria andThumbLessThanOrEqualTo(String value) {
            addCriterion("thumb <=", value, "thumb");
            return (Criteria) this;
        }

        public Criteria andThumbLike(String value) {
            addCriterion("thumb like", value, "thumb");
            return (Criteria) this;
        }

        public Criteria andThumbNotLike(String value) {
            addCriterion("thumb not like", value, "thumb");
            return (Criteria) this;
        }

        public Criteria andThumbIn(List<String> values) {
            addCriterion("thumb in", values, "thumb");
            return (Criteria) this;
        }

        public Criteria andThumbNotIn(List<String> values) {
            addCriterion("thumb not in", values, "thumb");
            return (Criteria) this;
        }

        public Criteria andThumbBetween(String value1, String value2) {
            addCriterion("thumb between", value1, value2, "thumb");
            return (Criteria) this;
        }

        public Criteria andThumbNotBetween(String value1, String value2) {
            addCriterion("thumb not between", value1, value2, "thumb");
            return (Criteria) this;
        }

        public Criteria andSkuIsNull() {
            addCriterion("sku is null");
            return (Criteria) this;
        }

        public Criteria andSkuIsNotNull() {
            addCriterion("sku is not null");
            return (Criteria) this;
        }

        public Criteria andSkuEqualTo(String value) {
            addCriterion("sku =", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuNotEqualTo(String value) {
            addCriterion("sku <>", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuGreaterThan(String value) {
            addCriterion("sku >", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuGreaterThanOrEqualTo(String value) {
            addCriterion("sku >=", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuLessThan(String value) {
            addCriterion("sku <", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuLessThanOrEqualTo(String value) {
            addCriterion("sku <=", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuLike(String value) {
            addCriterion("sku like", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuNotLike(String value) {
            addCriterion("sku not like", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuIn(List<String> values) {
            addCriterion("sku in", values, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuNotIn(List<String> values) {
            addCriterion("sku not in", values, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuBetween(String value1, String value2) {
            addCriterion("sku between", value1, value2, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuNotBetween(String value1, String value2) {
            addCriterion("sku not between", value1, value2, "sku");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andGoodsSnIsNull() {
            addCriterion("goods_sn is null");
            return (Criteria) this;
        }

        public Criteria andGoodsSnIsNotNull() {
            addCriterion("goods_sn is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsSnEqualTo(String value) {
            addCriterion("goods_sn =", value, "goodsSn");
            return (Criteria) this;
        }

        public Criteria andGoodsSnNotEqualTo(String value) {
            addCriterion("goods_sn <>", value, "goodsSn");
            return (Criteria) this;
        }

        public Criteria andGoodsSnGreaterThan(String value) {
            addCriterion("goods_sn >", value, "goodsSn");
            return (Criteria) this;
        }

        public Criteria andGoodsSnGreaterThanOrEqualTo(String value) {
            addCriterion("goods_sn >=", value, "goodsSn");
            return (Criteria) this;
        }

        public Criteria andGoodsSnLessThan(String value) {
            addCriterion("goods_sn <", value, "goodsSn");
            return (Criteria) this;
        }

        public Criteria andGoodsSnLessThanOrEqualTo(String value) {
            addCriterion("goods_sn <=", value, "goodsSn");
            return (Criteria) this;
        }

        public Criteria andGoodsSnLike(String value) {
            addCriterion("goods_sn like", value, "goodsSn");
            return (Criteria) this;
        }

        public Criteria andGoodsSnNotLike(String value) {
            addCriterion("goods_sn not like", value, "goodsSn");
            return (Criteria) this;
        }

        public Criteria andGoodsSnIn(List<String> values) {
            addCriterion("goods_sn in", values, "goodsSn");
            return (Criteria) this;
        }

        public Criteria andGoodsSnNotIn(List<String> values) {
            addCriterion("goods_sn not in", values, "goodsSn");
            return (Criteria) this;
        }

        public Criteria andGoodsSnBetween(String value1, String value2) {
            addCriterion("goods_sn between", value1, value2, "goodsSn");
            return (Criteria) this;
        }

        public Criteria andGoodsSnNotBetween(String value1, String value2) {
            addCriterion("goods_sn not between", value1, value2, "goodsSn");
            return (Criteria) this;
        }

        public Criteria andProductSnIsNull() {
            addCriterion("product_sn is null");
            return (Criteria) this;
        }

        public Criteria andProductSnIsNotNull() {
            addCriterion("product_sn is not null");
            return (Criteria) this;
        }

        public Criteria andProductSnEqualTo(String value) {
            addCriterion("product_sn =", value, "productSn");
            return (Criteria) this;
        }

        public Criteria andProductSnNotEqualTo(String value) {
            addCriterion("product_sn <>", value, "productSn");
            return (Criteria) this;
        }

        public Criteria andProductSnGreaterThan(String value) {
            addCriterion("product_sn >", value, "productSn");
            return (Criteria) this;
        }

        public Criteria andProductSnGreaterThanOrEqualTo(String value) {
            addCriterion("product_sn >=", value, "productSn");
            return (Criteria) this;
        }

        public Criteria andProductSnLessThan(String value) {
            addCriterion("product_sn <", value, "productSn");
            return (Criteria) this;
        }

        public Criteria andProductSnLessThanOrEqualTo(String value) {
            addCriterion("product_sn <=", value, "productSn");
            return (Criteria) this;
        }

        public Criteria andProductSnLike(String value) {
            addCriterion("product_sn like", value, "productSn");
            return (Criteria) this;
        }

        public Criteria andProductSnNotLike(String value) {
            addCriterion("product_sn not like", value, "productSn");
            return (Criteria) this;
        }

        public Criteria andProductSnIn(List<String> values) {
            addCriterion("product_sn in", values, "productSn");
            return (Criteria) this;
        }

        public Criteria andProductSnNotIn(List<String> values) {
            addCriterion("product_sn not in", values, "productSn");
            return (Criteria) this;
        }

        public Criteria andProductSnBetween(String value1, String value2) {
            addCriterion("product_sn between", value1, value2, "productSn");
            return (Criteria) this;
        }

        public Criteria andProductSnNotBetween(String value1, String value2) {
            addCriterion("product_sn not between", value1, value2, "productSn");
            return (Criteria) this;
        }

        public Criteria andMarketPriceIsNull() {
            addCriterion("market_price is null");
            return (Criteria) this;
        }

        public Criteria andMarketPriceIsNotNull() {
            addCriterion("market_price is not null");
            return (Criteria) this;
        }

        public Criteria andMarketPriceEqualTo(BigDecimal value) {
            addCriterion("market_price =", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceNotEqualTo(BigDecimal value) {
            addCriterion("market_price <>", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceGreaterThan(BigDecimal value) {
            addCriterion("market_price >", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("market_price >=", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceLessThan(BigDecimal value) {
            addCriterion("market_price <", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("market_price <=", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceIn(List<BigDecimal> values) {
            addCriterion("market_price in", values, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceNotIn(List<BigDecimal> values) {
            addCriterion("market_price not in", values, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("market_price between", value1, value2, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("market_price not between", value1, value2, "marketPrice");
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

        public Criteria andCostPriceIsNull() {
            addCriterion("cost_price is null");
            return (Criteria) this;
        }

        public Criteria andCostPriceIsNotNull() {
            addCriterion("cost_price is not null");
            return (Criteria) this;
        }

        public Criteria andCostPriceEqualTo(BigDecimal value) {
            addCriterion("cost_price =", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceNotEqualTo(BigDecimal value) {
            addCriterion("cost_price <>", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceGreaterThan(BigDecimal value) {
            addCriterion("cost_price >", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cost_price >=", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceLessThan(BigDecimal value) {
            addCriterion("cost_price <", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cost_price <=", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceIn(List<BigDecimal> values) {
            addCriterion("cost_price in", values, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceNotIn(List<BigDecimal> values) {
            addCriterion("cost_price not in", values, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cost_price between", value1, value2, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cost_price not between", value1, value2, "costPrice");
            return (Criteria) this;
        }

        public Criteria andStockIsNull() {
            addCriterion("stock is null");
            return (Criteria) this;
        }

        public Criteria andStockIsNotNull() {
            addCriterion("stock is not null");
            return (Criteria) this;
        }

        public Criteria andStockEqualTo(Integer value) {
            addCriterion("stock =", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotEqualTo(Integer value) {
            addCriterion("stock <>", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockGreaterThan(Integer value) {
            addCriterion("stock >", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockGreaterThanOrEqualTo(Integer value) {
            addCriterion("stock >=", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockLessThan(Integer value) {
            addCriterion("stock <", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockLessThanOrEqualTo(Integer value) {
            addCriterion("stock <=", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockIn(List<Integer> values) {
            addCriterion("stock in", values, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotIn(List<Integer> values) {
            addCriterion("stock not in", values, "stock");
            return (Criteria) this;
        }

        public Criteria andStockBetween(Integer value1, Integer value2) {
            addCriterion("stock between", value1, value2, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotBetween(Integer value1, Integer value2) {
            addCriterion("stock not between", value1, value2, "stock");
            return (Criteria) this;
        }

        public Criteria andReduceStockMethodIsNull() {
            addCriterion("reduce_stock_method is null");
            return (Criteria) this;
        }

        public Criteria andReduceStockMethodIsNotNull() {
            addCriterion("reduce_stock_method is not null");
            return (Criteria) this;
        }

        public Criteria andReduceStockMethodEqualTo(Integer value) {
            addCriterion("reduce_stock_method =", value, "reduceStockMethod");
            return (Criteria) this;
        }

        public Criteria andReduceStockMethodNotEqualTo(Integer value) {
            addCriterion("reduce_stock_method <>", value, "reduceStockMethod");
            return (Criteria) this;
        }

        public Criteria andReduceStockMethodGreaterThan(Integer value) {
            addCriterion("reduce_stock_method >", value, "reduceStockMethod");
            return (Criteria) this;
        }

        public Criteria andReduceStockMethodGreaterThanOrEqualTo(Integer value) {
            addCriterion("reduce_stock_method >=", value, "reduceStockMethod");
            return (Criteria) this;
        }

        public Criteria andReduceStockMethodLessThan(Integer value) {
            addCriterion("reduce_stock_method <", value, "reduceStockMethod");
            return (Criteria) this;
        }

        public Criteria andReduceStockMethodLessThanOrEqualTo(Integer value) {
            addCriterion("reduce_stock_method <=", value, "reduceStockMethod");
            return (Criteria) this;
        }

        public Criteria andReduceStockMethodIn(List<Integer> values) {
            addCriterion("reduce_stock_method in", values, "reduceStockMethod");
            return (Criteria) this;
        }

        public Criteria andReduceStockMethodNotIn(List<Integer> values) {
            addCriterion("reduce_stock_method not in", values, "reduceStockMethod");
            return (Criteria) this;
        }

        public Criteria andReduceStockMethodBetween(Integer value1, Integer value2) {
            addCriterion("reduce_stock_method between", value1, value2, "reduceStockMethod");
            return (Criteria) this;
        }

        public Criteria andReduceStockMethodNotBetween(Integer value1, Integer value2) {
            addCriterion("reduce_stock_method not between", value1, value2, "reduceStockMethod");
            return (Criteria) this;
        }

        public Criteria andShowSalesIsNull() {
            addCriterion("show_sales is null");
            return (Criteria) this;
        }

        public Criteria andShowSalesIsNotNull() {
            addCriterion("show_sales is not null");
            return (Criteria) this;
        }

        public Criteria andShowSalesEqualTo(Integer value) {
            addCriterion("show_sales =", value, "showSales");
            return (Criteria) this;
        }

        public Criteria andShowSalesNotEqualTo(Integer value) {
            addCriterion("show_sales <>", value, "showSales");
            return (Criteria) this;
        }

        public Criteria andShowSalesGreaterThan(Integer value) {
            addCriterion("show_sales >", value, "showSales");
            return (Criteria) this;
        }

        public Criteria andShowSalesGreaterThanOrEqualTo(Integer value) {
            addCriterion("show_sales >=", value, "showSales");
            return (Criteria) this;
        }

        public Criteria andShowSalesLessThan(Integer value) {
            addCriterion("show_sales <", value, "showSales");
            return (Criteria) this;
        }

        public Criteria andShowSalesLessThanOrEqualTo(Integer value) {
            addCriterion("show_sales <=", value, "showSales");
            return (Criteria) this;
        }

        public Criteria andShowSalesIn(List<Integer> values) {
            addCriterion("show_sales in", values, "showSales");
            return (Criteria) this;
        }

        public Criteria andShowSalesNotIn(List<Integer> values) {
            addCriterion("show_sales not in", values, "showSales");
            return (Criteria) this;
        }

        public Criteria andShowSalesBetween(Integer value1, Integer value2) {
            addCriterion("show_sales between", value1, value2, "showSales");
            return (Criteria) this;
        }

        public Criteria andShowSalesNotBetween(Integer value1, Integer value2) {
            addCriterion("show_sales not between", value1, value2, "showSales");
            return (Criteria) this;
        }

        public Criteria andRealSalesIsNull() {
            addCriterion("real_sales is null");
            return (Criteria) this;
        }

        public Criteria andRealSalesIsNotNull() {
            addCriterion("real_sales is not null");
            return (Criteria) this;
        }

        public Criteria andRealSalesEqualTo(Integer value) {
            addCriterion("real_sales =", value, "realSales");
            return (Criteria) this;
        }

        public Criteria andRealSalesNotEqualTo(Integer value) {
            addCriterion("real_sales <>", value, "realSales");
            return (Criteria) this;
        }

        public Criteria andRealSalesGreaterThan(Integer value) {
            addCriterion("real_sales >", value, "realSales");
            return (Criteria) this;
        }

        public Criteria andRealSalesGreaterThanOrEqualTo(Integer value) {
            addCriterion("real_sales >=", value, "realSales");
            return (Criteria) this;
        }

        public Criteria andRealSalesLessThan(Integer value) {
            addCriterion("real_sales <", value, "realSales");
            return (Criteria) this;
        }

        public Criteria andRealSalesLessThanOrEqualTo(Integer value) {
            addCriterion("real_sales <=", value, "realSales");
            return (Criteria) this;
        }

        public Criteria andRealSalesIn(List<Integer> values) {
            addCriterion("real_sales in", values, "realSales");
            return (Criteria) this;
        }

        public Criteria andRealSalesNotIn(List<Integer> values) {
            addCriterion("real_sales not in", values, "realSales");
            return (Criteria) this;
        }

        public Criteria andRealSalesBetween(Integer value1, Integer value2) {
            addCriterion("real_sales between", value1, value2, "realSales");
            return (Criteria) this;
        }

        public Criteria andRealSalesNotBetween(Integer value1, Integer value2) {
            addCriterion("real_sales not between", value1, value2, "realSales");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("weight is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("weight is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(BigDecimal value) {
            addCriterion("weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(BigDecimal value) {
            addCriterion("weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(BigDecimal value) {
            addCriterion("weight >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(BigDecimal value) {
            addCriterion("weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("weight <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<BigDecimal> values) {
            addCriterion("weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<BigDecimal> values) {
            addCriterion("weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("weight not between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andHasOptionIsNull() {
            addCriterion("has_option is null");
            return (Criteria) this;
        }

        public Criteria andHasOptionIsNotNull() {
            addCriterion("has_option is not null");
            return (Criteria) this;
        }

        public Criteria andHasOptionEqualTo(Integer value) {
            addCriterion("has_option =", value, "hasOption");
            return (Criteria) this;
        }

        public Criteria andHasOptionNotEqualTo(Integer value) {
            addCriterion("has_option <>", value, "hasOption");
            return (Criteria) this;
        }

        public Criteria andHasOptionGreaterThan(Integer value) {
            addCriterion("has_option >", value, "hasOption");
            return (Criteria) this;
        }

        public Criteria andHasOptionGreaterThanOrEqualTo(Integer value) {
            addCriterion("has_option >=", value, "hasOption");
            return (Criteria) this;
        }

        public Criteria andHasOptionLessThan(Integer value) {
            addCriterion("has_option <", value, "hasOption");
            return (Criteria) this;
        }

        public Criteria andHasOptionLessThanOrEqualTo(Integer value) {
            addCriterion("has_option <=", value, "hasOption");
            return (Criteria) this;
        }

        public Criteria andHasOptionIn(List<Integer> values) {
            addCriterion("has_option in", values, "hasOption");
            return (Criteria) this;
        }

        public Criteria andHasOptionNotIn(List<Integer> values) {
            addCriterion("has_option not in", values, "hasOption");
            return (Criteria) this;
        }

        public Criteria andHasOptionBetween(Integer value1, Integer value2) {
            addCriterion("has_option between", value1, value2, "hasOption");
            return (Criteria) this;
        }

        public Criteria andHasOptionNotBetween(Integer value1, Integer value2) {
            addCriterion("has_option not between", value1, value2, "hasOption");
            return (Criteria) this;
        }

        public Criteria andIsNewIsNull() {
            addCriterion("is_new is null");
            return (Criteria) this;
        }

        public Criteria andIsNewIsNotNull() {
            addCriterion("is_new is not null");
            return (Criteria) this;
        }

        public Criteria andIsNewEqualTo(Boolean value) {
            addCriterion("is_new =", value, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewNotEqualTo(Boolean value) {
            addCriterion("is_new <>", value, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewGreaterThan(Boolean value) {
            addCriterion("is_new >", value, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_new >=", value, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewLessThan(Boolean value) {
            addCriterion("is_new <", value, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewLessThanOrEqualTo(Boolean value) {
            addCriterion("is_new <=", value, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewIn(List<Boolean> values) {
            addCriterion("is_new in", values, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewNotIn(List<Boolean> values) {
            addCriterion("is_new not in", values, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewBetween(Boolean value1, Boolean value2) {
            addCriterion("is_new between", value1, value2, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_new not between", value1, value2, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsHotIsNull() {
            addCriterion("is_hot is null");
            return (Criteria) this;
        }

        public Criteria andIsHotIsNotNull() {
            addCriterion("is_hot is not null");
            return (Criteria) this;
        }

        public Criteria andIsHotEqualTo(Boolean value) {
            addCriterion("is_hot =", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotNotEqualTo(Boolean value) {
            addCriterion("is_hot <>", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotGreaterThan(Boolean value) {
            addCriterion("is_hot >", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_hot >=", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotLessThan(Boolean value) {
            addCriterion("is_hot <", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotLessThanOrEqualTo(Boolean value) {
            addCriterion("is_hot <=", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotIn(List<Boolean> values) {
            addCriterion("is_hot in", values, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotNotIn(List<Boolean> values) {
            addCriterion("is_hot not in", values, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_hot between", value1, value2, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_hot not between", value1, value2, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsDiscountIsNull() {
            addCriterion("is_discount is null");
            return (Criteria) this;
        }

        public Criteria andIsDiscountIsNotNull() {
            addCriterion("is_discount is not null");
            return (Criteria) this;
        }

        public Criteria andIsDiscountEqualTo(Boolean value) {
            addCriterion("is_discount =", value, "isDiscount");
            return (Criteria) this;
        }

        public Criteria andIsDiscountNotEqualTo(Boolean value) {
            addCriterion("is_discount <>", value, "isDiscount");
            return (Criteria) this;
        }

        public Criteria andIsDiscountGreaterThan(Boolean value) {
            addCriterion("is_discount >", value, "isDiscount");
            return (Criteria) this;
        }

        public Criteria andIsDiscountGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_discount >=", value, "isDiscount");
            return (Criteria) this;
        }

        public Criteria andIsDiscountLessThan(Boolean value) {
            addCriterion("is_discount <", value, "isDiscount");
            return (Criteria) this;
        }

        public Criteria andIsDiscountLessThanOrEqualTo(Boolean value) {
            addCriterion("is_discount <=", value, "isDiscount");
            return (Criteria) this;
        }

        public Criteria andIsDiscountIn(List<Boolean> values) {
            addCriterion("is_discount in", values, "isDiscount");
            return (Criteria) this;
        }

        public Criteria andIsDiscountNotIn(List<Boolean> values) {
            addCriterion("is_discount not in", values, "isDiscount");
            return (Criteria) this;
        }

        public Criteria andIsDiscountBetween(Boolean value1, Boolean value2) {
            addCriterion("is_discount between", value1, value2, "isDiscount");
            return (Criteria) this;
        }

        public Criteria andIsDiscountNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_discount not between", value1, value2, "isDiscount");
            return (Criteria) this;
        }

        public Criteria andIsRecommandIsNull() {
            addCriterion("is_recommand is null");
            return (Criteria) this;
        }

        public Criteria andIsRecommandIsNotNull() {
            addCriterion("is_recommand is not null");
            return (Criteria) this;
        }

        public Criteria andIsRecommandEqualTo(Boolean value) {
            addCriterion("is_recommand =", value, "isRecommand");
            return (Criteria) this;
        }

        public Criteria andIsRecommandNotEqualTo(Boolean value) {
            addCriterion("is_recommand <>", value, "isRecommand");
            return (Criteria) this;
        }

        public Criteria andIsRecommandGreaterThan(Boolean value) {
            addCriterion("is_recommand >", value, "isRecommand");
            return (Criteria) this;
        }

        public Criteria andIsRecommandGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_recommand >=", value, "isRecommand");
            return (Criteria) this;
        }

        public Criteria andIsRecommandLessThan(Boolean value) {
            addCriterion("is_recommand <", value, "isRecommand");
            return (Criteria) this;
        }

        public Criteria andIsRecommandLessThanOrEqualTo(Boolean value) {
            addCriterion("is_recommand <=", value, "isRecommand");
            return (Criteria) this;
        }

        public Criteria andIsRecommandIn(List<Boolean> values) {
            addCriterion("is_recommand in", values, "isRecommand");
            return (Criteria) this;
        }

        public Criteria andIsRecommandNotIn(List<Boolean> values) {
            addCriterion("is_recommand not in", values, "isRecommand");
            return (Criteria) this;
        }

        public Criteria andIsRecommandBetween(Boolean value1, Boolean value2) {
            addCriterion("is_recommand between", value1, value2, "isRecommand");
            return (Criteria) this;
        }

        public Criteria andIsRecommandNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_recommand not between", value1, value2, "isRecommand");
            return (Criteria) this;
        }

        public Criteria andIsCommentIsNull() {
            addCriterion("is_comment is null");
            return (Criteria) this;
        }

        public Criteria andIsCommentIsNotNull() {
            addCriterion("is_comment is not null");
            return (Criteria) this;
        }

        public Criteria andIsCommentEqualTo(Boolean value) {
            addCriterion("is_comment =", value, "isComment");
            return (Criteria) this;
        }

        public Criteria andIsCommentNotEqualTo(Boolean value) {
            addCriterion("is_comment <>", value, "isComment");
            return (Criteria) this;
        }

        public Criteria andIsCommentGreaterThan(Boolean value) {
            addCriterion("is_comment >", value, "isComment");
            return (Criteria) this;
        }

        public Criteria andIsCommentGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_comment >=", value, "isComment");
            return (Criteria) this;
        }

        public Criteria andIsCommentLessThan(Boolean value) {
            addCriterion("is_comment <", value, "isComment");
            return (Criteria) this;
        }

        public Criteria andIsCommentLessThanOrEqualTo(Boolean value) {
            addCriterion("is_comment <=", value, "isComment");
            return (Criteria) this;
        }

        public Criteria andIsCommentIn(List<Boolean> values) {
            addCriterion("is_comment in", values, "isComment");
            return (Criteria) this;
        }

        public Criteria andIsCommentNotIn(List<Boolean> values) {
            addCriterion("is_comment not in", values, "isComment");
            return (Criteria) this;
        }

        public Criteria andIsCommentBetween(Boolean value1, Boolean value2) {
            addCriterion("is_comment between", value1, value2, "isComment");
            return (Criteria) this;
        }

        public Criteria andIsCommentNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_comment not between", value1, value2, "isComment");
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

        public Criteria andCommentNumIsNull() {
            addCriterion("comment_num is null");
            return (Criteria) this;
        }

        public Criteria andCommentNumIsNotNull() {
            addCriterion("comment_num is not null");
            return (Criteria) this;
        }

        public Criteria andCommentNumEqualTo(Integer value) {
            addCriterion("comment_num =", value, "commentNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumNotEqualTo(Integer value) {
            addCriterion("comment_num <>", value, "commentNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumGreaterThan(Integer value) {
            addCriterion("comment_num >", value, "commentNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_num >=", value, "commentNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumLessThan(Integer value) {
            addCriterion("comment_num <", value, "commentNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumLessThanOrEqualTo(Integer value) {
            addCriterion("comment_num <=", value, "commentNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumIn(List<Integer> values) {
            addCriterion("comment_num in", values, "commentNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumNotIn(List<Integer> values) {
            addCriterion("comment_num not in", values, "commentNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumBetween(Integer value1, Integer value2) {
            addCriterion("comment_num between", value1, value2, "commentNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_num not between", value1, value2, "commentNum");
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

        public Criteria andVirtualSalesIsNull() {
            addCriterion("virtual_sales is null");
            return (Criteria) this;
        }

        public Criteria andVirtualSalesIsNotNull() {
            addCriterion("virtual_sales is not null");
            return (Criteria) this;
        }

        public Criteria andVirtualSalesEqualTo(Integer value) {
            addCriterion("virtual_sales =", value, "virtualSales");
            return (Criteria) this;
        }

        public Criteria andVirtualSalesNotEqualTo(Integer value) {
            addCriterion("virtual_sales <>", value, "virtualSales");
            return (Criteria) this;
        }

        public Criteria andVirtualSalesGreaterThan(Integer value) {
            addCriterion("virtual_sales >", value, "virtualSales");
            return (Criteria) this;
        }

        public Criteria andVirtualSalesGreaterThanOrEqualTo(Integer value) {
            addCriterion("virtual_sales >=", value, "virtualSales");
            return (Criteria) this;
        }

        public Criteria andVirtualSalesLessThan(Integer value) {
            addCriterion("virtual_sales <", value, "virtualSales");
            return (Criteria) this;
        }

        public Criteria andVirtualSalesLessThanOrEqualTo(Integer value) {
            addCriterion("virtual_sales <=", value, "virtualSales");
            return (Criteria) this;
        }

        public Criteria andVirtualSalesIn(List<Integer> values) {
            addCriterion("virtual_sales in", values, "virtualSales");
            return (Criteria) this;
        }

        public Criteria andVirtualSalesNotIn(List<Integer> values) {
            addCriterion("virtual_sales not in", values, "virtualSales");
            return (Criteria) this;
        }

        public Criteria andVirtualSalesBetween(Integer value1, Integer value2) {
            addCriterion("virtual_sales between", value1, value2, "virtualSales");
            return (Criteria) this;
        }

        public Criteria andVirtualSalesNotBetween(Integer value1, Integer value2) {
            addCriterion("virtual_sales not between", value1, value2, "virtualSales");
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

        public Criteria andType2IsNull() {
            addCriterion("type2 is null");
            return (Criteria) this;
        }

        public Criteria andType2IsNotNull() {
            addCriterion("type2 is not null");
            return (Criteria) this;
        }

        public Criteria andType2EqualTo(Boolean value) {
            addCriterion("type2 =", value, "type2");
            return (Criteria) this;
        }

        public Criteria andType2NotEqualTo(Boolean value) {
            addCriterion("type2 <>", value, "type2");
            return (Criteria) this;
        }

        public Criteria andType2GreaterThan(Boolean value) {
            addCriterion("type2 >", value, "type2");
            return (Criteria) this;
        }

        public Criteria andType2GreaterThanOrEqualTo(Boolean value) {
            addCriterion("type2 >=", value, "type2");
            return (Criteria) this;
        }

        public Criteria andType2LessThan(Boolean value) {
            addCriterion("type2 <", value, "type2");
            return (Criteria) this;
        }

        public Criteria andType2LessThanOrEqualTo(Boolean value) {
            addCriterion("type2 <=", value, "type2");
            return (Criteria) this;
        }

        public Criteria andType2In(List<Boolean> values) {
            addCriterion("type2 in", values, "type2");
            return (Criteria) this;
        }

        public Criteria andType2NotIn(List<Boolean> values) {
            addCriterion("type2 not in", values, "type2");
            return (Criteria) this;
        }

        public Criteria andType2Between(Boolean value1, Boolean value2) {
            addCriterion("type2 between", value1, value2, "type2");
            return (Criteria) this;
        }

        public Criteria andType2NotBetween(Boolean value1, Boolean value2) {
            addCriterion("type2 not between", value1, value2, "type2");
            return (Criteria) this;
        }

        public Criteria andOldIdIsNull() {
            addCriterion("old_id is null");
            return (Criteria) this;
        }

        public Criteria andOldIdIsNotNull() {
            addCriterion("old_id is not null");
            return (Criteria) this;
        }

        public Criteria andOldIdEqualTo(Integer value) {
            addCriterion("old_id =", value, "oldId");
            return (Criteria) this;
        }

        public Criteria andOldIdNotEqualTo(Integer value) {
            addCriterion("old_id <>", value, "oldId");
            return (Criteria) this;
        }

        public Criteria andOldIdGreaterThan(Integer value) {
            addCriterion("old_id >", value, "oldId");
            return (Criteria) this;
        }

        public Criteria andOldIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("old_id >=", value, "oldId");
            return (Criteria) this;
        }

        public Criteria andOldIdLessThan(Integer value) {
            addCriterion("old_id <", value, "oldId");
            return (Criteria) this;
        }

        public Criteria andOldIdLessThanOrEqualTo(Integer value) {
            addCriterion("old_id <=", value, "oldId");
            return (Criteria) this;
        }

        public Criteria andOldIdIn(List<Integer> values) {
            addCriterion("old_id in", values, "oldId");
            return (Criteria) this;
        }

        public Criteria andOldIdNotIn(List<Integer> values) {
            addCriterion("old_id not in", values, "oldId");
            return (Criteria) this;
        }

        public Criteria andOldIdBetween(Integer value1, Integer value2) {
            addCriterion("old_id between", value1, value2, "oldId");
            return (Criteria) this;
        }

        public Criteria andOldIdNotBetween(Integer value1, Integer value2) {
            addCriterion("old_id not between", value1, value2, "oldId");
            return (Criteria) this;
        }

        public Criteria andMinLimitIsNull() {
            addCriterion("min_limit is null");
            return (Criteria) this;
        }

        public Criteria andMinLimitIsNotNull() {
            addCriterion("min_limit is not null");
            return (Criteria) this;
        }

        public Criteria andMinLimitEqualTo(Float value) {
            addCriterion("min_limit =", value, "minLimit");
            return (Criteria) this;
        }

        public Criteria andMinLimitNotEqualTo(Float value) {
            addCriterion("min_limit <>", value, "minLimit");
            return (Criteria) this;
        }

        public Criteria andMinLimitGreaterThan(Float value) {
            addCriterion("min_limit >", value, "minLimit");
            return (Criteria) this;
        }

        public Criteria andMinLimitGreaterThanOrEqualTo(Float value) {
            addCriterion("min_limit >=", value, "minLimit");
            return (Criteria) this;
        }

        public Criteria andMinLimitLessThan(Float value) {
            addCriterion("min_limit <", value, "minLimit");
            return (Criteria) this;
        }

        public Criteria andMinLimitLessThanOrEqualTo(Float value) {
            addCriterion("min_limit <=", value, "minLimit");
            return (Criteria) this;
        }

        public Criteria andMinLimitIn(List<Float> values) {
            addCriterion("min_limit in", values, "minLimit");
            return (Criteria) this;
        }

        public Criteria andMinLimitNotIn(List<Float> values) {
            addCriterion("min_limit not in", values, "minLimit");
            return (Criteria) this;
        }

        public Criteria andMinLimitBetween(Float value1, Float value2) {
            addCriterion("min_limit between", value1, value2, "minLimit");
            return (Criteria) this;
        }

        public Criteria andMinLimitNotBetween(Float value1, Float value2) {
            addCriterion("min_limit not between", value1, value2, "minLimit");
            return (Criteria) this;
        }

        public Criteria andMaxLimitIsNull() {
            addCriterion("max_limit is null");
            return (Criteria) this;
        }

        public Criteria andMaxLimitIsNotNull() {
            addCriterion("max_limit is not null");
            return (Criteria) this;
        }

        public Criteria andMaxLimitEqualTo(Float value) {
            addCriterion("max_limit =", value, "maxLimit");
            return (Criteria) this;
        }

        public Criteria andMaxLimitNotEqualTo(Float value) {
            addCriterion("max_limit <>", value, "maxLimit");
            return (Criteria) this;
        }

        public Criteria andMaxLimitGreaterThan(Float value) {
            addCriterion("max_limit >", value, "maxLimit");
            return (Criteria) this;
        }

        public Criteria andMaxLimitGreaterThanOrEqualTo(Float value) {
            addCriterion("max_limit >=", value, "maxLimit");
            return (Criteria) this;
        }

        public Criteria andMaxLimitLessThan(Float value) {
            addCriterion("max_limit <", value, "maxLimit");
            return (Criteria) this;
        }

        public Criteria andMaxLimitLessThanOrEqualTo(Float value) {
            addCriterion("max_limit <=", value, "maxLimit");
            return (Criteria) this;
        }

        public Criteria andMaxLimitIn(List<Float> values) {
            addCriterion("max_limit in", values, "maxLimit");
            return (Criteria) this;
        }

        public Criteria andMaxLimitNotIn(List<Float> values) {
            addCriterion("max_limit not in", values, "maxLimit");
            return (Criteria) this;
        }

        public Criteria andMaxLimitBetween(Float value1, Float value2) {
            addCriterion("max_limit between", value1, value2, "maxLimit");
            return (Criteria) this;
        }

        public Criteria andMaxLimitNotBetween(Float value1, Float value2) {
            addCriterion("max_limit not between", value1, value2, "maxLimit");
            return (Criteria) this;
        }

        public Criteria andMultipleLimitIsNull() {
            addCriterion("multiple_limit is null");
            return (Criteria) this;
        }

        public Criteria andMultipleLimitIsNotNull() {
            addCriterion("multiple_limit is not null");
            return (Criteria) this;
        }

        public Criteria andMultipleLimitEqualTo(Float value) {
            addCriterion("multiple_limit =", value, "multipleLimit");
            return (Criteria) this;
        }

        public Criteria andMultipleLimitNotEqualTo(Float value) {
            addCriterion("multiple_limit <>", value, "multipleLimit");
            return (Criteria) this;
        }

        public Criteria andMultipleLimitGreaterThan(Float value) {
            addCriterion("multiple_limit >", value, "multipleLimit");
            return (Criteria) this;
        }

        public Criteria andMultipleLimitGreaterThanOrEqualTo(Float value) {
            addCriterion("multiple_limit >=", value, "multipleLimit");
            return (Criteria) this;
        }

        public Criteria andMultipleLimitLessThan(Float value) {
            addCriterion("multiple_limit <", value, "multipleLimit");
            return (Criteria) this;
        }

        public Criteria andMultipleLimitLessThanOrEqualTo(Float value) {
            addCriterion("multiple_limit <=", value, "multipleLimit");
            return (Criteria) this;
        }

        public Criteria andMultipleLimitIn(List<Float> values) {
            addCriterion("multiple_limit in", values, "multipleLimit");
            return (Criteria) this;
        }

        public Criteria andMultipleLimitNotIn(List<Float> values) {
            addCriterion("multiple_limit not in", values, "multipleLimit");
            return (Criteria) this;
        }

        public Criteria andMultipleLimitBetween(Float value1, Float value2) {
            addCriterion("multiple_limit between", value1, value2, "multipleLimit");
            return (Criteria) this;
        }

        public Criteria andMultipleLimitNotBetween(Float value1, Float value2) {
            addCriterion("multiple_limit not between", value1, value2, "multipleLimit");
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

        public Criteria andVolumeIsNull() {
            addCriterion("volume is null");
            return (Criteria) this;
        }

        public Criteria andVolumeIsNotNull() {
            addCriterion("volume is not null");
            return (Criteria) this;
        }

        public Criteria andVolumeEqualTo(BigDecimal value) {
            addCriterion("volume =", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotEqualTo(BigDecimal value) {
            addCriterion("volume <>", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeGreaterThan(BigDecimal value) {
            addCriterion("volume >", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("volume >=", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeLessThan(BigDecimal value) {
            addCriterion("volume <", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("volume <=", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeIn(List<BigDecimal> values) {
            addCriterion("volume in", values, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotIn(List<BigDecimal> values) {
            addCriterion("volume not in", values, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("volume between", value1, value2, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("volume not between", value1, value2, "volume");
            return (Criteria) this;
        }

        public Criteria andCheckTypeIsNull() {
            addCriterion("check_type is null");
            return (Criteria) this;
        }

        public Criteria andCheckTypeIsNotNull() {
            addCriterion("check_type is not null");
            return (Criteria) this;
        }

        public Criteria andCheckTypeEqualTo(Integer value) {
            addCriterion("check_type =", value, "checkType");
            return (Criteria) this;
        }

        public Criteria andCheckTypeNotEqualTo(Integer value) {
            addCriterion("check_type <>", value, "checkType");
            return (Criteria) this;
        }

        public Criteria andCheckTypeGreaterThan(Integer value) {
            addCriterion("check_type >", value, "checkType");
            return (Criteria) this;
        }

        public Criteria andCheckTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("check_type >=", value, "checkType");
            return (Criteria) this;
        }

        public Criteria andCheckTypeLessThan(Integer value) {
            addCriterion("check_type <", value, "checkType");
            return (Criteria) this;
        }

        public Criteria andCheckTypeLessThanOrEqualTo(Integer value) {
            addCriterion("check_type <=", value, "checkType");
            return (Criteria) this;
        }

        public Criteria andCheckTypeIn(List<Integer> values) {
            addCriterion("check_type in", values, "checkType");
            return (Criteria) this;
        }

        public Criteria andCheckTypeNotIn(List<Integer> values) {
            addCriterion("check_type not in", values, "checkType");
            return (Criteria) this;
        }

        public Criteria andCheckTypeBetween(Integer value1, Integer value2) {
            addCriterion("check_type between", value1, value2, "checkType");
            return (Criteria) this;
        }

        public Criteria andCheckTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("check_type not between", value1, value2, "checkType");
            return (Criteria) this;
        }

        public Criteria andLimitTimeIsNull() {
            addCriterion("limit_time is null");
            return (Criteria) this;
        }

        public Criteria andLimitTimeIsNotNull() {
            addCriterion("limit_time is not null");
            return (Criteria) this;
        }

        public Criteria andLimitTimeEqualTo(Integer value) {
            addCriterion("limit_time =", value, "limitTime");
            return (Criteria) this;
        }

        public Criteria andLimitTimeNotEqualTo(Integer value) {
            addCriterion("limit_time <>", value, "limitTime");
            return (Criteria) this;
        }

        public Criteria andLimitTimeGreaterThan(Integer value) {
            addCriterion("limit_time >", value, "limitTime");
            return (Criteria) this;
        }

        public Criteria andLimitTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("limit_time >=", value, "limitTime");
            return (Criteria) this;
        }

        public Criteria andLimitTimeLessThan(Integer value) {
            addCriterion("limit_time <", value, "limitTime");
            return (Criteria) this;
        }

        public Criteria andLimitTimeLessThanOrEqualTo(Integer value) {
            addCriterion("limit_time <=", value, "limitTime");
            return (Criteria) this;
        }

        public Criteria andLimitTimeIn(List<Integer> values) {
            addCriterion("limit_time in", values, "limitTime");
            return (Criteria) this;
        }

        public Criteria andLimitTimeNotIn(List<Integer> values) {
            addCriterion("limit_time not in", values, "limitTime");
            return (Criteria) this;
        }

        public Criteria andLimitTimeBetween(Integer value1, Integer value2) {
            addCriterion("limit_time between", value1, value2, "limitTime");
            return (Criteria) this;
        }

        public Criteria andLimitTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("limit_time not between", value1, value2, "limitTime");
            return (Criteria) this;
        }

        public Criteria andInsuranceIsNull() {
            addCriterion("insurance is null");
            return (Criteria) this;
        }

        public Criteria andInsuranceIsNotNull() {
            addCriterion("insurance is not null");
            return (Criteria) this;
        }

        public Criteria andInsuranceEqualTo(Integer value) {
            addCriterion("insurance =", value, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceNotEqualTo(Integer value) {
            addCriterion("insurance <>", value, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceGreaterThan(Integer value) {
            addCriterion("insurance >", value, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceGreaterThanOrEqualTo(Integer value) {
            addCriterion("insurance >=", value, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceLessThan(Integer value) {
            addCriterion("insurance <", value, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceLessThanOrEqualTo(Integer value) {
            addCriterion("insurance <=", value, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceIn(List<Integer> values) {
            addCriterion("insurance in", values, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceNotIn(List<Integer> values) {
            addCriterion("insurance not in", values, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceBetween(Integer value1, Integer value2) {
            addCriterion("insurance between", value1, value2, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceNotBetween(Integer value1, Integer value2) {
            addCriterion("insurance not between", value1, value2, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceNameIsNull() {
            addCriterion("insurance_name is null");
            return (Criteria) this;
        }

        public Criteria andInsuranceNameIsNotNull() {
            addCriterion("insurance_name is not null");
            return (Criteria) this;
        }

        public Criteria andInsuranceNameEqualTo(String value) {
            addCriterion("insurance_name =", value, "insuranceName");
            return (Criteria) this;
        }

        public Criteria andInsuranceNameNotEqualTo(String value) {
            addCriterion("insurance_name <>", value, "insuranceName");
            return (Criteria) this;
        }

        public Criteria andInsuranceNameGreaterThan(String value) {
            addCriterion("insurance_name >", value, "insuranceName");
            return (Criteria) this;
        }

        public Criteria andInsuranceNameGreaterThanOrEqualTo(String value) {
            addCriterion("insurance_name >=", value, "insuranceName");
            return (Criteria) this;
        }

        public Criteria andInsuranceNameLessThan(String value) {
            addCriterion("insurance_name <", value, "insuranceName");
            return (Criteria) this;
        }

        public Criteria andInsuranceNameLessThanOrEqualTo(String value) {
            addCriterion("insurance_name <=", value, "insuranceName");
            return (Criteria) this;
        }

        public Criteria andInsuranceNameLike(String value) {
            addCriterion("insurance_name like", value, "insuranceName");
            return (Criteria) this;
        }

        public Criteria andInsuranceNameNotLike(String value) {
            addCriterion("insurance_name not like", value, "insuranceName");
            return (Criteria) this;
        }

        public Criteria andInsuranceNameIn(List<String> values) {
            addCriterion("insurance_name in", values, "insuranceName");
            return (Criteria) this;
        }

        public Criteria andInsuranceNameNotIn(List<String> values) {
            addCriterion("insurance_name not in", values, "insuranceName");
            return (Criteria) this;
        }

        public Criteria andInsuranceNameBetween(String value1, String value2) {
            addCriterion("insurance_name between", value1, value2, "insuranceName");
            return (Criteria) this;
        }

        public Criteria andInsuranceNameNotBetween(String value1, String value2) {
            addCriterion("insurance_name not between", value1, value2, "insuranceName");
            return (Criteria) this;
        }

        public Criteria andInsurancePriceIsNull() {
            addCriterion("insurance_price is null");
            return (Criteria) this;
        }

        public Criteria andInsurancePriceIsNotNull() {
            addCriterion("insurance_price is not null");
            return (Criteria) this;
        }

        public Criteria andInsurancePriceEqualTo(BigDecimal value) {
            addCriterion("insurance_price =", value, "insurancePrice");
            return (Criteria) this;
        }

        public Criteria andInsurancePriceNotEqualTo(BigDecimal value) {
            addCriterion("insurance_price <>", value, "insurancePrice");
            return (Criteria) this;
        }

        public Criteria andInsurancePriceGreaterThan(BigDecimal value) {
            addCriterion("insurance_price >", value, "insurancePrice");
            return (Criteria) this;
        }

        public Criteria andInsurancePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("insurance_price >=", value, "insurancePrice");
            return (Criteria) this;
        }

        public Criteria andInsurancePriceLessThan(BigDecimal value) {
            addCriterion("insurance_price <", value, "insurancePrice");
            return (Criteria) this;
        }

        public Criteria andInsurancePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("insurance_price <=", value, "insurancePrice");
            return (Criteria) this;
        }

        public Criteria andInsurancePriceIn(List<BigDecimal> values) {
            addCriterion("insurance_price in", values, "insurancePrice");
            return (Criteria) this;
        }

        public Criteria andInsurancePriceNotIn(List<BigDecimal> values) {
            addCriterion("insurance_price not in", values, "insurancePrice");
            return (Criteria) this;
        }

        public Criteria andInsurancePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("insurance_price between", value1, value2, "insurancePrice");
            return (Criteria) this;
        }

        public Criteria andInsurancePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("insurance_price not between", value1, value2, "insurancePrice");
            return (Criteria) this;
        }

        public Criteria andAppointIsNull() {
            addCriterion("appoint is null");
            return (Criteria) this;
        }

        public Criteria andAppointIsNotNull() {
            addCriterion("appoint is not null");
            return (Criteria) this;
        }

        public Criteria andAppointEqualTo(Integer value) {
            addCriterion("appoint =", value, "appoint");
            return (Criteria) this;
        }

        public Criteria andAppointNotEqualTo(Integer value) {
            addCriterion("appoint <>", value, "appoint");
            return (Criteria) this;
        }

        public Criteria andAppointGreaterThan(Integer value) {
            addCriterion("appoint >", value, "appoint");
            return (Criteria) this;
        }

        public Criteria andAppointGreaterThanOrEqualTo(Integer value) {
            addCriterion("appoint >=", value, "appoint");
            return (Criteria) this;
        }

        public Criteria andAppointLessThan(Integer value) {
            addCriterion("appoint <", value, "appoint");
            return (Criteria) this;
        }

        public Criteria andAppointLessThanOrEqualTo(Integer value) {
            addCriterion("appoint <=", value, "appoint");
            return (Criteria) this;
        }

        public Criteria andAppointIn(List<Integer> values) {
            addCriterion("appoint in", values, "appoint");
            return (Criteria) this;
        }

        public Criteria andAppointNotIn(List<Integer> values) {
            addCriterion("appoint not in", values, "appoint");
            return (Criteria) this;
        }

        public Criteria andAppointBetween(Integer value1, Integer value2) {
            addCriterion("appoint between", value1, value2, "appoint");
            return (Criteria) this;
        }

        public Criteria andAppointNotBetween(Integer value1, Integer value2) {
            addCriterion("appoint not between", value1, value2, "appoint");
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