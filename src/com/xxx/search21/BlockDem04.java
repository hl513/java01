package com.xxx.search21;

public class BlockDem04 {
    public static void main(String[] args) {
        /*
         * 分块查找：查找30
         *     7 10   13 19 16 20    27 22 30 40 36    46 50 48
         *   分块的原则1:  前一块中的最大数据，小于后一块中所有的数据  （块内无序，块间有序）
         *   分块的原则2:  块数数量一般等于数字的个数开根号  ，比如 16个数字，一般分为 4块左右
         *   核心思路：先确定要查找的元素在那一块，然后在块内挨个查找
         * max:10       max:20       max:40        max:50
         * index:0~1    index:2~5    index:6~10    index:11~13
         *
         * 实现步骤：
         *      1、创建数组blockArr存放每一个块对象的信息
         *      2、先查找blockArr确定要查找的数据属于那一块
         *      3、再单独遍历这一块数据即可
         * */
        int[] arr = {16, 5, 9, 12, 18, 21
                , 32, 30, 37, 26, 45, 34,
                50, 48, 61, 52, 73, 66};

        // 创建三个块的对象
        Block b1 = new Block(21, 0, 5);
        Block b2 = new Block(45, 6, 11);
        Block b3 = new Block(73, 12, 17);

        // 定义数组用来管理三个块的对象 （索引表）
        Block[] blockArr = {b1, b2, b3};

        // 定义一个遍历用来记录要查找的元素
        int number = 30;

        // 调用方法：传递索引表、数组、要查找的元素
        int index = getIndex(blockArr, arr, number);
        // 打印一下
        System.out.println(index);

    }

    // 利用分块查找的原理，查询number的索引
    private static int getIndex(Block[] blockArr, int[] arr, int number) {
        // 1、确定number在那一块当中
        int indexBlock = findIndexBlock(blockArr, number);
        if (indexBlock == -1) {
            // 表示Number不在数组当中
            return -1;
        }
        // 2、数据在数组中，获取这一块的起始索引和结束索引
        int startIndex = blockArr[indexBlock].getStartIndex();
        int endIndex = blockArr[indexBlock].getEndIndex();

        // 3、遍历
        for (int i = startIndex; i < endIndex; i++) {
            if (arr[i] == number) {
                return i;
            }
        }
        return -1;
    }

    // 定义一个方法：用来确定number在那一块当中
    public static int findIndexBlock(Block[] blockArr, int number) { //30
        // 创建三个块的对象
        Block b1 = new Block(21, 0, 5);    // 0
        Block b2 = new Block(45, 6, 11);   // 1
        Block b3 = new Block(73, 12, 17);  // 2

        // 从0索引开始遍历blockArr,如果number小于max，那么就表示number是在这一块当中的
        for (int i = 0; i < blockArr.length; i++) {
            if (number <= blockArr[i].getMax()) {
                return i;
            }
        }
        return -1;
    }
}

class Block {
    private int max;  // 块中的最大值
    private int startIndex;  // 起始索引
    private int endIndex;   // 结束索引


    public Block() {
    }

    public Block(int max, int startIndex, int endIndex) {
        this.max = max;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    /**
     * 获取
     *
     * @return max
     */
    public int getMax() {
        return max;
    }

    /**
     * 设置
     *
     * @param max
     */
    public void setMax(int max) {
        this.max = max;
    }

    /**
     * 获取
     *
     * @return startIndex
     */
    public int getStartIndex() {
        return startIndex;
    }

    /**
     * 设置
     *
     * @param startIndex
     */
    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    /**
     * 获取
     *
     * @return endIndex
     */
    public int getEndIndex() {
        return endIndex;
    }

    /**
     * 设置
     *
     * @param endIndex
     */
    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }

    public String toString() {
        return "Block{max = " + max + ", startIndex = " + startIndex + ", endIndex = " + endIndex + "}";
    }
}