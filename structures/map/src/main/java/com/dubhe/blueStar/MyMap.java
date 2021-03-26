package com.dubhe.blueStar;

/**
 * 自己实现的map的接口
 *
 * @Author: Dubhe
 * @Date: 2020/12/23 19:41
 */
public interface MyMap<K,V>{

    /**
     * 大小
     * @return
     */
    int size();

    /**
     * 是否为空
     * @return
     */
    boolean isEmpty();

    /**
     * 根据key获取元素
     * @param key
     * @return
     */
    Object get(Object key);

    /**
     * 添加元素
     * @param key
     * @param value
     * @return
     */
    Object put(Object key,Object value);

    interface Entry<K,V>{
        K getKey();
        V getValue();
    }

}
