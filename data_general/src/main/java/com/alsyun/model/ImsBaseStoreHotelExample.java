package com.alsyun.model;

import java.util.ArrayList;
import java.util.List;

public class ImsBaseStoreHotelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ImsBaseStoreHotelExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andStroreHotelIdIsNull() {
            addCriterion("strore_hotel_id is null");
            return (Criteria) this;
        }

        public Criteria andStroreHotelIdIsNotNull() {
            addCriterion("strore_hotel_id is not null");
            return (Criteria) this;
        }

        public Criteria andStroreHotelIdEqualTo(String value) {
            addCriterion("strore_hotel_id =", value, "stroreHotelId");
            return (Criteria) this;
        }

        public Criteria andStroreHotelIdNotEqualTo(String value) {
            addCriterion("strore_hotel_id <>", value, "stroreHotelId");
            return (Criteria) this;
        }

        public Criteria andStroreHotelIdGreaterThan(String value) {
            addCriterion("strore_hotel_id >", value, "stroreHotelId");
            return (Criteria) this;
        }

        public Criteria andStroreHotelIdGreaterThanOrEqualTo(String value) {
            addCriterion("strore_hotel_id >=", value, "stroreHotelId");
            return (Criteria) this;
        }

        public Criteria andStroreHotelIdLessThan(String value) {
            addCriterion("strore_hotel_id <", value, "stroreHotelId");
            return (Criteria) this;
        }

        public Criteria andStroreHotelIdLessThanOrEqualTo(String value) {
            addCriterion("strore_hotel_id <=", value, "stroreHotelId");
            return (Criteria) this;
        }

        public Criteria andStroreHotelIdLike(String value) {
            addCriterion("strore_hotel_id like", value, "stroreHotelId");
            return (Criteria) this;
        }

        public Criteria andStroreHotelIdNotLike(String value) {
            addCriterion("strore_hotel_id not like", value, "stroreHotelId");
            return (Criteria) this;
        }

        public Criteria andStroreHotelIdIn(List<String> values) {
            addCriterion("strore_hotel_id in", values, "stroreHotelId");
            return (Criteria) this;
        }

        public Criteria andStroreHotelIdNotIn(List<String> values) {
            addCriterion("strore_hotel_id not in", values, "stroreHotelId");
            return (Criteria) this;
        }

        public Criteria andStroreHotelIdBetween(String value1, String value2) {
            addCriterion("strore_hotel_id between", value1, value2, "stroreHotelId");
            return (Criteria) this;
        }

        public Criteria andStroreHotelIdNotBetween(String value1, String value2) {
            addCriterion("strore_hotel_id not between", value1, value2, "stroreHotelId");
            return (Criteria) this;
        }

        public Criteria andStroreHotelNameIsNull() {
            addCriterion("strore_hotel_name is null");
            return (Criteria) this;
        }

        public Criteria andStroreHotelNameIsNotNull() {
            addCriterion("strore_hotel_name is not null");
            return (Criteria) this;
        }

        public Criteria andStroreHotelNameEqualTo(String value) {
            addCriterion("strore_hotel_name =", value, "stroreHotelName");
            return (Criteria) this;
        }

        public Criteria andStroreHotelNameNotEqualTo(String value) {
            addCriterion("strore_hotel_name <>", value, "stroreHotelName");
            return (Criteria) this;
        }

        public Criteria andStroreHotelNameGreaterThan(String value) {
            addCriterion("strore_hotel_name >", value, "stroreHotelName");
            return (Criteria) this;
        }

        public Criteria andStroreHotelNameGreaterThanOrEqualTo(String value) {
            addCriterion("strore_hotel_name >=", value, "stroreHotelName");
            return (Criteria) this;
        }

        public Criteria andStroreHotelNameLessThan(String value) {
            addCriterion("strore_hotel_name <", value, "stroreHotelName");
            return (Criteria) this;
        }

        public Criteria andStroreHotelNameLessThanOrEqualTo(String value) {
            addCriterion("strore_hotel_name <=", value, "stroreHotelName");
            return (Criteria) this;
        }

        public Criteria andStroreHotelNameLike(String value) {
            addCriterion("strore_hotel_name like", value, "stroreHotelName");
            return (Criteria) this;
        }

        public Criteria andStroreHotelNameNotLike(String value) {
            addCriterion("strore_hotel_name not like", value, "stroreHotelName");
            return (Criteria) this;
        }

        public Criteria andStroreHotelNameIn(List<String> values) {
            addCriterion("strore_hotel_name in", values, "stroreHotelName");
            return (Criteria) this;
        }

        public Criteria andStroreHotelNameNotIn(List<String> values) {
            addCriterion("strore_hotel_name not in", values, "stroreHotelName");
            return (Criteria) this;
        }

        public Criteria andStroreHotelNameBetween(String value1, String value2) {
            addCriterion("strore_hotel_name between", value1, value2, "stroreHotelName");
            return (Criteria) this;
        }

        public Criteria andStroreHotelNameNotBetween(String value1, String value2) {
            addCriterion("strore_hotel_name not between", value1, value2, "stroreHotelName");
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

        public Criteria andTypeEqualTo(Short value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Short value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Short value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Short value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Short value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Short> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Short> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Short value1, Short value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Short value1, Short value2) {
            addCriterion("type not between", value1, value2, "type");
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