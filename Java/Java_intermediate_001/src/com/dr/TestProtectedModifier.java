/**  
* @Title: TestProtectedModifier.java
* @Package com.dr
* @Description: TODO(用一句话描述该文件做什么)
* @author DengRui
* @date 2016-5-31
* @version V1.0  
*/
    
package com.dr;


/**
 * @ClassName: TestProtectedModifier
 * @Description: TODO(测试protected访问控制符)
 * @author DengRui
 * @date 2016-5-31
 *
 */

public class TestProtectedModifier extends Animal {
	
	protected int i;
	
	public void visitAge() {
		System.out.println(age);
	}

	/**
	 * @Title: main
	 * @Description: TODO(测试protected访问控制符)
	 * @param @param args    参数
	 * @return void    返回类型
	 * @throws
	 */

	public static void main(String[] args) {
		TestProtectedModifier t = new TestProtectedModifier();
		//访问派生类自己的成员
		System.out.println(t.age);
		Animal dog = new Animal();
		//没有报错，说明同一个包内可以访问缺省成员、派生类内部可以访问父类的protected成员
		System.out.println(dog.name + ":" + dog.age);
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

}
