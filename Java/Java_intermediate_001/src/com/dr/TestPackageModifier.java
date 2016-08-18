/**  
* @Title: TestPackageModifier.java
* @Package com.dr
* @Description: TODO(用一句话描述该文件做什么)
* @author DengRui
* @date 2016-5-31
* @version V1.0  
*/
    
package com.dr;


/**
 * @ClassName: TestPackageModifier
 * @Description: TODO(测试package访问控制符)
 * @author DengRui
 * @date 2016-5-31
 *
 */

public class TestPackageModifier {

	/**
	 * @Title: main
	 * @Description: TODO(测试package访问控制符)
	 * @param @param args    参数
	 * @return void    返回类型
	 * @throws
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal cat = new Animal();
		cat.age = 6;//age是protected的
		cat.name = "meng_meng";//name是缺省的、package的，所以在这里都可以访问。
	}

}
