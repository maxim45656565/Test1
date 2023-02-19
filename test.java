/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.test1;

import java.util.Scanner;

/**
 *
 * @author Максим
 */

public class Test1 {
public static void main(String[] args){
        calc();
    }

    public static Number calc() {
        System.out.println("Введите длительность вклада в месяцах");

        int month = Integer.parseInt(inner());
        if(month < 1){
            System.out.println("Кол-во месяцев должно быть равно 1 или больше");
            return null;
        }
        System.out.println("Длительность вкалада составляет: "+month);

        System.out.println("Введите годовой процент");
        Double percent = Double.parseDouble(inner());
        if(percent < 0 || percent > 100){
            System.out.println("Кол-во процентов должно быть больше 0 и меньше 100");
            return null;
        }
        System.out.println("Годовой процент составляет составляет: "+percent);

        System.out.println("Введите начальную сумму");
        Double startAmount = Double.parseDouble(inner());
        if(startAmount <= 0){
            System.out.println("Начальная сумма должна быть больше 0");
            return null;
        }
        System.out.println("Начальная сумма составляет: "+startAmount);

        System.out.println("---------------------------------");

        Double endAmount = startAmount;
        for(int i = 0;i < month;i++){
            endAmount += Math.round(endAmount*percent)/100;
            System.out.println("Текущая сумма вклада составляет: "+endAmount);
        }
        return endAmount;
    }

    public static String inner() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

}
