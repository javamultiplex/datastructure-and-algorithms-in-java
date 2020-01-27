package com.javamultiplex.hashmap;

public class HashMapCustomAppDemo {
    public static void main(String[] args) {
        HashMapCustom<Integer, Integer> hashMapCustom = new HashMapCustom<>();
        hashMapCustom.put(12, 22);
        hashMapCustom.put(13, 88);
        hashMapCustom.put(55, 88);
        hashMapCustom.put(22, 44);
        System.out.println("Value of key 12 is : " + hashMapCustom.get(12));
        System.out.println("Value of key 88 is : " + hashMapCustom.get(88));
        hashMapCustom.display();
        System.out.println();
        System.out.println("Key 13 has been removed : "+hashMapCustom.remove(13));
        System.out.println("Key 66 has been removed : "+hashMapCustom.remove(66));

        hashMapCustom.display();
    }
}
