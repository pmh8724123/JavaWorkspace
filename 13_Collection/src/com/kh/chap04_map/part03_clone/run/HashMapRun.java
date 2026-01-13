package com.kh.chap04_map.part03_clone.run;

public class HashMapRun <K, V> {
	private Entry<K,V>[] table;
	private int capacity; // 객체배열의 크기로써 사용
	private int size; // 객체배열 내부의 초기화된 객체의 수.
	
	class Entry <K, V>{
		K key;
		V value;
		Entry<K, V> next;
		
		public Entry(K key, V value, Entry<K,V> next) {
			this.key = key;
			this.value = value;
			this.next = next;
		}
		
	}
	
	// 객체 생성 시 반드시 객체배열의 크기를 지정
	public HashMapRun(int capacity) {
		this.capacity = capacity;
	}
	
	public int getIndex(K key) {
		// 매개변수로 전달받은 key값을 hashCode()로 변환시킨후
		// 객체의 총 저장공간 수(capacity)만큼 나눈 나머지 결과값을 반환하는 함수.
		int hash = key.hashCode();
		/*
		 * 저장공간이 10이라면?
		 * 113355 % 10 == 5번 인덱스
		 * 12345678 % 10 == 8번 인덱스
		 * 77777778 % 10 == 8번 인덱스
		 * */
		return Math.abs(hash) % capacity;
		
		
		
	}
	
	
	public void put(K key, V value) {
		// getIndex함수 호출후 반환값으로 table의 index에 접근
		int index = getIndex(key);
		
		if(table[index] == null) {
			table[index] = new Entry<>(key,value,null);
		} else {
			// 이미 해당 위치에 값이 있는 경우.
			// 1. 완전 같은 key값을 사용한 경우
			//  - key값 중복으로 현재 들어온 value로 인덱스위치의 값을 덮어씌우기.
			if(table[index].key.equals(key)) {
				table[index].value = value;
			} else {
				
			}
			// 2. key은 다르지만 hash값이 우연히 일치한 경우
		}
		// 접근시 내부의 값이 null이라면 Entry매개변수 있는 생성자를 이용하여
		// 객체생성후 비어있는 저장공간에 Entry객체 추가하기.
		// ex) 최초 Entry 객체 생성시 : new Entry(key, value , null)
		// 값이 null이 아니라면 , entry에 저장된 key값과 새롭게 추가하려는 entry의
		// key값이 동일한지 검사후 동일하다면 , 중복값이므로 value값만 덮어씌우고
		// key값이 다르다면 현재 entry의 next요소에 entry객체 저장.
		// 만약 next에도 이미 값이 존재하는경우, next가 없는 entry를 찾을때까지 반복
		// 중복값을 제외하고, 값이 새롭게 추가된경우 size 증가
	}
	
	public V get(K key) {
		
	}
	
	public boolean contains(String key) {
		
	}
	
	public void remove(String key) {
		
	}
	
	public int size() {
		return size;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append('{');
		for (Entry e : table) {
			if (e == null)
				continue;
			// {key : value}
			sb.append("{").append(e.key).append(" : ").append(e.value).append("}").append(",");

			Entry next = e.next;
			do {
				if (next != null) {
					sb.append("{").append(next.key).append(" : ").append(next.value).append("}").append(",");
					next = next.next;
				}
			} while (next != null); //
		}
		// sb.append(Arrays.toString(table));

		sb.append('}');

		return sb.toString();
	}

	
	public static void main(String[] args) {
		
	}
	
}
