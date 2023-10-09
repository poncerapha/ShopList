package models;

import java.util.ArrayList;
import java.util.List;

public class CreditCard {
    public CreditCard(double creditLimit) {
        this.creditLimit = creditLimit;
        this.currentMoney = creditLimit;
        this.shopList = new ArrayList<>();
    }

    private double creditLimit;
    public double currentMoney;
    private List<Buy> shopList;

    public boolean launchBuy(Buy buy) {
        if (this.currentMoney > buy.getValue()) {
            this.currentMoney -= buy.getValue();
            this.shopList.add(buy);
            return true;
        }

        return false;
    }

    public double getCurrentMoney() {
        return currentMoney;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public List<Buy> getShopList() {
        return shopList;
    }

    public void setShopList(List<Buy> shopList) {
        this.shopList = shopList;
    }
}
