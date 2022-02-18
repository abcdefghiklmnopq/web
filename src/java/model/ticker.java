/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author thand
 */
public class ticker {
        private String symbol;
        private String symbolName;
        private double buy;
        private double sale;
        private double changeRate;
        private double changePrice;
        private double high;
        private double low;
        private double vol;
        private double volValue;
        private double last;
        private double avgPrice;
        private double takerFeeRate;
        private double makerFeeRate;
        private double takerCoefficient;
        private double makerCoefficient;

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbolName() {
        return symbolName;
    }

    public void setSymbolName(String symbolName) {
        this.symbolName = symbolName;
    }

    public double getBuy() {
        return buy;
    }

    public void setBuy(double buy) {
        this.buy = buy;
    }

    public double getSale() {
        return sale;
    }

    public void setSale(double sale) {
        this.sale = sale;
    }

    public double getChangeRate() {
        return changeRate;
    }

    public void setChangeRate(double changeRate) {
        this.changeRate = changeRate;
    }

    public double getChangePrice() {
        return changePrice;
    }

    public void setChangePrice(double changePrice) {
        this.changePrice = changePrice;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public double getLow() {
        return low;
    }

    public void setLow(double low) {
        this.low = low;
    }

    public double getVol() {
        return vol;
    }

    public void setVol(double vol) {
        this.vol = vol;
    }

    public double getVolValue() {
        return volValue;
    }

    public void setVolValue(double volValue) {
        this.volValue = volValue;
    }

    public double getLast() {
        return last;
    }

    public void setLast(double last) {
        this.last = last;
    }

    public double getAvgPrice() {
        return avgPrice;
    }

    public void setAvgPrice(double avgPrice) {
        this.avgPrice = avgPrice;
    }

    public double getTakerFeeRate() {
        return takerFeeRate;
    }

    public void setTakerFeeRate(double takerFeeRate) {
        this.takerFeeRate = takerFeeRate;
    }

    public double getMakerFeeRate() {
        return makerFeeRate;
    }

    public void setMakerFeeRate(double makerFeeRate) {
        this.makerFeeRate = makerFeeRate;
    }

    public double getTakerCoefficient() {
        return takerCoefficient;
    }

    public void setTakerCoefficient(double takerCoefficient) {
        this.takerCoefficient = takerCoefficient;
    }

    public double getMakerCoefficient() {
        return makerCoefficient;
    }

    public void setMakerCoefficient(double makerCoefficient) {
        this.makerCoefficient = makerCoefficient;
    }

    @Override
    public String toString() {
        return "ticker{" + "symbol=" + symbol + ", symbolName=" + symbolName + ", changeRate=" + changeRate + ", changePrice=" + changePrice + ", vol=" + vol + ", volValue=" + volValue + '}';
    }
}
