package com.abc.demo;

class Employee {

    static String company = "Uber"; // 類別變數（靜態屬性/變數）Class Variable (Static Field)

    String name = "吳伯毅"; // 實例變數（非靜態屬性/變數）Instance Variable (Non-static Field)
    int age = 5; // 實例變數（非靜態屬性/變數）Instance Variable (Non-static Field)

    void work(int hours) { // 方法參數 Parameter
        int weeks = 4; // 本地變數 Local Variable

        System.out.println(company + "公司的員工[姓名：" + name + "][年齡：" + age + "歲]每" + weeks + "週工作" + hours + "小時");
    }
}
