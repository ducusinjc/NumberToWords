package com.example.numbertowords

class NumberToWords (val number: Int){
    val numberAsString = number.toString().reversed()
    val numberLength = numberAsString.length
    var words : String = ""
    var onesString : String = ""
    var numberAsWords : String = ""
    private var i = 0

    init {
        numberToWords()
    }

    private fun numberToWords() {
        while (numberLength > i){
            if (i%3 == 2 && numberAsString[i] != '0'){
                ones()
                numberAsWords = "${onesString}Hundred $numberAsWords"
            }
            if (i%3 == 1){
                if(numberAsString[i] == '1') {
                    tens()
                    numberAsWords = words + numberAsWords
                } else{
                    tens()
                    i--
                    ones()
                    i++
                    numberAsWords = words + onesString + numberAsWords
                }
            }
            if (i == 3){
                numberAsWords = "Thousand $numberAsWords"
            }
            if (i == 6){
                numberAsWords = "Million $numberAsWords"
            }
            if (i == 9){
                numberAsWords = "Billion $numberAsWords"
            }
            if (i == 12){
                numberAsWords = "Trillion $numberAsWords"
            }
            i++
        }
    }


    private fun ones(): String {
        when(numberAsString[i]){
            '1' -> onesString = "One "
            '2' -> onesString = "Two "
            '3' -> onesString = "Three "
            '4' -> onesString = "Four "
            '5' -> onesString = "Five "
            '6' -> onesString = "Six "
            '7' -> onesString = "Seven "
            '8' -> onesString = "Eight "
            '9' -> onesString = "Nine "
            '0' -> onesString = ""
        }
        return onesString
    }

    private fun tens(): String {
        if(numberAsString[i] == '1') {
            when (numberAsString[i - 1]) {
                '0' -> words = "Ten "
                '1' -> words = "Eleven "
                '2' -> words = "Twelve "
                '3' -> words = "Thirteen "
                '4' -> words = "Fourteen "
                '5' -> words = "Fifteen "
                '6' -> words = "Sixteen "
                '7' -> words = "Seventeen "
                '8' -> words = "Eighteen "
                '9' -> words = "Nineteen "
            }
        }else {
            when (numberAsString[i]) {
                '2' -> words = "Twenty "
                '3' -> words = "Thirty "
                '4' -> words = "Forty "
                '5' -> words = "Fifty "
                '6' -> words = "Sixty "
                '7' -> words = "Seventy "
                '8' -> words = "Eighty "
                '9' -> words = "Ninety "
            }
        }
        return words
    }
}

