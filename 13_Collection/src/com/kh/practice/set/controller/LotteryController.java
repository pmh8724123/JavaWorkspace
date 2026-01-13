package com.kh.practice.set.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

import com.kh.practice.set.model.compare.SortedLottery;
import com.kh.practice.set.model.vo.Lottery;

public class LotteryController {
	private HashSet<Lottery> lottery = new HashSet<>();
	private HashSet<Lottery> win = new HashSet<>();
	
	public boolean insertObject(Lottery l) {
		return lottery.add(l); 
	}
	
	public boolean deleteObject(Lottery l) {
		// 전달 받은 l을 lottery에서 삭제 
		boolean result = false;
		result = lottery.remove(l);
		
		if(result && win != null) {
			win.remove(l);
		}
		
		return result;
	}
	
	public HashSet<Lottery> winObject() {
	  // 추첨 대상자 중에서 랜덤으로 뽑아 당첨 목록에 넣는 메소드 
		
	  // 랜덤으로 뽑기 위해 lottery를 ArrayList에 담고,
	  List<Lottery> list = new ArrayList<>(lottery);
	  Collections.shuffle(list); // 데이터 섞어주기
	  
	  if(list.size() < 4) {
		  return null;
	  }
	  
	  for(int i =0; win.size() < 4; i++) {
		  win.add(list.get(i));
	  }
	  return win;
	}
	
	public TreeSet<Lottery> sortedWinObject() {
		winObject(); // 당첨자 목록 채우기
		
		TreeSet<Lottery> set = new TreeSet<>(new SortedLottery());
		set.addAll(win);
		
		return set;
	}
	
	public boolean searchWinner(Lottery l) {
		// 전달 받은 l을 win에서 찾고 찾은 결과인 boolean 값 반환
		return win.contains(l);
	}
	
	
}












