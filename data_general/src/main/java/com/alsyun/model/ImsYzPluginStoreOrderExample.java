package com.alsyun.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ImsYzPluginStoreOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ImsYzPluginStoreOrderExample() {
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

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andStoreIdIsNull() {
            addCriterion("store_id is null");
            return (Criteria) this;
        }

        public Criteria andStoreIdIsNotNull() {
            addCriterion("store_id is not null");
            return (Criteria) this;
        }

        public Criteria andStoreIdEqualTo(Integer value) {
            addCriterion("store_id =", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotEqualTo(Integer value) {
            addCriterion("store_id <>", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdGreaterThan(Integer value) {
            addCriterion("store_id >", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("store_id >=", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLessThan(Integer value) {
            addCriterion("store_id <", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLessThanOrEqualTo(Integer value) {
            addCriterion("store_id <=", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdIn(List<Integer> values) {
            addCriterion("store_id in", values, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotIn(List<Integer> values) {
            addCriterion("store_id not in", values, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdBetween(Integer value1, Integer value2) {
            addCriterion("store_id between", value1, value2, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotBetween(Integer value1, Integer value2) {
            addCriterion("store_id not between", value1, value2, "storeId");
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

        public Criteria andHasWithdrawIsNull() {
            addCriterion("has_withdraw is null");
            return (Criteria) this;
        }

        public Criteria andHasWithdrawIsNotNull() {
            addCriterion("has_withdraw is not null");
            return (Criteria) this;
        }

        public Criteria andHasWithdrawEqualTo(Boolean value) {
            addCriterion("has_withdraw =", value, "hasWithdraw");
            return (Criteria) this;
        }

        public Criteria andHasWithdrawNotEqualTo(Boolean value) {
            addCriterion("has_withdraw <>", value, "hasWithdraw");
            return (Criteria) this;
        }

        public Criteria andHasWithdrawGreaterThan(Boolean value) {
            addCriterion("has_withdraw >", value, "hasWithdraw");
            return (Criteria) this;
        }

        public Criteria andHasWithdrawGreaterThanOrEqualTo(Boolean value) {
            addCriterion("has_withdraw >=", value, "hasWithdraw");
            return (Criteria) this;
        }

        public Criteria andHasWithdrawLessThan(Boolean value) {
            addCriterion("has_withdraw <", value, "hasWithdraw");
            return (Criteria) this;
        }

        public Criteria andHasWithdrawLessThanOrEqualTo(Boolean value) {
            addCriterion("has_withdraw <=", value, "hasWithdraw");
            return (Criteria) this;
        }

        public Criteria andHasWithdrawIn(List<Boolean> values) {
            addCriterion("has_withdraw in", values, "hasWithdraw");
            return (Criteria) this;
        }

        public Criteria andHasWithdrawNotIn(List<Boolean> values) {
            addCriterion("has_withdraw not in", values, "hasWithdraw");
            return (Criteria) this;
        }

        public Criteria andHasWithdrawBetween(Boolean value1, Boolean value2) {
            addCriterion("has_withdraw between", value1, value2, "hasWithdraw");
            return (Criteria) this;
        }

        public Criteria andHasWithdrawNotBetween(Boolean value1, Boolean value2) {
            addCriterion("has_withdraw not between", value1, value2, "hasWithdraw");
            return (Criteria) this;
        }

        public Criteria andHasSettlementIsNull() {
            addCriterion("has_settlement is null");
            return (Criteria) this;
        }

        public Criteria andHasSettlementIsNotNull() {
            addCriterion("has_settlement is not null");
            return (Criteria) this;
        }

        public Criteria andHasSettlementEqualTo(Boolean value) {
            addCriterion("has_settlement =", value, "hasSettlement");
            return (Criteria) this;
        }

        public Criteria andHasSettlementNotEqualTo(Boolean value) {
            addCriterion("has_settlement <>", value, "hasSettlement");
            return (Criteria) this;
        }

        public Criteria andHasSettlementGreaterThan(Boolean value) {
            addCriterion("has_settlement >", value, "hasSettlement");
            return (Criteria) this;
        }

        public Criteria andHasSettlementGreaterThanOrEqualTo(Boolean value) {
            addCriterion("has_settlement >=", value, "hasSettlement");
            return (Criteria) this;
        }

        public Criteria andHasSettlementLessThan(Boolean value) {
            addCriterion("has_settlement <", value, "hasSettlement");
            return (Criteria) this;
        }

        public Criteria andHasSettlementLessThanOrEqualTo(Boolean value) {
            addCriterion("has_settlement <=", value, "hasSettlement");
            return (Criteria) this;
        }

        public Criteria andHasSettlementIn(List<Boolean> values) {
            addCriterion("has_settlement in", values, "hasSettlement");
            return (Criteria) this;
        }

        public Criteria andHasSettlementNotIn(List<Boolean> values) {
            addCriterion("has_settlement not in", values, "hasSettlement");
            return (Criteria) this;
        }

        public Criteria andHasSettlementBetween(Boolean value1, Boolean value2) {
            addCriterion("has_settlement between", value1, value2, "hasSettlement");
            return (Criteria) this;
        }

        public Criteria andHasSettlementNotBetween(Boolean value1, Boolean value2) {
            addCriterion("has_settlement not between", value1, value2, "hasSettlement");
            return (Criteria) this;
        }

        public Criteria andSettlementDaysIsNull() {
            addCriterion("settlement_days is null");
            return (Criteria) this;
        }

        public Criteria andSettlementDaysIsNotNull() {
            addCriterion("settlement_days is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementDaysEqualTo(BigDecimal value) {
            addCriterion("settlement_days =", value, "settlementDays");
            return (Criteria) this;
        }

        public Criteria andSettlementDaysNotEqualTo(BigDecimal value) {
            addCriterion("settlement_days <>", value, "settlementDays");
            return (Criteria) this;
        }

        public Criteria andSettlementDaysGreaterThan(BigDecimal value) {
            addCriterion("settlement_days >", value, "settlementDays");
            return (Criteria) this;
        }

        public Criteria andSettlementDaysGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("settlement_days >=", value, "settlementDays");
            return (Criteria) this;
        }

        public Criteria andSettlementDaysLessThan(BigDecimal value) {
            addCriterion("settlement_days <", value, "settlementDays");
            return (Criteria) this;
        }

        public Criteria andSettlementDaysLessThanOrEqualTo(BigDecimal value) {
            addCriterion("settlement_days <=", value, "settlementDays");
            return (Criteria) this;
        }

        public Criteria andSettlementDaysIn(List<BigDecimal> values) {
            addCriterion("settlement_days in", values, "settlementDays");
            return (Criteria) this;
        }

        public Criteria andSettlementDaysNotIn(List<BigDecimal> values) {
            addCriterion("settlement_days not in", values, "settlementDays");
            return (Criteria) this;
        }

        public Criteria andSettlementDaysBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("settlement_days between", value1, value2, "settlementDays");
            return (Criteria) this;
        }

        public Criteria andSettlementDaysNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("settlement_days not between", value1, value2, "settlementDays");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(BigDecimal value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(BigDecimal value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(BigDecimal value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(BigDecimal value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<BigDecimal> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<BigDecimal> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andFeeIsNull() {
            addCriterion("fee is null");
            return (Criteria) this;
        }

        public Criteria andFeeIsNotNull() {
            addCriterion("fee is not null");
            return (Criteria) this;
        }

        public Criteria andFeeEqualTo(BigDecimal value) {
            addCriterion("fee =", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotEqualTo(BigDecimal value) {
            addCriterion("fee <>", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeGreaterThan(BigDecimal value) {
            addCriterion("fee >", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fee >=", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeLessThan(BigDecimal value) {
            addCriterion("fee <", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fee <=", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeIn(List<BigDecimal> values) {
            addCriterion("fee in", values, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotIn(List<BigDecimal> values) {
            addCriterion("fee not in", values, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fee between", value1, value2, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fee not between", value1, value2, "fee");
            return (Criteria) this;
        }

        public Criteria andFeePercentageIsNull() {
            addCriterion("fee_percentage is null");
            return (Criteria) this;
        }

        public Criteria andFeePercentageIsNotNull() {
            addCriterion("fee_percentage is not null");
            return (Criteria) this;
        }

        public Criteria andFeePercentageEqualTo(BigDecimal value) {
            addCriterion("fee_percentage =", value, "feePercentage");
            return (Criteria) this;
        }

        public Criteria andFeePercentageNotEqualTo(BigDecimal value) {
            addCriterion("fee_percentage <>", value, "feePercentage");
            return (Criteria) this;
        }

        public Criteria andFeePercentageGreaterThan(BigDecimal value) {
            addCriterion("fee_percentage >", value, "feePercentage");
            return (Criteria) this;
        }

        public Criteria andFeePercentageGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fee_percentage >=", value, "feePercentage");
            return (Criteria) this;
        }

        public Criteria andFeePercentageLessThan(BigDecimal value) {
            addCriterion("fee_percentage <", value, "feePercentage");
            return (Criteria) this;
        }

        public Criteria andFeePercentageLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fee_percentage <=", value, "feePercentage");
            return (Criteria) this;
        }

        public Criteria andFeePercentageIn(List<BigDecimal> values) {
            addCriterion("fee_percentage in", values, "feePercentage");
            return (Criteria) this;
        }

        public Criteria andFeePercentageNotIn(List<BigDecimal> values) {
            addCriterion("fee_percentage not in", values, "feePercentage");
            return (Criteria) this;
        }

        public Criteria andFeePercentageBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fee_percentage between", value1, value2, "feePercentage");
            return (Criteria) this;
        }

        public Criteria andFeePercentageNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fee_percentage not between", value1, value2, "feePercentage");
            return (Criteria) this;
        }

        public Criteria andVerificationClerkIdIsNull() {
            addCriterion("verification_clerk_id is null");
            return (Criteria) this;
        }

        public Criteria andVerificationClerkIdIsNotNull() {
            addCriterion("verification_clerk_id is not null");
            return (Criteria) this;
        }

        public Criteria andVerificationClerkIdEqualTo(Integer value) {
            addCriterion("verification_clerk_id =", value, "verificationClerkId");
            return (Criteria) this;
        }

        public Criteria andVerificationClerkIdNotEqualTo(Integer value) {
            addCriterion("verification_clerk_id <>", value, "verificationClerkId");
            return (Criteria) this;
        }

        public Criteria andVerificationClerkIdGreaterThan(Integer value) {
            addCriterion("verification_clerk_id >", value, "verificationClerkId");
            return (Criteria) this;
        }

        public Criteria andVerificationClerkIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("verification_clerk_id >=", value, "verificationClerkId");
            return (Criteria) this;
        }

        public Criteria andVerificationClerkIdLessThan(Integer value) {
            addCriterion("verification_clerk_id <", value, "verificationClerkId");
            return (Criteria) this;
        }

        public Criteria andVerificationClerkIdLessThanOrEqualTo(Integer value) {
            addCriterion("verification_clerk_id <=", value, "verificationClerkId");
            return (Criteria) this;
        }

        public Criteria andVerificationClerkIdIn(List<Integer> values) {
            addCriterion("verification_clerk_id in", values, "verificationClerkId");
            return (Criteria) this;
        }

        public Criteria andVerificationClerkIdNotIn(List<Integer> values) {
            addCriterion("verification_clerk_id not in", values, "verificationClerkId");
            return (Criteria) this;
        }

        public Criteria andVerificationClerkIdBetween(Integer value1, Integer value2) {
            addCriterion("verification_clerk_id between", value1, value2, "verificationClerkId");
            return (Criteria) this;
        }

        public Criteria andVerificationClerkIdNotBetween(Integer value1, Integer value2) {
            addCriterion("verification_clerk_id not between", value1, value2, "verificationClerkId");
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

        public Criteria andPayTypeIdEqualTo(Integer value) {
            addCriterion("pay_type_id =", value, "payTypeId");
            return (Criteria) this;
        }

        public Criteria andPayTypeIdNotEqualTo(Integer value) {
            addCriterion("pay_type_id <>", value, "payTypeId");
            return (Criteria) this;
        }

        public Criteria andPayTypeIdGreaterThan(Integer value) {
            addCriterion("pay_type_id >", value, "payTypeId");
            return (Criteria) this;
        }

        public Criteria andPayTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_type_id >=", value, "payTypeId");
            return (Criteria) this;
        }

        public Criteria andPayTypeIdLessThan(Integer value) {
            addCriterion("pay_type_id <", value, "payTypeId");
            return (Criteria) this;
        }

        public Criteria andPayTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("pay_type_id <=", value, "payTypeId");
            return (Criteria) this;
        }

        public Criteria andPayTypeIdIn(List<Integer> values) {
            addCriterion("pay_type_id in", values, "payTypeId");
            return (Criteria) this;
        }

        public Criteria andPayTypeIdNotIn(List<Integer> values) {
            addCriterion("pay_type_id not in", values, "payTypeId");
            return (Criteria) this;
        }

        public Criteria andPayTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("pay_type_id between", value1, value2, "payTypeId");
            return (Criteria) this;
        }

        public Criteria andPayTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_type_id not between", value1, value2, "payTypeId");
            return (Criteria) this;
        }

        public Criteria andWithdrawModeIsNull() {
            addCriterion("withdraw_mode is null");
            return (Criteria) this;
        }

        public Criteria andWithdrawModeIsNotNull() {
            addCriterion("withdraw_mode is not null");
            return (Criteria) this;
        }

        public Criteria andWithdrawModeEqualTo(Integer value) {
            addCriterion("withdraw_mode =", value, "withdrawMode");
            return (Criteria) this;
        }

        public Criteria andWithdrawModeNotEqualTo(Integer value) {
            addCriterion("withdraw_mode <>", value, "withdrawMode");
            return (Criteria) this;
        }

        public Criteria andWithdrawModeGreaterThan(Integer value) {
            addCriterion("withdraw_mode >", value, "withdrawMode");
            return (Criteria) this;
        }

        public Criteria andWithdrawModeGreaterThanOrEqualTo(Integer value) {
            addCriterion("withdraw_mode >=", value, "withdrawMode");
            return (Criteria) this;
        }

        public Criteria andWithdrawModeLessThan(Integer value) {
            addCriterion("withdraw_mode <", value, "withdrawMode");
            return (Criteria) this;
        }

        public Criteria andWithdrawModeLessThanOrEqualTo(Integer value) {
            addCriterion("withdraw_mode <=", value, "withdrawMode");
            return (Criteria) this;
        }

        public Criteria andWithdrawModeIn(List<Integer> values) {
            addCriterion("withdraw_mode in", values, "withdrawMode");
            return (Criteria) this;
        }

        public Criteria andWithdrawModeNotIn(List<Integer> values) {
            addCriterion("withdraw_mode not in", values, "withdrawMode");
            return (Criteria) this;
        }

        public Criteria andWithdrawModeBetween(Integer value1, Integer value2) {
            addCriterion("withdraw_mode between", value1, value2, "withdrawMode");
            return (Criteria) this;
        }

        public Criteria andWithdrawModeNotBetween(Integer value1, Integer value2) {
            addCriterion("withdraw_mode not between", value1, value2, "withdrawMode");
            return (Criteria) this;
        }

        public Criteria andSettleTimeIsNull() {
            addCriterion("settle_time is null");
            return (Criteria) this;
        }

        public Criteria andSettleTimeIsNotNull() {
            addCriterion("settle_time is not null");
            return (Criteria) this;
        }

        public Criteria andSettleTimeEqualTo(Integer value) {
            addCriterion("settle_time =", value, "settleTime");
            return (Criteria) this;
        }

        public Criteria andSettleTimeNotEqualTo(Integer value) {
            addCriterion("settle_time <>", value, "settleTime");
            return (Criteria) this;
        }

        public Criteria andSettleTimeGreaterThan(Integer value) {
            addCriterion("settle_time >", value, "settleTime");
            return (Criteria) this;
        }

        public Criteria andSettleTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("settle_time >=", value, "settleTime");
            return (Criteria) this;
        }

        public Criteria andSettleTimeLessThan(Integer value) {
            addCriterion("settle_time <", value, "settleTime");
            return (Criteria) this;
        }

        public Criteria andSettleTimeLessThanOrEqualTo(Integer value) {
            addCriterion("settle_time <=", value, "settleTime");
            return (Criteria) this;
        }

        public Criteria andSettleTimeIn(List<Integer> values) {
            addCriterion("settle_time in", values, "settleTime");
            return (Criteria) this;
        }

        public Criteria andSettleTimeNotIn(List<Integer> values) {
            addCriterion("settle_time not in", values, "settleTime");
            return (Criteria) this;
        }

        public Criteria andSettleTimeBetween(Integer value1, Integer value2) {
            addCriterion("settle_time between", value1, value2, "settleTime");
            return (Criteria) this;
        }

        public Criteria andSettleTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("settle_time not between", value1, value2, "settleTime");
            return (Criteria) this;
        }

        public Criteria andSplitTimeIsNull() {
            addCriterion("split_time is null");
            return (Criteria) this;
        }

        public Criteria andSplitTimeIsNotNull() {
            addCriterion("split_time is not null");
            return (Criteria) this;
        }

        public Criteria andSplitTimeEqualTo(Integer value) {
            addCriterion("split_time =", value, "splitTime");
            return (Criteria) this;
        }

        public Criteria andSplitTimeNotEqualTo(Integer value) {
            addCriterion("split_time <>", value, "splitTime");
            return (Criteria) this;
        }

        public Criteria andSplitTimeGreaterThan(Integer value) {
            addCriterion("split_time >", value, "splitTime");
            return (Criteria) this;
        }

        public Criteria andSplitTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("split_time >=", value, "splitTime");
            return (Criteria) this;
        }

        public Criteria andSplitTimeLessThan(Integer value) {
            addCriterion("split_time <", value, "splitTime");
            return (Criteria) this;
        }

        public Criteria andSplitTimeLessThanOrEqualTo(Integer value) {
            addCriterion("split_time <=", value, "splitTime");
            return (Criteria) this;
        }

        public Criteria andSplitTimeIn(List<Integer> values) {
            addCriterion("split_time in", values, "splitTime");
            return (Criteria) this;
        }

        public Criteria andSplitTimeNotIn(List<Integer> values) {
            addCriterion("split_time not in", values, "splitTime");
            return (Criteria) this;
        }

        public Criteria andSplitTimeBetween(Integer value1, Integer value2) {
            addCriterion("split_time between", value1, value2, "splitTime");
            return (Criteria) this;
        }

        public Criteria andSplitTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("split_time not between", value1, value2, "splitTime");
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