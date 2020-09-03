package com.example.clase2sep

class LSketcher {
    fun draw() {
        val rows = 5
        val cols = 5
        for (row in 0 until rows) {
            println("*")
            if (row == rows - 1) {
                for (col in 0 until cols) {
                    print("* ")
                }
            }
        }
    }

    private fun print(text: String) {
        print(text)
    }

    private fun println(text: String) {
        println(text)
    }
}















