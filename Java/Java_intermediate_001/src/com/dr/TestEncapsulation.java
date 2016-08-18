/**  
* @Title: TestEncapsulation.java
* @Package com.dr
* @Description: TODO(测试Java语言的封装)
* @author DengRui
* @date 2016-5-31
* @version V1.0  
*/
    
package com.dr;


/**
 * 
* @ClassName: Animal
* @Description: TODO(定义一个default类animal用于测试。)
* @author DengRui
* @date 2016-5-31
*
 */
class Animal {
	private int legs;
	protected int age;
	String name;
	public void eat(){
		System.out.println("Eating.");
	}
	public void move(){
		System.out.println("Moving.");
	}
	public int getLegs() {
		return legs;
	}
	public void setLegs(int legs) {
		this.legs = legs;
	}
}


/**
* @ClassName: TestEncapsulation
* @Description: TODO(测试Java语言的封装)
* @author DengRui
* @date 2016-5-31
*
*/
    
public class TestEncapsulation {
	
	/**
	 * @Title: main
	 * @Description: TODO(测试Java语言的封装)
	 * @param @param args    参数
	 * @return void    返回类型
	 * @throws
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal xb = new Animal();
		xb.setLegs(4);
		System.out.println(xb.getLegs());
		xb.eat();
		xb.move();
	}
}
