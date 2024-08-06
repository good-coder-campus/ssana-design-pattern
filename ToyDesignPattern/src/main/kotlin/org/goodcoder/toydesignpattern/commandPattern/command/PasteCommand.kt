package org.goodcoder.toydesignpattern.commandPattern.command


import org.goodcoder.toydesignpattern.commandPattern.Editor
import org.springframework.stereotype.Component

@Component
class PasteCommand(private val editor: Editor) : Command {

    override fun execute() {
      editor.paste()
    }
}