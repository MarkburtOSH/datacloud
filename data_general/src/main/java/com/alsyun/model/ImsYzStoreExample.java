package com.alsyun.model;

import java.util.ArrayList;
import java.util.List;

public class ImsYzStoreExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ImsYzStoreExample() {
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

        public Criteria andStoreNameIsNull() {
            addCriterion("store_name is null");
            return (Criteria) this;
        }

        public Criteria andStoreNameIsNotNull() {
            addCriterion("store_name is not null");
            return (Criteria) this;
        }

        public Criteria andStoreNameEqualTo(String value) {
            addCriterion("store_name =", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotEqualTo(String value) {
            addCriterion("store_name <>", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameGreaterThan(String value) {
            addCriterion("store_name >", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameGreaterThanOrEqualTo(String value) {
            addCriterion("store_name >=", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameLessThan(String value) {
            addCriterion("store_name <", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameLessThanOrEqualTo(String value) {
            addCriterion("store_name <=", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameLike(String value) {
            addCriterion("store_name like", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotLike(String value) {
            addCriterion("store_name not like", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameIn(List<String> values) {
            addCriterion("store_name in", values, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotIn(List<String> values) {
            addCriterion("store_name not in", values, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameBetween(String value1, String value2) {
            addCriterion("store_name between", value1, value2, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotBetween(String value1, String value2) {
            addCriterion("store_name not between", value1, value2, "storeName");
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

        public Criteria andWeightEqualTo(Integer value) {
            addCriterion("weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(Integer value) {
            addCriterion("weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(Integer value) {
            addCriterion("weight >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(Integer value) {
            addCriterion("weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(Integer value) {
            addCriterion("weight <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<Integer> values) {
            addCriterion("weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<Integer> values) {
            addCriterion("weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(Integer value1, Integer value2) {
            addCriterion("weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(Integer value1, Integer value2) {
            addCriterion("weight not between", value1, value2, "weight");
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

        public Criteria andCategoryIdIsNull() {
            addCriterion("category_id is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNotNull() {
            addCriterion("category_id is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdEqualTo(Integer value) {
            addCriterion("category_id =", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotEqualTo(Integer value) {
            addCriterion("category_id <>", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThan(Integer value) {
            addCriterion("category_id >", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("category_id >=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThan(Integer value) {
            addCriterion("category_id <", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("category_id <=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIn(List<Integer> values) {
            addCriterion("category_id in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotIn(List<Integer> values) {
            addCriterion("category_id not in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdBetween(Integer value1, Integer value2) {
            addCriterion("category_id between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("category_id not between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdIsNull() {
            addCriterion("province_id is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIdIsNotNull() {
            addCriterion("province_id is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceIdEqualTo(Integer value) {
            addCriterion("province_id =", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotEqualTo(Integer value) {
            addCriterion("province_id <>", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdGreaterThan(Integer value) {
            addCriterion("province_id >", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("province_id >=", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdLessThan(Integer value) {
            addCriterion("province_id <", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdLessThanOrEqualTo(Integer value) {
            addCriterion("province_id <=", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdIn(List<Integer> values) {
            addCriterion("province_id in", values, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotIn(List<Integer> values) {
            addCriterion("province_id not in", values, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdBetween(Integer value1, Integer value2) {
            addCriterion("province_id between", value1, value2, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("province_id not between", value1, value2, "provinceId");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNull() {
            addCriterion("city_id is null");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNotNull() {
            addCriterion("city_id is not null");
            return (Criteria) this;
        }

        public Criteria andCityIdEqualTo(Integer value) {
            addCriterion("city_id =", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotEqualTo(Integer value) {
            addCriterion("city_id <>", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThan(Integer value) {
            addCriterion("city_id >", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("city_id >=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThan(Integer value) {
            addCriterion("city_id <", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThanOrEqualTo(Integer value) {
            addCriterion("city_id <=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdIn(List<Integer> values) {
            addCriterion("city_id in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotIn(List<Integer> values) {
            addCriterion("city_id not in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdBetween(Integer value1, Integer value2) {
            addCriterion("city_id between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("city_id not between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdIsNull() {
            addCriterion("district_id is null");
            return (Criteria) this;
        }

        public Criteria andDistrictIdIsNotNull() {
            addCriterion("district_id is not null");
            return (Criteria) this;
        }

        public Criteria andDistrictIdEqualTo(Integer value) {
            addCriterion("district_id =", value, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdNotEqualTo(Integer value) {
            addCriterion("district_id <>", value, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdGreaterThan(Integer value) {
            addCriterion("district_id >", value, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("district_id >=", value, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdLessThan(Integer value) {
            addCriterion("district_id <", value, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdLessThanOrEqualTo(Integer value) {
            addCriterion("district_id <=", value, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdIn(List<Integer> values) {
            addCriterion("district_id in", values, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdNotIn(List<Integer> values) {
            addCriterion("district_id not in", values, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdBetween(Integer value1, Integer value2) {
            addCriterion("district_id between", value1, value2, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdNotBetween(Integer value1, Integer value2) {
            addCriterion("district_id not between", value1, value2, "districtId");
            return (Criteria) this;
        }

        public Criteria andStreetIdIsNull() {
            addCriterion("street_id is null");
            return (Criteria) this;
        }

        public Criteria andStreetIdIsNotNull() {
            addCriterion("street_id is not null");
            return (Criteria) this;
        }

        public Criteria andStreetIdEqualTo(Integer value) {
            addCriterion("street_id =", value, "streetId");
            return (Criteria) this;
        }

        public Criteria andStreetIdNotEqualTo(Integer value) {
            addCriterion("street_id <>", value, "streetId");
            return (Criteria) this;
        }

        public Criteria andStreetIdGreaterThan(Integer value) {
            addCriterion("street_id >", value, "streetId");
            return (Criteria) this;
        }

        public Criteria andStreetIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("street_id >=", value, "streetId");
            return (Criteria) this;
        }

        public Criteria andStreetIdLessThan(Integer value) {
            addCriterion("street_id <", value, "streetId");
            return (Criteria) this;
        }

        public Criteria andStreetIdLessThanOrEqualTo(Integer value) {
            addCriterion("street_id <=", value, "streetId");
            return (Criteria) this;
        }

        public Criteria andStreetIdIn(List<Integer> values) {
            addCriterion("street_id in", values, "streetId");
            return (Criteria) this;
        }

        public Criteria andStreetIdNotIn(List<Integer> values) {
            addCriterion("street_id not in", values, "streetId");
            return (Criteria) this;
        }

        public Criteria andStreetIdBetween(Integer value1, Integer value2) {
            addCriterion("street_id between", value1, value2, "streetId");
            return (Criteria) this;
        }

        public Criteria andStreetIdNotBetween(Integer value1, Integer value2) {
            addCriterion("street_id not between", value1, value2, "streetId");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNull() {
            addCriterion("longitude is null");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNotNull() {
            addCriterion("longitude is not null");
            return (Criteria) this;
        }

        public Criteria andLongitudeEqualTo(String value) {
            addCriterion("longitude =", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotEqualTo(String value) {
            addCriterion("longitude <>", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThan(String value) {
            addCriterion("longitude >", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThanOrEqualTo(String value) {
            addCriterion("longitude >=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThan(String value) {
            addCriterion("longitude <", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThanOrEqualTo(String value) {
            addCriterion("longitude <=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLike(String value) {
            addCriterion("longitude like", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotLike(String value) {
            addCriterion("longitude not like", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeIn(List<String> values) {
            addCriterion("longitude in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotIn(List<String> values) {
            addCriterion("longitude not in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeBetween(String value1, String value2) {
            addCriterion("longitude between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotBetween(String value1, String value2) {
            addCriterion("longitude not between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNull() {
            addCriterion("latitude is null");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNotNull() {
            addCriterion("latitude is not null");
            return (Criteria) this;
        }

        public Criteria andLatitudeEqualTo(String value) {
            addCriterion("latitude =", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotEqualTo(String value) {
            addCriterion("latitude <>", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThan(String value) {
            addCriterion("latitude >", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThanOrEqualTo(String value) {
            addCriterion("latitude >=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThan(String value) {
            addCriterion("latitude <", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThanOrEqualTo(String value) {
            addCriterion("latitude <=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLike(String value) {
            addCriterion("latitude like", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotLike(String value) {
            addCriterion("latitude not like", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIn(List<String> values) {
            addCriterion("latitude in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotIn(List<String> values) {
            addCriterion("latitude not in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeBetween(String value1, String value2) {
            addCriterion("latitude between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotBetween(String value1, String value2) {
            addCriterion("latitude not between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
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

        public Criteria andTemplateIdIsNull() {
            addCriterion("template_id is null");
            return (Criteria) this;
        }

        public Criteria andTemplateIdIsNotNull() {
            addCriterion("template_id is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateIdEqualTo(String value) {
            addCriterion("template_id =", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdNotEqualTo(String value) {
            addCriterion("template_id <>", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdGreaterThan(String value) {
            addCriterion("template_id >", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdGreaterThanOrEqualTo(String value) {
            addCriterion("template_id >=", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdLessThan(String value) {
            addCriterion("template_id <", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdLessThanOrEqualTo(String value) {
            addCriterion("template_id <=", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdLike(String value) {
            addCriterion("template_id like", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdNotLike(String value) {
            addCriterion("template_id not like", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdIn(List<String> values) {
            addCriterion("template_id in", values, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdNotIn(List<String> values) {
            addCriterion("template_id not in", values, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdBetween(String value1, String value2) {
            addCriterion("template_id between", value1, value2, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdNotBetween(String value1, String value2) {
            addCriterion("template_id not between", value1, value2, "templateId");
            return (Criteria) this;
        }

        public Criteria andCashierIdIsNull() {
            addCriterion("cashier_id is null");
            return (Criteria) this;
        }

        public Criteria andCashierIdIsNotNull() {
            addCriterion("cashier_id is not null");
            return (Criteria) this;
        }

        public Criteria andCashierIdEqualTo(Integer value) {
            addCriterion("cashier_id =", value, "cashierId");
            return (Criteria) this;
        }

        public Criteria andCashierIdNotEqualTo(Integer value) {
            addCriterion("cashier_id <>", value, "cashierId");
            return (Criteria) this;
        }

        public Criteria andCashierIdGreaterThan(Integer value) {
            addCriterion("cashier_id >", value, "cashierId");
            return (Criteria) this;
        }

        public Criteria andCashierIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cashier_id >=", value, "cashierId");
            return (Criteria) this;
        }

        public Criteria andCashierIdLessThan(Integer value) {
            addCriterion("cashier_id <", value, "cashierId");
            return (Criteria) this;
        }

        public Criteria andCashierIdLessThanOrEqualTo(Integer value) {
            addCriterion("cashier_id <=", value, "cashierId");
            return (Criteria) this;
        }

        public Criteria andCashierIdIn(List<Integer> values) {
            addCriterion("cashier_id in", values, "cashierId");
            return (Criteria) this;
        }

        public Criteria andCashierIdNotIn(List<Integer> values) {
            addCriterion("cashier_id not in", values, "cashierId");
            return (Criteria) this;
        }

        public Criteria andCashierIdBetween(Integer value1, Integer value2) {
            addCriterion("cashier_id between", value1, value2, "cashierId");
            return (Criteria) this;
        }

        public Criteria andCashierIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cashier_id not between", value1, value2, "cashierId");
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

        public Criteria andBusinessHoursStartIsNull() {
            addCriterion("business_hours_start is null");
            return (Criteria) this;
        }

        public Criteria andBusinessHoursStartIsNotNull() {
            addCriterion("business_hours_start is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessHoursStartEqualTo(String value) {
            addCriterion("business_hours_start =", value, "businessHoursStart");
            return (Criteria) this;
        }

        public Criteria andBusinessHoursStartNotEqualTo(String value) {
            addCriterion("business_hours_start <>", value, "businessHoursStart");
            return (Criteria) this;
        }

        public Criteria andBusinessHoursStartGreaterThan(String value) {
            addCriterion("business_hours_start >", value, "businessHoursStart");
            return (Criteria) this;
        }

        public Criteria andBusinessHoursStartGreaterThanOrEqualTo(String value) {
            addCriterion("business_hours_start >=", value, "businessHoursStart");
            return (Criteria) this;
        }

        public Criteria andBusinessHoursStartLessThan(String value) {
            addCriterion("business_hours_start <", value, "businessHoursStart");
            return (Criteria) this;
        }

        public Criteria andBusinessHoursStartLessThanOrEqualTo(String value) {
            addCriterion("business_hours_start <=", value, "businessHoursStart");
            return (Criteria) this;
        }

        public Criteria andBusinessHoursStartLike(String value) {
            addCriterion("business_hours_start like", value, "businessHoursStart");
            return (Criteria) this;
        }

        public Criteria andBusinessHoursStartNotLike(String value) {
            addCriterion("business_hours_start not like", value, "businessHoursStart");
            return (Criteria) this;
        }

        public Criteria andBusinessHoursStartIn(List<String> values) {
            addCriterion("business_hours_start in", values, "businessHoursStart");
            return (Criteria) this;
        }

        public Criteria andBusinessHoursStartNotIn(List<String> values) {
            addCriterion("business_hours_start not in", values, "businessHoursStart");
            return (Criteria) this;
        }

        public Criteria andBusinessHoursStartBetween(String value1, String value2) {
            addCriterion("business_hours_start between", value1, value2, "businessHoursStart");
            return (Criteria) this;
        }

        public Criteria andBusinessHoursStartNotBetween(String value1, String value2) {
            addCriterion("business_hours_start not between", value1, value2, "businessHoursStart");
            return (Criteria) this;
        }

        public Criteria andBusinessHoursEndIsNull() {
            addCriterion("business_hours_end is null");
            return (Criteria) this;
        }

        public Criteria andBusinessHoursEndIsNotNull() {
            addCriterion("business_hours_end is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessHoursEndEqualTo(String value) {
            addCriterion("business_hours_end =", value, "businessHoursEnd");
            return (Criteria) this;
        }

        public Criteria andBusinessHoursEndNotEqualTo(String value) {
            addCriterion("business_hours_end <>", value, "businessHoursEnd");
            return (Criteria) this;
        }

        public Criteria andBusinessHoursEndGreaterThan(String value) {
            addCriterion("business_hours_end >", value, "businessHoursEnd");
            return (Criteria) this;
        }

        public Criteria andBusinessHoursEndGreaterThanOrEqualTo(String value) {
            addCriterion("business_hours_end >=", value, "businessHoursEnd");
            return (Criteria) this;
        }

        public Criteria andBusinessHoursEndLessThan(String value) {
            addCriterion("business_hours_end <", value, "businessHoursEnd");
            return (Criteria) this;
        }

        public Criteria andBusinessHoursEndLessThanOrEqualTo(String value) {
            addCriterion("business_hours_end <=", value, "businessHoursEnd");
            return (Criteria) this;
        }

        public Criteria andBusinessHoursEndLike(String value) {
            addCriterion("business_hours_end like", value, "businessHoursEnd");
            return (Criteria) this;
        }

        public Criteria andBusinessHoursEndNotLike(String value) {
            addCriterion("business_hours_end not like", value, "businessHoursEnd");
            return (Criteria) this;
        }

        public Criteria andBusinessHoursEndIn(List<String> values) {
            addCriterion("business_hours_end in", values, "businessHoursEnd");
            return (Criteria) this;
        }

        public Criteria andBusinessHoursEndNotIn(List<String> values) {
            addCriterion("business_hours_end not in", values, "businessHoursEnd");
            return (Criteria) this;
        }

        public Criteria andBusinessHoursEndBetween(String value1, String value2) {
            addCriterion("business_hours_end between", value1, value2, "businessHoursEnd");
            return (Criteria) this;
        }

        public Criteria andBusinessHoursEndNotBetween(String value1, String value2) {
            addCriterion("business_hours_end not between", value1, value2, "businessHoursEnd");
            return (Criteria) this;
        }

        public Criteria andAptitudeImgsIsNull() {
            addCriterion("aptitude_imgs is null");
            return (Criteria) this;
        }

        public Criteria andAptitudeImgsIsNotNull() {
            addCriterion("aptitude_imgs is not null");
            return (Criteria) this;
        }

        public Criteria andAptitudeImgsEqualTo(String value) {
            addCriterion("aptitude_imgs =", value, "aptitudeImgs");
            return (Criteria) this;
        }

        public Criteria andAptitudeImgsNotEqualTo(String value) {
            addCriterion("aptitude_imgs <>", value, "aptitudeImgs");
            return (Criteria) this;
        }

        public Criteria andAptitudeImgsGreaterThan(String value) {
            addCriterion("aptitude_imgs >", value, "aptitudeImgs");
            return (Criteria) this;
        }

        public Criteria andAptitudeImgsGreaterThanOrEqualTo(String value) {
            addCriterion("aptitude_imgs >=", value, "aptitudeImgs");
            return (Criteria) this;
        }

        public Criteria andAptitudeImgsLessThan(String value) {
            addCriterion("aptitude_imgs <", value, "aptitudeImgs");
            return (Criteria) this;
        }

        public Criteria andAptitudeImgsLessThanOrEqualTo(String value) {
            addCriterion("aptitude_imgs <=", value, "aptitudeImgs");
            return (Criteria) this;
        }

        public Criteria andAptitudeImgsLike(String value) {
            addCriterion("aptitude_imgs like", value, "aptitudeImgs");
            return (Criteria) this;
        }

        public Criteria andAptitudeImgsNotLike(String value) {
            addCriterion("aptitude_imgs not like", value, "aptitudeImgs");
            return (Criteria) this;
        }

        public Criteria andAptitudeImgsIn(List<String> values) {
            addCriterion("aptitude_imgs in", values, "aptitudeImgs");
            return (Criteria) this;
        }

        public Criteria andAptitudeImgsNotIn(List<String> values) {
            addCriterion("aptitude_imgs not in", values, "aptitudeImgs");
            return (Criteria) this;
        }

        public Criteria andAptitudeImgsBetween(String value1, String value2) {
            addCriterion("aptitude_imgs between", value1, value2, "aptitudeImgs");
            return (Criteria) this;
        }

        public Criteria andAptitudeImgsNotBetween(String value1, String value2) {
            addCriterion("aptitude_imgs not between", value1, value2, "aptitudeImgs");
            return (Criteria) this;
        }

        public Criteria andDispatchTypeIsNull() {
            addCriterion("dispatch_type is null");
            return (Criteria) this;
        }

        public Criteria andDispatchTypeIsNotNull() {
            addCriterion("dispatch_type is not null");
            return (Criteria) this;
        }

        public Criteria andDispatchTypeEqualTo(String value) {
            addCriterion("dispatch_type =", value, "dispatchType");
            return (Criteria) this;
        }

        public Criteria andDispatchTypeNotEqualTo(String value) {
            addCriterion("dispatch_type <>", value, "dispatchType");
            return (Criteria) this;
        }

        public Criteria andDispatchTypeGreaterThan(String value) {
            addCriterion("dispatch_type >", value, "dispatchType");
            return (Criteria) this;
        }

        public Criteria andDispatchTypeGreaterThanOrEqualTo(String value) {
            addCriterion("dispatch_type >=", value, "dispatchType");
            return (Criteria) this;
        }

        public Criteria andDispatchTypeLessThan(String value) {
            addCriterion("dispatch_type <", value, "dispatchType");
            return (Criteria) this;
        }

        public Criteria andDispatchTypeLessThanOrEqualTo(String value) {
            addCriterion("dispatch_type <=", value, "dispatchType");
            return (Criteria) this;
        }

        public Criteria andDispatchTypeLike(String value) {
            addCriterion("dispatch_type like", value, "dispatchType");
            return (Criteria) this;
        }

        public Criteria andDispatchTypeNotLike(String value) {
            addCriterion("dispatch_type not like", value, "dispatchType");
            return (Criteria) this;
        }

        public Criteria andDispatchTypeIn(List<String> values) {
            addCriterion("dispatch_type in", values, "dispatchType");
            return (Criteria) this;
        }

        public Criteria andDispatchTypeNotIn(List<String> values) {
            addCriterion("dispatch_type not in", values, "dispatchType");
            return (Criteria) this;
        }

        public Criteria andDispatchTypeBetween(String value1, String value2) {
            addCriterion("dispatch_type between", value1, value2, "dispatchType");
            return (Criteria) this;
        }

        public Criteria andDispatchTypeNotBetween(String value1, String value2) {
            addCriterion("dispatch_type not between", value1, value2, "dispatchType");
            return (Criteria) this;
        }

        public Criteria andAfficheIsNull() {
            addCriterion("affiche is null");
            return (Criteria) this;
        }

        public Criteria andAfficheIsNotNull() {
            addCriterion("affiche is not null");
            return (Criteria) this;
        }

        public Criteria andAfficheEqualTo(String value) {
            addCriterion("affiche =", value, "affiche");
            return (Criteria) this;
        }

        public Criteria andAfficheNotEqualTo(String value) {
            addCriterion("affiche <>", value, "affiche");
            return (Criteria) this;
        }

        public Criteria andAfficheGreaterThan(String value) {
            addCriterion("affiche >", value, "affiche");
            return (Criteria) this;
        }

        public Criteria andAfficheGreaterThanOrEqualTo(String value) {
            addCriterion("affiche >=", value, "affiche");
            return (Criteria) this;
        }

        public Criteria andAfficheLessThan(String value) {
            addCriterion("affiche <", value, "affiche");
            return (Criteria) this;
        }

        public Criteria andAfficheLessThanOrEqualTo(String value) {
            addCriterion("affiche <=", value, "affiche");
            return (Criteria) this;
        }

        public Criteria andAfficheLike(String value) {
            addCriterion("affiche like", value, "affiche");
            return (Criteria) this;
        }

        public Criteria andAfficheNotLike(String value) {
            addCriterion("affiche not like", value, "affiche");
            return (Criteria) this;
        }

        public Criteria andAfficheIn(List<String> values) {
            addCriterion("affiche in", values, "affiche");
            return (Criteria) this;
        }

        public Criteria andAfficheNotIn(List<String> values) {
            addCriterion("affiche not in", values, "affiche");
            return (Criteria) this;
        }

        public Criteria andAfficheBetween(String value1, String value2) {
            addCriterion("affiche between", value1, value2, "affiche");
            return (Criteria) this;
        }

        public Criteria andAfficheNotBetween(String value1, String value2) {
            addCriterion("affiche not between", value1, value2, "affiche");
            return (Criteria) this;
        }

        public Criteria andUserUidIsNull() {
            addCriterion("user_uid is null");
            return (Criteria) this;
        }

        public Criteria andUserUidIsNotNull() {
            addCriterion("user_uid is not null");
            return (Criteria) this;
        }

        public Criteria andUserUidEqualTo(Integer value) {
            addCriterion("user_uid =", value, "userUid");
            return (Criteria) this;
        }

        public Criteria andUserUidNotEqualTo(Integer value) {
            addCriterion("user_uid <>", value, "userUid");
            return (Criteria) this;
        }

        public Criteria andUserUidGreaterThan(Integer value) {
            addCriterion("user_uid >", value, "userUid");
            return (Criteria) this;
        }

        public Criteria andUserUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_uid >=", value, "userUid");
            return (Criteria) this;
        }

        public Criteria andUserUidLessThan(Integer value) {
            addCriterion("user_uid <", value, "userUid");
            return (Criteria) this;
        }

        public Criteria andUserUidLessThanOrEqualTo(Integer value) {
            addCriterion("user_uid <=", value, "userUid");
            return (Criteria) this;
        }

        public Criteria andUserUidIn(List<Integer> values) {
            addCriterion("user_uid in", values, "userUid");
            return (Criteria) this;
        }

        public Criteria andUserUidNotIn(List<Integer> values) {
            addCriterion("user_uid not in", values, "userUid");
            return (Criteria) this;
        }

        public Criteria andUserUidBetween(Integer value1, Integer value2) {
            addCriterion("user_uid between", value1, value2, "userUid");
            return (Criteria) this;
        }

        public Criteria andUserUidNotBetween(Integer value1, Integer value2) {
            addCriterion("user_uid not between", value1, value2, "userUid");
            return (Criteria) this;
        }

        public Criteria andIsBlackIsNull() {
            addCriterion("is_black is null");
            return (Criteria) this;
        }

        public Criteria andIsBlackIsNotNull() {
            addCriterion("is_black is not null");
            return (Criteria) this;
        }

        public Criteria andIsBlackEqualTo(Boolean value) {
            addCriterion("is_black =", value, "isBlack");
            return (Criteria) this;
        }

        public Criteria andIsBlackNotEqualTo(Boolean value) {
            addCriterion("is_black <>", value, "isBlack");
            return (Criteria) this;
        }

        public Criteria andIsBlackGreaterThan(Boolean value) {
            addCriterion("is_black >", value, "isBlack");
            return (Criteria) this;
        }

        public Criteria andIsBlackGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_black >=", value, "isBlack");
            return (Criteria) this;
        }

        public Criteria andIsBlackLessThan(Boolean value) {
            addCriterion("is_black <", value, "isBlack");
            return (Criteria) this;
        }

        public Criteria andIsBlackLessThanOrEqualTo(Boolean value) {
            addCriterion("is_black <=", value, "isBlack");
            return (Criteria) this;
        }

        public Criteria andIsBlackIn(List<Boolean> values) {
            addCriterion("is_black in", values, "isBlack");
            return (Criteria) this;
        }

        public Criteria andIsBlackNotIn(List<Boolean> values) {
            addCriterion("is_black not in", values, "isBlack");
            return (Criteria) this;
        }

        public Criteria andIsBlackBetween(Boolean value1, Boolean value2) {
            addCriterion("is_black between", value1, value2, "isBlack");
            return (Criteria) this;
        }

        public Criteria andIsBlackNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_black not between", value1, value2, "isBlack");
            return (Criteria) this;
        }

        public Criteria andBannerThumbIsNull() {
            addCriterion("banner_thumb is null");
            return (Criteria) this;
        }

        public Criteria andBannerThumbIsNotNull() {
            addCriterion("banner_thumb is not null");
            return (Criteria) this;
        }

        public Criteria andBannerThumbEqualTo(String value) {
            addCriterion("banner_thumb =", value, "bannerThumb");
            return (Criteria) this;
        }

        public Criteria andBannerThumbNotEqualTo(String value) {
            addCriterion("banner_thumb <>", value, "bannerThumb");
            return (Criteria) this;
        }

        public Criteria andBannerThumbGreaterThan(String value) {
            addCriterion("banner_thumb >", value, "bannerThumb");
            return (Criteria) this;
        }

        public Criteria andBannerThumbGreaterThanOrEqualTo(String value) {
            addCriterion("banner_thumb >=", value, "bannerThumb");
            return (Criteria) this;
        }

        public Criteria andBannerThumbLessThan(String value) {
            addCriterion("banner_thumb <", value, "bannerThumb");
            return (Criteria) this;
        }

        public Criteria andBannerThumbLessThanOrEqualTo(String value) {
            addCriterion("banner_thumb <=", value, "bannerThumb");
            return (Criteria) this;
        }

        public Criteria andBannerThumbLike(String value) {
            addCriterion("banner_thumb like", value, "bannerThumb");
            return (Criteria) this;
        }

        public Criteria andBannerThumbNotLike(String value) {
            addCriterion("banner_thumb not like", value, "bannerThumb");
            return (Criteria) this;
        }

        public Criteria andBannerThumbIn(List<String> values) {
            addCriterion("banner_thumb in", values, "bannerThumb");
            return (Criteria) this;
        }

        public Criteria andBannerThumbNotIn(List<String> values) {
            addCriterion("banner_thumb not in", values, "bannerThumb");
            return (Criteria) this;
        }

        public Criteria andBannerThumbBetween(String value1, String value2) {
            addCriterion("banner_thumb between", value1, value2, "bannerThumb");
            return (Criteria) this;
        }

        public Criteria andBannerThumbNotBetween(String value1, String value2) {
            addCriterion("banner_thumb not between", value1, value2, "bannerThumb");
            return (Criteria) this;
        }

        public Criteria andIsHideIsNull() {
            addCriterion("is_hide is null");
            return (Criteria) this;
        }

        public Criteria andIsHideIsNotNull() {
            addCriterion("is_hide is not null");
            return (Criteria) this;
        }

        public Criteria andIsHideEqualTo(Byte value) {
            addCriterion("is_hide =", value, "isHide");
            return (Criteria) this;
        }

        public Criteria andIsHideNotEqualTo(Byte value) {
            addCriterion("is_hide <>", value, "isHide");
            return (Criteria) this;
        }

        public Criteria andIsHideGreaterThan(Byte value) {
            addCriterion("is_hide >", value, "isHide");
            return (Criteria) this;
        }

        public Criteria andIsHideGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_hide >=", value, "isHide");
            return (Criteria) this;
        }

        public Criteria andIsHideLessThan(Byte value) {
            addCriterion("is_hide <", value, "isHide");
            return (Criteria) this;
        }

        public Criteria andIsHideLessThanOrEqualTo(Byte value) {
            addCriterion("is_hide <=", value, "isHide");
            return (Criteria) this;
        }

        public Criteria andIsHideIn(List<Byte> values) {
            addCriterion("is_hide in", values, "isHide");
            return (Criteria) this;
        }

        public Criteria andIsHideNotIn(List<Byte> values) {
            addCriterion("is_hide not in", values, "isHide");
            return (Criteria) this;
        }

        public Criteria andIsHideBetween(Byte value1, Byte value2) {
            addCriterion("is_hide between", value1, value2, "isHide");
            return (Criteria) this;
        }

        public Criteria andIsHideNotBetween(Byte value1, Byte value2) {
            addCriterion("is_hide not between", value1, value2, "isHide");
            return (Criteria) this;
        }

        public Criteria andSpecifyShowIsNull() {
            addCriterion("specify_show is null");
            return (Criteria) this;
        }

        public Criteria andSpecifyShowIsNotNull() {
            addCriterion("specify_show is not null");
            return (Criteria) this;
        }

        public Criteria andSpecifyShowEqualTo(Byte value) {
            addCriterion("specify_show =", value, "specifyShow");
            return (Criteria) this;
        }

        public Criteria andSpecifyShowNotEqualTo(Byte value) {
            addCriterion("specify_show <>", value, "specifyShow");
            return (Criteria) this;
        }

        public Criteria andSpecifyShowGreaterThan(Byte value) {
            addCriterion("specify_show >", value, "specifyShow");
            return (Criteria) this;
        }

        public Criteria andSpecifyShowGreaterThanOrEqualTo(Byte value) {
            addCriterion("specify_show >=", value, "specifyShow");
            return (Criteria) this;
        }

        public Criteria andSpecifyShowLessThan(Byte value) {
            addCriterion("specify_show <", value, "specifyShow");
            return (Criteria) this;
        }

        public Criteria andSpecifyShowLessThanOrEqualTo(Byte value) {
            addCriterion("specify_show <=", value, "specifyShow");
            return (Criteria) this;
        }

        public Criteria andSpecifyShowIn(List<Byte> values) {
            addCriterion("specify_show in", values, "specifyShow");
            return (Criteria) this;
        }

        public Criteria andSpecifyShowNotIn(List<Byte> values) {
            addCriterion("specify_show not in", values, "specifyShow");
            return (Criteria) this;
        }

        public Criteria andSpecifyShowBetween(Byte value1, Byte value2) {
            addCriterion("specify_show between", value1, value2, "specifyShow");
            return (Criteria) this;
        }

        public Criteria andSpecifyShowNotBetween(Byte value1, Byte value2) {
            addCriterion("specify_show not between", value1, value2, "specifyShow");
            return (Criteria) this;
        }

        public Criteria andOperatingStateIsNull() {
            addCriterion("operating_state is null");
            return (Criteria) this;
        }

        public Criteria andOperatingStateIsNotNull() {
            addCriterion("operating_state is not null");
            return (Criteria) this;
        }

        public Criteria andOperatingStateEqualTo(Byte value) {
            addCriterion("operating_state =", value, "operatingState");
            return (Criteria) this;
        }

        public Criteria andOperatingStateNotEqualTo(Byte value) {
            addCriterion("operating_state <>", value, "operatingState");
            return (Criteria) this;
        }

        public Criteria andOperatingStateGreaterThan(Byte value) {
            addCriterion("operating_state >", value, "operatingState");
            return (Criteria) this;
        }

        public Criteria andOperatingStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("operating_state >=", value, "operatingState");
            return (Criteria) this;
        }

        public Criteria andOperatingStateLessThan(Byte value) {
            addCriterion("operating_state <", value, "operatingState");
            return (Criteria) this;
        }

        public Criteria andOperatingStateLessThanOrEqualTo(Byte value) {
            addCriterion("operating_state <=", value, "operatingState");
            return (Criteria) this;
        }

        public Criteria andOperatingStateIn(List<Byte> values) {
            addCriterion("operating_state in", values, "operatingState");
            return (Criteria) this;
        }

        public Criteria andOperatingStateNotIn(List<Byte> values) {
            addCriterion("operating_state not in", values, "operatingState");
            return (Criteria) this;
        }

        public Criteria andOperatingStateBetween(Byte value1, Byte value2) {
            addCriterion("operating_state between", value1, value2, "operatingState");
            return (Criteria) this;
        }

        public Criteria andOperatingStateNotBetween(Byte value1, Byte value2) {
            addCriterion("operating_state not between", value1, value2, "operatingState");
            return (Criteria) this;
        }

        public Criteria andBossUidIsNull() {
            addCriterion("boss_uid is null");
            return (Criteria) this;
        }

        public Criteria andBossUidIsNotNull() {
            addCriterion("boss_uid is not null");
            return (Criteria) this;
        }

        public Criteria andBossUidEqualTo(Integer value) {
            addCriterion("boss_uid =", value, "bossUid");
            return (Criteria) this;
        }

        public Criteria andBossUidNotEqualTo(Integer value) {
            addCriterion("boss_uid <>", value, "bossUid");
            return (Criteria) this;
        }

        public Criteria andBossUidGreaterThan(Integer value) {
            addCriterion("boss_uid >", value, "bossUid");
            return (Criteria) this;
        }

        public Criteria andBossUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("boss_uid >=", value, "bossUid");
            return (Criteria) this;
        }

        public Criteria andBossUidLessThan(Integer value) {
            addCriterion("boss_uid <", value, "bossUid");
            return (Criteria) this;
        }

        public Criteria andBossUidLessThanOrEqualTo(Integer value) {
            addCriterion("boss_uid <=", value, "bossUid");
            return (Criteria) this;
        }

        public Criteria andBossUidIn(List<Integer> values) {
            addCriterion("boss_uid in", values, "bossUid");
            return (Criteria) this;
        }

        public Criteria andBossUidNotIn(List<Integer> values) {
            addCriterion("boss_uid not in", values, "bossUid");
            return (Criteria) this;
        }

        public Criteria andBossUidBetween(Integer value1, Integer value2) {
            addCriterion("boss_uid between", value1, value2, "bossUid");
            return (Criteria) this;
        }

        public Criteria andBossUidNotBetween(Integer value1, Integer value2) {
            addCriterion("boss_uid not between", value1, value2, "bossUid");
            return (Criteria) this;
        }

        public Criteria andAudioOpenIsNull() {
            addCriterion("audio_open is null");
            return (Criteria) this;
        }

        public Criteria andAudioOpenIsNotNull() {
            addCriterion("audio_open is not null");
            return (Criteria) this;
        }

        public Criteria andAudioOpenEqualTo(Byte value) {
            addCriterion("audio_open =", value, "audioOpen");
            return (Criteria) this;
        }

        public Criteria andAudioOpenNotEqualTo(Byte value) {
            addCriterion("audio_open <>", value, "audioOpen");
            return (Criteria) this;
        }

        public Criteria andAudioOpenGreaterThan(Byte value) {
            addCriterion("audio_open >", value, "audioOpen");
            return (Criteria) this;
        }

        public Criteria andAudioOpenGreaterThanOrEqualTo(Byte value) {
            addCriterion("audio_open >=", value, "audioOpen");
            return (Criteria) this;
        }

        public Criteria andAudioOpenLessThan(Byte value) {
            addCriterion("audio_open <", value, "audioOpen");
            return (Criteria) this;
        }

        public Criteria andAudioOpenLessThanOrEqualTo(Byte value) {
            addCriterion("audio_open <=", value, "audioOpen");
            return (Criteria) this;
        }

        public Criteria andAudioOpenIn(List<Byte> values) {
            addCriterion("audio_open in", values, "audioOpen");
            return (Criteria) this;
        }

        public Criteria andAudioOpenNotIn(List<Byte> values) {
            addCriterion("audio_open not in", values, "audioOpen");
            return (Criteria) this;
        }

        public Criteria andAudioOpenBetween(Byte value1, Byte value2) {
            addCriterion("audio_open between", value1, value2, "audioOpen");
            return (Criteria) this;
        }

        public Criteria andAudioOpenNotBetween(Byte value1, Byte value2) {
            addCriterion("audio_open not between", value1, value2, "audioOpen");
            return (Criteria) this;
        }

        public Criteria andInitialsIsNull() {
            addCriterion("initials is null");
            return (Criteria) this;
        }

        public Criteria andInitialsIsNotNull() {
            addCriterion("initials is not null");
            return (Criteria) this;
        }

        public Criteria andInitialsEqualTo(String value) {
            addCriterion("initials =", value, "initials");
            return (Criteria) this;
        }

        public Criteria andInitialsNotEqualTo(String value) {
            addCriterion("initials <>", value, "initials");
            return (Criteria) this;
        }

        public Criteria andInitialsGreaterThan(String value) {
            addCriterion("initials >", value, "initials");
            return (Criteria) this;
        }

        public Criteria andInitialsGreaterThanOrEqualTo(String value) {
            addCriterion("initials >=", value, "initials");
            return (Criteria) this;
        }

        public Criteria andInitialsLessThan(String value) {
            addCriterion("initials <", value, "initials");
            return (Criteria) this;
        }

        public Criteria andInitialsLessThanOrEqualTo(String value) {
            addCriterion("initials <=", value, "initials");
            return (Criteria) this;
        }

        public Criteria andInitialsLike(String value) {
            addCriterion("initials like", value, "initials");
            return (Criteria) this;
        }

        public Criteria andInitialsNotLike(String value) {
            addCriterion("initials not like", value, "initials");
            return (Criteria) this;
        }

        public Criteria andInitialsIn(List<String> values) {
            addCriterion("initials in", values, "initials");
            return (Criteria) this;
        }

        public Criteria andInitialsNotIn(List<String> values) {
            addCriterion("initials not in", values, "initials");
            return (Criteria) this;
        }

        public Criteria andInitialsBetween(String value1, String value2) {
            addCriterion("initials between", value1, value2, "initials");
            return (Criteria) this;
        }

        public Criteria andInitialsNotBetween(String value1, String value2) {
            addCriterion("initials not between", value1, value2, "initials");
            return (Criteria) this;
        }

        public Criteria andValidityIsNull() {
            addCriterion("validity is null");
            return (Criteria) this;
        }

        public Criteria andValidityIsNotNull() {
            addCriterion("validity is not null");
            return (Criteria) this;
        }

        public Criteria andValidityEqualTo(Integer value) {
            addCriterion("validity =", value, "validity");
            return (Criteria) this;
        }

        public Criteria andValidityNotEqualTo(Integer value) {
            addCriterion("validity <>", value, "validity");
            return (Criteria) this;
        }

        public Criteria andValidityGreaterThan(Integer value) {
            addCriterion("validity >", value, "validity");
            return (Criteria) this;
        }

        public Criteria andValidityGreaterThanOrEqualTo(Integer value) {
            addCriterion("validity >=", value, "validity");
            return (Criteria) this;
        }

        public Criteria andValidityLessThan(Integer value) {
            addCriterion("validity <", value, "validity");
            return (Criteria) this;
        }

        public Criteria andValidityLessThanOrEqualTo(Integer value) {
            addCriterion("validity <=", value, "validity");
            return (Criteria) this;
        }

        public Criteria andValidityIn(List<Integer> values) {
            addCriterion("validity in", values, "validity");
            return (Criteria) this;
        }

        public Criteria andValidityNotIn(List<Integer> values) {
            addCriterion("validity not in", values, "validity");
            return (Criteria) this;
        }

        public Criteria andValidityBetween(Integer value1, Integer value2) {
            addCriterion("validity between", value1, value2, "validity");
            return (Criteria) this;
        }

        public Criteria andValidityNotBetween(Integer value1, Integer value2) {
            addCriterion("validity not between", value1, value2, "validity");
            return (Criteria) this;
        }

        public Criteria andValidityStatusIsNull() {
            addCriterion("validity_status is null");
            return (Criteria) this;
        }

        public Criteria andValidityStatusIsNotNull() {
            addCriterion("validity_status is not null");
            return (Criteria) this;
        }

        public Criteria andValidityStatusEqualTo(Boolean value) {
            addCriterion("validity_status =", value, "validityStatus");
            return (Criteria) this;
        }

        public Criteria andValidityStatusNotEqualTo(Boolean value) {
            addCriterion("validity_status <>", value, "validityStatus");
            return (Criteria) this;
        }

        public Criteria andValidityStatusGreaterThan(Boolean value) {
            addCriterion("validity_status >", value, "validityStatus");
            return (Criteria) this;
        }

        public Criteria andValidityStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("validity_status >=", value, "validityStatus");
            return (Criteria) this;
        }

        public Criteria andValidityStatusLessThan(Boolean value) {
            addCriterion("validity_status <", value, "validityStatus");
            return (Criteria) this;
        }

        public Criteria andValidityStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("validity_status <=", value, "validityStatus");
            return (Criteria) this;
        }

        public Criteria andValidityStatusIn(List<Boolean> values) {
            addCriterion("validity_status in", values, "validityStatus");
            return (Criteria) this;
        }

        public Criteria andValidityStatusNotIn(List<Boolean> values) {
            addCriterion("validity_status not in", values, "validityStatus");
            return (Criteria) this;
        }

        public Criteria andValidityStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("validity_status between", value1, value2, "validityStatus");
            return (Criteria) this;
        }

        public Criteria andValidityStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("validity_status not between", value1, value2, "validityStatus");
            return (Criteria) this;
        }

        public Criteria andYunHornIsNull() {
            addCriterion("yun_horn is null");
            return (Criteria) this;
        }

        public Criteria andYunHornIsNotNull() {
            addCriterion("yun_horn is not null");
            return (Criteria) this;
        }

        public Criteria andYunHornEqualTo(String value) {
            addCriterion("yun_horn =", value, "yunHorn");
            return (Criteria) this;
        }

        public Criteria andYunHornNotEqualTo(String value) {
            addCriterion("yun_horn <>", value, "yunHorn");
            return (Criteria) this;
        }

        public Criteria andYunHornGreaterThan(String value) {
            addCriterion("yun_horn >", value, "yunHorn");
            return (Criteria) this;
        }

        public Criteria andYunHornGreaterThanOrEqualTo(String value) {
            addCriterion("yun_horn >=", value, "yunHorn");
            return (Criteria) this;
        }

        public Criteria andYunHornLessThan(String value) {
            addCriterion("yun_horn <", value, "yunHorn");
            return (Criteria) this;
        }

        public Criteria andYunHornLessThanOrEqualTo(String value) {
            addCriterion("yun_horn <=", value, "yunHorn");
            return (Criteria) this;
        }

        public Criteria andYunHornLike(String value) {
            addCriterion("yun_horn like", value, "yunHorn");
            return (Criteria) this;
        }

        public Criteria andYunHornNotLike(String value) {
            addCriterion("yun_horn not like", value, "yunHorn");
            return (Criteria) this;
        }

        public Criteria andYunHornIn(List<String> values) {
            addCriterion("yun_horn in", values, "yunHorn");
            return (Criteria) this;
        }

        public Criteria andYunHornNotIn(List<String> values) {
            addCriterion("yun_horn not in", values, "yunHorn");
            return (Criteria) this;
        }

        public Criteria andYunHornBetween(String value1, String value2) {
            addCriterion("yun_horn between", value1, value2, "yunHorn");
            return (Criteria) this;
        }

        public Criteria andYunHornNotBetween(String value1, String value2) {
            addCriterion("yun_horn not between", value1, value2, "yunHorn");
            return (Criteria) this;
        }

        public Criteria andZkcPayIsNull() {
            addCriterion("zkc_pay is null");
            return (Criteria) this;
        }

        public Criteria andZkcPayIsNotNull() {
            addCriterion("zkc_pay is not null");
            return (Criteria) this;
        }

        public Criteria andZkcPayEqualTo(String value) {
            addCriterion("zkc_pay =", value, "zkcPay");
            return (Criteria) this;
        }

        public Criteria andZkcPayNotEqualTo(String value) {
            addCriterion("zkc_pay <>", value, "zkcPay");
            return (Criteria) this;
        }

        public Criteria andZkcPayGreaterThan(String value) {
            addCriterion("zkc_pay >", value, "zkcPay");
            return (Criteria) this;
        }

        public Criteria andZkcPayGreaterThanOrEqualTo(String value) {
            addCriterion("zkc_pay >=", value, "zkcPay");
            return (Criteria) this;
        }

        public Criteria andZkcPayLessThan(String value) {
            addCriterion("zkc_pay <", value, "zkcPay");
            return (Criteria) this;
        }

        public Criteria andZkcPayLessThanOrEqualTo(String value) {
            addCriterion("zkc_pay <=", value, "zkcPay");
            return (Criteria) this;
        }

        public Criteria andZkcPayLike(String value) {
            addCriterion("zkc_pay like", value, "zkcPay");
            return (Criteria) this;
        }

        public Criteria andZkcPayNotLike(String value) {
            addCriterion("zkc_pay not like", value, "zkcPay");
            return (Criteria) this;
        }

        public Criteria andZkcPayIn(List<String> values) {
            addCriterion("zkc_pay in", values, "zkcPay");
            return (Criteria) this;
        }

        public Criteria andZkcPayNotIn(List<String> values) {
            addCriterion("zkc_pay not in", values, "zkcPay");
            return (Criteria) this;
        }

        public Criteria andZkcPayBetween(String value1, String value2) {
            addCriterion("zkc_pay between", value1, value2, "zkcPay");
            return (Criteria) this;
        }

        public Criteria andZkcPayNotBetween(String value1, String value2) {
            addCriterion("zkc_pay not between", value1, value2, "zkcPay");
            return (Criteria) this;
        }

        public Criteria andSaltIsNull() {
            addCriterion("salt is null");
            return (Criteria) this;
        }

        public Criteria andSaltIsNotNull() {
            addCriterion("salt is not null");
            return (Criteria) this;
        }

        public Criteria andSaltEqualTo(String value) {
            addCriterion("salt =", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotEqualTo(String value) {
            addCriterion("salt <>", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltGreaterThan(String value) {
            addCriterion("salt >", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltGreaterThanOrEqualTo(String value) {
            addCriterion("salt >=", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLessThan(String value) {
            addCriterion("salt <", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLessThanOrEqualTo(String value) {
            addCriterion("salt <=", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLike(String value) {
            addCriterion("salt like", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotLike(String value) {
            addCriterion("salt not like", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltIn(List<String> values) {
            addCriterion("salt in", values, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotIn(List<String> values) {
            addCriterion("salt not in", values, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltBetween(String value1, String value2) {
            addCriterion("salt between", value1, value2, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotBetween(String value1, String value2) {
            addCriterion("salt not between", value1, value2, "salt");
            return (Criteria) this;
        }

        public Criteria andHomeStoreUrlIsNull() {
            addCriterion("home_store_url is null");
            return (Criteria) this;
        }

        public Criteria andHomeStoreUrlIsNotNull() {
            addCriterion("home_store_url is not null");
            return (Criteria) this;
        }

        public Criteria andHomeStoreUrlEqualTo(String value) {
            addCriterion("home_store_url =", value, "homeStoreUrl");
            return (Criteria) this;
        }

        public Criteria andHomeStoreUrlNotEqualTo(String value) {
            addCriterion("home_store_url <>", value, "homeStoreUrl");
            return (Criteria) this;
        }

        public Criteria andHomeStoreUrlGreaterThan(String value) {
            addCriterion("home_store_url >", value, "homeStoreUrl");
            return (Criteria) this;
        }

        public Criteria andHomeStoreUrlGreaterThanOrEqualTo(String value) {
            addCriterion("home_store_url >=", value, "homeStoreUrl");
            return (Criteria) this;
        }

        public Criteria andHomeStoreUrlLessThan(String value) {
            addCriterion("home_store_url <", value, "homeStoreUrl");
            return (Criteria) this;
        }

        public Criteria andHomeStoreUrlLessThanOrEqualTo(String value) {
            addCriterion("home_store_url <=", value, "homeStoreUrl");
            return (Criteria) this;
        }

        public Criteria andHomeStoreUrlLike(String value) {
            addCriterion("home_store_url like", value, "homeStoreUrl");
            return (Criteria) this;
        }

        public Criteria andHomeStoreUrlNotLike(String value) {
            addCriterion("home_store_url not like", value, "homeStoreUrl");
            return (Criteria) this;
        }

        public Criteria andHomeStoreUrlIn(List<String> values) {
            addCriterion("home_store_url in", values, "homeStoreUrl");
            return (Criteria) this;
        }

        public Criteria andHomeStoreUrlNotIn(List<String> values) {
            addCriterion("home_store_url not in", values, "homeStoreUrl");
            return (Criteria) this;
        }

        public Criteria andHomeStoreUrlBetween(String value1, String value2) {
            addCriterion("home_store_url between", value1, value2, "homeStoreUrl");
            return (Criteria) this;
        }

        public Criteria andHomeStoreUrlNotBetween(String value1, String value2) {
            addCriterion("home_store_url not between", value1, value2, "homeStoreUrl");
            return (Criteria) this;
        }

        public Criteria andGoodsStoreUrlIsNull() {
            addCriterion("goods_store_url is null");
            return (Criteria) this;
        }

        public Criteria andGoodsStoreUrlIsNotNull() {
            addCriterion("goods_store_url is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsStoreUrlEqualTo(String value) {
            addCriterion("goods_store_url =", value, "goodsStoreUrl");
            return (Criteria) this;
        }

        public Criteria andGoodsStoreUrlNotEqualTo(String value) {
            addCriterion("goods_store_url <>", value, "goodsStoreUrl");
            return (Criteria) this;
        }

        public Criteria andGoodsStoreUrlGreaterThan(String value) {
            addCriterion("goods_store_url >", value, "goodsStoreUrl");
            return (Criteria) this;
        }

        public Criteria andGoodsStoreUrlGreaterThanOrEqualTo(String value) {
            addCriterion("goods_store_url >=", value, "goodsStoreUrl");
            return (Criteria) this;
        }

        public Criteria andGoodsStoreUrlLessThan(String value) {
            addCriterion("goods_store_url <", value, "goodsStoreUrl");
            return (Criteria) this;
        }

        public Criteria andGoodsStoreUrlLessThanOrEqualTo(String value) {
            addCriterion("goods_store_url <=", value, "goodsStoreUrl");
            return (Criteria) this;
        }

        public Criteria andGoodsStoreUrlLike(String value) {
            addCriterion("goods_store_url like", value, "goodsStoreUrl");
            return (Criteria) this;
        }

        public Criteria andGoodsStoreUrlNotLike(String value) {
            addCriterion("goods_store_url not like", value, "goodsStoreUrl");
            return (Criteria) this;
        }

        public Criteria andGoodsStoreUrlIn(List<String> values) {
            addCriterion("goods_store_url in", values, "goodsStoreUrl");
            return (Criteria) this;
        }

        public Criteria andGoodsStoreUrlNotIn(List<String> values) {
            addCriterion("goods_store_url not in", values, "goodsStoreUrl");
            return (Criteria) this;
        }

        public Criteria andGoodsStoreUrlBetween(String value1, String value2) {
            addCriterion("goods_store_url between", value1, value2, "goodsStoreUrl");
            return (Criteria) this;
        }

        public Criteria andGoodsStoreUrlNotBetween(String value1, String value2) {
            addCriterion("goods_store_url not between", value1, value2, "goodsStoreUrl");
            return (Criteria) this;
        }

        public Criteria andCollectMoneyUrlIsNull() {
            addCriterion("collect_money_url is null");
            return (Criteria) this;
        }

        public Criteria andCollectMoneyUrlIsNotNull() {
            addCriterion("collect_money_url is not null");
            return (Criteria) this;
        }

        public Criteria andCollectMoneyUrlEqualTo(String value) {
            addCriterion("collect_money_url =", value, "collectMoneyUrl");
            return (Criteria) this;
        }

        public Criteria andCollectMoneyUrlNotEqualTo(String value) {
            addCriterion("collect_money_url <>", value, "collectMoneyUrl");
            return (Criteria) this;
        }

        public Criteria andCollectMoneyUrlGreaterThan(String value) {
            addCriterion("collect_money_url >", value, "collectMoneyUrl");
            return (Criteria) this;
        }

        public Criteria andCollectMoneyUrlGreaterThanOrEqualTo(String value) {
            addCriterion("collect_money_url >=", value, "collectMoneyUrl");
            return (Criteria) this;
        }

        public Criteria andCollectMoneyUrlLessThan(String value) {
            addCriterion("collect_money_url <", value, "collectMoneyUrl");
            return (Criteria) this;
        }

        public Criteria andCollectMoneyUrlLessThanOrEqualTo(String value) {
            addCriterion("collect_money_url <=", value, "collectMoneyUrl");
            return (Criteria) this;
        }

        public Criteria andCollectMoneyUrlLike(String value) {
            addCriterion("collect_money_url like", value, "collectMoneyUrl");
            return (Criteria) this;
        }

        public Criteria andCollectMoneyUrlNotLike(String value) {
            addCriterion("collect_money_url not like", value, "collectMoneyUrl");
            return (Criteria) this;
        }

        public Criteria andCollectMoneyUrlIn(List<String> values) {
            addCriterion("collect_money_url in", values, "collectMoneyUrl");
            return (Criteria) this;
        }

        public Criteria andCollectMoneyUrlNotIn(List<String> values) {
            addCriterion("collect_money_url not in", values, "collectMoneyUrl");
            return (Criteria) this;
        }

        public Criteria andCollectMoneyUrlBetween(String value1, String value2) {
            addCriterion("collect_money_url between", value1, value2, "collectMoneyUrl");
            return (Criteria) this;
        }

        public Criteria andCollectMoneyUrlNotBetween(String value1, String value2) {
            addCriterion("collect_money_url not between", value1, value2, "collectMoneyUrl");
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