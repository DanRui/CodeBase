/**  
* @Title: TestOutpackage.java
* @Package com.others
* @Description: TODO(测试在不同包中protected和default的访问范围)
* @author DengRui
* @date 2016-5-31
* @version V1.0  
*/
    
package com.others;

import com.dr.*;

/**
 * @ClassName: TestOutpackage
 * @Description: TODO(测试在不同包中protected和default的访问范围)
 * @author DengRui
 * @date 2016-5-31
 *
 */

public class TestOutpackage extends TestProtectedModifier{

	/**
	 * @Title: main
	 * @Description: TODO(测试在不同包中protected和default的访问范围)
	 * @param @param args    参数
	 * @return void    返回类型
	 * @throws
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestProtectedModifier fox = new TestProtectedModifier();
		//System.out.println(fox.age);//编译报错，无法在包外访问protected成员
		//System.out.println(fox.name);//编译报错，无法在包外访问default成员
		
		TestOutpackage t = new TestOutpackage();
		//System.out.println(t.age + ":" + t.i + t.name);//不同包中，子类中可以访问protected成员，无法访问default成员
		//System.out.println(fox.i);//不同包中，无法访问类的protected成员
	}

}
