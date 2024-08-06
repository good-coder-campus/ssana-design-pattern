package org.goodcoder.toydesignpattern.commandPattern.command

import org.goodcoder.toydesignpattern.commandPattern.Editor
import org.springframework.stereotype.Component

/**
 * 편집기 상태를 변경하므로 기록에 저장
 */
@Component
class CutCommand(private val editor: Editor) : Command {
    override fun execute() {
        editor.cut()
    }
}