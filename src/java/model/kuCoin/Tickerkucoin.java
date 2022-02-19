/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.kuCoin;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.JsonReader;
import static model.JsonReader.readJsonFromUrl;
import model.ticker;

/**
 *
 * @author thand
 */
public class Tickerkucoin {

    private String symbol;
    private String symbolName;
    private String buy;
    private String sell;
    private String changeRate;
    private String changePrice;
    private String high;
    private String low;
    private String vol;
    private String volValue;
    private String last;
    private String avgPrice;
    private String takerFeeRate;
    private String makerFeeRate;
    private String takerCoefficient;
    private String makerCoefficient;

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

    public String getBuy() {
        return buy;
    }

    public void setBuy(String buy) {
        this.buy = buy;
    }

    public String getSell() {
        return sell;
    }

    public void setSell(String sell) {
        this.sell = sell;
    }

    public String getChangeRate() {
        return changeRate;
    }

    public void setChangeRate(String changeRate) {
        this.changeRate = changeRate;
    }

    public String getChangePrice() {
        return changePrice;
    }

    public void setChangePrice(String changePrice) {
        this.changePrice = changePrice;
    }

    public String getHigh() {
        return high;
    }

    public void setHigh(String high) {
        this.high = high;
    }

    public String getLow() {
        return low;
    }

    public void setLow(String low) {
        this.low = low;
    }

    public String getVol() {
        return vol;
    }

    public void setVol(String vol) {
        this.vol = vol;
    }

    public String getVolValue() {
        return volValue;
    }

    public void setVolValue(String volValue) {
        this.volValue = volValue;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getAvgPrice() {
        return avgPrice;
    }

    public void setAvgPrice(String avgPrice) {
        this.avgPrice = avgPrice;
    }

    public String getTakerFeeRate() {
        return takerFeeRate;
    }

    public void setTakerFeeRate(String takerFeeRate) {
        this.takerFeeRate = takerFeeRate;
    }

    public String getMakerFeeRate() {
        return makerFeeRate;
    }

    public void setMakerFeeRate(String makerFeeRate) {
        this.makerFeeRate = makerFeeRate;
    }

    public String getTakerCoefficient() {
        return takerCoefficient;
    }

    public void setTakerCoefficient(String takerCoefficient) {
        this.takerCoefficient = takerCoefficient;
    }

    public String getMakerCoefficient() {
        return makerCoefficient;
    }

    public void setMakerCoefficient(String makerCoefficient) {
        this.makerCoefficient = makerCoefficient;
    }

    @Override
    public String toString() {
        return "ticker{" + "symbol=" + symbol + ", symbolName=" + symbolName + ", buy=" + buy + ", sell=" + sell + ", changeRate=" + changeRate + ", changePrice=" + changePrice + ", high=" + high + ", low=" + low + ", vol=" + vol + ", avgPrice=" + avgPrice + '}';
    }

    public static ArrayList<ticker> getticker() {
        String url = "https://api.kucoin.com/api/v1/market/allTickers";
        String json = null;
        try {
            json = readJsonFromUrl(url);
        } catch (IOException ex) {
            Logger.getLogger(JsonReader.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (json != null) {
            String[] splits = json.split("\"ticker\":");
            String[] splits1 = splits[1].split("}}");
            Gson gson = new Gson();
            Type objtype = new TypeToken<ArrayList<Tickerkucoin>>() {
            }.getType();
            ArrayList<Tickerkucoin> lists = gson.fromJson(splits1[0], objtype);
            ArrayList<ticker> liststicker = new ArrayList<>();
            return liststicker;
        }
        return null;
    }
}
