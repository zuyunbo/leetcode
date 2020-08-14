package com.example.java.day06;

import org.springframework.util.ObjectUtils;

import java.util.Optional;

public class DataChain {

    private DataNode head;

    public DataChain(int size) {
        DataNode head = new DataNode(0);
        DataNode cur = head;

        for (int i = 1; i < size; i++) {
           DataNode tmp = new DataNode(i);
           cur.setNext(tmp);
           cur = tmp;
        }
        this.head = head;
    }


    public DataNode getHead() {
        return head;
    }

    public void setHead(DataNode head) {
        this.head = head;
    }

    public static void printChain(DataNode head) {
        StringBuilder sb = new StringBuilder();
        DataNode cur = head;
        sb.append(cur.getData());
        while (null != cur.getNext()) {
            sb.append(" -> ");
            sb.append(cur.getNext().getData());
            cur = cur.getNext();
        }
        System.out.println(sb.toString());
    }

    public static void main(String... strings) {
        DataChain chain1 = new DataChain(10);
        removeV1(chain1.getHead(), 2);
        printChain(chain1.getHead());
        long reverse1_start = System.currentTimeMillis();
        DataNode reNode1 = reverse1(chain1.getHead());
        long reverse1_cost = System.currentTimeMillis() - reverse1_start;
        printChain(reNode1);
        System.out.println("reverse1 cost time is ["+reverse1_cost+"]ms");

    }

    public static DataNode reverse1(DataNode head) {
        if (null == head || null == head.getNext()){
            return head;
        }
        DataNode revHead = reverse1(head.getNext());
        head.getNext().setNext(head);
        head.setNext(null);
        return revHead;
    }

    public static DataNode reverse2(DataNode head){
        if(null == head || null == head.getNext()){
            return head;
        }
        DataNode cur = head;
        DataNode then = head.getNext();
        while(null != then.getNext()){
            DataNode dataNode = head.getNext();
            then.setNext(cur);
            cur = then;
            then = dataNode;
        }
        cur.setNext(cur);
        head.setNext(null);
        return cur;
    }


    /**
     * 判断是否有环 快慢指针法
     *
     * @param
     * @return
     */
    public static boolean hasLoopV1(DataNode headNode) {

        if (headNode == null) {
            return false;
        }

        DataNode p = headNode;
        DataNode q = headNode.getNext();

        // 快指针未能遍历完所有节点
        while (q != null && q.getNext() != null) {
            // 遍历一个节点
            p = p.getNext();
            // 遍历两个个节点
            q = q.getNext().getNext();

            // 已到链表末尾
            if (q == null) {
                return false;
            } else if (p == q) {
                // 快慢指针相遇，存在环
                return true;
            }
        }

        return false;
    }

    public static DataNode removeV1(DataNode headNode, int n) {
        if (headNode == null) {
            return null;
        }
        DataChain chain1 = new DataChain(10);
        DataNode head = chain1.getHead();
        DataNode pNode =head ;
        DataNode qNode = headNode;

        int i = 0;
        while (i < n || n <= 0) {
            pNode = pNode.getNext();

            if (pNode == null) {
                headNode = headNode.getNext();
                return headNode;
            }

            i++;
        }

        while (pNode.getNext() != null) {
            pNode = pNode.getNext();
            qNode = qNode.getNext();
        }
        pNode = head;
        pNode.setNext( pNode.getNext().getNext());
        qNode.setNext( qNode.getNext().getNext());
        return headNode;
    }



}
