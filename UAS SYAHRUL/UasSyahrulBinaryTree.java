/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uassyahrulbinarytree;

/**
 *
 * @author ardin
 */
public class UasSyahrulBinaryTree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tree intTree = new Tree();

        intTree.insert(50);
        intTree.insert(33);
        intTree.insert(29);
        intTree.insert(14);
        intTree.insert(74);
        intTree.insert(97);
        intTree.insert(54);
        intTree.insert(21);
        intTree.insert(22);
        intTree.insert(4);
        intTree.insert(3);
        intTree.insert(10);

        intTree.traverseInOrder();
        System.out.println("\nSize of Binary Tree => " + intTree.size());

        System.out.println(intTree.get(24));
        System.out.println(intTree.get(52));

        System.out.println("Max Data Of Binary Tree => " + intTree.max());
        System.out.println("Min Data Of Binary Tree => " + intTree.min());
    }

}
