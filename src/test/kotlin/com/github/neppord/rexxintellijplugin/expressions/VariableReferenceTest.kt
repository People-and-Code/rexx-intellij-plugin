package com.github.neppord.rexxintellijplugin.expressions

import com.github.neppord.rexxintellijplugin.instructions.NameDeclaration
import com.intellij.psi.util.descendantsOfType
import com.intellij.testFramework.fixtures.BasePlatformTestCase

class VariableReferenceTest : BasePlatformTestCase() {

    fun testVariableReference() {
        val file = myFixture.configureByText(
            "foo.rex",
            """
                | foo = 1
                | foo = foo
            """.trimMargin()
        )
        val actual = file.descendantsOfType<Variable>().first().reference?.resolve()
        val expected = file.descendantsOfType<NameDeclaration>().first()

        assertEquals(expected, actual)
    }
    fun testParseValueReference() {
        val file = myFixture.configureByText(
            "foo.rex",
            """
                | parse value 1 with foo
                | say foo
            """.trimMargin()
        )
        val actual = file.descendantsOfType<Variable>().first().reference?.resolve()
        val expected = file.descendantsOfType<NameDeclaration>().first()

        assertEquals(expected, actual)
    }

    fun testParseSourceReference() {
        val file = myFixture.configureByText(
            "foo.rex",
            """
                | parse source a b c
                | say a
            """.trimMargin()
        )
        val actual = file.descendantsOfType<Variable>().first().reference?.resolve()
        val expected = file.descendantsOfType<NameDeclaration>().first()

        assertEquals(expected, actual)
    }
    fun testArgumentReference() {
        val file = myFixture.configureByText(
            "foo.rex",
            """
                | x = 1
                | call f x
            """.trimMargin()
        )
        val actual = file.descendantsOfType<Variable>().first {
            it.name == "x"
        }.reference?.resolve()
        val expected = file.descendantsOfType<NameDeclaration>().first {
            it.name == "x"
        }

        assertEquals(expected, actual)
    }
    fun testFromIfCondition() {
        val file = myFixture.configureByText(
            "foo.rex",
            """
                | x = 1
                | if x then say "hi"
            """.trimMargin()
        )
        val actual = file.descendantsOfType<Variable>().first().reference?.resolve()
        val expected = file.descendantsOfType<NameDeclaration>().first()

        assertEquals(expected, actual)
    }

    fun testFromDoBlock() {
        val file = myFixture.configureByText(
            "foo.rex",
            """
                | x = "hello"
                | if 1 then do
                |  say x
                | end
            """.trimMargin()
        )
        val actual = file.descendantsOfType<Variable>().first().reference?.resolve()
        val expected = file.descendantsOfType<NameDeclaration>().first()

        assertEquals(expected, actual)
    }
}