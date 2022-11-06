package com.xxx.day08;

public class Exam04 {
    /*
     * 需求：
     *   定义一个长度为3的数组，数组存储1~3名学生对象作为初始数据，学生对象的学号，姓名各不相同
     *   学生的属性：学号、年龄、姓名
     *   要求1：再次添加一个学生对象，并在添加的时候进行学号的唯一性判断
     *   要求2：添加完毕之后，遍历所有学生信息
     *   要求3：通过id删除学生信息
     *          如果存在，则删除，如果不存在，则提示删除失败
     *   要求4：删除完毕之后，遍历所有学生信息
     *   要求5：查询数组id为 “002” 的学生，如果存在，则将他的年龄+1岁
     * */

    public static void main(String[] args) {
        // 定义数组长度为3
        Student[] students = new Student[10];
        // 创建学生对象
        Student s1 = new Student("张三", 001, 18);
        Student s2 = new Student("李四", 002, 19);
        Student s3 = new Student("王五", 003, 21);

        // 将学生对象添加到数组当中
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        //  要求1：再次添加一个学生对象，并在添加的时候进行学号的唯一性判断
        Student s4 = new Student("麻子", 004, 20);
        // 唯一性判断
        boolean flag = contains(students, s4.getId());
        if (flag) {
            // 已存在，不用添加
            System.out.println("当前id重复，请修改id后再添加");
        } else {
            // 不存在 就可以把学生对象添加到数组
            // 数组已经存满，只能创建一个新的数组，新数组的长度 = 老数组+1
            int count = getCount(students);
            // 已经存满
            // 创建一个新的数组 长度 = 老数组+1
            Student[] newArr = createArr(students);
            if (count == students.length) {
                // 把新元素添加进去
                newArr[count] = s4;

                // 要求2：添加完毕之后，遍历所有学生信息
                printArr(newArr);

            } else {
                // 数组没有存满  直接添加
                // getCount获取到的是2，表示数组当中已经有了2个元素
                // 也表示下一次要添加数据，就是添加到2索引的位置
                students[count] = s4;

                // 要求2：添加完毕之后，遍历所有学生信息
                printArr(students);
            }
        }
    }

    // 判断数组中的id是否重复
    public static boolean contains(Student[] students, int id) {
        for (int i = 0; i < students.length; i++) {
            // 依次获取到数组中的每一个学生对象
            Student student = students[i];
            if (student != null) {
                int Sid = student.getId();
                // 比较
                if (Sid == id) {
                    return true;
                }
            }

        }
        // 当循环结束之后，还没有找到一样的，那么就表示数组中要查找的id是不存在的
        return false;
    }

    // 判断数组中已经存了几个元素
    public static int getCount(Student[] students) {
        // 定义一个计数器，用来统计
        int count = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                count++;
            }
        }
        // 循环结束后，就知道数组中有几个元素
        return count;
    }

    // 创建一个新的数组
    public static Student[] createArr(Student[] students) {
        Student[] newArr = new Student[students.length + 1];
        // 循环遍历得到老数组中的元素
        for (int i = 0; i < students.length; i++) {
            newArr[i] = students[i];
        }
        // 把新数组返回
        return newArr;
    }

    public static void printArr(Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            Student student = arr[i];
            if (student != null) {
                System.out.println(student.getAge() + "," + student.getId() +
                        "," + student.getName());
            }
        }
    }

}
