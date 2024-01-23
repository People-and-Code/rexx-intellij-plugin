package com.github.neppord.rexxintellijplugin

import com.intellij.testFramework.ParsingTestCase

class RexxParserTest : ParsingTestCase(
    "src/test/testData",
    "rex",
    RexxParserDefinition
) {
    override fun getTestDataPath() = "."
    fun testHelloWorld() = doTest(true)
    fun testSayFortyTwo() = doTest(true)
    fun testSayPi() = doTest(true)
    fun testSayScientific() = doTest(true)
    fun testSayParenthesis() = doTest(true)
}