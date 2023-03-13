package hello.core;

import net.minidev.json.JSONArray;
import net.minidev.json.JSONObject;
import net.minidev.json.parser.JSONParser;
import net.minidev.json.parser.ParseException;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

class ApiTest {
    @Test
    void apiTest() throws IOException, ParseException {
        StringBuilder urlBuilder = new StringBuilder("https://openapi.foodsafetykorea.go.kr/api/c7e42419587e4873ae88/I2790/json/1/200"); /*URL*/
        urlBuilder.append("/" + URLEncoder.encode("DESC_KOR","UTF-8") + "=" + URLEncoder.encode("하리보", "UTF-8")); /*식품이름*/
//        urlBuilder.append("&" + URLEncoder.encode("pageNo","UTF-8") + "=" + URLEncoder.encode("2", "UTF-8")); /*페이지번호*/
//        urlBuilder.append("&" + URLEncoder.encode("numOfRows","UTF-8") + "=" + URLEncoder.encode("99", "UTF-8")); /*한 페이지 결과 수*/
//        urlBuilder.append("&" + URLEncoder.encode("bgn_year","UTF-8") + "=" + URLEncoder.encode("2021", "UTF-8")); /*구축년도*/
//        urlBuilder.append("&" + URLEncoder.encode("animal_plant","UTF-8") + "=" + URLEncoder.encode("(유)돌코리아", "UTF-8")); /*가공업체*/
//        urlBuilder.append("&" + URLEncoder.encode("type","UTF-8") + "=" + URLEncoder.encode("json", "UTF-8")); /*응답데이터 형식(xml/json) Default: xml*/
        URL url = new URL(urlBuilder.toString());
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Content-type", "application/json");
        System.out.println("Response code: " + conn.getResponseCode());
        BufferedReader rd;
        if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
            rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        } else {
            rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
        }
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = rd.readLine()) != null) {
            sb.append(line);
        }
        rd.close();
        conn.disconnect();
        System.out.println(sb.toString());

        // 1. 문자열 형태의 JSON을 파싱하기 위한 JSONParser 객체 생성.
        JSONParser parser = new JSONParser();
        // 2. 문자열을 JSON 형태로 JSONObject 객체에 저장.
        JSONObject obj = (JSONObject)parser.parse(sb.toString());
        // 3. 필요한 리스트 데이터 부분만 가져와 JSONArray로 저장.
        JSONObject dataArr = (JSONObject) obj.get("I2790");
//        JSONObject rows = (JSONObject) dataArr.get("row");
        JSONArray row = (JSONArray) dataArr.get("row");
//        System.out.println(row.toString());
        for(int i = 0; i < row.size(); i++){
            JSONObject tmp = (JSONObject) row.get(i);
            System.out.println("이름 : " + tmp.get("DESC_KOR")
                    + ", 열량 : " + tmp.get("NUTR_CONT1")
                    + ", 탄수화물 : " + tmp.get("NUTR_CONT2")
                    + ", 단백질 : " + tmp.get("NUTR_CONT3")
                    + ", 지방 : " + tmp.get("NUTR_CONT4")
                    + ", 당류 : " + tmp.get("NUTR_CONT5")
                    + ", 나트륨 : " + tmp.get("NUTR_CONT6")
                    + ", 콜레스테롤 : " + tmp.get("NUTR_CONT7")
                    + ", 포화지방산 : " + tmp.get("NUTR_CONT8")
                    + ", 트랜스지방 : " + tmp.get("NUTR_CONT9")
            );
        }
        System.out.println("items = " + row.size());
    }
}
