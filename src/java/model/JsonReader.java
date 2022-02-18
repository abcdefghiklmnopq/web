/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.Type;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;



public class JsonReader {

    private static String readAll(Reader rd) throws IOException {
        StringBuilder sb = new StringBuilder();
        int cp;
        while ((cp = rd.read()) != -1) {
            sb.append((char) cp);
        }
        return sb.toString();
    }

    public static String readJsonFromUrl(String url) throws IOException{
        InputStream is = new URL(url).openStream();
        try {
            BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
            String jsonText = readAll(rd);
//            JSONObject json = new JSONObject(jsonText);
            return jsonText;
        } finally {
            is.close();
        }
    }
    public  ArrayList<ticker> getticker(String url){
        String json=null;
        try {
            json = readJsonFromUrl(url);
        } catch (IOException ex) {
            Logger.getLogger(JsonReader.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(json!=null){
        String[] splits = json.split("\"ticker\":");
        String[] splits1 =splits[1].split("}}");
        Gson gson = new Gson();
        Type objtype = new TypeToken<ArrayList<ticker>>(){}.getType();
        ArrayList<ticker> liststicker = gson.fromJson(splits1[0], objtype);
        return liststicker;
        }
        return null;
    }

    public static void main(String[] args) throws IOException {
        String urlApi = "https://api.kucoin.com/api/v1/market/allTickers";
       JsonReader js =new JsonReader();
        ArrayList<ticker> list = js.getticker(urlApi);
        for (int i=0;i<10;i++) {
            System.out.println(list.get(i).toString());
        }
    }
}
