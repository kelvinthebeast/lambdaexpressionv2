package com.nhantesting.core.direct;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // xài interface theo kiểu truyền thống - new class con đã impliments cha saluation
        Saluatation loiChao = new SaluatationVN();
        loiChao.sayHello("Noi cai lon");
    
        // xài interface theo kiểu on the go - éo thèm tạo lớp con
        // anonymous class - éo cần tạo class bình thường
        // chỉ new và gõ code  và chấm hoy mà
        Saluatation enHello = new Saluatation() {
            @Override
            public void sayHello(String msg) {
                System.out.println(msg);
            }

            // @Override
            // public void fuck() {
            //     System.out.println("fuck u in vn");
            // }
        };
        enHello.sayHello("em chao cac anh in english"); // vì chỉ có 1 hàm trong interface và chỉ có code trong hàm này, 
        // dù anonymous hay class có hàm riêng
        // vì chỉ có 1 hàm duy nhất, mà lại cần impliments, tại sao
        // không tập trung vào code, mà lại viết cả tên hàm làm chi
        // rút gọn thành class riêng lẽ thành anonymous, bớt được tên class, bớt luôn tên hàm cho gọn -> lambda expression
        // chỉ còn dây nịt, code của hàm mà thôi
        // chỉ được xài dây nịch - lambda ex - khi chơi với  functional interface (interface chỉ có 1 hàm mà thôi)

        // cách 3: xài lambda
        Saluatation jpHello = (String msg) -> {
            System.out.println(msg);
        };
        jpHello.sayHello("Anh nhớ hân quá!!!");
    

        Saluatation koreanHello = (String msg) -> {
            System.out.println(msg);
        };
        koreanHello.sayHello("Làm sao để cho em và anh hạnh phúc đây!!");

        Saluatation indianHello = (String msg) -> {
            System.out.println(msg);
        };

        indianHello.sayHello("Anh phải đánh đổi thêm cái gì nữa thì em mới quay về bên anh đây ??");
        Saluatation kelvinHello = (String msg) -> {
            System.out.println(msg);

        };

        kelvinHello.sayHello("Cái giá đó anh có thể trả giá nổi không!!!");

        // Saluatation myMsg = (String msg) -> {
        //     System.out.println(msg);
        // };
        Saluatation myMsg = msg -> {
            System.out.println(msg);
        };
        myMsg.sayHello("anh đang bị làm sao thế này");

        myMsg.sayHello("Trường 3 chữ....");

        // Lambda expression: code cho 1 cái hàm abstract
        // gọi nó sau khi code xong
        // lọi bỏ luôn cái tên hàm
        myMsg.sayHello("nè oke bro");

        List<Integer> ar = new ArrayList<>();
        ar.add(10);
        ar.add(20);
        ar.add(30);
        ar.forEach(x -> {
            System.out.print(x + " ");
        });
    }

}