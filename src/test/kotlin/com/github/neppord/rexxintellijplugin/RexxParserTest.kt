package com.github.neppord.rexxintellijplugin

import com.intellij.testFramework.ParsingTestCase

class RexxParserTest : ParsingTestCase(
    "src/test/testData",
    "rex",
    RexxParserDefinition()
) {
    override fun getTestDataPath() = "."
    fun testHelloWorld() = doTest(true)
    fun testSayFortyTwo() = doTest(true)
    fun testSayPi() = doTest(true)
    fun testSayScientific() = doTest(true)
    fun testSayParenthesis() = doTest(true)
    fun testSayConcat() = doTest(true)
    fun testSayArguments() = doTest(true)
    fun testSayAdd() = doTest(true)
    fun testSayAddAndConcat() = doTest(true)
    fun testSayPemdas() = doTest(true)
    fun testSayVar() = doTest(true)
    fun testAssignment() = doTest(true)
    fun testParseArg() = doTest(true)
    fun testParseValue() = doTest(true)
    fun testIfWithDo() = doTest(true)
    fun testFunctionCalls() = doTest(true)
}