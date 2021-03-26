package com.dubhe.blueStar;

import java.util.Set;

/**
 * @Author: Dubhe
 * @Date: 2020/12/24 8:56
 */
public class MyHashMap<K,V> implements MyMap {


    /**
     * 默认容量16
     */
    private final int DEFAULT_CAPACITY=16;

    /**
     * 内部存储结构
     */
    Node[] table=new Node[DEFAULT_CAPACITY];

    /**
     * 长度
     */
    private int size=0;

    Set<K> keySet;

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public Object get(Object key) {




        return null;
    }

    /**
     * 获取插入位置
     * @param hashValue
     * @param length
     * @return
     */
    public int indexFor(int hashValue,int length){

        return hashValue%length;

    }

    @Override
    public Object put(Object key, Object value) {

        //通过key，求hash值
        int hashValue = hash(key);

        //通过hash,找到这个key应该放的位置
        int i = indexFor(hashValue, table.length);

        //i位置已经有数据了，往链表添加元素
        for (Node node=table[i];node!=null;node=node.next){

            Object k;

            //且数组中有这个key，覆盖其value
            if(node.hash==hashValue&&((k=node.key)==key||key.equals(k))){
                Object oldValue = node.value;
                node.value=value;
                //返回oldValue
                return oldValue;
            }
        }

        //如果i位置没有数据，或i位置有数据，但key是新的key，新增节点
        addEntry(key,value,hashValue,i);


        return null;
    }

    public void addEntry(Object key,Object value,int hashValue,int i){

        //如果超过了原数组大小，则扩大数组
        if(++size>=table.length){
            Node[] newTable = new Node[table.length * 2];
            System.arraycopy(table,0,newTable,0,table.length);
            table=newTable;
        }

        //i位置的数据
        Node eNode = table[i];

        //新增节点，将该节点的next指向前一个节点
        table[i]=new Node(hashValue,key,value,eNode);

    }

    /**
     * 获取hash值
     * @param key
     * @return
     */
    public int hash(Object key){
        return key.hashCode();
    }

    static class Node implements MyMap.Entry{

        /**
         * hash值
         */
        int hash;

        /**
         * key
         */
        Object key;

        /**
         * value
         */
        Object value;

        /**
         * 指向下一个节点（单链表）
         */
        Node next;

        public Node(int hash, Object key, Object value, Node next) {
            this.hash = hash;
            this.key = key;
            this.value = value;
            this.next = next;
        }

        @Override
        public Object getKey() {
            return null;
        }

        @Override
        public Object getValue() {
            return null;
        }
    }
}
