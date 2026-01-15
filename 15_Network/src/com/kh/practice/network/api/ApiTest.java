package com.kh.practice.network.api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

public class ApiTest {
	public static void main(String[] args) {
		
		try {
			// 0) 홈페이지에서 요청주소, 요청변수 확인후 필수값에 해당하는 변수 초기화
			//    serviceKey를 제외한 필수데이터는 샘플데이터를 추가한다
			String serviceUrl = "http://apis.data.go.kr/B552584/ArpltnInforInqireSvc/getMinuDustFrcstDspth";
			String serviceKey = "761334040e862c2bc51543d43550c5d1c8b97896feafc2531642e8ae927b0f6c";
			String stationName = URLEncoder.encode("종로구","UTF-8");
			String dataTerm = "DAILY";

			serviceUrl += "?serviceKey=" + serviceKey;
			serviceUrl += "&stationName=" + stationName;
			serviceUrl += "&dataTerm=" + dataTerm;
			// 1) URL 객체 생성
			URL url = new URL(serviceUrl);
			// 2)URLConnection 객체 생성
			try (BufferedReader br = new BufferedReader
					(new InputStreamReader
							(url.openConnection().getInputStream()))) {
				String line = null;

				while ((line = br.readLine()) != null) {
					System.out.println(line);
				}
			}

		} catch (MalformedURLException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
