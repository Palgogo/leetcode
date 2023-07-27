package com.palgogo.ex1_ex50.ex20ValidParentheses

import java.util.Stack

class ValidParentheses {
    fun isValid(s:String) : Boolean {
        val map = mapOf(Pair('[', ']'), Pair('(', ')'), Pair('{', '}'))
        val stack = Stack<Char>()

        for (character in s){
            //check the key (only left braces)
            if (map.containsKey(character)){
                stack.push(map[character])
                // if we take a right brace or other character - check if we have left for them.
            } else if (stack.isNotEmpty() && stack.peek() == character){
                stack.pop()
            }
            else{
                return false
            }
        }
        return stack.isEmpty()
    }
}