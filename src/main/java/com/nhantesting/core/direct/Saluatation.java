package com.nhantesting.core.direct;
@FunctionalInterface // là 1 loại interface chỉ có duy nhất 1 hàm abstract
public interface Saluatation { // sau này khi new thì object chỉ có 1 abstract
	public void sayHello(String msg); // vùng ram chỉ có 1 hàm, dẹp mẹ tên hàm chỉ cần vùng body  
                            // vì không còn sự nhầm lẫn giữa hàm này và hàm kia
                            // lambda expression mà chỉ có 1 hàm duy nhất
} 


// public interface Saluatation {

//     void sayHello();

//     void fuck();
// } khong phai functional interface