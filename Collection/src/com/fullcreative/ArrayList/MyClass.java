package com.fullcreative.ArrayList;

public class MyClass {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

//		List myArrayList = new MyArrayList();
//	
//		myArrayList.add("hfdgf");
//		myArrayList.add(100);
//		myArrayList.add(101);
//		myArrayList.add(102);
//		myArrayList.add(103);
//		myArrayList.add(104);
//		myArrayList.add(105);
//		myArrayList.add(106);
//		for(int i=0;i<myArrayList.length();i++) {
//		System.out.print(myArrayList.get(i)+"\t");
//		myArrayList.add(200);
//		}
	
//		List<Object> list = new ArrayList<>();
//
//		list.add(132);
//		list.add("1234");
//		list.add(45);
//		System.out.println(list.size());
		
		List<Integer> list = new ArrayList<>();
		list.add(100);
		System.out.println(list.isEmpty());
		list.add(112);
		list.add(121);
		list.add(134);
		list.add(145);
//		list.add("rustam");
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.remove(5));
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.remove(1));
		System.out.println(list);
		System.out.println();
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i));
			
		}
		
		

}
}
