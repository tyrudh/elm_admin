package com.elm.po;

public class Food {
    private Integer foodId;
    private String foodName;
    private String foodExplain;
    private Double foodPrice;
    private Integer businessId;

    public void setFoodId(Integer foodId) {
        this.foodId = foodId;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public void setFoodExplain(String foodExplain) {
        this.foodExplain = foodExplain;
    }

    public void setFoodPrice(Double foodPrice) {
        this.foodPrice = foodPrice;
    }

    public void setBusinessId(Integer businessId) {
        this.businessId = businessId;
    }

    public Integer getFoodId() {
        return foodId;
    }

    @Override
    public String toString() {
        return "\n食品编号："+this.foodId+
                "\n食品名称："+this.foodName+
                "\n食品介绍："+this.foodExplain+
                "\n食品价格："+this.foodPrice+
                "\n所属商家："+this.businessId;
    }

    public String getFoodName() {
        return foodName;
    }

    public String getFoodExplain() {
        return foodExplain;
    }

    public Double getFoodPrice() {
        return foodPrice;
    }

    public Integer getBusinessId() {
        return businessId;
    }
}
