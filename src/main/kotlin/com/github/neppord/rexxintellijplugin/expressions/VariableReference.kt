package com.github.neppord.rexxintellijplugin.expressions

import com.github.neppord.rexxintellijplugin.gen.psi.RexxAssignment
import com.github.neppord.rexxintellijplugin.gen.psi.RexxSayInstruction
import com.github.neppord.rexxintellijplugin.gen.psi.RexxVariable
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiReferenceBase
import com.intellij.psi.util.parentOfType
import com.intellij.psi.util.parents
import com.intellij.psi.util.siblings

class VariableReference(variable: Variable) :
    PsiReferenceBase<RexxVariable>(variable, variable.textRangeInParent) {
    override fun resolve(): PsiElement? {
        val variableName = element.identifier.text
        val instruction = element.parents(true).firstOrNull {
            it is RexxAssignment || it is RexxSayInstruction
        } ?: return null
        val previousInstructions = instruction.siblings(forward = false)
        return previousInstructions.firstOrNull {
            when (it) {
                is RexxAssignment -> it.identifier.text == variableName
                else -> false
            }
        }
    }
}