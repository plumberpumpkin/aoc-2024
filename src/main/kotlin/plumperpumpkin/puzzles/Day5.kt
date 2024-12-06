package plumperpumpkin.puzzles

class Day5 {

    fun part1(input: String) : String {
        var result = 0

        val inputParts = input.split("\r\n\r\n") //Zwischen Rules und Updates ist eine Leerzeile
        val rules = prepareRules(inputParts[0])
        val updates = prepareUpdates(inputParts[1])




        return "Day5 Part1 - Result is $result"
    }

    fun prepareRules(rawRules : String) : List<Pair<Int, Int>> {
        val rules = ArrayList<Pair<Int, Int>>()
        val rawRulesList = rawRules.split("\r\n")
        for (rawRule in rawRulesList) {
            val( first, second) = rawRule.split("|").map { it.toInt() }
            rules.add(first to second)
        }
        return rules
    }
    fun prepareUpdates(rawUpdates : String) : List<List<Int>>{
        val updates = ArrayList<List<Int>>()
        val updateLines = rawUpdates.split("\r\n")
        for (line in updateLines){
            val rawValues = line.split(",").map { it.toInt() }
            updates.add(rawValues)
        }
        return updates
    }

    fun checkOrder(updates: ArrayList<ArrayList<Int>>, rules : ArrayList<Pair<Int, Int>>) : Int {
        var result = 0
        for (update in updates){
            var orderIsCorrect = true
            for (rule in rules) {
                if (!update.contains(rule.first) || !update.contains(rule.second)){
                    println("Not all numbers present. Ignoring rule $rule for update $update")
                    continue
                }
                val indexFirst = update.lastIndexOf(rule.first)
                val indexSecond = update.lastIndexOf(rule.second)
                if  (indexFirst < indexSecond) {
                    println("Update $update violated rule $rule")
                    orderIsCorrect = false
                    break
                }
            }
            if (orderIsCorrect){
                result += update[(update.size - 1)/2]
            }
        }
        return result
    }
}