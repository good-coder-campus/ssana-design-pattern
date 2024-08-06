package org.goodcoder.toydesignpattern.commandPattern.command


import org.goodcoder.toydesignpattern.commandPattern.Editor
import org.springframework.stereotype.Component

@Component
class InsertCommand(private val editor: Editor) : Command {
    var input: String = "" // 요청 인수들을 저장하기 위한 필드

    override fun execute() {
      editor.insert(input)
    }
}