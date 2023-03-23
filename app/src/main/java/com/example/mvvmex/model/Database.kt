package com.example.mvvmex.model

class Database {
    private lateinit var database : Database
    private var arrayList : ArrayList<Int> = ArrayList() // arraylist 초기화

    fun saveNumber(number:Int){
        arrayList.add(number)
    }

    fun getAllNumber(): ArrayList<Int> {
        return arrayList
    }

    fun removeNumber(){
        arrayList.clear()
    }
}