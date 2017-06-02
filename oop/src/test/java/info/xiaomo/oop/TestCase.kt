/*
 * Copyright (c) 2017. sh-game all Rights Resolved
 */

package info.xiaomo.oop

import com.alibaba.fastjson.JSON
import org.junit.Test

class TestCase {

    /**
     * 地址引用(会影响到原来的值)
     */
    @Test
    fun test1() {
        val arr1 = intArrayOf(1, 2, 3, 4)
        val arr2 = arr1
        arr2[0] = 0
        println(JSON.toJSONString(arr1))
    }

    /**
     * 值引用(不会影响到原来的值)
     */
    @Test
    fun test2() {
        val arr1 = intArrayOf(1, 2, 3, 4)
        val arr2 = arr1.clone()
        arr2[0] = 0
        println(JSON.toJSONString(arr1))

    }

}
