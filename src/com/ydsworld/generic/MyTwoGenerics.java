package com.ydsworld.generic;

public class MyTwoGenerics {

	public static void main(String[] args) {
		TwoGenerics<String, Integer> twoGen = new TwoGenerics<String,Integer>("Arun",31);
		twoGen.printTypes();

}

}

class TwoGenerics<U,V> {
	private U uObjRef;
	private V vObjRef;
	
	public TwoGenerics(U uObj, V vObj){
		this.uObjRef = uObj;
		this.vObjRef = vObj;
	}
	
	public void printTypes(){
        System.out.println("U Type: "+this.uObjRef.getClass().getName());
        System.out.println("V Type: "+this.vObjRef.getClass().getName());
    }
}
