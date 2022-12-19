package fizzBuzz_412

class FizzBuzz {
    fun fizzBuzz(n: Int) : List<String>{
        val list = mutableListOf<String>()
        for (i in 1..n){
            var temp = ""
            if (i % 3 == 0 || i % 5 == 0) {

                if (i % 3 == 0) {
                    temp += "Fizz";
                }
                if (i % 5 == 0) {
                    temp += "Buzz"
                }
            }
                else temp = i.toString();

                list.add(temp)
            }
        return list;
    }
}