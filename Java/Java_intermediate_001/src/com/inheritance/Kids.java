/**  
* @Title: TestInheritance.java
* @Package com.inheritance
* @Description: TODO(测试继承的例子)
* @author DengRui
* @date 2016-5-31
* @version V1.0  
*/
    
package com.inheritance;


/**
 * @ClassName: TestInheritance
 * @Description: TODO(测试继承的例子)
 * @author DengRui
 * @date 2016-5-31
 *
 */

public class Kids extends ManKind{

	int yearsOld;
	
	void printAge() {
		System.out.println(yearsOld);
	} 

	/**
	 * @Title: main
	 * @Description: TODO(测试继承的例子)
	 * @param @param args    参数
	 * @return void    返回类型
	 * @throws
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kids someKid = new Kids();
		System.out.println(someKid.yearsOld);

	}

}

class ManKind {
	private int sex;
	private int salary;
	
	void manOrWoman() {
		if (sex == 1) {
			System.out.println("man");
		}
		if (sex == 0) {
			System.out.println("woman");
		}
	}
	
	void employeed() {
		if (salary == 0) {
			System.out.println("no job");
		}
		if (salary != 0) {
			System.out.println("job");
		}
	}
}