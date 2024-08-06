package org.goodcoder.toydesignpattern.commandPattern

import org.springframework.stereotype.Component

/**
 * 실제 텍스트 편집 기능
 * 수신기 역할
 * 모든 커맨드는 Editor의 메서드를 실행하는 것이 목적
 */
@Component
class Editor {
    var clipboard: String = ""
    var text: String = ""

    fun copy() {
        clipboard = text  // 현재 텍스트 클립보드에 복사
    }

    fun cut() {
        clipboard = text // 현재 텍스트 클립보드에 복사
        text = "" // 텍스트 삭제
    }

    fun paste() {
        text = clipboard // 클립보드 문자를 텍스트에 붙여넣기
    }

    fun insert(input: String) {
        text = input
    }
}