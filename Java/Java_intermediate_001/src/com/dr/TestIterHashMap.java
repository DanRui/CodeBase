/**  
* @Title: TestIterHashMap.java
* @Package com.dr
* @Description: TODO(比较HashMap的两种遍历方式的不同)
* @author DengRui
* @date 2016-5-30
* @version V1.0  
*/
    
package com.dr;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


/**
 * @ClassName: TestIterHashMap
 * @Description: TODO(比较HashMap的两种遍历方式的不同)
 * @author DengRui
 * @date 2016-5-30
 *
 */

public class TestIterHashMap {

	/**	
	 * @Title: main
	 * @Description: TODO(测试HashMap的两种遍历方式的不同)
	 * @param @param args    参数
	 * @return void    返回类型
	 * @throws
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> map = new HashMap<String, String>();
        for (int i = 0; i < 10000000; i++)
        {
            map.put(i + "", "hello world");
        }
        long begin1 = System.currentTimeMillis();
        Iterator iterator1 = map.entrySet().iterator();
        while (iterator1.hasNext())
        {
            Map.Entry entry = (Map.Entry) iterator1.next();
            Object key1 = entry.getKey();
            Object val1 = entry.getValue();
        }
        long end1 = System.currentTimeMillis();
        System.out.println("map.entrySet方式变量花费的时间为:" + (end1 - begin1));
        long begin2 = System.currentTimeMillis();
        Iterator iterator2 = map.keySet().iterator();
        while (iterator2.hasNext())
        {
            Object key2 = iterator2.next();
            Object val2 = map.get(key2);
        }
        long end2 = System.currentTimeMillis();
        System.out.println("map.keySet方式变量花费的时间为:" + (end2 - begin2));
	}

}
