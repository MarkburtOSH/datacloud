package com.alsyun.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ImsYzPluginHotelOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ImsYzPluginHotelOrderExample() {
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

        public Criteria andHotelIdIsNull() {
            addCriterion("hotel_id is null");
            return (Criteria) this;
        }

        public Criteria andHotelIdIsNotNull() {
            addCriterion("hotel_id is not null");
            return (Criteria) this;
        }

        public Criteria andHotelIdEqualTo(Integer value) {
            addCriterion("hotel_id =", value, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdNotEqualTo(Integer value) {
            addCriterion("hotel_id <>", value, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdGreaterThan(Integer value) {
            addCriterion("hotel_id >", value, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("hotel_id >=", value, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdLessThan(Integer value) {
            addCriterion("hotel_id <", value, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdLessThanOrEqualTo(Integer value) {
            addCriterion("hotel_id <=", value, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdIn(List<Integer> values) {
            addCriterion("hotel_id in", values, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdNotIn(List<Integer> values) {
            addCriterion("hotel_id not in", values, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdBetween(Integer value1, Integer value2) {
            addCriterion("hotel_id between", value1, value2, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdNotBetween(Integer value1, Integer value2) {
            addCriterion("hotel_id not between", value1, value2, "hotelId");
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

        public Criteria andHasWithdrawEqualTo(Byte value) {
            addCriterion("has_withdraw =", value, "hasWithdraw");
            return (Criteria) this;
        }

        public Criteria andHasWithdrawNotEqualTo(Byte value) {
            addCriterion("has_withdraw <>", value, "hasWithdraw");
            return (Criteria) this;
        }

        public Criteria andHasWithdrawGreaterThan(Byte value) {
            addCriterion("has_withdraw >", value, "hasWithdraw");
            return (Criteria) this;
        }

        public Criteria andHasWithdrawGreaterThanOrEqualTo(Byte value) {
            addCriterion("has_withdraw >=", value, "hasWithdraw");
            return (Criteria) this;
        }

        public Criteria andHasWithdrawLessThan(Byte value) {
            addCriterion("has_withdraw <", value, "hasWithdraw");
            return (Criteria) this;
        }

        public Criteria andHasWithdrawLessThanOrEqualTo(Byte value) {
            addCriterion("has_withdraw <=", value, "hasWithdraw");
            return (Criteria) this;
        }

        public Criteria andHasWithdrawIn(List<Byte> values) {
            addCriterion("has_withdraw in", values, "hasWithdraw");
            return (Criteria) this;
        }

        public Criteria andHasWithdrawNotIn(List<Byte> values) {
            addCriterion("has_withdraw not in", values, "hasWithdraw");
            return (Criteria) this;
        }

        public Criteria andHasWithdrawBetween(Byte value1, Byte value2) {
            addCriterion("has_withdraw between", value1, value2, "hasWithdraw");
            return (Criteria) this;
        }

        public Criteria andHasWithdrawNotBetween(Byte value1, Byte value2) {
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

        public Criteria andHasSettlementEqualTo(Byte value) {
            addCriterion("has_settlement =", value, "hasSettlement");
            return (Criteria) this;
        }

        public Criteria andHasSettlementNotEqualTo(Byte value) {
            addCriterion("has_settlement <>", value, "hasSettlement");
            return (Criteria) this;
        }

        public Criteria andHasSettlementGreaterThan(Byte value) {
            addCriterion("has_settlement >", value, "hasSettlement");
            return (Criteria) this;
        }

        public Criteria andHasSettlementGreaterThanOrEqualTo(Byte value) {
            addCriterion("has_settlement >=", value, "hasSettlement");
            return (Criteria) this;
        }

        public Criteria andHasSettlementLessThan(Byte value) {
            addCriterion("has_settlement <", value, "hasSettlement");
            return (Criteria) this;
        }

        public Criteria andHasSettlementLessThanOrEqualTo(Byte value) {
            addCriterion("has_settlement <=", value, "hasSettlement");
            return (Criteria) this;
        }

        public Criteria andHasSettlementIn(List<Byte> values) {
            addCriterion("has_settlement in", values, "hasSettlement");
            return (Criteria) this;
        }

        public Criteria andHasSettlementNotIn(List<Byte> values) {
            addCriterion("has_settlement not in", values, "hasSettlement");
            return (Criteria) this;
        }

        public Criteria andHasSettlementBetween(Byte value1, Byte value2) {
            addCriterion("has_settlement between", value1, value2, "hasSettlement");
            return (Criteria) this;
        }

        public Criteria andHasSettlementNotBetween(Byte value1, Byte value2) {
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

        public Criteria andEnterAtIsNull() {
            addCriterion("enter_at is null");
            return (Criteria) this;
        }

        public Criteria andEnterAtIsNotNull() {
            addCriterion("enter_at is not null");
            return (Criteria) this;
        }

        public Criteria andEnterAtEqualTo(Integer value) {
            addCriterion("enter_at =", value, "enterAt");
            return (Criteria) this;
        }

        public Criteria andEnterAtNotEqualTo(Integer value) {
            addCriterion("enter_at <>", value, "enterAt");
            return (Criteria) this;
        }

        public Criteria andEnterAtGreaterThan(Integer value) {
            addCriterion("enter_at >", value, "enterAt");
            return (Criteria) this;
        }

        public Criteria andEnterAtGreaterThanOrEqualTo(Integer value) {
            addCriterion("enter_at >=", value, "enterAt");
            return (Criteria) this;
        }

        public Criteria andEnterAtLessThan(Integer value) {
            addCriterion("enter_at <", value, "enterAt");
            return (Criteria) this;
        }

        public Criteria andEnterAtLessThanOrEqualTo(Integer value) {
            addCriterion("enter_at <=", value, "enterAt");
            return (Criteria) this;
        }

        public Criteria andEnterAtIn(List<Integer> values) {
            addCriterion("enter_at in", values, "enterAt");
            return (Criteria) this;
        }

        public Criteria andEnterAtNotIn(List<Integer> values) {
            addCriterion("enter_at not in", values, "enterAt");
            return (Criteria) this;
        }

        public Criteria andEnterAtBetween(Integer value1, Integer value2) {
            addCriterion("enter_at between", value1, value2, "enterAt");
            return (Criteria) this;
        }

        public Criteria andEnterAtNotBetween(Integer value1, Integer value2) {
            addCriterion("enter_at not between", value1, value2, "enterAt");
            return (Criteria) this;
        }

        public Criteria andLeaveAtIsNull() {
            addCriterion("leave_at is null");
            return (Criteria) this;
        }

        public Criteria andLeaveAtIsNotNull() {
            addCriterion("leave_at is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveAtEqualTo(Integer value) {
            addCriterion("leave_at =", value, "leaveAt");
            return (Criteria) this;
        }

        public Criteria andLeaveAtNotEqualTo(Integer value) {
            addCriterion("leave_at <>", value, "leaveAt");
            return (Criteria) this;
        }

        public Criteria andLeaveAtGreaterThan(Integer value) {
            addCriterion("leave_at >", value, "leaveAt");
            return (Criteria) this;
        }

        public Criteria andLeaveAtGreaterThanOrEqualTo(Integer value) {
            addCriterion("leave_at >=", value, "leaveAt");
            return (Criteria) this;
        }

        public Criteria andLeaveAtLessThan(Integer value) {
            addCriterion("leave_at <", value, "leaveAt");
            return (Criteria) this;
        }

        public Criteria andLeaveAtLessThanOrEqualTo(Integer value) {
            addCriterion("leave_at <=", value, "leaveAt");
            return (Criteria) this;
        }

        public Criteria andLeaveAtIn(List<Integer> values) {
            addCriterion("leave_at in", values, "leaveAt");
            return (Criteria) this;
        }

        public Criteria andLeaveAtNotIn(List<Integer> values) {
            addCriterion("leave_at not in", values, "leaveAt");
            return (Criteria) this;
        }

        public Criteria andLeaveAtBetween(Integer value1, Integer value2) {
            addCriterion("leave_at between", value1, value2, "leaveAt");
            return (Criteria) this;
        }

        public Criteria andLeaveAtNotBetween(Integer value1, Integer value2) {
            addCriterion("leave_at not between", value1, value2, "leaveAt");
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