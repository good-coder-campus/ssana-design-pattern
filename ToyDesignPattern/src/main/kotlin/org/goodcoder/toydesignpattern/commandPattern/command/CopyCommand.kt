
package org.goodcoder.toydesignpattern.commandPattern.command

import org.goodcoder.toydesignpattern.commandPattern.Editor
import org.springframework.stereotype.Component

/**
 * 2. 구상 커맨드 클래스 추출
 * - 수신자 객체에 대한 참조나 인수가 필요하다면 저장하기 위한 필드 추가
 * - 이 필드들은 커맨드 생성자를 통해 초기화
 */
@Component  // Spring에서 객체 생성 및 빈 등록
class CopyCommand(private val editor: Editor) : Command{
    override fun execute() {
        editor.copy()
    }
}