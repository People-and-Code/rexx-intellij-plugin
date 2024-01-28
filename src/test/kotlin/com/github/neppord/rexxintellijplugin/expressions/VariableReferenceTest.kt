package com.github.neppord.rexxintellijplugin.expressions

import com.github.neppord.rexxintellijplugin.instructions.NameDeclaration
import com.intellij.psi.util.descendantsOfType
import com.intellij.testFramework.fixtures.BasePlatformTestCase

import org.junit.Assert.*

class VariableReferenceTest : BasePlatformTestCase() {

    fun testVariableReference() {
        val file = myFixture.configureByText(
            "foo.rex",
            """
                | foo = 1
                | bar = foo
            """.trimMargin()
        )
        val actual = file.descendantsOfType<Variable>().first().reference?.resolve()
        val expected = file.descendantsOfType<NameDeclaration>().first()

        assertEquals(expected, actual)
    }
}