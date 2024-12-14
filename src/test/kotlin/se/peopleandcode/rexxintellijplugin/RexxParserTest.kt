package se.peopleandcode.rexxintellijplugin

import com.intellij.testFramework.ParsingTestCase

class RexxParserTest : ParsingTestCase(
    "src/test/testData",
    "rex",
    RexxParserDefinition()
) {
    override fun getTestDataPath() = "."
    fun testHelloWorld() = doTest(true, true)
    fun testSayFortyTwo() = doTest(true, true)
    fun testSayPi() = doTest(true, true)
    fun testSayScientific() = doTest(true, true)
    fun testSayParenthesis() = doTest(true, true)
    fun testSayConcat() = doTest(true, true)
    fun testSayArguments() = doTest(true, true)
    fun testSayAdd() = doTest(true, true)
    fun testSayAddAndConcat() = doTest(true, true)
    fun testSayPemdas() = doTest(true, true)
    fun testSayVar() = doTest(true, true)
    fun testAssignment() = doTest(true, true)
    fun testParseArg() = doTest(true, true)
    fun testParseValue() = doTest(true, true)
    fun testIfWithDo() = doTest(true, true)
    fun testFunctionCalls() = doTest(true, true)
    fun testMethodCalls() = doTest(true, true)
    fun testDoWhile() = doTest(true, true)
    fun testProcedures() = doTest(true, true)
    fun testDoRepeat() = doTest(true, true)
    fun testComparison() = doTest(true, true)
    fun testIterate() = doTest(true, true)
    fun testArg() = doTest(true, true)
    fun testCall() = doTest(true, true)
    fun testSelect() = doTest(true, true)
    fun testComments() = doTest(true, true)
    fun testNop() = doTest(true, true)
    fun testParseVrefp() = doTest(true, true)
    fun testDrop() = doTest(true, true)
    fun testProcedureWithExpose() = doTest(true, true)
    fun testProcedureWithExposeStem() = doTest(true, true)
    fun testNakedLabel() = doTest(true, true)
    fun testUseArg() = doTest(true, true)
}