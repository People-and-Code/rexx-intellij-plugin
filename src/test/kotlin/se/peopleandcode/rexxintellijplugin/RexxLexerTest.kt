package se.peopleandcode.rexxintellijplugin

import com.intellij.testFramework.LexerTestCase

class RexxLexerTest : LexerTestCase() {
    override fun createLexer() = RexxLexer()
    override fun getDirPath() = "src/test/testData"
    override fun getExpectedFileExtension() = ".rex.lex.txt"

    fun testHelloWorld() = doFileTest("rex")
    fun testVariable() = doFileTest("rex")
    fun testNumbers() = doFileTest("rex")
    fun testComments() = doFileTest("rex")
    fun testObject() = doFileTest("rex")
    fun testSayConcat() = doFileTest("rex")
    fun testMultilineComment() = doFileTest("rex")
    fun testParseArg() = doFileTest("rex")
    fun testParseValue() = doFileTest("rex")
    fun testIfWithDo() = doFileTest("rex")
    override fun getPathToTestDataFile(extension: String?): String {
        val root = ""
        val testName = getTestName(false)
        return "$root$dirPath/$testName$extension"
    }
}