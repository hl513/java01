package com.xxx.day08;

public class Exam04Plus {
    public static void main(String[] args) {
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

        //    要求3：通过id删除学生信息
        int index = getIndex(students,3);
        if (index >= 0){
            //   如果存在，则删除
            students[index] = null;
        }else{
            // ，如果不存在，则提示删除失败
            System.out.println("id不存在，删除失败");
        }

        // 要求4：删除完毕之后，遍历所有学生信息
        printArr(students);

        // 要求5：查询数组id为 “002” 的学生，如果存在，则将他的年龄+1岁
       int index02 = getIndex(students,2);
       if (index02 >= 0){
           // 存在，则他的年龄+1岁
           Student stu=students[index02];
           int newAge = stu.getAge()+1;
           stu.setAge(newAge);
       }else{
           System.out.println("当前id不存在，修改失败");
       }
    }

    // 找到id在数组中的索引
    public static int getIndex(Student [] arr,int id){
        for (int i = 0; i < arr.length; i++) {
            // 依次得到每一个学生对象
            Student stu = arr[i];
            // 对stu进行一个非空判断
            if (stu != null){
                if (stu.getId()==id){
                    return i;
                }
            }
        }
        // 当循环结束之后，还没有找到就表示不存在
        return -1;
    }
    // 遍历数组
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
