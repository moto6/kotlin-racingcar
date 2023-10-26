package calculator.model

class Arithmetic(
    val operators: List<Operator>,
    val operands: List<Operand>,
) {
    fun act(): Int {
        assertFormula(operators.size, operands.size)
        var result = operands[0].value
        for (i in 0 until operators.size) {
            result = operators[i].operate(result, operands[i + 1].value)
        }
        return result
    }

    private fun assertFormula(operatorsCount: Int, operandsCount: Int) {
        if (operatorsCount + 1 != operandsCount) {
            throw IllegalArgumentException("연산자와 피연산자의 숫자가 적합하지 않습니다. 피연산자 갯수 = 연산자갯수 + 1 이어야 합니다")
        }
    }
}
