package com.kh.practice.network.ip;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class IPSearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 키보드로 호스트명 또는 도메인명을 입력받는다.
		System.out.print("호스트명 : ");
		String hostname = sc.next();
		
		

		try {
			InetAddress host = InetAddress.getByName(hostname);
			String name = host.getHostName();
			String address = host.getHostAddress();

			// 입력받은 호스트명을 가지고, 모든 ip 주소를 조회해서 출력한다.
			InetAddress[] arr = InetAddress.getAllByName(hostname);
			System.out.println(hostname + "는 " + arr.length +"개의 IP주소를 가지고 있습니다.");
			
			// 조회한 ip 갯수가 1개 이상이면 루프문으로 모두 출력하고,
			int count = 1;
			for(InetAddress ia : arr) {
				// 출력시 호스트명과 ip 주소를 분리해서, ip 주소만 출력되게 한다.
				System.out.println(count++ +"번 IP = " + ia.getHostAddress());
			}

		} catch (UnknownHostException e) {
			e.printStackTrace();
		}


	}
}
