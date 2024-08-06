package org.goodcoder.toydesignpattern.commandPattern

import org.goodcoder.toydesignpattern.commandPattern.command.CopyCommand
import org.goodcoder.toydesignpattern.commandPattern.command.CutCommand
import org.goodcoder.toydesignpattern.commandPattern.command.InsertCommand
import org.goodcoder.toydesignpattern.commandPattern.command.PasteCommand
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * 3. 발송자 역할 클래스: 클라이언트의 요청을 받아 적절한 커맨드 객체 실행
 * - 클래스 커맨드 들을 저장하기 위한 필드 추가
 * - 인터페이스에 정의된 실행 메서드를 통해서만 통신 -> 수신자 객체에 직접 접근하지 않고 커맨드 실행하여 비즈니스 로직 수행
 * - 자체적인 커맨드 생성 X, 스프링에서는 DI를 통해 주입
 */
@RestController
@RequestMapping("/editor")
class EditorController (
    private val copyCommand: CopyCommand,
    private val cutCommand: CutCommand,
    private val pasteCommand: PasteCommand,
    private val insertCommand: InsertCommand,
    private val editor: Editor,
){
    @PostMapping("/copy")
    fun copy() {
        copyCommand.execute()
    }

    @PostMapping("/paste")
    fun paste(): String {
        pasteCommand.execute()
        return editor.text
    }

    @PostMapping("/cut")
    fun cut() {
        cutCommand.execute()
    }

    @PostMapping("/insert")
    fun insert(@RequestBody input: String) {
        insertCommand.input = input
        insertCommand.execute()
    }

    @GetMapping()
    fun get() : String {
        return editor.text
    }
}