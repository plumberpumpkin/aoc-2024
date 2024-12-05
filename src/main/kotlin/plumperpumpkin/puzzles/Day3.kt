package plumperpumpkin.puzzles

class Day3 {
    fun part1(input: String) : String {
        val sanitizedInput = input.replace("\r\n", "")
        val instructions = extractMultiplicationPartsPart1(sanitizedInput)
        var result = 0
        for (instruction in instructions) {
            var instructionValues = instruction.replace("mul(","")
            instructionValues = instructionValues.replace(")", "")
            val values = instructionValues.split(",")
            result += values[0].toInt() * values[1].toInt()
        }
        return "Result is $result"
    }

    fun part2(input: String) : String {
        val sanitizedInput = input.replace("\r\n", "")
        val instructions = extractMultiplicationPartsPart2(sanitizedInput)
        var result = 0
        for (instruction in instructions) {
            var instructionValues = instruction.replace("mul(","")
            instructionValues = instructionValues.replace(")", "")
            val values = instructionValues.split(",")
            result += values[0].toInt() * values[1].toInt()
        }
        return "Result is $result"
    }

    fun extractMultiplicationPartsPart1(input: String) : List<String> {
        val parts = ArrayList<String>()
        val charArray = input.toCharArray()
        for (i in charArray.indices) {
            if (i == charArray.size - 6) {
                println("No more instructions possible")
                break
            }
            if (charArray[i] == 'm' && charArray[i+1] == 'u' && charArray[i+2] == 'l' && charArray[i+3] == '(' && charArray[i+4].isDigit()) {
                println("Possible instruction found. Checking")
                if ((charArray[i + 5].isDigit() || charArray[i + 5] == ',') || ((charArray[i + 6].isDigit() || charArray[i + 6] == ',')) || (charArray[i + 7].isDigit() || charArray[i+7] == ',')
                    &&
                    ((charArray[i + 6].isDigit() || charArray[i + 6] == ',' || charArray[i + 6] == ')') || (charArray[i + 7].isDigit() || charArray[i+7] == ',' || charArray[i + 7] == ')') || (charArray[i + 8].isDigit() || charArray[i + 8] == ')') || charArray[i + 9] == ')')
                ) {
                    val relevantStringPart = input.substring(i)
                    val instruction = relevantStringPart.substringBefore(")") + ")"
                    if (instruction.length <= 12 && instruction[instruction.length - 1] == ')' && instruction[instruction.length - 2].isDigit()) {
                        println(instruction)
                        parts.add(instruction)
                    }
                }
            }
        }
        return parts
    }

    fun extractMultiplicationPartsPart2(input: String) : List<String> {
        val parts = ArrayList<String>()


        return parts
    }
}