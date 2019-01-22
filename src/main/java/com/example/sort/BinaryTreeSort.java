package com.example.sort;

/**
 * @author: qiudong
 * @description: 二叉树排序
 * Time: O( nlog(n) )
 *
 * 二叉树排序的描述也是一个递归的描述， 所以二叉树排序的构造自然也用递归的：
 * 二叉排序树或者是一棵空树，或者是具有下列性质的二叉树：
 * （1）若左子树不空，则左子树上所有结点的值均小于它的根结点的值；
 * （2）若右子树不空，则右子树上所有结点的值均大于它的根结点的值；
 * （3）左、右子树也分别为二叉排序树；
 * （4）没有键值相等的结点。
 * @date: Created in 15:44 2019-01-22
 */
public class BinaryTreeSort {
    private int value;// current value
    private BinaryTreeSort lChild;// left child
    private BinaryTreeSort rChild;// right child
    private BinaryTreeSort(int value, BinaryTreeSort l, BinaryTreeSort r) {
        this.value = value;
        this.lChild = l;
        this.rChild = r;
    }
    private BinaryTreeSort getLChild() {
        return lChild;
    }
    private void setLChild(BinaryTreeSort child) {
        lChild = child;
    }
    private BinaryTreeSort getRChild() {
        return rChild;
    }
    private void setRChild(BinaryTreeSort child) {
        rChild = child;
    }
    private int getValue() {
        return value;
    }
    private void setValue(int value) {
        this.value = value;
    }

    // iterater all node.
    private static void iterater(BinaryTreeSort root) {
        // 先迭代遍历根节点的左边
        if (root.lChild != null) {
            iterater(root.getLChild());
        }
        // 再迭代遍历根节点
        System.out.print(root.getValue() + " ");
        // 最后迭代遍历根节点的右边
        if (root.rChild != null) {
            iterater(root.getRChild());
        }
    }
    /**
     * add child to the current node to construct a tree. Time: O( nlog(n) )
     **/
    private void addChild(int n) {
        if (n < value) {
            if (lChild != null) {
                lChild.addChild(n);
            } else {
                lChild = new BinaryTreeSort(n, null, null);
            }
        } else {
            if (rChild != null) {
                rChild.addChild(n);
            } else {
                rChild = new BinaryTreeSort(n, null, null);
            }
        }
    }
    // test case.
    public static void main(String[] args) {
        int[] arr = new int[] {23, 54, 1, 65, 9, 3, 100};
        //创建一个根节点
        BinaryTreeSort root = new BinaryTreeSort(arr[0], null, null);
        //将数组以排序二叉树的方式摆放
        for (int i = 1; i < arr.length; i++) {
            root.addChild(arr[i]);
        }
        //遍历上面形成的排序二叉树
        BinaryTreeSort.iterater(root);
    }
}
