package com.interviewprep.Problems;


import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
    }
}

public class Tree {

    public static void main(String[] args) {
        Node node = new Node(5);
        node.left = new Node(1);
        node.left.right = new Node(10);
        node.right = new Node(11);
        node.right.left = new Node(12);
        node.right.left.right = new Node(20);

//        printTheLeftViewOfTree(node);
        levelOrderTraverSal(node);

    }

    public static void levelOrderTraverSal(Node root){
        Queue<Node> queue = new LinkedList<>();

        queue.add(new Node(Integer.MIN_VALUE));
        queue.add(root);

        while(!queue.isEmpty()){
            Node refNode = queue.poll();

            if(refNode == null)
                break;

            if(refNode.data == Integer.MIN_VALUE){
                if(queue.isEmpty()){
                    break;
                } else{
                    queue.add(new Node(Integer.MIN_VALUE));
                }

                System.out.println(queue.peek().data);
            }

            if(!queue.isEmpty() && queue.peek() != null && queue.peek().data == Integer.MIN_VALUE){
                System.out.println(refNode.data);
            }

            if(refNode.left != null)
                queue.add(refNode.left);

            if(refNode.right != null)
                queue.add(refNode.right);
        }
    }



    public static void printTheLeftViewOfTree(Node root){
        Queue<Node> queue = new LinkedList<>();

        Node targetNode = new Node(Integer.MIN_VALUE);

        queue.add(targetNode);
        queue.add(root);

        while(!queue.isEmpty()){
            Node refNode = queue.poll();

            if(refNode == null){
                break;
            }

            if(refNode.data == Integer.MIN_VALUE){
                if(queue.isEmpty())
                    break;
                else
                    queue.add(targetNode);

                refNode = queue.poll();
                System.out.println(refNode.data);
            }

            if(refNode.left != null)
                queue.add(refNode.left);

            if(refNode.right != null);
                queue.add(refNode.right);
        }
    }



}
